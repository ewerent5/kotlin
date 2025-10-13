package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.rewarded.RewardItem;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class sn extends wm {

    /* renamed from: e, reason: collision with root package name */
    private final String f8917e;

    /* renamed from: f, reason: collision with root package name */
    private final int f8918f;

    public sn(RewardItem rewardItem) {
        this(rewardItem != null ? rewardItem.getType() : "", rewardItem != null ? rewardItem.getAmount() : 1);
    }

    @Override // com.google.android.gms.internal.ads.xm
    public final String zze() {
        return this.f8917e;
    }

    @Override // com.google.android.gms.internal.ads.xm
    public final int zzf() {
        return this.f8918f;
    }

    public sn(String str, int i2) {
        this.f8917e = str;
        this.f8918f = i2;
    }
}