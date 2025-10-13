package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.ads.internal.util.zze;
import java.util.HashMap;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class c11 implements vs1<b11, x01> {
    private final String a;

    public c11(String str) {
        this.a = str;
    }

    @Override // com.google.android.gms.internal.ads.vs1
    public final /* bridge */ /* synthetic */ x01 zza(b11 b11Var) throws tx0 {
        b11 b11Var2 = b11Var;
        int iOptInt = b11Var2.a.optInt("http_timeout_millis", CoreConstants.MILLIS_IN_ONE_MINUTE);
        tl tlVar = b11Var2.f5043b;
        if (tlVar.a() != -2) {
            if (tlVar.a() != 1) {
                throw new tx0(1);
            }
            if (tlVar.b() != null) {
                er.zzf(TextUtils.join(", ", tlVar.b()));
            }
            throw new tx0(2, "Error building request URL.");
        }
        HashMap map = new HashMap();
        if (b11Var2.f5043b.g() && !TextUtils.isEmpty(this.a)) {
            map.put("Cookie", this.a);
        }
        String strD = "";
        if (b11Var2.f5043b.f()) {
            JSONObject jSONObjectOptJSONObject = b11Var2.a.optJSONObject("pii");
            if (jSONObjectOptJSONObject != null) {
                if (!TextUtils.isEmpty(jSONObjectOptJSONObject.optString("doritos", ""))) {
                    map.put("x-afma-drt-cookie", jSONObjectOptJSONObject.optString("doritos", ""));
                }
                if (!TextUtils.isEmpty(jSONObjectOptJSONObject.optString("doritos_v2", ""))) {
                    map.put("x-afma-drt-v2-cookie", jSONObjectOptJSONObject.optString("doritos_v2", ""));
                }
            } else {
                zze.zza("DSID signal does not exist.");
            }
        }
        if (b11Var2.f5043b != null && !TextUtils.isEmpty(b11Var2.f5043b.d())) {
            strD = b11Var2.f5043b.d();
        }
        return new x01(b11Var2.f5043b.e(), iOptInt, map, strD);
    }
}