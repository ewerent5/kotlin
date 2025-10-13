package com.google.ads.mediation;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.ads.formats.UnifiedNativeAd;
import com.google.android.gms.ads.mediation.MediationNativeListener;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
final class k extends AdListener implements UnifiedNativeAd.OnUnifiedNativeAdLoadedListener, NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener, NativeCustomTemplateAd.OnCustomClickListener {

    /* renamed from: e */
    final AbstractAdViewAdapter f4271e;

    /* renamed from: f */
    final MediationNativeListener f4272f;

    public k(AbstractAdViewAdapter abstractAdViewAdapter, MediationNativeListener mediationNativeListener) {
        this.f4271e = abstractAdViewAdapter;
        this.f4272f = mediationNativeListener;
    }

    @Override // com.google.android.gms.ads.AdListener, com.google.android.gms.internal.ads.c93
    public final void onAdClicked() {
        this.f4272f.onAdClicked(this.f4271e);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClosed() {
        this.f4272f.onAdClosed(this.f4271e);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.f4272f.onAdFailedToLoad(this.f4271e, loadAdError);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdImpression() {
        this.f4272f.onAdImpression(this.f4271e);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdOpened() {
        this.f4272f.onAdOpened(this.f4271e);
    }

    @Override // com.google.android.gms.ads.formats.NativeCustomTemplateAd.OnCustomClickListener
    public final void onCustomClick(NativeCustomTemplateAd nativeCustomTemplateAd, String str) {
        this.f4272f.zzc(this.f4271e, nativeCustomTemplateAd, str);
    }

    @Override // com.google.android.gms.ads.formats.NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener
    public final void onCustomTemplateAdLoaded(NativeCustomTemplateAd nativeCustomTemplateAd) {
        this.f4272f.zzb(this.f4271e, nativeCustomTemplateAd);
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd.OnUnifiedNativeAdLoadedListener
    public final void onUnifiedNativeAdLoaded(UnifiedNativeAd unifiedNativeAd) {
        this.f4272f.onAdLoaded(this.f4271e, new g(unifiedNativeAd));
    }
}