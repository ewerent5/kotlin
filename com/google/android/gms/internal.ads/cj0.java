package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class cj0 implements mo2<nh0<xe0>> {
    private final pi0 a;

    /* renamed from: b, reason: collision with root package name */
    private final wo2<Executor> f5324b;

    public cj0(pi0 pi0Var, wo2<Executor> wo2Var) {
        this.a = pi0Var;
        this.f5324b = wo2Var;
    }

    @Override // com.google.android.gms.internal.ads.wo2
    public final /* bridge */ /* synthetic */ Object zzb() {
        return this.a.g(this.f5324b.zzb());
    }
}