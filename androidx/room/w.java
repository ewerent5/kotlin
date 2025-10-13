package androidx.room;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: AutoCloser.java */
/* loaded from: classes.dex */
final class w {

    /* renamed from: e, reason: collision with root package name */
    final long f1981e;

    /* renamed from: f, reason: collision with root package name */
    final Executor f1982f;

    /* renamed from: i, reason: collision with root package name */
    c.r.a.b f1985i;
    private c.r.a.c a = null;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f1978b = new Handler(Looper.getMainLooper());

    /* renamed from: c, reason: collision with root package name */
    Runnable f1979c = null;

    /* renamed from: d, reason: collision with root package name */
    final Object f1980d = new Object();

    /* renamed from: g, reason: collision with root package name */
    int f1983g = 0;

    /* renamed from: h, reason: collision with root package name */
    long f1984h = SystemClock.uptimeMillis();

    /* renamed from: j, reason: collision with root package name */
    private boolean f1986j = false;

    /* renamed from: k, reason: collision with root package name */
    private final Runnable f1987k = new a();

    /* renamed from: l, reason: collision with root package name */
    final Runnable f1988l = new b();

    /* compiled from: AutoCloser.java */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            w wVar = w.this;
            wVar.f1982f.execute(wVar.f1988l);
        }
    }

    /* compiled from: AutoCloser.java */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (w.this.f1980d) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                w wVar = w.this;
                if (jUptimeMillis - wVar.f1984h < wVar.f1981e) {
                    return;
                }
                if (wVar.f1983g != 0) {
                    return;
                }
                Runnable runnable = wVar.f1979c;
                if (runnable == null) {
                    throw new IllegalStateException("mOnAutoCloseCallback is null but it should have been set before use. Please file a bug against Room at: https://issuetracker.google.com/issues/new?component=413107&template=1096568");
                }
                runnable.run();
                c.r.a.b bVar = w.this.f1985i;
                if (bVar != null && bVar.isOpen()) {
                    try {
                        w.this.f1985i.close();
                    } catch (IOException e2) {
                        androidx.room.c1.e.a(e2);
                    }
                    w.this.f1985i = null;
                }
            }
        }
    }

    w(long j2, TimeUnit timeUnit, Executor executor) {
        this.f1981e = timeUnit.toMillis(j2);
        this.f1982f = executor;
    }

    public void a() {
        synchronized (this.f1980d) {
            this.f1986j = true;
            c.r.a.b bVar = this.f1985i;
            if (bVar != null) {
                bVar.close();
            }
            this.f1985i = null;
        }
    }

    public void b() {
        synchronized (this.f1980d) {
            int i2 = this.f1983g;
            if (i2 <= 0) {
                throw new IllegalStateException("ref count is 0 or lower but we're supposed to decrement");
            }
            int i3 = i2 - 1;
            this.f1983g = i3;
            if (i3 == 0) {
                if (this.f1985i == null) {
                } else {
                    this.f1978b.postDelayed(this.f1987k, this.f1981e);
                }
            }
        }
    }

    public <V> V c(c.b.a.c.a<c.r.a.b, V> aVar) {
        try {
            return aVar.apply(e());
        } finally {
            b();
        }
    }

    public c.r.a.b d() {
        c.r.a.b bVar;
        synchronized (this.f1980d) {
            bVar = this.f1985i;
        }
        return bVar;
    }

    public c.r.a.b e() {
        synchronized (this.f1980d) {
            this.f1978b.removeCallbacks(this.f1987k);
            this.f1983g++;
            if (this.f1986j) {
                throw new IllegalStateException("Attempting to open already closed database.");
            }
            c.r.a.b bVar = this.f1985i;
            if (bVar != null && bVar.isOpen()) {
                return this.f1985i;
            }
            c.r.a.c cVar = this.a;
            if (cVar == null) {
                throw new IllegalStateException("AutoCloser has not been initialized. Please file a bug against Room at: https://issuetracker.google.com/issues/new?component=413107&template=1096568");
            }
            c.r.a.b bVarC0 = cVar.c0();
            this.f1985i = bVarC0;
            return bVarC0;
        }
    }

    public void f(c.r.a.c cVar) {
        if (this.a != null) {
            Log.e("ROOM", "AutoCloser initialized multiple times. Please file a bug against room at: https://issuetracker.google.com/issues/new?component=413107&template=1096568");
        } else {
            this.a = cVar;
        }
    }

    public boolean g() {
        return !this.f1986j;
    }

    public void h(Runnable runnable) {
        this.f1979c = runnable;
    }
}