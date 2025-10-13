package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import c.c.b.c;
import com.google.android.gms.internal.ads.t4;
import com.google.android.gms.internal.ads.v4;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class zzl implements t4 {
    final /* synthetic */ v4 zza;
    final /* synthetic */ Context zzb;
    final /* synthetic */ Uri zzc;

    zzl(zzr zzrVar, v4 v4Var, Context context, Uri uri) {
        this.zza = v4Var;
        this.zzb = context;
        this.zzc = uri;
    }

    @Override // com.google.android.gms.internal.ads.t4
    public final void zza() {
        new c.a(this.zza.c()).a().a(this.zzb, this.zzc);
        this.zza.b((Activity) this.zzb);
    }
}