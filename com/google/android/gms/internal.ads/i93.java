package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdListener;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class i93 extends i {

    /* renamed from: e, reason: collision with root package name */
    private final AdListener f6502e;

    public i93(AdListener adListener) {
        this.f6502e = adListener;
    }

    public final AdListener I4() {
        return this.f6502e;
    }

    @Override // com.google.android.gms.internal.ads.j
    public final void g(int i2) {
    }

    @Override // com.google.android.gms.internal.ads.j
    public final void x(g93 g93Var) {
        AdListener adListener = this.f6502e;
        if (adListener != null) {
            adListener.onAdFailedToLoad(g93Var.I());
        }
    }

    @Override // com.google.android.gms.internal.ads.j
    public final void zzb() {
        AdListener adListener = this.f6502e;
        if (adListener != null) {
            adListener.onAdClosed();
        }
    }

    @Override // com.google.android.gms.internal.ads.j
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.j
    public final void zzf() {
        AdListener adListener = this.f6502e;
        if (adListener != null) {
            adListener.onAdLoaded();
        }
    }

    @Override // com.google.android.gms.internal.ads.j
    public final void zzg() {
        AdListener adListener = this.f6502e;
        if (adListener != null) {
            adListener.onAdOpened();
        }
    }

    @Override // com.google.android.gms.internal.ads.j
    public final void zzh() {
        AdListener adListener = this.f6502e;
        if (adListener != null) {
            adListener.onAdClicked();
        }
    }

    @Override // com.google.android.gms.internal.ads.j
    public final void zzi() {
        AdListener adListener = this.f6502e;
        if (adListener != null) {
            adListener.onAdImpression();
        }
    }
}