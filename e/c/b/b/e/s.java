package e.c.b.b.e;

/* compiled from: com.google.android.gms:play-services-tasks@@17.0.2 */
/* loaded from: classes.dex */
final class s implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ h f15039e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ t f15040f;

    s(t tVar, h hVar) {
        this.f15040f = tVar;
        this.f15039e = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f15040f.f15041b) {
            if (this.f15040f.f15042c != null) {
                this.f15040f.f15042c.a(this.f15039e);
            }
        }
    }
}