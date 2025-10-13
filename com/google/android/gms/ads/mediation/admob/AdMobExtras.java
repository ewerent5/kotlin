package com.google.android.gms.ads.mediation.admob;

import android.os.Bundle;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.ads.mediation.f;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
@Deprecated
/* loaded from: classes.dex */
public final class AdMobExtras implements f {
    private final Bundle zza;

    public AdMobExtras(@RecentlyNonNull Bundle bundle) {
        this.zza = bundle != null ? new Bundle(bundle) : null;
    }

    @RecentlyNullable
    public Bundle getExtras() {
        return this.zza;
    }
}