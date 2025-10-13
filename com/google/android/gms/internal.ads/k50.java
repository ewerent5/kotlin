package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class k50 implements mo2<so> {
    private final y40 a;

    /* renamed from: b, reason: collision with root package name */
    private final wo2<Context> f6966b;

    /* renamed from: c, reason: collision with root package name */
    private final wo2<qp1> f6967c;

    public k50(y40 y40Var, wo2<Context> wo2Var, wo2<qp1> wo2Var2) {
        this.a = y40Var;
        this.f6966b = wo2Var;
        this.f6967c = wo2Var2;
    }

    @Override // com.google.android.gms.internal.ads.wo2
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final so zzb() {
        return new so(((vq1) this.f6966b).a(), ((ga0) this.f6967c).a().f8429f);
    }
}