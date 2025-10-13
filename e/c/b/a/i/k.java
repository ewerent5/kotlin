package e.c.b.a.i;

import java.util.concurrent.Executor;

/* compiled from: SafeLoggingExecutor.java */
/* loaded from: classes.dex */
class k implements Executor {

    /* renamed from: e, reason: collision with root package name */
    private final Executor f14261e;

    /* compiled from: SafeLoggingExecutor.java */
    static class a implements Runnable {

        /* renamed from: e, reason: collision with root package name */
        private final Runnable f14262e;

        a(Runnable runnable) {
            this.f14262e = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f14262e.run();
            } catch (Exception e2) {
                e.c.b.a.i.u.a.c("Executor", "Background execution failure.", e2);
            }
        }
    }

    k(Executor executor) {
        this.f14261e = executor;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f14261e.execute(new a(runnable));
    }
}