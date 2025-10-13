package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class r41 implements mo2<q41> {
    private final wo2<Context> a;

    /* renamed from: b, reason: collision with root package name */
    private final wo2<p50> f8576b;

    /* renamed from: c, reason: collision with root package name */
    private final wo2<Executor> f8577c;

    public r41(wo2<Context> wo2Var, wo2<p50> wo2Var2, wo2<Executor> wo2Var3) {
        this.a = wo2Var;
        this.f8576b = wo2Var2;
        this.f8577c = wo2Var3;
    }

    @Override // com.google.android.gms.internal.ads.wo2
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new q41(this.a.zzb(), this.f8576b.zzb(), this.f8577c.zzb());
    }
}