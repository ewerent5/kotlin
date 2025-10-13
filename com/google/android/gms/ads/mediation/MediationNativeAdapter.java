package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.RecentlyNonNull;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
@Deprecated
/* loaded from: classes.dex */
public interface MediationNativeAdapter extends MediationAdapter {
    void requestNativeAd(@RecentlyNonNull Context context, @RecentlyNonNull MediationNativeListener mediationNativeListener, @RecentlyNonNull Bundle bundle, @RecentlyNonNull NativeMediationAdRequest nativeMediationAdRequest, @RecentlyNonNull Bundle bundle2);
}