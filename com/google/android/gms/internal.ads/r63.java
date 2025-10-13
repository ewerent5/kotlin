package com.google.android.gms.internal.ads;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class r63 extends Thread {

    /* renamed from: e, reason: collision with root package name */
    private final BlockingQueue<d1<?>> f8604e;

    /* renamed from: f, reason: collision with root package name */
    private final q53 f8605f;

    /* renamed from: g, reason: collision with root package name */
    private final hw2 f8606g;

    /* renamed from: h, reason: collision with root package name */
    private volatile boolean f8607h = false;

    /* renamed from: i, reason: collision with root package name */
    private final o33 f8608i;

    /* JADX WARN: Multi-variable type inference failed */
    public r63(BlockingQueue blockingQueue, BlockingQueue<d1<?>> blockingQueue2, q53 q53Var, hw2 hw2Var, o33 o33Var) {
        this.f8604e = blockingQueue;
        this.f8605f = blockingQueue2;
        this.f8606g = q53Var;
        this.f8608i = hw2Var;
    }

    private void b() throws InterruptedException {
        d1<?> d1VarTake = this.f8604e.take();
        SystemClock.elapsedRealtime();
        d1VarTake.zze(3);
        try {
            d1VarTake.zzc("network-queue-take");
            d1VarTake.zzl();
            TrafficStats.setThreadStatsTag(d1VarTake.zzb());
            t83 t83VarZza = this.f8605f.zza(d1VarTake);
            d1VarTake.zzc("network-http-complete");
            if (t83VarZza.f9093e && d1VarTake.zzq()) {
                d1VarTake.zzd("not-modified");
                d1VarTake.zzw();
                return;
            }
            j7<?> j7VarZzr = d1VarTake.zzr(t83VarZza);
            d1VarTake.zzc("network-parse-complete");
            if (j7VarZzr.f6700b != null) {
                this.f8606g.b(d1VarTake.zzi(), j7VarZzr.f6700b);
                d1VarTake.zzc("network-cache-written");
            }
            d1VarTake.zzp();
            this.f8608i.a(d1VarTake, j7VarZzr, null);
            d1VarTake.zzv(j7VarZzr);
        } catch (ma e2) {
            SystemClock.elapsedRealtime();
            this.f8608i.b(d1VarTake, e2);
            d1VarTake.zzw();
        } catch (Exception e3) {
            pd.d(e3, "Unhandled exception %s", e3.toString());
            ma maVar = new ma(e3);
            SystemClock.elapsedRealtime();
            this.f8608i.b(d1VarTake, maVar);
            d1VarTake.zzw();
        } finally {
            d1VarTake.zze(4);
        }
    }

    public final void a() {
        this.f8607h = true;
        interrupt();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        Process.setThreadPriority(10);
        while (true) {
            try {
                b();
            } catch (InterruptedException unused) {
                if (this.f8607h) {
                    Thread.currentThread().interrupt();
                    return;
                }
                pd.c("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}