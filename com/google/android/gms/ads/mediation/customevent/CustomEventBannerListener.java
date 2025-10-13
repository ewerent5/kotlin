package com.google.android.gms.ads.mediation.customevent;

import android.view.View;
import androidx.annotation.RecentlyNonNull;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public interface CustomEventBannerListener extends CustomEventListener {
    void onAdLoaded(@RecentlyNonNull View view);
}