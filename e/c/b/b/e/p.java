package e.c.b.b.e;

import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-tasks@@17.0.2 */
/* loaded from: classes.dex */
final class p<TResult> implements a0<TResult> {
    private final Executor a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f15034b = new Object();

    /* renamed from: c, reason: collision with root package name */
    @GuardedBy("mLock")
    private b f15035c;

    public p(Executor executor, b bVar) {
        this.a = executor;
        this.f15035c = bVar;
    }

    @Override // e.c.b.b.e.a0
    public final void b(h<TResult> hVar) {
        if (hVar.l()) {
            synchronized (this.f15034b) {
                if (this.f15035c == null) {
                    return;
                }
                this.a.execute(new r(this));
            }
        }
    }
}