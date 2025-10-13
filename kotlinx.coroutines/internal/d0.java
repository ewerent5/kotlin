package kotlinx.coroutines.internal;

import i.v.g;

/* compiled from: ThreadContext.kt */
/* loaded from: classes3.dex */
public final class d0 implements g.c<c0<?>> {
    private final ThreadLocal<?> a;

    public d0(ThreadLocal<?> threadLocal) {
        this.a = threadLocal;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof d0) && i.y.d.l.a(this.a, ((d0) obj).a);
        }
        return true;
    }

    public int hashCode() {
        ThreadLocal<?> threadLocal = this.a;
        if (threadLocal != null) {
            return threadLocal.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "ThreadLocalKey(threadLocal=" + this.a + ")";
    }
}