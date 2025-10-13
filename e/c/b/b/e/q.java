package e.c.b.b.e;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-tasks@@17.0.2 */
/* loaded from: classes.dex */
final class q implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ h f15036e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ n f15037f;

    q(n nVar, h hVar) {
        this.f15037f = nVar;
        this.f15036e = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            h hVar = (h) this.f15037f.f15030b.a(this.f15036e);
            if (hVar == null) {
                this.f15037f.a(new NullPointerException("Continuation returned null"));
                return;
            }
            Executor executor = j.f15019b;
            hVar.e(executor, this.f15037f);
            hVar.d(executor, this.f15037f);
            hVar.a(executor, this.f15037f);
        } catch (f e2) {
            if (e2.getCause() instanceof Exception) {
                this.f15037f.f15031c.q((Exception) e2.getCause());
            } else {
                this.f15037f.f15031c.q(e2);
            }
        } catch (Exception e3) {
            this.f15037f.f15031c.q(e3);
        }
    }
}