package com.google.android.gms.ads.interstitial;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.internal.ads.uc;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public abstract class InterstitialAd {
    public static void load(@RecentlyNonNull Context context, @RecentlyNonNull String str, @RecentlyNonNull AdRequest adRequest, @RecentlyNonNull InterstitialAdLoadCallback interstitialAdLoadCallback) {
        p.k(context, "Context cannot be null.");
        p.k(str, "AdUnitId cannot be null.");
        p.k(adRequest, "AdRequest cannot be null.");
        p.k(interstitialAdLoadCallback, "LoadCallback cannot be null.");
        new uc(context, str).a(adRequest.zza(), interstitialAdLoadCallback);
    }

    public abstract String getAdUnitId();

    @RecentlyNullable
    public abstract FullScreenContentCallback getFullScreenContentCallback();

    @RecentlyNullable
    public abstract OnPaidEventListener getOnPaidEventListener();

    public abstract ResponseInfo getResponseInfo();

    public abstract void setFullScreenContentCallback(FullScreenContentCallback fullScreenContentCallback);

    public abstract void setImmersiveMode(boolean z);

    public abstract void setOnPaidEventListener(OnPaidEventListener onPaidEventListener);

    public abstract void show(@RecentlyNonNull Activity activity);
}