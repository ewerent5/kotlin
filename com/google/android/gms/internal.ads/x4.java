package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class x4 implements mo2<w4> {
    private final wo2<Context> a;

    /* renamed from: b, reason: collision with root package name */
    private final wo2<ScheduledExecutorService> f10119b;

    /* renamed from: c, reason: collision with root package name */
    private final wo2<y4> f10120c;

    public x4(wo2<Context> wo2Var, wo2<ScheduledExecutorService> wo2Var2, wo2<y4> wo2Var3) {
        this.a = wo2Var;
        this.f10119b = wo2Var2;
        this.f10120c = wo2Var3;
    }

    @Override // com.google.android.gms.internal.ads.wo2
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new w4(((vq1) this.a).a(), this.f10119b.zzb(), new y4(), null);
    }
}