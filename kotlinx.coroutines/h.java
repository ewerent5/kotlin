package kotlinx.coroutines;

import i.v.e;

/* compiled from: Builders.common.kt */
/* loaded from: classes3.dex */
public final /* synthetic */ class h {
    public static final o1 a(i0 i0Var, i.v.g gVar, k0 k0Var, i.y.c.p<? super i0, ? super i.v.d<? super i.s>, ? extends Object> pVar) {
        i.v.g gVarC = c0.c(i0Var, gVar);
        a x1Var = k0Var.b() ? new x1(gVarC, pVar) : new e2(gVarC, true);
        x1Var.G0(k0Var, x1Var, pVar);
        return x1Var;
    }

    public static /* synthetic */ o1 b(i0 i0Var, i.v.g gVar, k0 k0Var, i.y.c.p pVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            gVar = i.v.h.f15852e;
        }
        if ((i2 & 2) != 0) {
            k0Var = k0.DEFAULT;
        }
        return f.a(i0Var, gVar, k0Var, pVar);
    }

    public static final <T> Object c(i.v.g gVar, i.y.c.p<? super i0, ? super i.v.d<? super T>, ? extends Object> pVar, i.v.d<? super T> dVar) throws Throwable {
        Object objI0;
        i.v.g context = dVar.getContext();
        i.v.g gVarPlus = context.plus(gVar);
        p2.a(gVarPlus);
        if (gVarPlus == context) {
            kotlinx.coroutines.internal.v vVar = new kotlinx.coroutines.internal.v(gVarPlus, dVar);
            objI0 = kotlinx.coroutines.s2.b.b(vVar, vVar, pVar);
        } else {
            e.b bVar = i.v.e.f15850b;
            if (i.y.d.l.a((i.v.e) gVarPlus.get(bVar), (i.v.e) context.get(bVar))) {
                n2 n2Var = new n2(gVarPlus, dVar);
                Object objC = kotlinx.coroutines.internal.b0.c(gVarPlus, null);
                try {
                    Object objB = kotlinx.coroutines.s2.b.b(n2Var, n2Var, pVar);
                    kotlinx.coroutines.internal.b0.a(gVarPlus, objC);
                    objI0 = objB;
                } catch (Throwable th) {
                    kotlinx.coroutines.internal.b0.a(gVarPlus, objC);
                    throw th;
                }
            } else {
                p0 p0Var = new p0(gVarPlus, dVar);
                p0Var.C0();
                kotlinx.coroutines.s2.a.c(pVar, p0Var, p0Var, null, 4, null);
                objI0 = p0Var.I0();
            }
        }
        if (objI0 == i.v.i.d.c()) {
            i.v.j.a.h.c(dVar);
        }
        return objI0;
    }
}