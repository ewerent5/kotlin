package ch.qos.logback.core.pattern;

/* loaded from: classes.dex */
public final class LiteralConverter<E> extends Converter<E> {
    String literal;

    public LiteralConverter(String str) {
        this.literal = str;
    }

    @Override // ch.qos.logback.core.pattern.Converter
    public String convert(E e2) {
        return this.literal;
    }
}