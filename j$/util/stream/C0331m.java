package j$.util.stream;

import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.C0277e;
import j$.util.function.Consumer;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: j$.util.stream.m */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0331m implements Consumer {
    public final /* synthetic */ AtomicBoolean a;

    /* renamed from: b */
    public final /* synthetic */ ConcurrentHashMap f16326b;

    public /* synthetic */ C0331m(AtomicBoolean atomicBoolean, ConcurrentHashMap concurrentHashMap) {
        atomicBoolean = atomicBoolean;
        concurrentHashMap = concurrentHashMap;
    }

    @Override // j$.util.function.Consumer
    public final void accept(Object obj) {
        AtomicBoolean atomicBoolean = atomicBoolean;
        ConcurrentHashMap concurrentHashMap = concurrentHashMap;
        if (obj == null) {
            atomicBoolean.set(true);
        } else {
            concurrentHashMap.putIfAbsent(obj, Boolean.TRUE);
        }
    }

    @Override // j$.util.function.Consumer
    public Consumer e(Consumer consumer) {
        Objects.requireNonNull(consumer);
        return new C0277e(this, consumer);
    }
}