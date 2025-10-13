package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class fc1 implements mo2<ec1> {
    private final wo2<g52<String>> a;

    /* renamed from: b, reason: collision with root package name */
    private final wo2<Executor> f5840b;

    public fc1(wo2<g52<String>> wo2Var, wo2<Executor> wo2Var2) {
        this.a = wo2Var;
        this.f5840b = wo2Var2;
    }

    @Override // com.google.android.gms.internal.ads.wo2
    public final /* bridge */ /* synthetic */ Object zzb() {
        g52<String> g52VarZzb = this.a.zzb();
        h52 h52Var = qr.a;
        ro2.b(h52Var);
        return new ec1(g52VarZzb, h52Var);
    }
}