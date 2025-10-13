package ch.qos.logback.core.pattern;

/* loaded from: classes.dex */
public class IdentityCompositeConverter<E> extends CompositeConverter<E> {
    @Override // ch.qos.logback.core.pattern.CompositeConverter
    protected String transform(E e2, String str) {
        return str;
    }
}