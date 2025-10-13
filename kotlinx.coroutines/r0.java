package kotlinx.coroutines;

import i.m;
import java.util.Objects;

/* compiled from: DispatchedTask.kt */
/* loaded from: classes3.dex */
public final class r0 {
    public static final <T> void a(q0<? super T> q0Var, int i2) {
        if (m0.a()) {
            if (!(i2 != -1)) {
                throw new AssertionError();
            }
        }
        i.v.d<? super T> dVarD = q0Var.d();
        boolean z = i2 == 4;
        if (z || !(dVarD instanceof kotlinx.coroutines.internal.e) || b(i2) != b(q0Var.f17031g)) {
            d(q0Var, dVarD, z);
            return;
        }
        d0 d0Var = ((kotlinx.coroutines.internal.e) dVarD).f16968l;
        i.v.g context = dVarD.getContext();
        if (d0Var.a0(context)) {
            d0Var.Z(context, q0Var);
        } else {
            e(q0Var);
        }
    }

    public static final boolean b(int i2) {
        return i2 == 1 || i2 == 2;
    }

    public static final boolean c(int i2) {
        return i2 == 2;
    }

    public static final <T> void d(q0<? super T> q0Var, i.v.d<? super T> dVar, boolean z) {
        Object objI;
        Object objP = q0Var.p();
        Throwable thG = q0Var.g(objP);
        if (thG != null) {
            m.a aVar = i.m.f15825e;
            objI = i.n.a(thG);
        } else {
            m.a aVar2 = i.m.f15825e;
            objI = q0Var.i(objP);
        }
        Object objA = i.m.a(objI);
        if (!z) {
            dVar.e(objA);
            return;
        }
        Objects.requireNonNull(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T>");
        kotlinx.coroutines.internal.e eVar = (kotlinx.coroutines.internal.e) dVar;
        i.v.g context = eVar.getContext();
        Object objC = kotlinx.coroutines.internal.b0.c(context, eVar.f16967k);
        try {
            eVar.f16969m.e(objA);
            i.s sVar = i.s.a;
        } finally {
            kotlinx.coroutines.internal.b0.a(context, objC);
        }
    }

    private static final void e(q0<?> q0Var) {
        x0 x0VarB = j2.f17004b.b();
        if (x0VarB.v0()) {
            x0VarB.k0(q0Var);
            return;
        }
        x0VarB.q0(true);
        try {
            d(q0Var, q0Var.d(), true);
            do {
            } while (x0VarB.G0());
        } finally {
            try {
            } finally {
            }
        }
    }
}