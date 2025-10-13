package j$.util.stream;

import j$.util.Spliterator;
import j$.util.stream.InterfaceC0329l1;
import java.util.Iterator;

/* renamed from: j$.util.stream.l1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC0329l1<T, S extends InterfaceC0329l1<T, S>> extends AutoCloseable {
    @Override // java.lang.AutoCloseable
    void close();

    boolean isParallel();

    Iterator iterator();

    InterfaceC0329l1 onClose(Runnable runnable);

    InterfaceC0329l1 parallel();

    InterfaceC0329l1 sequential();

    Spliterator spliterator();

    InterfaceC0329l1 unordered();
}