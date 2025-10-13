package i;

import i.m;

/* compiled from: Result.kt */
/* loaded from: classes3.dex */
public final class n {
    public static final Object a(Throwable th) {
        i.y.d.l.d(th, "exception");
        return new m.b(th);
    }

    public static final void b(Object obj) throws Throwable {
        if (obj instanceof m.b) {
            throw ((m.b) obj).f15826e;
        }
    }
}