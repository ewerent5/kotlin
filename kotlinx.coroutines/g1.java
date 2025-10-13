package kotlinx.coroutines;

import java.util.concurrent.Executor;

/* compiled from: Executors.kt */
/* loaded from: classes3.dex */
public final class g1 {
    public static final d0 a(Executor executor) {
        d0 d0Var;
        s0 s0Var = (s0) (!(executor instanceof s0) ? null : executor);
        return (s0Var == null || (d0Var = s0Var.f17096e) == null) ? new f1(executor) : d0Var;
    }
}