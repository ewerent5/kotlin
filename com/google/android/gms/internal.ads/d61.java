package com.google.android.gms.internal.ads;

import org.json.JSONArray;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class d61 implements e42 {
    private final h61 a;

    /* renamed from: b */
    private final kp1 f5439b;

    /* renamed from: c */
    private final xo1 f5440c;

    d61(h61 h61Var, kp1 kp1Var, xo1 xo1Var) {
        this.a = h61Var;
        this.f5439b = kp1Var;
        this.f5440c = xo1Var;
    }

    @Override // com.google.android.gms.internal.ads.e42
    public final g52 zza(Object obj) {
        return this.a.e(this.f5439b, this.f5440c, (JSONArray) obj);
    }
}