package com.google.ads.mediation.admob;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Keep;
import androidx.annotation.RecentlyNonNull;
import com.google.ads.mediation.AbstractAdViewAdapter;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
@Keep
/* loaded from: classes.dex */
public final class AdMobAdapter extends AbstractAdViewAdapter {

    @RecentlyNonNull
    public static final String NEW_BUNDLE = "_newBundle";

    @Override // com.google.ads.mediation.AbstractAdViewAdapter
    @RecentlyNonNull
    protected final Bundle zza(@RecentlyNonNull Bundle bundle, @RecentlyNonNull Bundle bundle2) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (bundle.getBoolean(NEW_BUNDLE)) {
            bundle = new Bundle(bundle);
        }
        bundle.putInt("gw", 1);
        bundle.putString("mad_hac", bundle2.getString("mad_hac"));
        if (!TextUtils.isEmpty(bundle2.getString("adJson"))) {
            bundle.putString("_ad", bundle2.getString("adJson"));
        }
        bundle.putBoolean("_noRefresh", true);
        return bundle;
    }
}