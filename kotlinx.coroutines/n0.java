package kotlinx.coroutines;

import i.m;

/* compiled from: DebugStrings.kt */
/* loaded from: classes3.dex */
public final class n0 {
    public static final String a(Object obj) {
        return obj.getClass().getSimpleName();
    }

    public static final String b(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final String c(i.v.d<?> dVar) {
        Object objA;
        if (dVar instanceof kotlinx.coroutines.internal.e) {
            return dVar.toString();
        }
        try {
            m.a aVar = i.m.f15825e;
            objA = i.m.a(dVar + '@' + b(dVar));
        } catch (Throwable th) {
            m.a aVar2 = i.m.f15825e;
            objA = i.m.a(i.n.a(th));
        }
        if (i.m.b(objA) != null) {
            objA = dVar.getClass().getName() + '@' + b(dVar);
        }
        return (String) objA;
    }
}