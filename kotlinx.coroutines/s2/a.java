package kotlinx.coroutines.s2;

import i.m;
import i.n;
import i.s;
import i.v.d;
import i.v.i.c;
import i.y.c.l;
import i.y.c.p;
import kotlinx.coroutines.internal.f;

/* compiled from: Cancellable.kt */
/* loaded from: classes3.dex */
public final class a {
    public static final void a(d<? super s> dVar, d<?> dVar2) {
        try {
            d dVarB = c.b(dVar);
            m.a aVar = m.f15825e;
            f.c(dVarB, m.a(s.a), null, 2, null);
        } catch (Throwable th) {
            m.a aVar2 = m.f15825e;
            dVar2.e(m.a(n.a(th)));
        }
    }

    public static final <R, T> void b(p<? super R, ? super d<? super T>, ? extends Object> pVar, R r, d<? super T> dVar, l<? super Throwable, s> lVar) {
        try {
            d dVarB = c.b(c.a(pVar, r, dVar));
            m.a aVar = m.f15825e;
            f.b(dVarB, m.a(s.a), lVar);
        } catch (Throwable th) {
            m.a aVar2 = m.f15825e;
            dVar.e(m.a(n.a(th)));
        }
    }

    public static /* synthetic */ void c(p pVar, Object obj, d dVar, l lVar, int i2, Object obj2) {
        if ((i2 & 4) != 0) {
            lVar = null;
        }
        b(pVar, obj, dVar, lVar);
    }
}