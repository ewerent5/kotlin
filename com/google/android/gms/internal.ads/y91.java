package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.zzs;
import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class y91 extends v {

    /* renamed from: e, reason: collision with root package name */
    private final Context f10394e;

    /* renamed from: f, reason: collision with root package name */
    private final j f10395f;

    /* renamed from: g, reason: collision with root package name */
    private final qp1 f10396g;

    /* renamed from: h, reason: collision with root package name */
    private final r40 f10397h;

    /* renamed from: i, reason: collision with root package name */
    private final ViewGroup f10398i;

    public y91(Context context, j jVar, qp1 qp1Var, r40 r40Var) {
        this.f10394e = context;
        this.f10395f = jVar;
        this.f10396g = qp1Var;
        this.f10397h = r40Var;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.removeAllViews();
        frameLayout.addView(r40Var.g(), zzs.zze().zzj());
        frameLayout.setMinimumHeight(zzn().f8617g);
        frameLayout.setMinimumWidth(zzn().f8620j);
        this.f10398i = frameLayout;
    }

    @Override // com.google.android.gms.internal.ads.w
    public final boolean zzA() {
        return false;
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
    public final n1 zzE() {
        return this.f10397h.i();
    }

    @Override // com.google.android.gms.internal.ads.w
    public final void zzF(d3 d3Var) {
        er.zzh("setVideoOptions is not supported in Ad Manager AdView returned by AdLoader.");
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
        er.zzh("setOnPaidEventListener is not supported in Ad Manager AdView returned by AdLoader.");
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

    @Override // com.google.android.gms.internal.ads.w
    public final void zzab(i0 i0Var) {
        er.zzh("setCorrelationIdProvider is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.internal.ads.w
    public final e.c.b.b.b.b zzb() {
        return e.c.b.b.b.d.m4(this.f10398i);
    }

    @Override // com.google.android.gms.internal.ads.w
    public final boolean zzbI() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.w
    public final void zzc() {
        com.google.android.gms.common.internal.p.e("destroy must be called on the main UI thread.");
        this.f10397h.b();
    }

    @Override // com.google.android.gms.internal.ads.w
    public final boolean zze(m93 m93Var) {
        er.zzh("loadAd is not supported for an Ad Manager AdView returned from AdLoader.");
        return false;
    }

    @Override // com.google.android.gms.internal.ads.w
    public final void zzf() {
        com.google.android.gms.common.internal.p.e("destroy must be called on the main UI thread.");
        this.f10397h.c().K0(null);
    }

    @Override // com.google.android.gms.internal.ads.w
    public final void zzg() {
        com.google.android.gms.common.internal.p.e("destroy must be called on the main UI thread.");
        this.f10397h.c().L0(null);
    }

    @Override // com.google.android.gms.internal.ads.w
    public final void zzh(j jVar) {
        er.zzh("setAdListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.internal.ads.w
    public final void zzi(e0 e0Var) {
        wa1 wa1Var = this.f10396g.f8426c;
        if (wa1Var != null) {
            wa1Var.x(e0Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.w
    public final void zzj(a0 a0Var) {
        er.zzh("setAdMetadataListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.internal.ads.w
    public final Bundle zzk() {
        er.zzh("getAdMetadata is not supported in Ad Manager AdView returned by AdLoader.");
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.w
    public final void zzl() {
    }

    @Override // com.google.android.gms.internal.ads.w
    public final void zzm() {
        this.f10397h.m();
    }

    @Override // com.google.android.gms.internal.ads.w
    public final r93 zzn() {
        com.google.android.gms.common.internal.p.e("getAdSize must be called on the main UI thread.");
        return up1.b(this.f10394e, Collections.singletonList(this.f10397h.j()));
    }

    @Override // com.google.android.gms.internal.ads.w
    public final void zzo(r93 r93Var) {
        com.google.android.gms.common.internal.p.e("setAdSize must be called on the main UI thread.");
        r40 r40Var = this.f10397h;
        if (r40Var != null) {
            r40Var.h(this.f10398i, r93Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.w
    public final void zzp(ek ekVar) {
    }

    @Override // com.google.android.gms.internal.ads.w
    public final void zzq(hk hkVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.w
    public final String zzr() {
        if (this.f10397h.d() != null) {
            return this.f10397h.d().zze();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.w
    public final String zzs() {
        if (this.f10397h.d() != null) {
            return this.f10397h.d().zze();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.w
    public final k1 zzt() {
        return this.f10397h.d();
    }

    @Override // com.google.android.gms.internal.ads.w
    public final String zzu() {
        return this.f10396g.f8429f;
    }

    @Override // com.google.android.gms.internal.ads.w
    public final e0 zzv() {
        return this.f10396g.n;
    }

    @Override // com.google.android.gms.internal.ads.w
    public final j zzw() {
        return this.f10395f;
    }

    @Override // com.google.android.gms.internal.ads.w
    public final void zzx(s4 s4Var) {
        er.zzh("setOnCustomRenderedAdLoadedListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.internal.ads.w
    public final void zzy(g gVar) {
        er.zzh("setAdClickListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.internal.ads.w
    public final void zzz(boolean z) {
        er.zzh("setManualImpressionsEnabled is not supported in Ad Manager AdView returned by AdLoader.");
    }
}