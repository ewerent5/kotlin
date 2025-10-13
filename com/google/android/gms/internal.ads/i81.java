package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class i81 implements mo2<h81> {
    private final wo2<Context> a;

    /* renamed from: b, reason: collision with root package name */
    private final wo2<Executor> f6500b;

    /* renamed from: c, reason: collision with root package name */
    private final wo2<dr0> f6501c;

    public i81(wo2<Context> wo2Var, wo2<Executor> wo2Var2, wo2<dr0> wo2Var3) {
        this.a = wo2Var;
        this.f6500b = wo2Var2;
        this.f6501c = wo2Var3;
    }

    @Override // com.google.android.gms.internal.ads.wo2
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new h81(this.a.zzb(), this.f6500b.zzb(), this.f6501c.zzb());
    }
}