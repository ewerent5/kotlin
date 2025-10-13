package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class ev1 {
    private final lv1 a;

    /* renamed from: b, reason: collision with root package name */
    private final lv1 f5722b;

    /* renamed from: c, reason: collision with root package name */
    private final iv1 f5723c;

    /* renamed from: d, reason: collision with root package name */
    private final kv1 f5724d;

    private ev1(iv1 iv1Var, kv1 kv1Var, lv1 lv1Var, lv1 lv1Var2, boolean z) {
        this.f5723c = iv1Var;
        this.f5724d = kv1Var;
        this.a = lv1Var;
        if (lv1Var2 == null) {
            this.f5722b = lv1.NONE;
        } else {
            this.f5722b = lv1Var2;
        }
    }

    public static ev1 a(iv1 iv1Var, kv1 kv1Var, lv1 lv1Var, lv1 lv1Var2, boolean z) {
        mw1.a(kv1Var, "ImpressionType is null");
        mw1.a(lv1Var, "Impression owner is null");
        mw1.c(lv1Var, iv1Var, kv1Var);
        return new ev1(iv1Var, kv1Var, lv1Var, lv1Var2, true);
    }

    @Deprecated
    public static ev1 b(lv1 lv1Var, lv1 lv1Var2, boolean z) {
        mw1.a(lv1Var, "Impression owner is null");
        mw1.c(lv1Var, null, null);
        return new ev1(null, null, lv1Var, lv1Var2, true);
    }

    public final JSONObject c() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        kw1.c(jSONObject, "impressionOwner", this.a);
        if (this.f5723c == null || this.f5724d == null) {
            kw1.c(jSONObject, "videoEventsOwner", this.f5722b);
        } else {
            kw1.c(jSONObject, "mediaEventsOwner", this.f5722b);
            kw1.c(jSONObject, "creativeType", this.f5723c);
            kw1.c(jSONObject, "impressionType", this.f5724d);
        }
        kw1.c(jSONObject, "isolateVerificationScripts", Boolean.TRUE);
        return jSONObject;
    }
}