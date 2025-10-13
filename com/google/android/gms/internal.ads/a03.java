package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import ch.qos.logback.classic.Level;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.internal.ads.b03;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
@SuppressLint({"HandlerLeak"})
/* loaded from: classes.dex */
final class a03<T extends b03> extends Handler implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    private final T f4798e;

    /* renamed from: f, reason: collision with root package name */
    private final zz2<T> f4799f;

    /* renamed from: g, reason: collision with root package name */
    public final int f4800g;

    /* renamed from: h, reason: collision with root package name */
    private final long f4801h;

    /* renamed from: i, reason: collision with root package name */
    private IOException f4802i;

    /* renamed from: j, reason: collision with root package name */
    private int f4803j;

    /* renamed from: k, reason: collision with root package name */
    private volatile Thread f4804k;

    /* renamed from: l, reason: collision with root package name */
    private volatile boolean f4805l;

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ d03 f4806m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a03(d03 d03Var, Looper looper, T t, zz2<T> zz2Var, int i2, long j2) {
        super(looper);
        this.f4806m = d03Var;
        this.f4798e = t;
        this.f4799f = zz2Var;
        this.f4800g = i2;
        this.f4801h = j2;
    }

    private final void d() {
        this.f4802i = null;
        this.f4806m.a.execute(this.f4806m.f5402b);
    }

    public final void a(int i2) {
        IOException iOException = this.f4802i;
        if (iOException != null && this.f4803j > i2) {
            throw iOException;
        }
    }

    public final void b(long j2) {
        f03.d(this.f4806m.f5402b == null);
        this.f4806m.f5402b = this;
        if (j2 > 0) {
            sendEmptyMessageDelayed(0, j2);
        } else {
            d();
        }
    }

    public final void c(boolean z) {
        this.f4805l = z;
        this.f4802i = null;
        if (hasMessages(0)) {
            removeMessages(0);
            if (!z) {
                sendEmptyMessage(1);
                return;
            }
        } else {
            this.f4798e.zzb();
            if (this.f4804k != null) {
                this.f4804k.interrupt();
            }
            if (!z) {
                return;
            }
        }
        this.f4806m.f5402b = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.f4799f.h(this.f4798e, jElapsedRealtime, jElapsedRealtime - this.f4801h, true);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.f4805l) {
            return;
        }
        int i2 = message.what;
        if (i2 == 0) {
            d();
            return;
        }
        if (i2 == 4) {
            throw ((Error) message.obj);
        }
        this.f4806m.f5402b = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = jElapsedRealtime - this.f4801h;
        if (this.f4798e.zzc()) {
            this.f4799f.h(this.f4798e, jElapsedRealtime, j2, false);
            return;
        }
        int i3 = message.what;
        if (i3 == 1) {
            this.f4799f.h(this.f4798e, jElapsedRealtime, j2, false);
            return;
        }
        if (i3 == 2) {
            this.f4799f.k(this.f4798e, jElapsedRealtime, j2);
            return;
        }
        if (i3 != 3) {
            return;
        }
        IOException iOException = (IOException) message.obj;
        this.f4802i = iOException;
        int iC = this.f4799f.c(this.f4798e, jElapsedRealtime, j2, iOException);
        if (iC == 3) {
            this.f4806m.f5403c = this.f4802i;
        } else if (iC != 2) {
            this.f4803j = iC != 1 ? 1 + this.f4803j : 1;
            b(Math.min((r1 - 1) * CoreConstants.MILLIS_IN_ONE_SECOND, Level.TRACE_INT));
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f4804k = Thread.currentThread();
            if (!this.f4798e.zzc()) {
                String simpleName = this.f4798e.getClass().getSimpleName();
                t03.a(simpleName.length() != 0 ? "load:".concat(simpleName) : new String("load:"));
                try {
                    this.f4798e.zzd();
                    t03.b();
                } catch (Throwable th) {
                    t03.b();
                    throw th;
                }
            }
            if (this.f4805l) {
                return;
            }
            sendEmptyMessage(2);
        } catch (IOException e2) {
            if (this.f4805l) {
                return;
            }
            obtainMessage(3, e2).sendToTarget();
        } catch (InterruptedException unused) {
            f03.d(this.f4798e.zzc());
            if (this.f4805l) {
                return;
            }
            sendEmptyMessage(2);
        } catch (Exception e3) {
            Log.e("LoadTask", "Unexpected exception loading stream", e3);
            if (this.f4805l) {
                return;
            }
            obtainMessage(3, new c03(e3)).sendToTarget();
        } catch (OutOfMemoryError e4) {
            Log.e("LoadTask", "OutOfMemory error loading stream", e4);
            if (this.f4805l) {
                return;
            }
            obtainMessage(3, new c03(e4)).sendToTarget();
        } catch (Error e5) {
            Log.e("LoadTask", "Unexpected error loading stream", e5);
            if (!this.f4805l) {
                obtainMessage(4, e5).sendToTarget();
            }
            throw e5;
        }
    }
}