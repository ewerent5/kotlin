package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class ke1 implements mo2<ie1> {
    private final wo2<Context> a;

    /* renamed from: b, reason: collision with root package name */
    private final wo2<h52> f6989b;

    public ke1(wo2<Context> wo2Var, wo2<h52> wo2Var2) {
        this.a = wo2Var;
        this.f6989b = wo2Var2;
    }

    @Override // com.google.android.gms.internal.ads.wo2
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context contextZzb = this.a.zzb();
        h52 h52Var = qr.a;
        ro2.b(h52Var);
        return new ie1(contextZzb, h52Var);
    }
}