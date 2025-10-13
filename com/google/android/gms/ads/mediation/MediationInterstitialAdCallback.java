package com.google.android.gms.ads.mediation;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.ads.AdError;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public interface MediationInterstitialAdCallback extends MediationAdCallback {
    void onAdFailedToShow(@RecentlyNonNull AdError adError);

    @Deprecated
    void onAdFailedToShow(@RecentlyNonNull String str);

    void onAdLeftApplication();
}