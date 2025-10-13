package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class be implements as<ad> {
    final /* synthetic */ ae a;

    be(fe feVar, ae aeVar) {
        this.a = aeVar;
    }

    @Override // com.google.android.gms.internal.ads.as
    public final /* bridge */ /* synthetic */ void zza(ad adVar) {
        zze.zza("Getting a new session for JS Engine.");
        this.a.b(adVar.zzk());
    }
}