package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class e61 implements e42 {
    private final h61 a;

    /* renamed from: b */
    private final pq0 f5591b;

    e61(h61 h61Var, pq0 pq0Var) {
        this.a = h61Var;
        this.f5591b = pq0Var;
    }

    @Override // com.google.android.gms.internal.ads.e42
    public final g52 zza(Object obj) {
        return this.a.d(this.f5591b, (JSONObject) obj);
    }
}