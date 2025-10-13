package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class vg2 implements vy1 {
    final /* synthetic */ lx1 a;

    vg2(lx1 lx1Var) {
        this.a = lx1Var;
    }

    @Override // com.google.android.gms.internal.ads.vy1
    public final void zza(int i2, long j2) {
        this.a.c(i2, System.currentTimeMillis() - j2);
    }

    @Override // com.google.android.gms.internal.ads.vy1
    public final void zzb(int i2, long j2, String str) {
        this.a.g(i2, System.currentTimeMillis() - j2, str);
    }
}