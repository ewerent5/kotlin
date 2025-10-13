package i;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Exceptions.kt */
/* loaded from: classes3.dex */
public class b {
    public static void a(Throwable th, Throwable th2) {
        i.y.d.l.d(th, "$this$addSuppressed");
        i.y.d.l.d(th2, "exception");
        if (th != th2) {
            i.w.b.a.a(th, th2);
        }
    }
}