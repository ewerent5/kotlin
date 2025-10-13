package e.c.b.b.e;

/* compiled from: com.google.android.gms:play-services-tasks@@17.0.2 */
/* loaded from: classes.dex */
final class w implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ h f15047e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ x f15048f;

    w(x xVar, h hVar) {
        this.f15048f = xVar;
        this.f15047e = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f15048f.f15049b) {
            if (this.f15048f.f15050c != null) {
                this.f15048f.f15050c.onSuccess(this.f15047e.k());
            }
        }
    }
}