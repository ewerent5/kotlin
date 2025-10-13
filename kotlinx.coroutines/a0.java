package kotlinx.coroutines;

import i.m;

/* compiled from: CompletionState.kt */
/* loaded from: classes3.dex */
public final class a0 {
    public static final <T> Object a(Object obj, i.v.d<? super T> dVar) {
        if (!(obj instanceof w)) {
            m.a aVar = i.m.f15825e;
            return i.m.a(obj);
        }
        m.a aVar2 = i.m.f15825e;
        Throwable thJ = ((w) obj).f17169b;
        if (m0.d() && (dVar instanceof i.v.j.a.e)) {
            thJ = kotlinx.coroutines.internal.w.j(thJ, (i.v.j.a.e) dVar);
        }
        return i.m.a(i.n.a(thJ));
    }

    public static final <T> Object b(Object obj, i.y.c.l<? super Throwable, i.s> lVar) {
        Throwable thB = i.m.b(obj);
        return thB == null ? lVar != null ? new x(obj, lVar) : obj : new w(thB, false, 2, null);
    }

    public static final <T> Object c(Object obj, k<?> kVar) {
        Throwable thB = i.m.b(obj);
        if (thB != null) {
            if (m0.d() && (kVar instanceof i.v.j.a.e)) {
                thB = kotlinx.coroutines.internal.w.j(thB, (i.v.j.a.e) kVar);
            }
            obj = new w(thB, false, 2, null);
        }
        return obj;
    }

    public static /* synthetic */ Object d(Object obj, i.y.c.l lVar, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            lVar = null;
        }
        return b(obj, lVar);
    }
}