package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import androidx.annotation.RecentlyNonNull;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public class MediationInterstitialAdConfiguration extends MediationAdConfiguration {
    public MediationInterstitialAdConfiguration(@RecentlyNonNull Context context, @RecentlyNonNull String str, @RecentlyNonNull Bundle bundle, @RecentlyNonNull Bundle bundle2, boolean z, Location location, int i2, int i3, String str2, @RecentlyNonNull String str3) {
        super(context, str, bundle, bundle2, z, location, i2, i3, str2, str3);
    }
}