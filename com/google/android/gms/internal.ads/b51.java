package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class b51 implements mo2<a51> {
    private final wo2<Context> a;

    /* renamed from: b, reason: collision with root package name */
    private final wo2<Executor> f5074b;

    /* renamed from: c, reason: collision with root package name */
    private final wo2<jj0> f5075c;

    /* renamed from: d, reason: collision with root package name */
    private final wo2<wo1> f5076d;

    public b51(wo2<Context> wo2Var, wo2<Executor> wo2Var2, wo2<jj0> wo2Var3, wo2<wo1> wo2Var4) {
        this.a = wo2Var;
        this.f5074b = wo2Var2;
        this.f5075c = wo2Var3;
        this.f5076d = wo2Var4;
    }

    @Override // com.google.android.gms.internal.ads.wo2
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new a51(this.a.zzb(), this.f5074b.zzb(), this.f5075c.zzb(), this.f5076d.zzb());
    }
}