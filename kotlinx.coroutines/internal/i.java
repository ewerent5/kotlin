package kotlinx.coroutines.internal;

import i.m;

/* compiled from: FastServiceLoader.kt */
/* loaded from: classes3.dex */
public final class i {
    private static final boolean a;

    static {
        Object objA;
        try {
            m.a aVar = i.m.f15825e;
            objA = i.m.a(Class.forName("android.os.Build"));
        } catch (Throwable th) {
            m.a aVar2 = i.m.f15825e;
            objA = i.m.a(i.n.a(th));
        }
        a = i.m.d(objA);
    }

    public static final boolean a() {
        return a;
    }
}