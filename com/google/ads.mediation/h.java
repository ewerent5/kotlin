package com.google.ads.mediation;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.internal.ads.c93;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
final class h extends AdListener implements AppEventListener, c93 {

    /* renamed from: e, reason: collision with root package name */
    final AbstractAdViewAdapter f4267e;

    /* renamed from: f, reason: collision with root package name */
    final MediationBannerListener f4268f;

    public h(AbstractAdViewAdapter abstractAdViewAdapter, MediationBannerListener mediationBannerListener) {
        this.f4267e = abstractAdViewAdapter;
        this.f4268f = mediationBannerListener;
    }

    @Override // com.google.android.gms.ads.AdListener, com.google.android.gms.internal.ads.c93
    public final void onAdClicked() {
        this.f4268f.onAdClicked(this.f4267e);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClosed() {
        this.f4268f.onAdClosed(this.f4267e);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.f4268f.onAdFailedToLoad(this.f4267e, loadAdError);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
        this.f4268f.onAdLoaded(this.f4267e);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdOpened() {
        this.f4268f.onAdOpened(this.f4267e);
    }

    @Override // com.google.android.gms.ads.admanager.AppEventListener
    public final void onAppEvent(String str, String str2) {
        this.f4268f.zza(this.f4267e, str, str2);
    }
}