package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class au1 implements mo2<zt1> {
    private final wo2<Executor> a;

    /* renamed from: b, reason: collision with root package name */
    private final wo2<jr> f5004b;

    public au1(wo2<Executor> wo2Var, wo2<jr> wo2Var2) {
        this.a = wo2Var;
        this.f5004b = wo2Var2;
    }

    @Override // com.google.android.gms.internal.ads.wo2
    public final /* bridge */ /* synthetic */ Object zzb() {
        h52 h52Var = qr.a;
        ro2.b(h52Var);
        return new zt1(h52Var, this.f5004b.zzb());
    }
}