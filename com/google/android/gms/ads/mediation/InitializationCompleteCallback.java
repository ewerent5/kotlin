package com.google.android.gms.ads.mediation;

import androidx.annotation.RecentlyNonNull;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public interface InitializationCompleteCallback {
    void onInitializationFailed(@RecentlyNonNull String str);

    void onInitializationSucceeded();
}