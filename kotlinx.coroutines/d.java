package kotlinx.coroutines;

import java.util.concurrent.locks.LockSupport;

/* compiled from: Builders.kt */
/* loaded from: classes3.dex */
final class d<T> extends a<T> {

    /* renamed from: h, reason: collision with root package name */
    private final Thread f16934h;

    /* renamed from: i, reason: collision with root package name */
    private final x0 f16935i;

    public d(i.v.g gVar, Thread thread, x0 x0Var) {
        super(gVar, true);
        this.f16934h = thread;
        this.f16935i = x0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final T H0() throws Throwable {
        k2 k2VarA = l2.a();
        if (k2VarA != null) {
            k2VarA.b();
        }
        try {
            x0 x0Var = this.f16935i;
            if (x0Var != null) {
                x0.r0(x0Var, false, 1, null);
            }
            while (!Thread.interrupted()) {
                try {
                    x0 x0Var2 = this.f16935i;
                    long jC0 = x0Var2 != null ? x0Var2.C0() : Long.MAX_VALUE;
                    if (Z()) {
                        T t = (T) w1.h(U());
                        w wVar = t instanceof w ? t : null;
                        if (wVar == null) {
                            return t;
                        }
                        throw wVar.f17169b;
                    }
                    k2 k2VarA2 = l2.a();
                    if (k2VarA2 != null) {
                        k2VarA2.e(this, jC0);
                    } else {
                        LockSupport.parkNanos(this, jC0);
                    }
                } finally {
                    x0 x0Var3 = this.f16935i;
                    if (x0Var3 != null) {
                        x0.h0(x0Var3, false, 1, null);
                    }
                }
            }
            InterruptedException interruptedException = new InterruptedException();
            w(interruptedException);
            throw interruptedException;
        } finally {
            k2 k2VarA3 = l2.a();
            if (k2VarA3 != null) {
                k2VarA3.f();
            }
        }
    }

    @Override // kotlinx.coroutines.v1
    protected boolean a0() {
        return true;
    }

    @Override // kotlinx.coroutines.v1
    protected void u(Object obj) {
        if (!i.y.d.l.a(Thread.currentThread(), this.f16934h)) {
            LockSupport.unpark(this.f16934h);
        }
    }
}