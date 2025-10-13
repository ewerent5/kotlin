package androidx.room;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* compiled from: TransactionExecutor.java */
/* loaded from: classes.dex */
class a1 implements Executor {

    /* renamed from: e, reason: collision with root package name */
    private final Executor f1792e;

    /* renamed from: f, reason: collision with root package name */
    private final ArrayDeque<Runnable> f1793f = new ArrayDeque<>();

    /* renamed from: g, reason: collision with root package name */
    private Runnable f1794g;

    /* compiled from: TransactionExecutor.java */
    class a implements Runnable {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Runnable f1795e;

        a(Runnable runnable) {
            this.f1795e = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f1795e.run();
            } finally {
                a1.this.a();
            }
        }
    }

    a1(Executor executor) {
        this.f1792e = executor;
    }

    synchronized void a() {
        Runnable runnablePoll = this.f1793f.poll();
        this.f1794g = runnablePoll;
        if (runnablePoll != null) {
            this.f1792e.execute(runnablePoll);
        }
    }

    @Override // java.util.concurrent.Executor
    public synchronized void execute(Runnable runnable) {
        this.f1793f.offer(new a(runnable));
        if (this.f1794g == null) {
            a();
        }
    }
}