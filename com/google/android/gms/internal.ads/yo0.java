package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class yo0 implements mo2<xo0> {
    private final wo2<Executor> a;

    /* renamed from: b, reason: collision with root package name */
    private final wo2<so0> f10457b;

    public yo0(wo2<Executor> wo2Var, wo2<so0> wo2Var2) {
        this.a = wo2Var;
        this.f10457b = wo2Var2;
    }

    @Override // com.google.android.gms.internal.ads.wo2
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final xo0 zzb() {
        h52 h52Var = qr.a;
        ro2.b(h52Var);
        return new xo0(h52Var, ((to0) this.f10457b).zzb());
    }
}