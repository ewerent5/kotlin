package e.a.a;

import android.os.Handler;
import android.os.HandlerThread;

/* compiled from: WorkerThread.java */
/* loaded from: classes.dex */
public class n extends HandlerThread {

    /* renamed from: e, reason: collision with root package name */
    private Handler f14197e;

    public n(String str) {
        super(str);
    }

    private synchronized void c() {
        if (this.f14197e == null) {
            this.f14197e = new Handler(getLooper());
        }
    }

    void a(Runnable runnable) {
        c();
        this.f14197e.post(runnable);
    }

    void b(Runnable runnable, long j2) {
        c();
        this.f14197e.postDelayed(runnable, j2);
    }
}