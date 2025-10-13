package i.w.d;

import i.y.d.l;

/* compiled from: JDK7PlatformImplementations.kt */
/* loaded from: classes3.dex */
public class a extends i.w.a {
    @Override // i.w.a
    public void a(Throwable th, Throwable th2) {
        l.d(th, "cause");
        l.d(th2, "exception");
        th.addSuppressed(th2);
    }
}