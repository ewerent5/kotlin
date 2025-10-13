package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.RecentlyNonNull;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
@Deprecated
/* loaded from: classes.dex */
public interface MediationInterstitialAdapter extends MediationAdapter {
    void requestInterstitialAd(@RecentlyNonNull Context context, @RecentlyNonNull MediationInterstitialListener mediationInterstitialListener, @RecentlyNonNull Bundle bundle, @RecentlyNonNull MediationAdRequest mediationAdRequest, @RecentlyNonNull Bundle bundle2);

    void showInterstitial();
}