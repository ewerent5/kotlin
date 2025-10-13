package com.google.android.gms.internal.ads;

import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class uq0 implements ra {

    /* renamed from: e, reason: collision with root package name */
    private final wb0 f9531e;

    /* renamed from: f, reason: collision with root package name */
    private final tm f9532f;

    /* renamed from: g, reason: collision with root package name */
    private final String f9533g;

    /* renamed from: h, reason: collision with root package name */
    private final String f9534h;

    public uq0(wb0 wb0Var, xo1 xo1Var) {
        this.f9531e = wb0Var;
        this.f9532f = xo1Var.f10207l;
        this.f9533g = xo1Var.f10205j;
        this.f9534h = xo1Var.f10206k;
    }

    @Override // com.google.android.gms.internal.ads.ra
    @ParametersAreNonnullByDefault
    public final void x(tm tmVar) {
        int i2;
        String str;
        tm tmVar2 = this.f9532f;
        if (tmVar2 != null) {
            tmVar = tmVar2;
        }
        if (tmVar != null) {
            str = tmVar.f9199e;
            i2 = tmVar.f9200f;
        } else {
            i2 = 1;
            str = "";
        }
        this.f9531e.L0(new dm(str, i2), this.f9533g, this.f9534h);
    }

    @Override // com.google.android.gms.internal.ads.ra
    public final void zza() {
        this.f9531e.zzd();
    }

    @Override // com.google.android.gms.internal.ads.ra
    public final void zzc() {
        this.f9531e.M0();
    }
}