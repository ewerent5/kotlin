package e.c.b.b.e;

import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-tasks@@17.0.2 */
/* loaded from: classes.dex */
final class x<TResult> implements a0<TResult> {
    private final Executor a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f15049b = new Object();

    /* renamed from: c, reason: collision with root package name */
    @GuardedBy("mLock")
    private e<? super TResult> f15050c;

    public x(Executor executor, e<? super TResult> eVar) {
        this.a = executor;
        this.f15050c = eVar;
    }

    @Override // e.c.b.b.e.a0
    public final void b(h<TResult> hVar) {
        if (hVar.n()) {
            synchronized (this.f15049b) {
                if (this.f15050c == null) {
                    return;
                }
                this.a.execute(new w(this, hVar));
            }
        }
    }
}