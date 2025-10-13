package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.overlay.zzaa;
import com.google.android.gms.ads.internal.overlay.zzq;
import com.google.android.gms.ads.internal.overlay.zzr;
import com.google.android.gms.ads.internal.zzs;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class uj1 extends v implements zzaa, j33, pc0 {

    /* renamed from: e, reason: collision with root package name */
    private final cy f9470e;

    /* renamed from: f, reason: collision with root package name */
    private final Context f9471f;

    /* renamed from: g, reason: collision with root package name */
    private final ViewGroup f9472g;

    /* renamed from: i, reason: collision with root package name */
    private final String f9474i;

    /* renamed from: j, reason: collision with root package name */
    private final oj1 f9475j;

    /* renamed from: k, reason: collision with root package name */
    private final rk1 f9476k;

    /* renamed from: l, reason: collision with root package name */
    private final kr f9477l;
    private l30 n;

    @GuardedBy("this")
    protected z30 o;

    /* renamed from: h, reason: collision with root package name */
    private AtomicBoolean f9473h = new AtomicBoolean();

    /* renamed from: m, reason: collision with root package name */
    private long f9478m = -1;

    public uj1(cy cyVar, Context context, String str, oj1 oj1Var, rk1 rk1Var, kr krVar) {
        this.f9472g = new FrameLayout(context);
        this.f9470e = cyVar;
        this.f9471f = context;
        this.f9474i = str;
        this.f9475j = oj1Var;
        this.f9476k = rk1Var;
        rk1Var.e(this);
        this.f9477l = krVar;
    }

    static /* synthetic */ zzr M4(uj1 uj1Var, z30 z30Var) {
        boolean zL = z30Var.l();
        int iIntValue = ((Integer) c.c().b(w3.b3)).intValue();
        zzq zzqVar = new zzq();
        zzqVar.zzd = 50;
        zzqVar.zza = true != zL ? 0 : iIntValue;
        zzqVar.zzb = true != zL ? iIntValue : 0;
        zzqVar.zzc = iIntValue;
        return new zzr(uj1Var.f9471f, zzqVar, uj1Var);
    }

    private final synchronized void P4(int i2) {
        if (this.f9473h.compareAndSet(false, true)) {
            z30 z30Var = this.o;
            if (z30Var != null && z30Var.q() != null) {
                this.f9476k.k(this.o.q());
            }
            this.f9476k.j();
            this.f9472g.removeAllViews();
            l30 l30Var = this.n;
            if (l30Var != null) {
                zzs.zzf().c(l30Var);
            }
            if (this.o != null) {
                long jC = -1;
                if (this.f9478m != -1) {
                    jC = zzs.zzj().c() - this.f9478m;
                }
                this.o.o(jC, i2);
            }
            zzc();
        }
    }

    public final void I4() {
        ta3.a();
        if (xq.p()) {
            P4(5);
        } else {
            this.f9470e.h().execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.qj1

                /* renamed from: e, reason: collision with root package name */
                private final uj1 f8398e;

                {
                    this.f8398e = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f8398e.J4();
                }
            });
        }
    }

    final /* synthetic */ void J4() {
        P4(5);
    }

    @Override // com.google.android.gms.internal.ads.pc0
    public final void t() {
        if (this.o == null) {
            return;
        }
        this.f9478m = zzs.zzj().c();
        int i2 = this.o.i();
        if (i2 <= 0) {
            return;
        }
        l30 l30Var = new l30(this.f9470e.i(), zzs.zzj());
        this.n = l30Var;
        l30Var.a(i2, new Runnable(this) { // from class: com.google.android.gms.internal.ads.rj1

            /* renamed from: e, reason: collision with root package name */
            private final uj1 f8655e;

            {
                this.f8655e = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f8655e.I4();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.w
    public final synchronized boolean zzA() {
        return this.f9475j.zzb();
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
        this.f9475j.c(y93Var);
    }

    @Override // com.google.android.gms.internal.ads.w
    public final void zzI(t33 t33Var) {
        this.f9476k.b(t33Var);
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
        P4(3);
    }

    @Override // com.google.android.gms.internal.ads.w
    public final synchronized void zzab(i0 i0Var) {
    }

    @Override // com.google.android.gms.internal.ads.w
    public final e.c.b.b.b.b zzb() {
        com.google.android.gms.common.internal.p.e("getAdFrame must be called on the main UI thread.");
        return e.c.b.b.b.d.m4(this.f9472g);
    }

    @Override // com.google.android.gms.internal.ads.w
    public final boolean zzbI() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.w
    public final synchronized void zzc() {
        com.google.android.gms.common.internal.p.e("destroy must be called on the main UI thread.");
        z30 z30Var = this.o;
        if (z30Var != null) {
            z30Var.b();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzaa
    public final void zzd() {
        P4(4);
    }

    @Override // com.google.android.gms.internal.ads.w
    public final synchronized boolean zze(m93 m93Var) {
        com.google.android.gms.common.internal.p.e("loadAd must be called on the main UI thread.");
        zzs.zzc();
        if (com.google.android.gms.ads.internal.util.zzr.zzJ(this.f9471f) && m93Var.w == null) {
            er.zzf("Failed to load the ad because app ID is missing.");
            this.f9476k.B0(mq1.d(4, null, null));
            return false;
        }
        if (zzA()) {
            return false;
        }
        this.f9473h = new AtomicBoolean();
        return this.f9475j.a(m93Var, this.f9474i, new sj1(this), new tj1(this));
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
    public final void zzl() {
    }

    @Override // com.google.android.gms.internal.ads.w
    public final synchronized void zzm() {
    }

    @Override // com.google.android.gms.internal.ads.w
    public final synchronized r93 zzn() {
        com.google.android.gms.common.internal.p.e("getAdSize must be called on the main UI thread.");
        z30 z30Var = this.o;
        if (z30Var == null) {
            return null;
        }
        return up1.b(this.f9471f, Collections.singletonList(z30Var.g()));
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
        return this.f9474i;
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