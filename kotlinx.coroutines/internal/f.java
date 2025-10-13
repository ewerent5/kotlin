package kotlinx.coroutines.internal;

import i.m;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.j2;
import kotlinx.coroutines.m0;
import kotlinx.coroutines.o1;
import kotlinx.coroutines.x0;

/* compiled from: DispatchedContinuation.kt */
/* loaded from: classes3.dex */
public final class f {
    private static final x a = new x("UNDEFINED");

    /* renamed from: b, reason: collision with root package name */
    public static final x f16970b = new x("REUSABLE_CLAIMED");

    public static final <T> void b(i.v.d<? super T> dVar, Object obj, i.y.c.l<? super Throwable, i.s> lVar) {
        boolean z;
        if (!(dVar instanceof e)) {
            dVar.e(obj);
            return;
        }
        e eVar = (e) dVar;
        Object objB = kotlinx.coroutines.a0.b(obj, lVar);
        if (eVar.f16968l.a0(eVar.getContext())) {
            eVar.f16965i = objB;
            eVar.f17031g = 1;
            eVar.f16968l.Z(eVar.getContext(), eVar);
            return;
        }
        m0.a();
        x0 x0VarB = j2.f17004b.b();
        if (x0VarB.v0()) {
            eVar.f16965i = objB;
            eVar.f17031g = 1;
            x0VarB.k0(eVar);
            return;
        }
        x0VarB.q0(true);
        try {
            o1 o1Var = (o1) eVar.getContext().get(o1.f17025d);
            if (o1Var == null || o1Var.b()) {
                z = false;
            } else {
                CancellationException cancellationExceptionS = o1Var.s();
                eVar.b(objB, cancellationExceptionS);
                m.a aVar = i.m.f15825e;
                eVar.e(i.m.a(i.n.a(cancellationExceptionS)));
                z = true;
            }
            if (!z) {
                i.v.g context = eVar.getContext();
                Object objC = b0.c(context, eVar.f16967k);
                try {
                    eVar.f16969m.e(obj);
                    i.s sVar = i.s.a;
                    b0.a(context, objC);
                } catch (Throwable th) {
                    b0.a(context, objC);
                    throw th;
                }
            }
            while (x0VarB.G0()) {
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public static /* synthetic */ void c(i.v.d dVar, Object obj, i.y.c.l lVar, int i2, Object obj2) {
        if ((i2 & 2) != 0) {
            lVar = null;
        }
        b(dVar, obj, lVar);
    }
}