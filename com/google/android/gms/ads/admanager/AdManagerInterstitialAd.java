package com.google.android.gms.ads.admanager;

import android.content.Context;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.internal.ads.uc;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public abstract class AdManagerInterstitialAd extends InterstitialAd {
    public static void load(@RecentlyNonNull Context context, @RecentlyNonNull String str, @RecentlyNonNull AdManagerAdRequest adManagerAdRequest, @RecentlyNonNull AdManagerInterstitialAdLoadCallback adManagerInterstitialAdLoadCallback) {
        p.k(context, "Context cannot be null.");
        p.k(str, "AdUnitId cannot be null.");
        p.k(adManagerAdRequest, "AdManagerAdRequest cannot be null.");
        p.k(adManagerInterstitialAdLoadCallback, "LoadCallback cannot be null.");
        new uc(context, str).a(adManagerAdRequest.zza(), adManagerInterstitialAdLoadCallback);
    }

    @RecentlyNullable
    public abstract AppEventListener getAppEventListener();

    public abstract void setAppEventListener(AppEventListener appEventListener);
}