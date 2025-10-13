package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class g61 implements Callable {
    private final h61 a;

    /* renamed from: b */
    private final g52 f6065b;

    /* renamed from: c */
    private final g52 f6066c;

    /* renamed from: d */
    private final kp1 f6067d;

    /* renamed from: e */
    private final xo1 f6068e;

    /* renamed from: f */
    private final JSONObject f6069f;

    g61(h61 h61Var, g52 g52Var, g52 g52Var2, kp1 kp1Var, xo1 xo1Var, JSONObject jSONObject) {
        this.a = h61Var;
        this.f6065b = g52Var;
        this.f6066c = g52Var2;
        this.f6067d = kp1Var;
        this.f6068e = xo1Var;
        this.f6069f = jSONObject;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.a.c(this.f6065b, this.f6066c, this.f6067d, this.f6068e, this.f6069f);
    }
}