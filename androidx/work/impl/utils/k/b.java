package androidx.work.impl.utils.k;

import android.os.Handler;
import android.os.Looper;
import androidx.work.impl.utils.f;
import java.util.concurrent.Executor;

/* compiled from: WorkManagerTaskExecutor.java */
/* loaded from: classes.dex */
public class b implements androidx.work.impl.utils.k.a {
    private final Executor a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f2394b = new Handler(Looper.getMainLooper());

    /* renamed from: c, reason: collision with root package name */
    private final Executor f2395c = new a();

    /* compiled from: WorkManagerTaskExecutor.java */
    class a implements Executor {
        a() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            b.this.d(runnable);
        }
    }

    public b(Executor executor) {
        this.a = new f(executor);
    }

    @Override // androidx.work.impl.utils.k.a
    public Executor a() {
        return this.f2395c;
    }

    @Override // androidx.work.impl.utils.k.a
    public void b(Runnable runnable) {
        this.a.execute(runnable);
    }

    @Override // androidx.work.impl.utils.k.a
    public Executor c() {
        return this.a;
    }

    public void d(Runnable runnable) {
        this.f2394b.post(runnable);
    }
}