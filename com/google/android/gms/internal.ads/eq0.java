package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class eq0 implements e42 {
    private final pq0 a;

    /* renamed from: b */
    private final String f5685b;

    /* renamed from: c */
    private final JSONObject f5686c;

    eq0(pq0 pq0Var, String str, JSONObject jSONObject) {
        this.a = pq0Var;
        this.f5685b = str;
        this.f5686c = jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.e42
    public final g52 zza(Object obj) {
        return this.a.i(this.f5685b, this.f5686c, (ew) obj);
    }
}