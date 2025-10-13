package com.google.android.gms.ads.appopen;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.ads.AdLoadCallback;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.internal.ads.y33;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public abstract class AppOpenAd {
    public static final int APP_OPEN_AD_ORIENTATION_LANDSCAPE = 2;
    public static final int APP_OPEN_AD_ORIENTATION_PORTRAIT = 1;

    /* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
    public static abstract class AppOpenAdLoadCallback extends AdLoadCallback<AppOpenAd> {
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
    public @interface AppOpenAdOrientation {
    }

    public static void load(@RecentlyNonNull Context context, @RecentlyNonNull String str, @RecentlyNonNull AdRequest adRequest, @AppOpenAdOrientation int i2, @RecentlyNonNull AppOpenAdLoadCallback appOpenAdLoadCallback) {
        p.k(context, "Context cannot be null.");
        p.k(str, "adUnitId cannot be null.");
        p.k(adRequest, "AdRequest cannot be null.");
        new y33(context, str, adRequest.zza(), i2, appOpenAdLoadCallback).a();
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

    public static void load(@RecentlyNonNull Context context, @RecentlyNonNull String str, @RecentlyNonNull AdManagerAdRequest adManagerAdRequest, @AppOpenAdOrientation int i2, @RecentlyNonNull AppOpenAdLoadCallback appOpenAdLoadCallback) {
        p.k(context, "Context cannot be null.");
        p.k(str, "adUnitId cannot be null.");
        p.k(adManagerAdRequest, "AdManagerAdRequest cannot be null.");
        new y33(context, str, adManagerAdRequest.zza(), i2, appOpenAdLoadCallback).a();
    }
}