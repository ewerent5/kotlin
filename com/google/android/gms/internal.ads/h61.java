package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class h61 implements b61<ol0> {
    private final gk0 a;

    /* renamed from: b, reason: collision with root package name */
    private final h52 f6300b;

    /* renamed from: c, reason: collision with root package name */
    private final io0 f6301c;

    /* renamed from: d, reason: collision with root package name */
    private final iq1<pq0> f6302d;

    public h61(gk0 gk0Var, h52 h52Var, io0 io0Var, iq1<pq0> iq1Var) {
        this.a = gk0Var;
        this.f6300b = h52Var;
        this.f6301c = io0Var;
        this.f6302d = iq1Var;
    }

    private final g52<ol0> g(final kp1 kp1Var, final xo1 xo1Var, final JSONObject jSONObject) {
        final g52<pq0> g52VarB = this.f6302d.b();
        final g52<tl0> g52VarA = this.f6301c.a(kp1Var, xo1Var, jSONObject);
        return y42.m(g52VarB, g52VarA).a(new Callable(this, g52VarA, g52VarB, kp1Var, xo1Var, jSONObject) { // from class: com.google.android.gms.internal.ads.g61
            private final h61 a;

            /* renamed from: b, reason: collision with root package name */
            private final g52 f6065b;

            /* renamed from: c, reason: collision with root package name */
            private final g52 f6066c;

            /* renamed from: d, reason: collision with root package name */
            private final kp1 f6067d;

            /* renamed from: e, reason: collision with root package name */
            private final xo1 f6068e;

            /* renamed from: f, reason: collision with root package name */
            private final JSONObject f6069f;

            {
                this.a = this;
                this.f6065b = g52VarA;
                this.f6066c = g52VarB;
                this.f6067d = kp1Var;
                this.f6068e = xo1Var;
                this.f6069f = jSONObject;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.c(this.f6065b, this.f6066c, this.f6067d, this.f6068e, this.f6069f);
            }
        }, this.f6300b);
    }

    @Override // com.google.android.gms.internal.ads.j31
    public final g52<List<g52<ol0>>> a(final kp1 kp1Var, final xo1 xo1Var) {
        return y42.h(y42.h(this.f6302d.b(), new e42(this, xo1Var) { // from class: com.google.android.gms.internal.ads.c61
            private final h61 a;

            /* renamed from: b, reason: collision with root package name */
            private final xo1 f5272b;

            {
                this.a = this;
                this.f5272b = xo1Var;
            }

            @Override // com.google.android.gms.internal.ads.e42
            public final g52 zza(Object obj) {
                return this.a.f(this.f5272b, (pq0) obj);
            }
        }, this.f6300b), new e42(this, kp1Var, xo1Var) { // from class: com.google.android.gms.internal.ads.d61
            private final h61 a;

            /* renamed from: b, reason: collision with root package name */
            private final kp1 f5439b;

            /* renamed from: c, reason: collision with root package name */
            private final xo1 f5440c;

            {
                this.a = this;
                this.f5439b = kp1Var;
                this.f5440c = xo1Var;
            }

            @Override // com.google.android.gms.internal.ads.e42
            public final g52 zza(Object obj) {
                return this.a.e(this.f5439b, this.f5440c, (JSONArray) obj);
            }
        }, this.f6300b);
    }

    @Override // com.google.android.gms.internal.ads.j31
    public final boolean b(kp1 kp1Var, xo1 xo1Var) {
        cp1 cp1Var = xo1Var.r;
        return (cp1Var == null || cp1Var.f5347c == null) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ ol0 c(g52 g52Var, g52 g52Var2, kp1 kp1Var, xo1 xo1Var, JSONObject jSONObject) {
        tl0 tl0Var = (tl0) g52Var.get();
        pq0 pq0Var = (pq0) g52Var2.get();
        ul0 ul0VarC = this.a.c(new i70(kp1Var, xo1Var, null), new gm0(tl0Var), new uk0(jSONObject, pq0Var));
        ul0VarC.i().b();
        ul0VarC.j().a(pq0Var);
        ul0VarC.k().a(tl0Var.o());
        return ul0VarC.h();
    }

    final /* synthetic */ g52 d(pq0 pq0Var, JSONObject jSONObject) throws je {
        this.f6302d.c(y42.a(pq0Var));
        if (jSONObject.optBoolean("success")) {
            return y42.a(jSONObject.getJSONObject("json").getJSONArray("ads"));
        }
        throw new je("process json failed");
    }

    final /* synthetic */ g52 e(kp1 kp1Var, xo1 xo1Var, JSONArray jSONArray) {
        if (jSONArray.length() == 0) {
            return y42.b(new tx0(3));
        }
        if (kp1Var.a.a.f8434k <= 1) {
            return y42.i(g(kp1Var, xo1Var, jSONArray.getJSONObject(0)), f61.a, this.f6300b);
        }
        int length = jSONArray.length();
        this.f6302d.a(Math.min(length, kp1Var.a.a.f8434k));
        ArrayList arrayList = new ArrayList(kp1Var.a.a.f8434k);
        for (int i2 = 0; i2 < kp1Var.a.a.f8434k; i2++) {
            if (i2 < length) {
                arrayList.add(g(kp1Var, xo1Var, jSONArray.getJSONObject(i2)));
            } else {
                arrayList.add(y42.b(new tx0(3)));
            }
        }
        return y42.a(arrayList);
    }

    final /* synthetic */ g52 f(xo1 xo1Var, final pq0 pq0Var) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("isNonagon", true);
        if (((Boolean) c.c().b(w3.F5)).booleanValue() && com.google.android.gms.common.util.n.l()) {
            jSONObject.put("skipDeepLinkValidation", true);
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("response", xo1Var.r.f5347c);
        jSONObject2.put("sdk_params", jSONObject);
        return y42.h(pq0Var.c("google.afma.nativeAds.preProcessJson", jSONObject2), new e42(this, pq0Var) { // from class: com.google.android.gms.internal.ads.e61
            private final h61 a;

            /* renamed from: b, reason: collision with root package name */
            private final pq0 f5591b;

            {
                this.a = this;
                this.f5591b = pq0Var;
            }

            @Override // com.google.android.gms.internal.ads.e42
            public final g52 zza(Object obj) {
                return this.a.d(this.f5591b, (JSONObject) obj);
            }
        }, this.f6300b);
    }
}