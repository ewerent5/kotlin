package androidx.work;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.work.ListenableWorker;

/* loaded from: classes.dex */
public abstract class Worker extends ListenableWorker {
    androidx.work.impl.utils.j.c<ListenableWorker.a> mFuture;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Worker.this.mFuture.p(Worker.this.doWork());
            } catch (Throwable th) {
                Worker.this.mFuture.q(th);
            }
        }
    }

    @Keep
    @SuppressLint({"BanKeepAnnotation"})
    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public abstract ListenableWorker.a doWork();

    @Override // androidx.work.ListenableWorker
    public final e.c.c.a.a.a<ListenableWorker.a> startWork() {
        this.mFuture = androidx.work.impl.utils.j.c.t();
        getBackgroundExecutor().execute(new a());
        return this.mFuture;
    }
}