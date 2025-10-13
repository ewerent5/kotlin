package kotlinx.coroutines.s2;

import i.m;
import i.n;
import i.v.d;
import i.v.g;
import i.v.j.a.e;
import i.v.j.a.h;
import i.y.c.p;
import i.y.d.y;
import kotlinx.coroutines.internal.b0;
import kotlinx.coroutines.internal.v;
import kotlinx.coroutines.m0;
import kotlinx.coroutines.w;
import kotlinx.coroutines.w1;

/* compiled from: Undispatched.kt */
/* loaded from: classes3.dex */
public final class b {
    public static final <R, T> void a(p<? super R, ? super d<? super T>, ? extends Object> pVar, R r, d<? super T> dVar) {
        d dVarA = h.a(dVar);
        try {
            g context = dVar.getContext();
            Object objC = b0.c(context, null);
            try {
                if (pVar == null) {
                    throw new NullPointerException("null cannot be cast to non-null type (R, kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
                }
                Object objI = ((p) y.b(pVar, 2)).i(r, dVarA);
                if (objI != i.v.i.d.c()) {
                    m.a aVar = m.f15825e;
                    dVarA.e(m.a(objI));
                }
            } finally {
                b0.a(context, objC);
            }
        } catch (Throwable th) {
            m.a aVar2 = m.f15825e;
            dVarA.e(m.a(n.a(th)));
        }
    }

    public static final <T, R> Object b(v<? super T> vVar, R r, p<? super R, ? super d<? super T>, ? extends Object> pVar) throws Throwable {
        Object wVar;
        Object objE0;
        vVar.C0();
        try {
        } catch (Throwable th) {
            wVar = new w(th, false, 2, null);
        }
        if (pVar == null) {
            throw new NullPointerException("null cannot be cast to non-null type (R, kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
        }
        wVar = ((p) y.b(pVar, 2)).i(r, vVar);
        if (wVar != i.v.i.d.c() && (objE0 = vVar.e0(wVar)) != w1.f17171b) {
            if (!(objE0 instanceof w)) {
                return w1.h(objE0);
            }
            Throwable th2 = ((w) objE0).f17169b;
            d<? super T> dVar = vVar.f17001h;
            if (m0.d() && (dVar instanceof e)) {
                throw kotlinx.coroutines.internal.w.j(th2, (e) dVar);
            }
            throw th2;
        }
        return i.v.i.d.c();
    }
}