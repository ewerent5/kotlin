package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.zzr;
import com.google.android.gms.ads.internal.zzs;
import java.util.Collections;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class da1 extends v implements fd0 {

    /* renamed from: e */
    private final Context f5452e;

    /* renamed from: f */
    private final gl1 f5453f;

    /* renamed from: g */
    private final String f5454g;

    /* renamed from: h */
    private final wa1 f5455h;

    /* renamed from: i */
    private r93 f5456i;

    /* renamed from: j */
    @GuardedBy("this")
    private final pp1 f5457j;

    /* renamed from: k */
    @GuardedBy("this")
    private r40 f5458k;

    public da1(Context context, r93 r93Var, String str, gl1 gl1Var, wa1 wa1Var) {
        this.f5452e = context;
        this.f5453f = gl1Var;
        this.f5456i = r93Var;
        this.f5454g = str;
        this.f5455h = wa1Var;
        this.f5457j = gl1Var.e();
        gl1Var.g(this);
    }

    private final synchronized void K4(r93 r93Var) {
        this.f5457j.r(r93Var);
        this.f5457j.s(this.f5456i.r);
    }

    private final synchronized boolean L4(m93 m93Var) {
        com.google.android.gms.common.internal.p.e("loadAd must be called on the main UI thread.");
        zzs.zzc();
        if (!zzr.zzJ(this.f5452e) || m93Var.w != null) {
            gq1.b(this.f5452e, m93Var.f7448j);
            return this.f5453f.a(m93Var, this.f5454g, null, new ca1(this));
        }
        er.zzf("Failed to load the ad because app ID is missing.");
        wa1 wa1Var = this.f5455h;
        if (wa1Var != null) {
            wa1Var.B0(mq1.d(4, null, null));
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.w
    public final synchronized boolean zzA() {
        return this.f5453f.zzb();
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
        com.google.android.gms.common.internal.p.e("getVideoController must be called from the main thread.");
        r40 r40Var = this.f5458k;
        if (r40Var == null) {
            return null;
        }
        return r40Var.i();
    }

    @Override // com.google.android.gms.internal.ads.w
    public final synchronized void zzF(d3 d3Var) {
        com.google.android.gms.common.internal.p.e("setVideoOptions must be called on the main UI thread.");
        this.f5457j.w(d3Var);
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
    public final void zzJ(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.w
    public final void zzO(h1 h1Var) {
        com.google.android.gms.common.internal.p.e("setPaidEventListener must be called on the main UI thread.");
        this.f5455h.z(h1Var);
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

    @Override // com.google.android.gms.internal.ads.fd0
    public final synchronized void zza() {
        if (!this.f5453f.f()) {
            this.f5453f.h();
            return;
        }
        r93 r93VarT = this.f5457j.t();
        r40 r40Var = this.f5458k;
        if (r40Var != null && r40Var.k() != null && this.f5457j.K()) {
            r93VarT = up1.b(this.f5452e, Collections.singletonList(this.f5458k.k()));
        }
        K4(r93VarT);
        try {
            L4(this.f5457j.q());
        } catch (RemoteException unused) {
            er.zzi("Failed to refresh the banner ad.");
        }
    }

    @Override // com.google.android.gms.internal.ads.w
    public final synchronized void zzab(i0 i0Var) {
        com.google.android.gms.common.internal.p.e("setCorrelationIdProvider must be called on the main UI thread");
        this.f5457j.n(i0Var);
    }

    @Override // com.google.android.gms.internal.ads.w
    public final e.c.b.b.b.b zzb() {
        com.google.android.gms.common.internal.p.e("destroy must be called on the main UI thread.");
        return e.c.b.b.b.d.m4(this.f5453f.b());
    }

    @Override // com.google.android.gms.internal.ads.w
    public final boolean zzbI() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.w
    public final synchronized void zzc() {
        com.google.android.gms.common.internal.p.e("destroy must be called on the main UI thread.");
        r40 r40Var = this.f5458k;
        if (r40Var != null) {
            r40Var.b();
        }
    }

    @Override // com.google.android.gms.internal.ads.w
    public final synchronized boolean zze(m93 m93Var) {
        K4(this.f5456i);
        return L4(m93Var);
    }

    @Override // com.google.android.gms.internal.ads.w
    public final synchronized void zzf() {
        com.google.android.gms.common.internal.p.e("pause must be called on the main UI thread.");
        r40 r40Var = this.f5458k;
        if (r40Var != null) {
            r40Var.c().K0(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.w
    public final synchronized void zzg() {
        com.google.android.gms.common.internal.p.e("resume must be called on the main UI thread.");
        r40 r40Var = this.f5458k;
        if (r40Var != null) {
            r40Var.c().L0(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.w
    public final void zzh(j jVar) {
        com.google.android.gms.common.internal.p.e("setAdListener must be called on the main UI thread.");
        this.f5455h.u(jVar);
    }

    @Override // com.google.android.gms.internal.ads.w
    public final void zzi(e0 e0Var) {
        com.google.android.gms.common.internal.p.e("setAppEventListener must be called on the main UI thread.");
        this.f5455h.x(e0Var);
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
    public final void zzl() {
    }

    @Override // com.google.android.gms.internal.ads.w
    public final synchronized void zzm() {
        com.google.android.gms.common.internal.p.e("recordManualImpression must be called on the main UI thread.");
        r40 r40Var = this.f5458k;
        if (r40Var != null) {
            r40Var.m();
        }
    }

    @Override // com.google.android.gms.internal.ads.w
    public final synchronized r93 zzn() {
        com.google.android.gms.common.internal.p.e("getAdSize must be called on the main UI thread.");
        r40 r40Var = this.f5458k;
        if (r40Var != null) {
            return up1.b(this.f5452e, Collections.singletonList(r40Var.j()));
        }
        return this.f5457j.t();
    }

    @Override // com.google.android.gms.internal.ads.w
    public final synchronized void zzo(r93 r93Var) {
        com.google.android.gms.common.internal.p.e("setAdSize must be called on the main UI thread.");
        this.f5457j.r(r93Var);
        this.f5456i = r93Var;
        r40 r40Var = this.f5458k;
        if (r40Var != null) {
            r40Var.h(this.f5453f.b(), r93Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.w
    public final void zzp(ek ekVar) {
    }

    @Override // com.google.android.gms.internal.ads.w
    public final void zzq(hk hkVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.w
    public final synchronized String zzr() {
        r40 r40Var = this.f5458k;
        if (r40Var == null || r40Var.d() == null) {
            return null;
        }
        return this.f5458k.d().zze();
    }

    @Override // com.google.android.gms.internal.ads.w
    public final synchronized String zzs() {
        r40 r40Var = this.f5458k;
        if (r40Var == null || r40Var.d() == null) {
            return null;
        }
        return this.f5458k.d().zze();
    }

    @Override // com.google.android.gms.internal.ads.w
    public final synchronized k1 zzt() {
        if (!((Boolean) c.c().b(w3.P4)).booleanValue()) {
            return null;
        }
        r40 r40Var = this.f5458k;
        if (r40Var == null) {
            return null;
        }
        return r40Var.d();
    }

    @Override // com.google.android.gms.internal.ads.w
    public final synchronized String zzu() {
        return this.f5454g;
    }

    @Override // com.google.android.gms.internal.ads.w
    public final e0 zzv() {
        return this.f5455h.o();
    }

    @Override // com.google.android.gms.internal.ads.w
    public final j zzw() {
        return this.f5455h.m();
    }

    @Override // com.google.android.gms.internal.ads.w
    public final synchronized void zzx(s4 s4Var) {
        com.google.android.gms.common.internal.p.e("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.f5453f.c(s4Var);
    }

    @Override // com.google.android.gms.internal.ads.w
    public final void zzy(g gVar) {
        com.google.android.gms.common.internal.p.e("setAdListener must be called on the main UI thread.");
        this.f5453f.d(gVar);
    }

    @Override // com.google.android.gms.internal.ads.w
    public final synchronized void zzz(boolean z) {
        com.google.android.gms.common.internal.p.e("setManualImpressionsEnabled must be called from the main thread.");
        this.f5457j.y(z);
    }
}