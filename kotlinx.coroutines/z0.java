package kotlinx.coroutines;

import java.util.concurrent.locks.LockSupport;
import kotlinx.coroutines.y0;

/* compiled from: EventLoop.kt */
/* loaded from: classes3.dex */
public abstract class z0 extends x0 {
    protected abstract Thread I0();

    protected final void O0(long j2, y0.a aVar) {
        if (m0.a()) {
            if (!(this != o0.f17024l)) {
                throw new AssertionError();
            }
        }
        o0.f17024l.c1(j2, aVar);
    }

    protected final void S0() {
        Thread threadI0 = I0();
        if (Thread.currentThread() != threadI0) {
            k2 k2VarA = l2.a();
            if (k2VarA != null) {
                k2VarA.d(threadI0);
            } else {
                LockSupport.unpark(threadI0);
            }
        }
    }
}