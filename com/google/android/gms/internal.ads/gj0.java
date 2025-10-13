package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.zzp;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class gj0 implements zzp {

    /* renamed from: e, reason: collision with root package name */
    private final vc0 f6134e;

    /* renamed from: f, reason: collision with root package name */
    private final lh0 f6135f;

    public gj0(vc0 vc0Var, lh0 lh0Var) {
        this.f6134e = vc0Var;
        this.f6135f = lh0Var;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzbJ() {
        this.f6134e.zzbJ();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzbo() {
        this.f6134e.zzbo();
        this.f6135f.zza();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzbr() {
        this.f6134e.zzbr();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzbs() {
        this.f6134e.zzbs();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzbt(int i2) {
        this.f6134e.zzbt(i2);
        this.f6135f.K0();
    }
}