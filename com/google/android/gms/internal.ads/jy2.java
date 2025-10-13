package com.google.android.gms.internal.ads;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class jy2 extends Thread {

    /* renamed from: e, reason: collision with root package name */
    private static final boolean f6891e = pd.f8137b;

    /* renamed from: f, reason: collision with root package name */
    private final BlockingQueue<d1<?>> f6892f;

    /* renamed from: g, reason: collision with root package name */
    private final BlockingQueue<d1<?>> f6893g;

    /* renamed from: h, reason: collision with root package name */
    private final hw2 f6894h;

    /* renamed from: i, reason: collision with root package name */
    private volatile boolean f6895i = false;

    /* renamed from: j, reason: collision with root package name */
    private final qe f6896j;

    /* renamed from: k, reason: collision with root package name */
    private final o33 f6897k;

    /* JADX WARN: Multi-variable type inference failed */
    public jy2(BlockingQueue blockingQueue, BlockingQueue<d1<?>> blockingQueue2, BlockingQueue<d1<?>> blockingQueue3, hw2 hw2Var, o33 o33Var) {
        this.f6892f = blockingQueue;
        this.f6893g = blockingQueue2;
        this.f6894h = blockingQueue3;
        this.f6897k = hw2Var;
        this.f6896j = new qe(this, blockingQueue2, hw2Var, null);
    }

    private void c() throws InterruptedException {
        d1<?> d1VarTake = this.f6892f.take();
        d1VarTake.zzc("cache-queue-take");
        d1VarTake.zze(1);
        try {
            d1VarTake.zzl();
            gv2 gv2VarZza = this.f6894h.zza(d1VarTake.zzi());
            if (gv2VarZza == null) {
                d1VarTake.zzc("cache-miss");
                if (!this.f6896j.c(d1VarTake)) {
                    this.f6893g.put(d1VarTake);
                }
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (gv2VarZza.a(jCurrentTimeMillis)) {
                d1VarTake.zzc("cache-hit-expired");
                d1VarTake.zzj(gv2VarZza);
                if (!this.f6896j.c(d1VarTake)) {
                    this.f6893g.put(d1VarTake);
                }
                return;
            }
            d1VarTake.zzc("cache-hit");
            j7<?> j7VarZzr = d1VarTake.zzr(new t83(gv2VarZza.a, gv2VarZza.f6210g));
            d1VarTake.zzc("cache-hit-parsed");
            if (!j7VarZzr.c()) {
                d1VarTake.zzc("cache-parsing-failed");
                this.f6894h.a(d1VarTake.zzi(), true);
                d1VarTake.zzj(null);
                if (!this.f6896j.c(d1VarTake)) {
                    this.f6893g.put(d1VarTake);
                }
                return;
            }
            if (gv2VarZza.f6209f < jCurrentTimeMillis) {
                d1VarTake.zzc("cache-hit-refresh-needed");
                d1VarTake.zzj(gv2VarZza);
                j7VarZzr.f6702d = true;
                if (this.f6896j.c(d1VarTake)) {
                    this.f6897k.a(d1VarTake, j7VarZzr, null);
                } else {
                    this.f6897k.a(d1VarTake, j7VarZzr, new ix2(this, d1VarTake));
                }
            } else {
                this.f6897k.a(d1VarTake, j7VarZzr, null);
            }
        } finally {
            d1VarTake.zze(2);
        }
    }

    public final void a() {
        this.f6895i = true;
        interrupt();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        if (f6891e) {
            pd.a("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.f6894h.zzc();
        while (true) {
            try {
                c();
            } catch (InterruptedException unused) {
                if (this.f6895i) {
                    Thread.currentThread().interrupt();
                    return;
                }
                pd.c("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}