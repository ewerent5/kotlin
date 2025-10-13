package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.ads.mediation.MediationAdRequest;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public interface CustomEventInterstitial extends CustomEvent {
    void requestInterstitialAd(@RecentlyNonNull Context context, @RecentlyNonNull CustomEventInterstitialListener customEventInterstitialListener, String str, @RecentlyNonNull MediationAdRequest mediationAdRequest, Bundle bundle);

    void showInterstitial();
}