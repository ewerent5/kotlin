package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.util.zzr;
import com.google.android.gms.ads.internal.zzs;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class eb1 extends v {

    /* renamed from: e */
    private final r93 f5611e;

    /* renamed from: f */
    private final Context f5612f;

    /* renamed from: g */
    private final an1 f5613g;

    /* renamed from: h */
    private final String f5614h;

    /* renamed from: i */
    private final wa1 f5615i;

    /* renamed from: j */
    private final ao1 f5616j;

    /* renamed from: k */
    @GuardedBy("this")
    private li0 f5617k;

    /* renamed from: l */
    @GuardedBy("this")
    private boolean f5618l = ((Boolean) c.c().b(w3.t0)).booleanValue();

    public eb1(Context context, r93 r93Var, String str, an1 an1Var, wa1 wa1Var, ao1 ao1Var) {
        this.f5611e = r93Var;
        this.f5614h = str;
        this.f5612f = context;
        this.f5613g = an1Var;
        this.f5615i = wa1Var;
        this.f5616j = ao1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final synchronized boolean K4() {
        /*
            r1 = this;
            monitor-enter(r1)
            com.google.android.gms.internal.ads.li0 r0 = r1.f5617k     // Catch: java.lang.Throwable -> L10
            if (r0 == 0) goto Le
            boolean r0 = r0.h()     // Catch: java.lang.Throwable -> L10
            if (r0 != 0) goto Le
            r0 = 1
        Lc:
            monitor-exit(r1)
            return r0
        Le:
            r0 = 0
            goto Lc
        L10:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.eb1.K4():boolean");
    }

    @Override // com.google.android.gms.internal.ads.w
    public final synchronized boolean zzA() {
        return this.f5613g.zzb();
    }

    @Override // com.google.android.gms.internal.ads.w
    public final void zzB(mm mmVar) {
        this.f5616j.A(mmVar);
    }

    @Override // com.google.android.gms.internal.ads.w
    public final void zzC(String str) {
    }

    @Override // com.google.android.gms.internal.ads.w
    public final void zzD(String str) {
    }

    @Override // com.google.android.gms.internal.ads.w
    public final n1 zzE() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.w
    public final void zzF(d3 d3Var) {
    }

    @Override // com.google.android.gms.internal.ads.w
    public final void zzG(r1 r1Var) {
    }

    @Override // com.google.android.gms.internal.ads.w
    public final void zzH(y93 y93Var) {
    }

    @Override // com.google.android.gms.internal.ads.w
    public final void zzI(t33 t33Var) {
    }

    @Override // com.google.android.gms.internal.ads.w
    public final synchronized void zzJ(boolean z) {
        com.google.android.gms.common.internal.p.e("setImmersiveMode must be called on the main UI thread.");
        this.f5618l = z;
    }

    @Override // com.google.android.gms.internal.ads.w
    public final void zzO(h1 h1Var) {
        com.google.android.gms.common.internal.p.e("setPaidEventListener must be called on the main UI thread.");
        this.f5615i.z(h1Var);
    }

    @Override // com.google.android.gms.internal.ads.w
    public final void zzP(m93 m93Var, m mVar) {
        this.f5615i.A(mVar);
        zze(m93Var);
    }

    @Override // com.google.android.gms.internal.ads.w
    public final synchronized void zzQ(e.c.b.b.b.b bVar) {
        if (this.f5617k == null) {
            er.zzi("Interstitial can not be shown before loaded.");
            this.f5615i.I(mq1.d(9, null, null));
        } else {
            this.f5617k.g(this.f5618l, (Activity) e.c.b.b.b.d.Y(bVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.w
    public final void zzR(l0 l0Var) {
        this.f5615i.G(l0Var);
    }

    @Override // com.google.android.gms.internal.ads.w
    public final void zzab(i0 i0Var) {
    }

    @Override // com.google.android.gms.internal.ads.w
    public final e.c.b.b.b.b zzb() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.w
    public final synchronized boolean zzbI() {
        com.google.android.gms.common.internal.p.e("isLoaded must be called on the main UI thread.");
        return K4();
    }

    @Override // com.google.android.gms.internal.ads.w
    public final synchronized void zzc() {
        com.google.android.gms.common.internal.p.e("destroy must be called on the main UI thread.");
        li0 li0Var = this.f5617k;
        if (li0Var != null) {
            li0Var.c().M0(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.w
    public final synchronized boolean zze(m93 m93Var) {
        com.google.android.gms.common.internal.p.e("loadAd must be called on the main UI thread.");
        zzs.zzc();
        if (zzr.zzJ(this.f5612f) && m93Var.w == null) {
            er.zzf("Failed to load the ad because app ID is missing.");
            wa1 wa1Var = this.f5615i;
            if (wa1Var != null) {
                wa1Var.B0(mq1.d(4, null, null));
            }
            return false;
        }
        if (K4()) {
            return false;
        }
        gq1.b(this.f5612f, m93Var.f7448j);
        this.f5617k = null;
        return this.f5613g.a(m93Var, this.f5614h, new tm1(this.f5611e), new db1(this));
    }

    @Override // com.google.android.gms.internal.ads.w
    public final synchronized void zzf() {
        com.google.android.gms.common.internal.p.e("pause must be called on the main UI thread.");
        li0 li0Var = this.f5617k;
        if (li0Var != null) {
            li0Var.c().K0(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.w
    public final synchronized void zzg() {
        com.google.android.gms.common.internal.p.e("resume must be called on the main UI thread.");
        li0 li0Var = this.f5617k;
        if (li0Var != null) {
            li0Var.c().L0(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.w
    public final void zzh(j jVar) {
        com.google.android.gms.common.internal.p.e("setAdListener must be called on the main UI thread.");
        this.f5615i.u(jVar);
    }

    @Override // com.google.android.gms.internal.ads.w
    public final void zzi(e0 e0Var) {
        com.google.android.gms.common.internal.p.e("setAppEventListener must be called on the main UI thread.");
        this.f5615i.x(e0Var);
    }

    @Override // com.google.android.gms.internal.ads.w
    public final void zzj(a0 a0Var) {
        com.google.android.gms.common.internal.p.e("setAdMetadataListener must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.internal.ads.w
    public final Bundle zzk() {
        com.google.android.gms.common.internal.p.e("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.w
    public final synchronized void zzl() {
        com.google.android.gms.common.internal.p.e("showInterstitial must be called on the main UI thread.");
        li0 li0Var = this.f5617k;
        if (li0Var == null) {
            return;
        }
        li0Var.g(this.f5618l, null);
    }

    @Override // com.google.android.gms.internal.ads.w
    public final void zzm() {
    }

    @Override // com.google.android.gms.internal.ads.w
    public final r93 zzn() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.w
    public final void zzo(r93 r93Var) {
    }

    @Override // com.google.android.gms.internal.ads.w
    public final void zzp(ek ekVar) {
    }

    @Override // com.google.android.gms.internal.ads.w
    public final void zzq(hk hkVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.w
    public final synchronized String zzr() {
        li0 li0Var = this.f5617k;
        if (li0Var == null || li0Var.d() == null) {
            return null;
        }
        return this.f5617k.d().zze();
    }

    @Override // com.google.android.gms.internal.ads.w
    public final synchronized String zzs() {
        li0 li0Var = this.f5617k;
        if (li0Var == null || li0Var.d() == null) {
            return null;
        }
        return this.f5617k.d().zze();
    }

    @Override // com.google.android.gms.internal.ads.w
    public final synchronized k1 zzt() {
        if (!((Boolean) c.c().b(w3.P4)).booleanValue()) {
            return null;
        }
        li0 li0Var = this.f5617k;
        if (li0Var == null) {
            return null;
        }
        return li0Var.d();
    }

    @Override // com.google.android.gms.internal.ads.w
    public final synchronized String zzu() {
        return this.f5614h;
    }

    @Override // com.google.android.gms.internal.ads.w
    public final e0 zzv() {
        return this.f5615i.o();
    }

    @Override // com.google.android.gms.internal.ads.w
    public final j zzw() {
        return this.f5615i.m();
    }

    @Override // com.google.android.gms.internal.ads.w
    public final synchronized void zzx(s4 s4Var) {
        com.google.android.gms.common.internal.p.e("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.f5613g.b(s4Var);
    }

    @Override // com.google.android.gms.internal.ads.w
    public final void zzy(g gVar) {
    }

    @Override // com.google.android.gms.internal.ads.w
    public final void zzz(boolean z) {
    }
}