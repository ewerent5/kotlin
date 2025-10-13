package com.google.android.gms.ads.rewarded;

import androidx.annotation.RecentlyNonNull;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public interface RewardItem {

    @RecentlyNonNull
    public static final RewardItem DEFAULT_REWARD = new zza();

    int getAmount();

    @RecentlyNonNull
    String getType();
}