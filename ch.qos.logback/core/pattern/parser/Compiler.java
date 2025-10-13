package ch.qos.logback.core.pattern.parser;

import ch.qos.logback.core.pattern.CompositeConverter;
import ch.qos.logback.core.pattern.Converter;
import ch.qos.logback.core.pattern.DynamicConverter;
import ch.qos.logback.core.pattern.LiteralConverter;
import ch.qos.logback.core.spi.ContextAwareBase;
import ch.qos.logback.core.status.ErrorStatus;
import ch.qos.logback.core.util.OptionHelper;
import java.util.Map;

/* loaded from: classes.dex */
class Compiler<E> extends ContextAwareBase {
    final Map converterMap;
    Converter<E> head;
    Converter<E> tail;
    final Node top;

    Compiler(Node node, Map map) {
        this.top = node;
        this.converterMap = map;
    }

    private void addToList(Converter<E> converter) {
        if (this.head == null) {
            this.tail = converter;
            this.head = converter;
        } else {
            this.tail.setNext(converter);
            this.tail = converter;
        }
    }

    Converter<E> compile() {
        Converter literalConverter;
        this.tail = null;
        this.head = null;
        for (Node node = this.top; node != null; node = node.next) {
            int i2 = node.type;
            if (i2 != 0) {
                if (i2 == 1) {
                    SimpleKeywordNode simpleKeywordNode = (SimpleKeywordNode) node;
                    DynamicConverter<E> dynamicConverterCreateConverter = createConverter(simpleKeywordNode);
                    if (dynamicConverterCreateConverter != null) {
                        dynamicConverterCreateConverter.setFormattingInfo(simpleKeywordNode.getFormatInfo());
                        dynamicConverterCreateConverter.setOptionList(simpleKeywordNode.getOptions());
                        literalConverter = dynamicConverterCreateConverter;
                    } else {
                        Converter literalConverter2 = new LiteralConverter("%PARSER_ERROR[" + simpleKeywordNode.getValue() + "]");
                        addStatus(new ErrorStatus("[" + simpleKeywordNode.getValue() + "] is not a valid conversion word", this));
                        literalConverter = literalConverter2;
                    }
                } else if (i2 == 2) {
                    CompositeNode compositeNode = (CompositeNode) node;
                    CompositeConverter<E> compositeConverterCreateCompositeConverter = createCompositeConverter(compositeNode);
                    if (compositeConverterCreateCompositeConverter == null) {
                        addError("Failed to create converter for [%" + compositeNode.getValue() + "] keyword");
                        literalConverter = new LiteralConverter("%PARSER_ERROR[" + compositeNode.getValue() + "]");
                    } else {
                        compositeConverterCreateCompositeConverter.setFormattingInfo(compositeNode.getFormatInfo());
                        compositeConverterCreateCompositeConverter.setOptionList(compositeNode.getOptions());
                        Compiler compiler = new Compiler(compositeNode.getChildNode(), this.converterMap);
                        compiler.setContext(this.context);
                        compositeConverterCreateCompositeConverter.setChildConverter(compiler.compile());
                        literalConverter = compositeConverterCreateCompositeConverter;
                    }
                }
                addToList(literalConverter);
            } else {
                addToList(new LiteralConverter((String) node.getValue()));
            }
        }
        return this.head;
    }

    CompositeConverter<E> createCompositeConverter(CompositeNode compositeNode) {
        String str = (String) compositeNode.getValue();
        String str2 = (String) this.converterMap.get(str);
        if (str2 == null) {
            addError("There is no conversion class registered for composite conversion word [" + str + "]");
            return null;
        }
        try {
            return (CompositeConverter) OptionHelper.instantiateByClassName(str2, (Class<?>) CompositeConverter.class, this.context);
        } catch (Exception e2) {
            addError("Failed to instantiate converter class [" + str2 + "] as a composite converter for keyword [" + str + "]", e2);
            return null;
        }
    }

    DynamicConverter<E> createConverter(SimpleKeywordNode simpleKeywordNode) {
        String str = (String) simpleKeywordNode.getValue();
        String str2 = (String) this.converterMap.get(str);
        if (str2 == null) {
            addError("There is no conversion class registered for conversion word [" + str + "]");
            return null;
        }
        try {
            return (DynamicConverter) OptionHelper.instantiateByClassName(str2, (Class<?>) DynamicConverter.class, this.context);
        } catch (Exception e2) {
            addError("Failed to instantiate converter class [" + str2 + "] for keyword [" + str + "]", e2);
            return null;
        }
    }
}