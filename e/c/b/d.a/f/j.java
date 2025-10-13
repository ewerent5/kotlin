package e.c.b.d.a.f;

/* loaded from: classes.dex */
final class j implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ e f15375e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ k f15376f;

    j(k kVar, e eVar) {
        this.f15376f = kVar;
        this.f15375e = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f15376f.f15377b) {
            if (this.f15376f.f15378c != null) {
                this.f15376f.f15378c.a(this.f15375e.d());
            }
        }
    }
}