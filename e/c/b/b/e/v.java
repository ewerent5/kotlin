package e.c.b.b.e;

/* compiled from: com.google.android.gms:play-services-tasks@@17.0.2 */
/* loaded from: classes.dex */
final class v implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ h f15045e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ u f15046f;

    v(u uVar, h hVar) {
        this.f15046f = uVar;
        this.f15045e = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f15046f.f15043b) {
            if (this.f15046f.f15044c != null) {
                this.f15046f.f15044c.a(this.f15045e.j());
            }
        }
    }
}