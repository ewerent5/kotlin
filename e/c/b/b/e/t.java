package e.c.b.b.e;

import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-tasks@@17.0.2 */
/* loaded from: classes.dex */
final class t<TResult> implements a0<TResult> {
    private final Executor a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f15041b = new Object();

    /* renamed from: c, reason: collision with root package name */
    @GuardedBy("mLock")
    private c<TResult> f15042c;

    public t(Executor executor, c<TResult> cVar) {
        this.a = executor;
        this.f15042c = cVar;
    }

    @Override // e.c.b.b.e.a0
    public final void b(h<TResult> hVar) {
        synchronized (this.f15041b) {
            if (this.f15042c == null) {
                return;
            }
            this.a.execute(new s(this, hVar));
        }
    }
}