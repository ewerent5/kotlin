package e.c.b.d.a.f;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class r implements Executor {
    r() {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}