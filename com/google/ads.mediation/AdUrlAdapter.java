package com.google.ads.mediation;

import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
@Keep
@Deprecated
/* loaded from: classes.dex */
public final class AdUrlAdapter extends AbstractAdViewAdapter implements com.google.android.gms.ads.mediation.MediationBannerAdapter, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, MediationNativeAdapter {
    @Override // com.google.ads.mediation.AbstractAdViewAdapter
    @RecentlyNonNull
    public String getAdUnitId(@RecentlyNonNull Bundle bundle) {
        return "adurl";
    }

    @Override // com.google.ads.mediation.AbstractAdViewAdapter
    @RecentlyNonNull
    protected final Bundle zza(@RecentlyNonNull Bundle bundle, @RecentlyNonNull Bundle bundle2) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putBundle("sdk_less_server_data", bundle2);
        bundle.putBoolean("_noRefresh", true);
        return bundle;
    }
}