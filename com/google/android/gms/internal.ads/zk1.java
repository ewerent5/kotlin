package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.overlay.zzp;
import com.google.android.gms.ads.internal.util.zzr;
import com.google.android.gms.ads.internal.zzs;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class zk1 extends v implements zzp, j33 {

    /* renamed from: e, reason: collision with root package name */
    private final cy f10611e;

    /* renamed from: f, reason: collision with root package name */
    private final Context f10612f;

    /* renamed from: h, reason: collision with root package name */
    private final String f10614h;

    /* renamed from: i, reason: collision with root package name */
    private final tk1 f10615i;

    /* renamed from: j, reason: collision with root package name */
    private final rk1 f10616j;

    /* renamed from: l, reason: collision with root package name */
    @GuardedBy("this")
    private l30 f10618l;

    /* renamed from: m, reason: collision with root package name */
    @GuardedBy("this")
    protected k40 f10619m;

    /* renamed from: g, reason: collision with root package name */
    private AtomicBoolean f10613g = new AtomicBoolean();

    /* renamed from: k, reason: collision with root package name */
    @GuardedBy("this")
    private long f10617k = -1;

    public zk1(cy cyVar, Context context, String str, tk1 tk1Var, rk1 rk1Var) {
        this.f10611e = cyVar;
        this.f10612f = context;
        this.f10614h = str;
        this.f10615i = tk1Var;
        this.f10616j = rk1Var;
        rk1Var.g(this);
    }

    private final synchronized void K4(int i2) {
        if (this.f10613g.compareAndSet(false, true)) {
            this.f10616j.j();
            l30 l30Var = this.f10618l;
            if (l30Var != null) {
                zzs.zzf().c(l30Var);
            }
            if (this.f10619m != null) {
                long jC = -1;
                if (this.f10617k != -1) {
                    jC = zzs.zzj().c() - this.f10617k;
                }
                this.f10619m.j(jC, i2);
            }
            zzc();
        }
    }

    final /* synthetic */ void I4() {
        K4(5);
    }

    public final void t() {
        this.f10611e.h().execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.vk1

            /* renamed from: e, reason: collision with root package name */
            private final zk1 f9720e;

            {
                this.f9720e = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f9720e.I4();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.w
    public final synchronized boolean zzA() {
        return this.f10615i.zzb();
    }

    @Override // com.google.android.gms.internal.ads.w
    public final void zzB(mm mmVar) {
    }

    @Override // com.google.android.gms.internal.ads.w
    public final void zzC(String str) {
    }

    @Override // com.google.android.gms.internal.ads.w
    public final void zzD(String str) {
    }

    @Override // com.google.android.gms.internal.ads.w
    public final synchronized n1 zzE() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.w
    public final synchronized void zzF(d3 d3Var) {
    }

    @Override // com.google.android.gms.internal.ads.w
    public final void zzG(r1 r1Var) {
    }

    @Override // com.google.android.gms.internal.ads.w
    public final void zzH(y93 y93Var) {
        this.f10615i.c(y93Var);
    }

    @Override // com.google.android.gms.internal.ads.w
    public final void zzI(t33 t33Var) {
        this.f10616j.b(t33Var);
    }

    @Override // com.google.android.gms.internal.ads.w
    public final void zzJ(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.w
    public final void zzO(h1 h1Var) {
    }

    @Override // com.google.android.gms.internal.ads.w
    public final void zzP(m93 m93Var, m mVar) {
    }

    @Override // com.google.android.gms.internal.ads.w
    public final void zzQ(e.c.b.b.b.b bVar) {
    }

    @Override // com.google.android.gms.internal.ads.w
    public final void zzR(l0 l0Var) {
    }

    @Override // com.google.android.gms.internal.ads.j33
    public final void zza() {
        K4(3);
    }

    @Override // com.google.android.gms.internal.ads.w
    public final synchronized void zzab(i0 i0Var) {
    }

    @Override // com.google.android.gms.internal.ads.w
    public final e.c.b.b.b.b zzb() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.w
    public final boolean zzbI() {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzbJ() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final synchronized void zzbo() {
        if (this.f10619m == null) {
            return;
        }
        this.f10617k = zzs.zzj().c();
        int i2 = this.f10619m.i();
        if (i2 <= 0) {
            return;
        }
        l30 l30Var = new l30(this.f10611e.i(), zzs.zzj());
        this.f10618l = l30Var;
        l30Var.a(i2, new Runnable(this) { // from class: com.google.android.gms.internal.ads.wk1

            /* renamed from: e, reason: collision with root package name */
            private final zk1 f9987e;

            {
                this.f9987e = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f9987e.t();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final synchronized void zzbr() {
        k40 k40Var = this.f10619m;
        if (k40Var != null) {
            k40Var.j(zzs.zzj().c() - this.f10617k, 1);
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzbs() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzbt(int i2) {
        int i3 = i2 - 1;
        if (i2 == 0) {
            throw null;
        }
        if (i3 == 0) {
            K4(2);
            return;
        }
        if (i3 == 1) {
            K4(4);
        } else if (i3 == 2) {
            K4(3);
        } else {
            if (i3 != 3) {
                return;
            }
            K4(6);
        }
    }

    @Override // com.google.android.gms.internal.ads.w
    public final synchronized void zzc() {
        com.google.android.gms.common.internal.p.e("destroy must be called on the main UI thread.");
        k40 k40Var = this.f10619m;
        if (k40Var != null) {
            k40Var.b();
        }
    }

    @Override // com.google.android.gms.internal.ads.w
    public final synchronized boolean zze(m93 m93Var) {
        com.google.android.gms.common.internal.p.e("loadAd must be called on the main UI thread.");
        zzs.zzc();
        if (zzr.zzJ(this.f10612f) && m93Var.w == null) {
            er.zzf("Failed to load the ad because app ID is missing.");
            this.f10616j.B0(mq1.d(4, null, null));
            return false;
        }
        if (zzA()) {
            return false;
        }
        this.f10613g = new AtomicBoolean();
        return this.f10615i.a(m93Var, this.f10614h, new xk1(this), new yk1(this));
    }

    @Override // com.google.android.gms.internal.ads.w
    public final synchronized void zzf() {
        com.google.android.gms.common.internal.p.e("pause must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.internal.ads.w
    public final synchronized void zzg() {
        com.google.android.gms.common.internal.p.e("resume must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.internal.ads.w
    public final void zzh(j jVar) {
    }

    @Override // com.google.android.gms.internal.ads.w
    public final void zzi(e0 e0Var) {
    }

    @Override // com.google.android.gms.internal.ads.w
    public final void zzj(a0 a0Var) {
    }

    @Override // com.google.android.gms.internal.ads.w
    public final Bundle zzk() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.w
    public final synchronized void zzl() {
    }

    @Override // com.google.android.gms.internal.ads.w
    public final synchronized void zzm() {
    }

    @Override // com.google.android.gms.internal.ads.w
    public final synchronized r93 zzn() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.w
    public final synchronized void zzo(r93 r93Var) {
        com.google.android.gms.common.internal.p.e("setAdSize must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.internal.ads.w
    public final void zzp(ek ekVar) {
    }

    @Override // com.google.android.gms.internal.ads.w
    public final void zzq(hk hkVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.w
    public final synchronized String zzr() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.w
    public final synchronized String zzs() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.w
    public final synchronized k1 zzt() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.w
    public final synchronized String zzu() {
        return this.f10614h;
    }

    @Override // com.google.android.gms.internal.ads.w
    public final e0 zzv() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.w
    public final j zzw() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.w
    public final synchronized void zzx(s4 s4Var) {
    }

    @Override // com.google.android.gms.internal.ads.w
    public final void zzy(g gVar) {
    }

    @Override // com.google.android.gms.internal.ads.w
    public final synchronized void zzz(boolean z) {
    }
}