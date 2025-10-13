package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class e41 implements mo2<d41> {
    private final wo2<t30> a;

    /* renamed from: b, reason: collision with root package name */
    private final wo2<Context> f5574b;

    /* renamed from: c, reason: collision with root package name */
    private final wo2<Executor> f5575c;

    /* renamed from: d, reason: collision with root package name */
    private final wo2<vr0> f5576d;

    public e41(wo2<t30> wo2Var, wo2<Context> wo2Var2, wo2<Executor> wo2Var3, wo2<vr0> wo2Var4) {
        this.a = wo2Var;
        this.f5574b = wo2Var2;
        this.f5575c = wo2Var3;
        this.f5576d = wo2Var4;
    }

    @Override // com.google.android.gms.internal.ads.wo2
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new d41(this.a.zzb(), this.f5574b.zzb(), this.f5575c.zzb(), this.f5576d.zzb());
    }
}