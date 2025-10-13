package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class em1 implements x02<uz0, hm1> {
    final /* synthetic */ im1 a;

    em1(im1 im1Var) {
        this.a = im1Var;
    }

    @Override // com.google.android.gms.internal.ads.x02
    @NullableDecl
    public final /* bridge */ /* synthetic */ hm1 apply(@NullableDecl uz0 uz0Var) {
        er.zzg("", uz0Var);
        zze.zza("Failed to get a cache key, reverting to legacy flow.");
        im1 im1Var = this.a;
        im1Var.f6543e = new hm1(null, im1Var.e(), null);
        return this.a.f6543e;
    }
}