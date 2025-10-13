package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class fr0 implements mo2<j31<xq0>> {
    private final wo2<q81<xq0, hq1, i51>> a;

    /* renamed from: b, reason: collision with root package name */
    private final wo2<q81<xq0, hq1, h51>> f5931b;

    /* renamed from: c, reason: collision with root package name */
    private final wo2<qp1> f5932c;

    public fr0(wo2<q81<xq0, hq1, i51>> wo2Var, wo2<q81<xq0, hq1, h51>> wo2Var2, wo2<qp1> wo2Var3) {
        this.a = wo2Var;
        this.f5931b = wo2Var2;
        this.f5932c = wo2Var3;
    }

    @Override // com.google.android.gms.internal.ads.wo2
    public final /* bridge */ /* synthetic */ Object zzb() {
        wo2<q81<xq0, hq1, i51>> wo2Var = this.a;
        wo2<q81<xq0, hq1, h51>> wo2Var2 = this.f5931b;
        int i2 = ((ga0) this.f5932c).a().o.a;
        int i3 = i2 - 1;
        if (i2 != 0) {
            return i3 != 0 ? ((r81) wo2Var2).zzb() : ((r81) wo2Var).zzb();
        }
        throw null;
    }
}