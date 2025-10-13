package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzr;
import com.google.android.gms.ads.internal.zzs;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class go0 implements Callable {
    private final io0 a;

    /* renamed from: b */
    private final kp1 f6148b;

    /* renamed from: c */
    private final xo1 f6149c;

    /* renamed from: d */
    private final JSONObject f6150d;

    go0(io0 io0Var, kp1 kp1Var, xo1 xo1Var, JSONObject jSONObject) {
        this.a = io0Var;
        this.f6148b = kp1Var;
        this.f6149c = xo1Var;
        this.f6150d = jSONObject;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws e71 {
        kp1 kp1Var = this.f6148b;
        xo1 xo1Var = this.f6149c;
        JSONObject jSONObject = this.f6150d;
        tl0 tl0Var = new tl0();
        tl0Var.A(jSONObject.optInt("template_id", -1));
        tl0Var.O(jSONObject.optString("custom_template_id"));
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("omid_settings");
        tl0Var.V(jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optString("omid_partner_name") : null);
        qp1 qp1Var = kp1Var.a.a;
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
        tl0Var.L(jSONObject.optDouble("rating", -1.0d));
        String strOptString = jSONObject.optString("headline", null);
        if (xo1Var.H) {
            zzs.zzc();
            String strZzB = zzr.zzB();
            StringBuilder sb2 = new StringBuilder(String.valueOf(strZzB).length() + 3 + String.valueOf(strOptString).length());
            sb2.append(strZzB);
            sb2.append(" : ");
            sb2.append(strOptString);
            strOptString = sb2.toString();
        }
        tl0Var.S("headline", strOptString);
        tl0Var.S("body", jSONObject.optString("body", null));
        tl0Var.S("call_to_action", jSONObject.optString("call_to_action", null));
        tl0Var.S("store", jSONObject.optString("store", null));
        tl0Var.S("price", jSONObject.optString("price", null));
        tl0Var.S("advertiser", jSONObject.optString("advertiser", null));
        return tl0Var;
    }
}