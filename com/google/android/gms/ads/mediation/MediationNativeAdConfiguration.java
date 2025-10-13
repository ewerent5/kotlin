package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import com.google.android.gms.internal.ads.g6;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public class MediationNativeAdConfiguration extends MediationAdConfiguration {
    private final g6 zza;

    public MediationNativeAdConfiguration(Context context, String str, Bundle bundle, Bundle bundle2, boolean z, Location location, int i2, int i3, String str2, String str3, g6 g6Var) {
        super(context, str, bundle, bundle2, z, location, i2, i3, str2, str3);
        this.zza = g6Var;
    }

    @RecentlyNonNull
    public NativeAdOptions getNativeAdOptions() {
        return g6.c(this.zza);
    }
}