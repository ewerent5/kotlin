package e.c.b.d.a.f;

/* loaded from: classes.dex */
final class h implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ e f15371e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ i f15372f;

    h(i iVar, e eVar) {
        this.f15372f = iVar;
        this.f15371e = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f15372f.f15373b) {
            if (this.f15372f.f15374c != null) {
                this.f15372f.f15374c.a(this.f15371e);
            }
        }
    }
}