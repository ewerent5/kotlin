package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class bc1 implements mo2<zb1> {
    private final wo2<com.google.android.gms.common.util.f> a;

    /* renamed from: b, reason: collision with root package name */
    private final wo2<qp1> f5100b;

    public bc1(wo2<com.google.android.gms.common.util.f> wo2Var, wo2<qp1> wo2Var2) {
        this.a = wo2Var;
        this.f5100b = wo2Var2;
    }

    public static zb1 a(com.google.android.gms.common.util.f fVar, qp1 qp1Var) {
        return new zb1(fVar, qp1Var);
    }

    @Override // com.google.android.gms.internal.ads.wo2
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zb1(this.a.zzb(), ((ga0) this.f5100b).a());
    }
}