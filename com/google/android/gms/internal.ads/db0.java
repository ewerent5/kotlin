package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class db0 implements mo2<bb0> {
    private final wo2<ab0> a;

    /* renamed from: b, reason: collision with root package name */
    private final wo2<Set<nh0<ua0>>> f5461b;

    /* renamed from: c, reason: collision with root package name */
    private final wo2<Executor> f5462c;

    public db0(wo2<ab0> wo2Var, wo2<Set<nh0<ua0>>> wo2Var2, wo2<Executor> wo2Var3) {
        this.a = wo2Var;
        this.f5461b = wo2Var2;
        this.f5462c = wo2Var3;
    }

    @Override // com.google.android.gms.internal.ads.wo2
    public final /* bridge */ /* synthetic */ Object zzb() {
        ab0 ab0VarZzb = ((cb0) this.a).zzb();
        Set setZzb = ((uo2) this.f5461b).zzb();
        h52 h52Var = qr.a;
        ro2.b(h52Var);
        return new bb0(ab0VarZzb, setZzb, h52Var);
    }
}