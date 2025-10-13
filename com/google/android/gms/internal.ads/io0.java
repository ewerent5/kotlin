package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.zzr;
import com.google.android.gms.ads.internal.zzs;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class io0 {
    private final h52 a;

    /* renamed from: b, reason: collision with root package name */
    private final so0 f6560b;

    /* renamed from: c, reason: collision with root package name */
    private final xo0 f6561c;

    public io0(h52 h52Var, so0 so0Var, xo0 xo0Var) {
        this.a = h52Var;
        this.f6560b = so0Var;
        this.f6561c = xo0Var;
    }

    public final g52<tl0> a(final kp1 kp1Var, final xo1 xo1Var, final JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        g52 g52VarA;
        final g52 g52VarN = this.a.N(new Callable(this, kp1Var, xo1Var, jSONObject) { // from class: com.google.android.gms.internal.ads.go0
            private final io0 a;

            /* renamed from: b, reason: collision with root package name */
            private final kp1 f6148b;

            /* renamed from: c, reason: collision with root package name */
            private final xo1 f6149c;

            /* renamed from: d, reason: collision with root package name */
            private final JSONObject f6150d;

            {
                this.a = this;
                this.f6148b = kp1Var;
                this.f6149c = xo1Var;
                this.f6150d = jSONObject;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() throws e71 {
                kp1 kp1Var2 = this.f6148b;
                xo1 xo1Var2 = this.f6149c;
                JSONObject jSONObject2 = this.f6150d;
                tl0 tl0Var = new tl0();
                tl0Var.A(jSONObject2.optInt("template_id", -1));
                tl0Var.O(jSONObject2.optString("custom_template_id"));
                JSONObject jSONObjectOptJSONObject2 = jSONObject2.optJSONObject("omid_settings");
                tl0Var.V(jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.optString("omid_partner_name") : null);
                qp1 qp1Var = kp1Var2.a.a;
                if (!qp1Var.f8430g.contains(Integer.toString(tl0Var.X()))) {
                    int iX = tl0Var.X();
                    StringBuilder sb = new StringBuilder(32);
                    sb.append("Invalid template ID: ");
                    sb.append(iX);
                    throw new e71(1, sb.toString());
                }
                if (tl0Var.X() == 3) {
                    if (tl0Var.n() == null) {
                        throw new e71(1, "No custom template id for custom template ad response.");
                    }
                    if (!qp1Var.f8431h.contains(tl0Var.n())) {
                        throw new e71(1, "Unexpected custom template id in the response.");
                    }
                }
                tl0Var.L(jSONObject2.optDouble("rating", -1.0d));
                String strOptString = jSONObject2.optString("headline", null);
                if (xo1Var2.H) {
                    zzs.zzc();
                    String strZzB = zzr.zzB();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(strZzB).length() + 3 + String.valueOf(strOptString).length());
                    sb2.append(strZzB);
                    sb2.append(" : ");
                    sb2.append(strOptString);
                    strOptString = sb2.toString();
                }
                tl0Var.S("headline", strOptString);
                tl0Var.S("body", jSONObject2.optString("body", null));
                tl0Var.S("call_to_action", jSONObject2.optString("call_to_action", null));
                tl0Var.S("store", jSONObject2.optString("store", null));
                tl0Var.S("price", jSONObject2.optString("price", null));
                tl0Var.S("advertiser", jSONObject2.optString("advertiser", null));
                return tl0Var;
            }
        });
        final g52<List<c6>> g52VarB = this.f6560b.b(jSONObject, "images");
        final g52<c6> g52VarA2 = this.f6560b.a(jSONObject, "secondary_image");
        final g52<c6> g52VarA3 = this.f6560b.a(jSONObject, "app_icon");
        final g52<z5> g52VarC = this.f6560b.c(jSONObject, "attribution");
        final g52<ew> g52VarD = this.f6560b.d(jSONObject);
        final so0 so0Var = this.f6560b;
        if (jSONObject.optBoolean("enable_omid") && (jSONObjectOptJSONObject = jSONObject.optJSONObject("omid_settings")) != null) {
            final String strOptString = jSONObjectOptJSONObject.optString("omid_html");
            g52VarA = TextUtils.isEmpty(strOptString) ? y42.a(null) : y42.h(y42.a(null), new e42(so0Var, strOptString) { // from class: com.google.android.gms.internal.ads.no0
                private final so0 a;

                /* renamed from: b, reason: collision with root package name */
                private final String f7763b;

                {
                    this.a = so0Var;
                    this.f7763b = strOptString;
                }

                @Override // com.google.android.gms.internal.ads.e42
                public final g52 zza(Object obj) {
                    return this.a.e(this.f7763b, obj);
                }
            }, qr.f8450e);
        } else {
            g52VarA = y42.a(null);
        }
        final g52 g52Var = g52VarA;
        final g52<List<wo0>> g52VarA4 = this.f6561c.a(jSONObject, "custom_assets");
        return y42.k(g52VarN, g52VarB, g52VarA2, g52VarA3, g52VarC, g52VarD, g52Var, g52VarA4).a(new Callable(this, g52VarN, g52VarB, g52VarA3, g52VarA2, g52VarC, jSONObject, g52VarD, g52Var, g52VarA4) { // from class: com.google.android.gms.internal.ads.ho0
            private final io0 a;

            /* renamed from: b, reason: collision with root package name */
            private final g52 f6357b;

            /* renamed from: c, reason: collision with root package name */
            private final g52 f6358c;

            /* renamed from: d, reason: collision with root package name */
            private final g52 f6359d;

            /* renamed from: e, reason: collision with root package name */
            private final g52 f6360e;

            /* renamed from: f, reason: collision with root package name */
            private final g52 f6361f;

            /* renamed from: g, reason: collision with root package name */
            private final JSONObject f6362g;

            /* renamed from: h, reason: collision with root package name */
            private final g52 f6363h;

            /* renamed from: i, reason: collision with root package name */
            private final g52 f6364i;

            /* renamed from: j, reason: collision with root package name */
            private final g52 f6365j;

            {
                this.a = this;
                this.f6357b = g52VarN;
                this.f6358c = g52VarB;
                this.f6359d = g52VarA3;
                this.f6360e = g52VarA2;
                this.f6361f = g52VarC;
                this.f6362g = jSONObject;
                this.f6363h = g52VarD;
                this.f6364i = g52Var;
                this.f6365j = g52VarA4;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                g52 g52Var2 = this.f6357b;
                g52 g52Var3 = this.f6358c;
                g52 g52Var4 = this.f6359d;
                g52 g52Var5 = this.f6360e;
                g52 g52Var6 = this.f6361f;
                JSONObject jSONObject2 = this.f6362g;
                g52 g52Var7 = this.f6363h;
                g52 g52Var8 = this.f6364i;
                g52 g52Var9 = this.f6365j;
                tl0 tl0Var = (tl0) g52Var2.get();
                tl0Var.H((List) g52Var3.get());
                tl0Var.M((t6) g52Var4.get());
                tl0Var.N((t6) g52Var5.get());
                tl0Var.G((l6) g52Var6.get());
                tl0Var.I(so0.h(jSONObject2));
                tl0Var.J(so0.g(jSONObject2));
                ew ewVar = (ew) g52Var7.get();
                if (ewVar != null) {
                    tl0Var.P(ewVar);
                    tl0Var.K(ewVar.n());
                    tl0Var.F(ewVar.zzh());
                }
                ew ewVar2 = (ew) g52Var8.get();
                if (ewVar2 != null) {
                    tl0Var.Q(ewVar2);
                }
                for (wo0 wo0Var : (List) g52Var9.get()) {
                    if (wo0Var.a != 1) {
                        tl0Var.T(wo0Var.f10009b, wo0Var.f10011d);
                    } else {
                        tl0Var.S(wo0Var.f10009b, wo0Var.f10010c);
                    }
                }
                return tl0Var;
            }
        }, this.a);
    }
}