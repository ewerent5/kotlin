package e.c.b.b.e;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-tasks@@17.0.2 */
/* loaded from: classes.dex */
final class z implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ h f15053e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ y f15054f;

    z(y yVar, h hVar) {
        this.f15054f = yVar;
        this.f15053e = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            h hVarA = this.f15054f.f15051b.a(this.f15053e.k());
            if (hVarA == null) {
                this.f15054f.a(new NullPointerException("Continuation returned null"));
                return;
            }
            Executor executor = j.f15019b;
            hVarA.e(executor, this.f15054f);
            hVarA.d(executor, this.f15054f);
            hVarA.a(executor, this.f15054f);
        } catch (f e2) {
            if (e2.getCause() instanceof Exception) {
                this.f15054f.a((Exception) e2.getCause());
            } else {
                this.f15054f.a(e2);
            }
        } catch (CancellationException unused) {
            this.f15054f.c();
        } catch (Exception e3) {
            this.f15054f.a(e3);
        }
    }
}