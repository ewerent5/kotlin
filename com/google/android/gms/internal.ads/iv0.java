package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class iv0 implements mo2<Set<nh0<ib0>>> {
    private final av0 a;

    /* renamed from: b, reason: collision with root package name */
    private final wo2<kv0> f6613b;

    /* renamed from: c, reason: collision with root package name */
    private final wo2<Executor> f6614c;

    public iv0(av0 av0Var, wo2<kv0> wo2Var, wo2<Executor> wo2Var2) {
        this.a = av0Var;
        this.f6613b = wo2Var;
        this.f6614c = wo2Var2;
    }

    @Override // com.google.android.gms.internal.ads.wo2
    public final /* bridge */ /* synthetic */ Object zzb() {
        kv0 kv0VarZzb = this.f6613b.zzb();
        h52 h52Var = qr.a;
        ro2.b(h52Var);
        Set<nh0<ib0>> setH = av0.h(kv0VarZzb, h52Var);
        ro2.b(setH);
        return setH;
    }
}