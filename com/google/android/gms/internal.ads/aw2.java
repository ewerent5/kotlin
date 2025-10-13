package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class aw2 implements yv2 {
    private final int a;

    /* renamed from: b, reason: collision with root package name */
    private final int f5012b;

    /* renamed from: c, reason: collision with root package name */
    private final o03 f5013c;

    public aw2(vv2 vv2Var) {
        o03 o03Var = vv2Var.P0;
        this.f5013c = o03Var;
        o03Var.i(12);
        this.a = o03Var.u();
        this.f5012b = o03Var.u();
    }

    @Override // com.google.android.gms.internal.ads.yv2
    public final int zza() {
        return this.f5012b;
    }

    @Override // com.google.android.gms.internal.ads.yv2
    public final int zzb() {
        int i2 = this.a;
        return i2 == 0 ? this.f5013c.u() : i2;
    }

    @Override // com.google.android.gms.internal.ads.yv2
    public final boolean zzc() {
        return this.a != 0;
    }
}