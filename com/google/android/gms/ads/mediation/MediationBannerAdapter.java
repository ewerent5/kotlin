package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.ads.AdSize;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
@Deprecated
/* loaded from: classes.dex */
public interface MediationBannerAdapter extends MediationAdapter {
    @RecentlyNonNull
    View getBannerView();

    void requestBannerAd(@RecentlyNonNull Context context, @RecentlyNonNull MediationBannerListener mediationBannerListener, @RecentlyNonNull Bundle bundle, @RecentlyNonNull AdSize adSize, @RecentlyNonNull MediationAdRequest mediationAdRequest, @RecentlyNonNull Bundle bundle2);
}