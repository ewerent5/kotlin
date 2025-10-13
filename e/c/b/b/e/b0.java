package e.c.b.b.e;

import java.util.ArrayDeque;
import java.util.Queue;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-tasks@@17.0.2 */
/* loaded from: classes.dex */
final class b0<TResult> {
    private final Object a = new Object();

    /* renamed from: b, reason: collision with root package name */
    @GuardedBy("mLock")
    private Queue<a0<TResult>> f15009b;

    /* renamed from: c, reason: collision with root package name */
    @GuardedBy("mLock")
    private boolean f15010c;

    b0() {
    }

    public final void a(h<TResult> hVar) {
        a0<TResult> a0VarPoll;
        synchronized (this.a) {
            if (this.f15009b != null && !this.f15010c) {
                this.f15010c = true;
                while (true) {
                    synchronized (this.a) {
                        a0VarPoll = this.f15009b.poll();
                        if (a0VarPoll == null) {
                            this.f15010c = false;
                            return;
                        }
                    }
                    a0VarPoll.b(hVar);
                }
            }
        }
    }

    public final void b(a0<TResult> a0Var) {
        synchronized (this.a) {
            if (this.f15009b == null) {
                this.f15009b = new ArrayDeque();
            }
            this.f15009b.add(a0Var);
        }
    }
}