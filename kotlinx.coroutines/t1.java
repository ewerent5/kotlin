package kotlinx.coroutines;

import java.util.concurrent.CancellationException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Job.kt */
/* loaded from: classes3.dex */
public final /* synthetic */ class t1 {
    public static final u a(o1 o1Var) {
        return new r1(o1Var);
    }

    public static /* synthetic */ u b(o1 o1Var, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            o1Var = null;
        }
        return s1.a(o1Var);
    }

    public static final void c(i.v.g gVar, CancellationException cancellationException) {
        o1 o1Var = (o1) gVar.get(o1.f17025d);
        if (o1Var != null) {
            o1Var.K(cancellationException);
        }
    }

    public static /* synthetic */ void d(i.v.g gVar, CancellationException cancellationException, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            cancellationException = null;
        }
        s1.c(gVar, cancellationException);
    }

    public static final void e(i.v.g gVar) {
        o1 o1Var = (o1) gVar.get(o1.f17025d);
        if (o1Var != null) {
            s1.f(o1Var);
        }
    }

    public static final void f(o1 o1Var) {
        if (!o1Var.b()) {
            throw o1Var.s();
        }
    }
}