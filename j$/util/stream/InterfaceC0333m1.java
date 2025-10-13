package j$.util.stream;

import j$.util.function.BiConsumer;
import j$.util.function.Function;
import java.util.Set;

/* renamed from: j$.util.stream.m1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC0333m1<T, A, R> {

    /* renamed from: j$.util.stream.m1$a */
    public enum a {
        CONCURRENT,
        UNORDERED,
        IDENTITY_FINISH
    }

    BiConsumer accumulator();

    Set characteristics();

    j$.util.function.n combiner();

    Function finisher();

    j$.util.function.J supplier();
}