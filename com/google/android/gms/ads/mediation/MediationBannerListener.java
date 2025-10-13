package com.google.android.gms.ads.mediation;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.ads.AdError;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
@Deprecated
/* loaded from: classes.dex */
public interface MediationBannerListener {
    void onAdClicked(@RecentlyNonNull MediationBannerAdapter mediationBannerAdapter);

    void onAdClosed(@RecentlyNonNull MediationBannerAdapter mediationBannerAdapter);

    @Deprecated
    void onAdFailedToLoad(@RecentlyNonNull MediationBannerAdapter mediationBannerAdapter, int i2);

    void onAdFailedToLoad(@RecentlyNonNull MediationBannerAdapter mediationBannerAdapter, @RecentlyNonNull AdError adError);

    void onAdLeftApplication(@RecentlyNonNull MediationBannerAdapter mediationBannerAdapter);

    void onAdLoaded(@RecentlyNonNull MediationBannerAdapter mediationBannerAdapter);

    void onAdOpened(@RecentlyNonNull MediationBannerAdapter mediationBannerAdapter);

    void zza(@RecentlyNonNull MediationBannerAdapter mediationBannerAdapter, @RecentlyNonNull String str, @RecentlyNonNull String str2);
}