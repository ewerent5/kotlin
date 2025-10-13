package e.c.b.d.a.f;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class s implements Executor {

    /* renamed from: e, reason: collision with root package name */
    private final Handler f15385e = new Handler(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f15385e.post(runnable);
    }
}