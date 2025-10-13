package ch.qos.logback.core.rolling.helper;

import ch.qos.logback.core.Context;
import ch.qos.logback.core.pattern.Converter;
import ch.qos.logback.core.pattern.ConverterUtil;
import ch.qos.logback.core.pattern.LiteralConverter;
import ch.qos.logback.core.pattern.parser.Parser;
import ch.qos.logback.core.pattern.util.AlmostAsIsEscapeUtil;
import ch.qos.logback.core.spi.ContextAwareBase;
import ch.qos.logback.core.spi.ScanException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class FileNamePattern extends ContextAwareBase {
    static final Map<String, String> CONVERTER_MAP;
    Converter<Object> headTokenConverter;
    String pattern;

    static {
        HashMap map = new HashMap();
        CONVERTER_MAP = map;
        map.put(IntegerTokenConverter.CONVERTER_KEY, IntegerTokenConverter.class.getName());
        map.put(DateTokenConverter.CONVERTER_KEY, DateTokenConverter.class.getName());
    }

    public FileNamePattern(String str, Context context) {
        setPattern(FileFilterUtil.slashify(str));
        setContext(context);
        parse();
        ConverterUtil.startConverters(this.headTokenConverter);
    }

    public String convert(Object obj) {
        StringBuilder sb = new StringBuilder();
        for (Converter<Object> next = this.headTokenConverter; next != null; next = next.getNext()) {
            sb.append(next.convert(obj));
        }
        return sb.toString();
    }

    public String convertInt(int i2) {
        return convert(Integer.valueOf(i2));
    }

    public String convertMultipleArguments(Object... objArr) {
        StringBuilder sb = new StringBuilder();
        for (Converter<Object> next = this.headTokenConverter; next != null; next = next.getNext()) {
            if (next instanceof MonoTypedConverter) {
                MonoTypedConverter monoTypedConverter = (MonoTypedConverter) next;
                for (Object obj : objArr) {
                    if (monoTypedConverter.isApplicable(obj)) {
                        sb.append(next.convert(obj));
                    }
                }
            } else {
                sb.append(next.convert(objArr));
            }
        }
        return sb.toString();
    }

    String escapeRightParantesis(String str) {
        return this.pattern.replace(")", "\\)");
    }

    public IntegerTokenConverter getIntegerTokenConverter() {
        for (Converter<Object> next = this.headTokenConverter; next != null; next = next.getNext()) {
            if (next instanceof IntegerTokenConverter) {
                return (IntegerTokenConverter) next;
            }
        }
        return null;
    }

    public String getPattern() {
        return this.pattern;
    }

    public DateTokenConverter getPrimaryDateTokenConverter() {
        for (Converter<Object> next = this.headTokenConverter; next != null; next = next.getNext()) {
            if (next instanceof DateTokenConverter) {
                DateTokenConverter dateTokenConverter = (DateTokenConverter) next;
                if (dateTokenConverter.isPrimary()) {
                    return dateTokenConverter;
                }
            }
        }
        return null;
    }

    void parse() {
        try {
            Parser parser = new Parser(escapeRightParantesis(this.pattern), new AlmostAsIsEscapeUtil());
            parser.setContext(this.context);
            this.headTokenConverter = parser.compile(parser.parse(), CONVERTER_MAP);
        } catch (ScanException e2) {
            addError("Failed to parse pattern \"" + this.pattern + "\".", e2);
        }
    }

    public void setPattern(String str) {
        if (str != null) {
            this.pattern = str.trim();
        }
    }

    public String toRegex() {
        String regex;
        StringBuilder sb = new StringBuilder();
        for (Converter<Object> next = this.headTokenConverter; next != null; next = next.getNext()) {
            if (next instanceof LiteralConverter) {
                regex = next.convert(null);
            } else if (next instanceof IntegerTokenConverter) {
                regex = "\\d{1,2}";
            } else if (next instanceof DateTokenConverter) {
                regex = ((DateTokenConverter) next).toRegex();
            }
            sb.append(regex);
        }
        return sb.toString();
    }

    public String toRegexForFixedDate(Date date) {
        String strConvert;
        StringBuilder sb = new StringBuilder();
        for (Converter<Object> next = this.headTokenConverter; next != null; next = next.getNext()) {
            if (next instanceof LiteralConverter) {
                strConvert = next.convert(null);
            } else if (next instanceof IntegerTokenConverter) {
                strConvert = "(\\d{1,3})";
            } else if (next instanceof DateTokenConverter) {
                strConvert = next.convert(date);
            }
            sb.append(strConvert);
        }
        return sb.toString();
    }

    public String toString() {
        return this.pattern;
    }
}