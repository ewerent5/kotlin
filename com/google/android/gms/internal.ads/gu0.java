package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class gu0 implements mo2<nh0<tt1>> {
    private final wo2<qu0> a;

    /* renamed from: b, reason: collision with root package name */
    private final wo2<Executor> f6178b;

    /* renamed from: c, reason: collision with root package name */
    private final wo2<n11> f6179c;

    public gu0(wo2<qu0> wo2Var, wo2<Executor> wo2Var2, wo2<n11> wo2Var3) {
        this.a = wo2Var;
        this.f6178b = wo2Var2;
        this.f6179c = wo2Var3;
    }

    @Override // com.google.android.gms.internal.ads.wo2
    public final /* bridge */ /* synthetic */ Object zzb() {
        qu0 qu0VarZzb = this.a.zzb();
        h52 h52Var = qr.a;
        ro2.b(h52Var);
        return ((Boolean) c.c().b(w3.I5)).booleanValue() ? new nh0(this.f6179c.zzb(), h52Var) : new nh0(qu0VarZzb, h52Var);
    }
}