package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class b00 implements ov0 {
    private final Long a;

    /* renamed from: b, reason: collision with root package name */
    private final String f5040b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ c00 f5041c;

    /* synthetic */ b00(c00 c00Var, Long l2, String str, dz dzVar) {
        this.f5041c = c00Var;
        this.a = l2;
        this.f5040b = str;
    }

    @Override // com.google.android.gms.internal.ads.ov0
    public final yv0 zza() {
        return zv0.a(this.a.longValue(), this.f5041c.a, sv0.b(this.f5041c.f5231b), this.f5041c.f5236g, this.f5040b);
    }

    @Override // com.google.android.gms.internal.ads.ov0
    public final cw0 zzb() {
        return dw0.a(this.a.longValue(), this.f5041c.a, sv0.b(this.f5041c.f5231b), this.f5041c.f5236g, this.f5040b);
    }
}