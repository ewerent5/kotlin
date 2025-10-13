package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.ads.c;
import com.google.android.gms.internal.ads.er;
import com.google.android.gms.internal.ads.hp2;
import com.google.android.gms.internal.ads.kr;
import com.google.android.gms.internal.ads.lx1;
import com.google.android.gms.internal.ads.oz1;
import com.google.android.gms.internal.ads.qr;
import com.google.android.gms.internal.ads.ta3;
import com.google.android.gms.internal.ads.uy1;
import com.google.android.gms.internal.ads.w3;
import com.google.android.gms.internal.ads.wj2;
import com.google.android.gms.internal.ads.xq;
import com.google.android.gms.internal.ads.zm2;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class zzi implements Runnable, zm2 {
    private final boolean zze;
    private final boolean zzf;
    private final boolean zzg;
    private final Executor zzh;
    private final lx1 zzi;
    private Context zzj;
    private final Context zzk;
    private kr zzl;
    private final kr zzm;
    private final boolean zzn;
    private int zzo;
    private final List<Object[]> zzb = new Vector();
    private final AtomicReference<zm2> zzc = new AtomicReference<>();
    private final AtomicReference<zm2> zzd = new AtomicReference<>();
    final CountDownLatch zza = new CountDownLatch(1);

    public zzi(Context context, kr krVar) {
        this.zzj = context;
        this.zzk = context;
        this.zzl = krVar;
        this.zzm = krVar;
        ExecutorService executorServiceNewCachedThreadPool = Executors.newCachedThreadPool();
        this.zzh = executorServiceNewCachedThreadPool;
        boolean zBooleanValue = ((Boolean) c.c().b(w3.t1)).booleanValue();
        this.zzn = zBooleanValue;
        lx1 lx1VarB = lx1.b(context, executorServiceNewCachedThreadPool, zBooleanValue);
        this.zzi = lx1VarB;
        this.zzf = ((Boolean) c.c().b(w3.p1)).booleanValue();
        this.zzg = ((Boolean) c.c().b(w3.u1)).booleanValue();
        if (((Boolean) c.c().b(w3.s1)).booleanValue()) {
            this.zzo = 2;
        } else {
            this.zzo = 1;
        }
        Context context2 = this.zzj;
        zzh zzhVar = new zzh(this);
        this.zze = new oz1(this.zzj, uy1.b(context2, lx1VarB), zzhVar, ((Boolean) c.c().b(w3.q1)).booleanValue()).d(1);
        if (((Boolean) c.c().b(w3.L1)).booleanValue()) {
            qr.a.execute(this);
            return;
        }
        ta3.a();
        if (xq.p()) {
            qr.a.execute(this);
        } else {
            run();
        }
    }

    private final void zze() {
        zm2 zm2VarZzn = zzn();
        if (this.zzb.isEmpty() || zm2VarZzn == null) {
            return;
        }
        for (Object[] objArr : this.zzb) {
            int length = objArr.length;
            if (length == 1) {
                zm2VarZzn.zzf((MotionEvent) objArr[0]);
            } else if (length == 3) {
                zm2VarZzn.zzg(((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue(), ((Integer) objArr[2]).intValue());
            }
        }
        this.zzb.clear();
    }

    private final void zzm(boolean z) {
        this.zzc.set(hp2.r(this.zzl.f7054e, zzo(this.zzj), z, this.zzo));
    }

    private final zm2 zzn() {
        return zzd() == 2 ? this.zzd.get() : this.zzc.get();
    }

    private static final Context zzo(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            boolean z = this.zzl.f7057h;
            final boolean z2 = false;
            if (!((Boolean) c.c().b(w3.H0)).booleanValue() && z) {
                z2 = true;
            }
            if (zzd() == 1) {
                zzm(z2);
                if (this.zzo == 2) {
                    this.zzh.execute(new Runnable(this, z2) { // from class: com.google.android.gms.ads.internal.zzg
                        private final zzi zza;
                        private final boolean zzb;

                        {
                            this.zza = this;
                            this.zzb = z2;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zza.zzb(this.zzb);
                        }
                    });
                }
            } else {
                long jCurrentTimeMillis = System.currentTimeMillis();
                try {
                    wj2 wj2VarA = wj2.a(this.zzl.f7054e, zzo(this.zzj), z2, this.zzn);
                    this.zzd.set(wj2VarA);
                    if (this.zzg && !wj2VarA.c()) {
                        this.zzo = 1;
                        zzm(z2);
                    }
                } catch (NullPointerException e2) {
                    this.zzo = 1;
                    zzm(z2);
                    this.zzi.d(2031, System.currentTimeMillis() - jCurrentTimeMillis, e2);
                }
            }
        } finally {
            this.zza.countDown();
            this.zzj = null;
            this.zzl = null;
        }
    }

    protected final boolean zza() throws InterruptedException {
        try {
            this.zza.await();
            return true;
        } catch (InterruptedException e2) {
            er.zzj("Interrupted during GADSignals creation.", e2);
            return false;
        }
    }

    final /* synthetic */ void zzb(boolean z) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            wj2.a(this.zzm.f7054e, zzo(this.zzk), z, this.zzn).f();
        } catch (NullPointerException e2) {
            this.zzi.d(2027, System.currentTimeMillis() - jCurrentTimeMillis, e2);
        }
    }

    protected final int zzd() {
        if (!this.zzf || this.zze) {
            return this.zzo;
        }
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zm2
    public final void zzf(MotionEvent motionEvent) {
        zm2 zm2VarZzn = zzn();
        if (zm2VarZzn == null) {
            this.zzb.add(new Object[]{motionEvent});
        } else {
            zze();
            zm2VarZzn.zzf(motionEvent);
        }
    }

    @Override // com.google.android.gms.internal.ads.zm2
    public final void zzg(int i2, int i3, int i4) {
        zm2 zm2VarZzn = zzn();
        if (zm2VarZzn == null) {
            this.zzb.add(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)});
        } else {
            zze();
            zm2VarZzn.zzg(i2, i3, i4);
        }
    }

    @Override // com.google.android.gms.internal.ads.zm2
    public final String zzh(Context context, String str, View view, Activity activity) {
        zm2 zm2VarZzn;
        if (!zza() || (zm2VarZzn = zzn()) == null) {
            return "";
        }
        zze();
        return zm2VarZzn.zzh(zzo(context), str, view, activity);
    }

    @Override // com.google.android.gms.internal.ads.zm2
    public final String zzi(Context context, String str, View view) {
        return zzh(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.zm2
    public final void zzj(View view) {
        zm2 zm2VarZzn = zzn();
        if (zm2VarZzn != null) {
            zm2VarZzn.zzj(view);
        }
    }

    @Override // com.google.android.gms.internal.ads.zm2
    public final String zzk(Context context, View view, Activity activity) {
        zm2 zm2VarZzn = zzn();
        return zm2VarZzn != null ? zm2VarZzn.zzk(context, view, null) : "";
    }

    @Override // com.google.android.gms.internal.ads.zm2
    public final String zzl(Context context) {
        zm2 zm2VarZzn;
        if (!zza() || (zm2VarZzn = zzn()) == null) {
            return "";
        }
        zze();
        return zm2VarZzn.zzl(zzo(context));
    }
}