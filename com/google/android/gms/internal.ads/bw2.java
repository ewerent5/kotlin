package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class bw2 implements yv2 {
    private final o03 a;

    /* renamed from: b, reason: collision with root package name */
    private final int f5200b;

    /* renamed from: c, reason: collision with root package name */
    private final int f5201c;

    /* renamed from: d, reason: collision with root package name */
    private int f5202d;

    /* renamed from: e, reason: collision with root package name */
    private int f5203e;

    public bw2(vv2 vv2Var) {
        o03 o03Var = vv2Var.P0;
        this.a = o03Var;
        o03Var.i(12);
        this.f5201c = o03Var.u() & 255;
        this.f5200b = o03Var.u();
    }

    @Override // com.google.android.gms.internal.ads.yv2
    public final int zza() {
        return this.f5200b;
    }

    @Override // com.google.android.gms.internal.ads.yv2
    public final int zzb() {
        int i2 = this.f5201c;
        if (i2 == 8) {
            return this.a.l();
        }
        if (i2 == 16) {
            return this.a.m();
        }
        int i3 = this.f5202d;
        this.f5202d = i3 + 1;
        if (i3 % 2 != 0) {
            return this.f5203e & 15;
        }
        int iL = this.a.l();
        this.f5203e = iL;
        return (iL & 240) >> 4;
    }

    @Override // com.google.android.gms.internal.ads.yv2
    public final boolean zzc() {
        return false;
    }
}