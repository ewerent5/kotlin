package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class z20 implements mo2<y20> {
    private final wo2<ef> a;

    /* renamed from: b, reason: collision with root package name */
    private final wo2<u20> f10529b;

    /* renamed from: c, reason: collision with root package name */
    private final wo2<Executor> f10530c;

    /* renamed from: d, reason: collision with root package name */
    private final wo2<t20> f10531d;

    /* renamed from: e, reason: collision with root package name */
    private final wo2<com.google.android.gms.common.util.f> f10532e;

    public z20(wo2<ef> wo2Var, wo2<u20> wo2Var2, wo2<Executor> wo2Var3, wo2<t20> wo2Var4, wo2<com.google.android.gms.common.util.f> wo2Var5) {
        this.a = wo2Var;
        this.f10529b = wo2Var2;
        this.f10530c = wo2Var3;
        this.f10531d = wo2Var4;
        this.f10532e = wo2Var5;
    }

    @Override // com.google.android.gms.internal.ads.wo2
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new y20(this.a.zzb(), this.f10529b.zzb(), this.f10530c.zzb(), this.f10531d.zzb(), this.f10532e.zzb());
    }
}