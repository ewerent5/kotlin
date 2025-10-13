package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class cg1 implements mo2<zf1> {
    private final wo2<String> a;

    /* renamed from: b, reason: collision with root package name */
    private final wo2<String> f5316b;

    public cg1(wo2<String> wo2Var, wo2<String> wo2Var2) {
        this.a = wo2Var;
        this.f5316b = wo2Var2;
    }

    public static zf1 a(String str, String str2) {
        return new zf1(str, str2);
    }

    @Override // com.google.android.gms.internal.ads.wo2
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zf1(this.a.zzb(), this.f5316b.zzb());
    }
}