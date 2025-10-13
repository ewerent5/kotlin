package e.c.b.d.a.f;

import java.util.ArrayDeque;
import java.util.Queue;

/* loaded from: classes.dex */
final class o<ResultT> {
    private final Object a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private Queue<n<ResultT>> f15383b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f15384c;

    o() {
    }

    public final void a(n<ResultT> nVar) {
        synchronized (this.a) {
            if (this.f15383b == null) {
                this.f15383b = new ArrayDeque();
            }
            this.f15383b.add(nVar);
        }
    }

    public final void b(e<ResultT> eVar) {
        n<ResultT> nVarPoll;
        synchronized (this.a) {
            if (this.f15383b != null && !this.f15384c) {
                this.f15384c = true;
                while (true) {
                    synchronized (this.a) {
                        nVarPoll = this.f15383b.poll();
                        if (nVarPoll == null) {
                            this.f15384c = false;
                            return;
                        }
                    }
                    nVarPoll.a(eVar);
                }
            }
        }
    }
}