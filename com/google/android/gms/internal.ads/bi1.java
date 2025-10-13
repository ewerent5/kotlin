package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class bi1 implements mo2<zh1> {
    private final wo2<sl> a;

    /* renamed from: b, reason: collision with root package name */
    private final wo2<Context> f5115b;

    /* renamed from: c, reason: collision with root package name */
    private final wo2<String> f5116c;

    /* renamed from: d, reason: collision with root package name */
    private final wo2<h52> f5117d;

    public bi1(wo2<sl> wo2Var, wo2<Context> wo2Var2, wo2<String> wo2Var3, wo2<h52> wo2Var4) {
        this.a = wo2Var;
        this.f5115b = wo2Var2;
        this.f5116c = wo2Var3;
        this.f5117d = wo2Var4;
    }

    @Override // com.google.android.gms.internal.ads.wo2
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context contextA = ((hy) this.f5115b).a();
        String strA = ((cj1) this.f5116c).a();
        h52 h52Var = qr.a;
        ro2.b(h52Var);
        return new zh1(null, contextA, strA, h52Var);
    }
}