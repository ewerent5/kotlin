package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class aj1 implements mo2<yi1> {
    private final wo2<zj> a;

    /* renamed from: b, reason: collision with root package name */
    private final wo2<ScheduledExecutorService> f4921b;

    /* renamed from: c, reason: collision with root package name */
    private final wo2<Context> f4922c;

    public aj1(wo2<zj> wo2Var, wo2<ScheduledExecutorService> wo2Var2, wo2<Context> wo2Var3) {
        this.a = wo2Var;
        this.f4921b = wo2Var2;
        this.f4922c = wo2Var3;
    }

    @Override // com.google.android.gms.internal.ads.wo2
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new yi1(new zj(), this.f4921b.zzb(), ((hy) this.f4922c).a(), null);
    }
}