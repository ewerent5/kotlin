package e.c.b.b.e;

import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-tasks@@17.0.2 */
/* loaded from: classes.dex */
final class u<TResult> implements a0<TResult> {
    private final Executor a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f15043b = new Object();

    /* renamed from: c, reason: collision with root package name */
    @GuardedBy("mLock")
    private d f15044c;

    public u(Executor executor, d dVar) {
        this.a = executor;
        this.f15044c = dVar;
    }

    @Override // e.c.b.b.e.a0
    public final void b(h<TResult> hVar) {
        if (hVar.n() || hVar.l()) {
            return;
        }
        synchronized (this.f15043b) {
            if (this.f15044c == null) {
                return;
            }
            this.a.execute(new v(this, hVar));
        }
    }
}