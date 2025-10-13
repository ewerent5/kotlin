package com.google.android.gms.ads.mediation;

import android.os.Bundle;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.ads.AdFormat;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public class MediationConfiguration {
    private final AdFormat zza;
    private final Bundle zzb;

    public MediationConfiguration(@RecentlyNonNull AdFormat adFormat, @RecentlyNonNull Bundle bundle) {
        this.zza = adFormat;
        this.zzb = bundle;
    }

    @RecentlyNonNull
    public AdFormat getFormat() {
        return this.zza;
    }

    @RecentlyNonNull
    public Bundle getServerParameters() {
        return this.zzb;
    }
}