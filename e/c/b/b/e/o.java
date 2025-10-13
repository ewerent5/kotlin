package e.c.b.b.e;

/* compiled from: com.google.android.gms:play-services-tasks@@17.0.2 */
/* loaded from: classes.dex */
final class o implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ h f15032e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ m f15033f;

    o(m mVar, h hVar) {
        this.f15033f = mVar;
        this.f15032e = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f15032e.l()) {
            this.f15033f.f15029c.s();
            return;
        }
        try {
            this.f15033f.f15029c.r(this.f15033f.f15028b.a(this.f15032e));
        } catch (f e2) {
            if (e2.getCause() instanceof Exception) {
                this.f15033f.f15029c.q((Exception) e2.getCause());
            } else {
                this.f15033f.f15029c.q(e2);
            }
        } catch (Exception e3) {
            this.f15033f.f15029c.q(e3);
        }
    }
}