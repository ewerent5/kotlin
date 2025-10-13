package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class ou implements oz2 {
    private final oz2 a;

    /* renamed from: b */
    private final byte[] f8018b;

    ou(oz2 oz2Var, byte[] bArr) {
        this.a = oz2Var;
        this.f8018b = bArr;
    }

    @Override // com.google.android.gms.internal.ads.oz2
    public final pz2 zza() {
        oz2 oz2Var = this.a;
        byte[] bArr = this.f8018b;
        return new uu(new nz2(bArr), bArr.length, oz2Var.zza());
    }
}