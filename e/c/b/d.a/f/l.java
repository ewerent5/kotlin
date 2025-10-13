package e.c.b.d.a.f;

/* loaded from: classes.dex */
final class l implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ e f15379e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ m f15380f;

    l(m mVar, e eVar) {
        this.f15380f = mVar;
        this.f15379e = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f15380f.f15381b) {
            if (this.f15380f.f15382c != null) {
                this.f15380f.f15382c.onSuccess(this.f15379e.e());
            }
        }
    }
}