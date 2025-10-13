package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class cu0 implements mo2<nh0<jd0>> {
    private final wo2<au0> a;

    /* renamed from: b, reason: collision with root package name */
    private final wo2<Executor> f5371b;

    /* renamed from: c, reason: collision with root package name */
    private final wo2<f11> f5372c;

    public cu0(wo2<au0> wo2Var, wo2<Executor> wo2Var2, wo2<f11> wo2Var3) {
        this.a = wo2Var;
        this.f5371b = wo2Var2;
        this.f5372c = wo2Var3;
    }

    @Override // com.google.android.gms.internal.ads.wo2
    public final /* bridge */ /* synthetic */ Object zzb() {
        au0 au0VarZzb = this.a.zzb();
        h52 h52Var = qr.a;
        ro2.b(h52Var);
        return ((Boolean) c.c().b(w3.I5)).booleanValue() ? new nh0(this.f5372c.zzb(), h52Var) : new nh0(au0VarZzb, h52Var);
    }
}