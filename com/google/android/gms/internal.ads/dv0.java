package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class dv0 implements mo2<Set<nh0<jb0>>> {
    private final av0 a;

    /* renamed from: b, reason: collision with root package name */
    private final wo2<kv0> f5524b;

    /* renamed from: c, reason: collision with root package name */
    private final wo2<Executor> f5525c;

    public dv0(av0 av0Var, wo2<kv0> wo2Var, wo2<Executor> wo2Var2) {
        this.a = av0Var;
        this.f5524b = wo2Var;
        this.f5525c = wo2Var2;
    }

    @Override // com.google.android.gms.internal.ads.wo2
    public final /* bridge */ /* synthetic */ Object zzb() {
        kv0 kv0VarZzb = this.f5524b.zzb();
        h52 h52Var = qr.a;
        ro2.b(h52Var);
        Set<nh0<jb0>> setC = av0.c(kv0VarZzb, h52Var);
        ro2.b(setC);
        return setC;
    }
}