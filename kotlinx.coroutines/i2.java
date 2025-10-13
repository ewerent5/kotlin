package kotlinx.coroutines;

/* compiled from: ThreadContextElement.kt */
/* loaded from: classes3.dex */
public final class i2 {
    public static final <T> h2<T> a(ThreadLocal<T> threadLocal, T t) {
        return new kotlinx.coroutines.internal.c0(t, threadLocal);
    }
}