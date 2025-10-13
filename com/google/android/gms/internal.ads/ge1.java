package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class ge1 implements mo2<fe1> {
    private final wo2<Context> a;

    /* renamed from: b, reason: collision with root package name */
    private final wo2<h52> f6111b;

    public ge1(wo2<Context> wo2Var, wo2<h52> wo2Var2) {
        this.a = wo2Var;
        this.f6111b = wo2Var2;
    }

    public static fe1 a(Context context, h52 h52Var) {
        return new fe1(context, h52Var);
    }

    @Override // com.google.android.gms.internal.ads.wo2
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context contextA = ((vq1) this.a).a();
        h52 h52Var = qr.a;
        ro2.b(h52Var);
        return new fe1(contextA, h52Var);
    }
}