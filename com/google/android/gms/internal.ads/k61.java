package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class k61 implements mo2<j61> {
    private final wo2<Context> a;

    /* renamed from: b, reason: collision with root package name */
    private final wo2<gk0> f6974b;

    /* renamed from: c, reason: collision with root package name */
    private final wo2<Executor> f6975c;

    public k61(wo2<Context> wo2Var, wo2<gk0> wo2Var2, wo2<Executor> wo2Var3) {
        this.a = wo2Var;
        this.f6974b = wo2Var2;
        this.f6975c = wo2Var3;
    }

    @Override // com.google.android.gms.internal.ads.wo2
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new j61(this.a.zzb(), this.f6974b.zzb(), this.f6975c.zzb());
    }
}