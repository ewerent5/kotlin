package e.c.b.b.e;

/* compiled from: com.google.android.gms:play-services-tasks@@17.0.2 */
/* loaded from: classes.dex */
final class r implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ p f15038e;

    r(p pVar) {
        this.f15038e = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f15038e.f15034b) {
            if (this.f15038e.f15035c != null) {
                this.f15038e.f15035c.c();
            }
        }
    }
}