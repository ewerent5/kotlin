package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class v51 implements mo2<u51> {
    private final wo2<Context> a;

    /* renamed from: b, reason: collision with root package name */
    private final wo2<kr> f9655b;

    /* renamed from: c, reason: collision with root package name */
    private final wo2<jj0> f9656c;

    /* renamed from: d, reason: collision with root package name */
    private final wo2<Executor> f9657d;

    public v51(wo2<Context> wo2Var, wo2<kr> wo2Var2, wo2<jj0> wo2Var3, wo2<Executor> wo2Var4) {
        this.a = wo2Var;
        this.f9655b = wo2Var2;
        this.f9656c = wo2Var3;
        this.f9657d = wo2Var4;
    }

    @Override // com.google.android.gms.internal.ads.wo2
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context contextZzb = this.a.zzb();
        kr krVarA = ((qy) this.f9655b).a();
        jj0 jj0VarZzb = this.f9656c.zzb();
        h52 h52Var = qr.a;
        ro2.b(h52Var);
        return new u51(contextZzb, krVarA, jj0VarZzb, h52Var);
    }
}