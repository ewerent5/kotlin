package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class ca0 implements mo2<Context> {
    private final ba0 a;

    /* renamed from: b, reason: collision with root package name */
    private final wo2<Context> f5302b;

    public ca0(ba0 ba0Var, wo2<Context> wo2Var) {
        this.a = ba0Var;
        this.f5302b = wo2Var;
    }

    @Override // com.google.android.gms.internal.ads.wo2
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context contextE = this.a.e(((vq1) this.f5302b).a());
        ro2.b(contextE);
        return contextE;
    }
}