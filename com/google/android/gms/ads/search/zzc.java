package com.google.android.gms.ads.search;

import android.os.Bundle;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import com.google.android.gms.internal.ads.t1;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class zzc {
    private final t1 zza = new t1();
    private String zzb;

    public final zzc zza(NetworkExtras networkExtras) {
        this.zza.l(networkExtras);
        return this;
    }

    public final zzc zzb(Class<? extends MediationAdapter> cls, Bundle bundle) {
        this.zza.m(cls, bundle);
        return this;
    }

    public final zzc zzc(Class<? extends CustomEvent> cls, Bundle bundle) {
        this.zza.n(cls, bundle);
        return this;
    }

    public final zzc zzd(String str) {
        this.zzb = str;
        return this;
    }
}