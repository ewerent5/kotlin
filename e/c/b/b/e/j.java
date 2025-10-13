package e.c.b.b.e;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-tasks@@17.0.2 */
/* loaded from: classes.dex */
public final class j {
    public static final Executor a = new a();

    /* renamed from: b, reason: collision with root package name */
    static final Executor f15019b = new c0();

    /* compiled from: com.google.android.gms:play-services-tasks@@17.0.2 */
    private static final class a implements Executor {

        /* renamed from: e, reason: collision with root package name */
        private final Handler f15020e = new e.c.b.b.c.f.a(Looper.getMainLooper());

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            this.f15020e.post(runnable);
        }
    }
}