package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class bm0 implements mo2<yl0> {
    private final wo2<xo1> a;

    /* renamed from: b, reason: collision with root package name */
    private final wo2<JSONObject> f5144b;

    public bm0(wo2<xo1> wo2Var, wo2<JSONObject> wo2Var2) {
        this.a = wo2Var;
        this.f5144b = wo2Var2;
    }

    @Override // com.google.android.gms.internal.ads.wo2
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new yl0(((j70) this.a).a(), ((xk0) this.f5144b).a());
    }
}