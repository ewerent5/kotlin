package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class b90 implements mo2<nh0<cf0>> {
    private final wo2<yt0> a;

    /* renamed from: b, reason: collision with root package name */
    private final wo2<Executor> f5091b;

    /* renamed from: c, reason: collision with root package name */
    private final wo2<d11> f5092c;

    public b90(wo2<yt0> wo2Var, wo2<Executor> wo2Var2, wo2<d11> wo2Var3) {
        this.a = wo2Var;
        this.f5091b = wo2Var2;
        this.f5092c = wo2Var3;
    }

    @Override // com.google.android.gms.internal.ads.wo2
    public final /* bridge */ /* synthetic */ Object zzb() {
        yt0 yt0VarZzb = this.a.zzb();
        h52 h52Var = qr.a;
        ro2.b(h52Var);
        return ((Boolean) c.c().b(w3.I5)).booleanValue() ? new nh0(this.f5092c.zzb(), h52Var) : new nh0(yt0VarZzb, h52Var);
    }
}