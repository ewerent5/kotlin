package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class yy0 implements mo2<xy0> {
    private final wo2<qp1> a;

    /* renamed from: b, reason: collision with root package name */
    private final wo2<xx0> f10510b;

    /* renamed from: c, reason: collision with root package name */
    private final wo2<h52> f10511c;

    /* renamed from: d, reason: collision with root package name */
    private final wo2<ScheduledExecutorService> f10512d;

    /* renamed from: e, reason: collision with root package name */
    private final wo2<a21> f10513e;

    public yy0(wo2<qp1> wo2Var, wo2<xx0> wo2Var2, wo2<h52> wo2Var3, wo2<ScheduledExecutorService> wo2Var4, wo2<a21> wo2Var5) {
        this.a = wo2Var;
        this.f10510b = wo2Var2;
        this.f10511c = wo2Var3;
        this.f10512d = wo2Var4;
        this.f10513e = wo2Var5;
    }

    @Override // com.google.android.gms.internal.ads.wo2
    public final /* bridge */ /* synthetic */ Object zzb() {
        qp1 qp1VarA = ((ga0) this.a).a();
        xx0 xx0VarZzb = ((yx0) this.f10510b).zzb();
        h52 h52Var = qr.a;
        ro2.b(h52Var);
        return new xy0(qp1VarA, xx0VarZzb, h52Var, this.f10512d.zzb(), this.f10513e.zzb());
    }
}