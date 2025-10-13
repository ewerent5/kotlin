package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class f60 implements mo2<a60> {
    private final wo2<r60> a;

    /* renamed from: b, reason: collision with root package name */
    private final wo2<h8> f5806b;

    /* renamed from: c, reason: collision with root package name */
    private final wo2<Runnable> f5807c;

    /* renamed from: d, reason: collision with root package name */
    private final wo2<Executor> f5808d;

    public f60(wo2<r60> wo2Var, wo2<h8> wo2Var2, wo2<Runnable> wo2Var3, wo2<Executor> wo2Var4) {
        this.a = wo2Var;
        this.f5806b = wo2Var2;
        this.f5807c = wo2Var3;
        this.f5808d = wo2Var4;
    }

    @Override // com.google.android.gms.internal.ads.wo2
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new a60(((o80) this.a).zzb(), ((e60) this.f5806b).a(), ((d60) this.f5807c).a(), this.f5808d.zzb());
    }
}