package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class wl1 implements u42<Void> {
    wl1(yl1 yl1Var) {
    }

    @Override // com.google.android.gms.internal.ads.u42
    public final void zza(Throwable th) {
        zze.zza("Notification of cache hit failed.");
    }

    @Override // com.google.android.gms.internal.ads.u42
    public final /* bridge */ /* synthetic */ void zzb(@NullableDecl Void r1) {
        zze.zza("Notification of cache hit successful.");
    }
}