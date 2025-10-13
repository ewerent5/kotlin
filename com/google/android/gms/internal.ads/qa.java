package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzs;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class qa implements ba<Object> {
    private final Object a = new Object();

    /* renamed from: b, reason: collision with root package name */
    @GuardedBy("lock")
    private final Map<String, pa> f8353b = new HashMap();

    @Override // com.google.android.gms.internal.ads.ba
    public final void a(Object obj, Map<String, String> map) {
        String strConcat;
        String str = map.get("id");
        String str2 = map.get("fail");
        String str3 = map.get("fail_reason");
        String str4 = map.get("fail_stack");
        String str5 = map.get("result");
        if (true == TextUtils.isEmpty(str4)) {
            str3 = "Unknown Fail Reason.";
        }
        if (TextUtils.isEmpty(str4)) {
            strConcat = "";
        } else {
            String strValueOf = String.valueOf(str4);
            strConcat = strValueOf.length() != 0 ? "\n".concat(strValueOf) : new String("\n");
        }
        synchronized (this.a) {
            pa paVarRemove = this.f8353b.remove(str);
            if (paVarRemove == null) {
                String strValueOf2 = String.valueOf(str);
                er.zzi(strValueOf2.length() != 0 ? "Received result for unexpected method invocation: ".concat(strValueOf2) : new String("Received result for unexpected method invocation: "));
                return;
            }
            if (!TextUtils.isEmpty(str2)) {
                String strValueOf3 = String.valueOf(str3);
                String strValueOf4 = String.valueOf(strConcat);
                paVarRemove.c(strValueOf4.length() != 0 ? strValueOf3.concat(strValueOf4) : new String(strValueOf3));
            } else {
                if (str5 == null) {
                    paVarRemove.d(null);
                    return;
                }
                try {
                    JSONObject jSONObject = new JSONObject(str5);
                    if (zze.zzc()) {
                        String strValueOf5 = String.valueOf(jSONObject.toString(2));
                        zze.zza(strValueOf5.length() != 0 ? "Result GMSG: ".concat(strValueOf5) : new String("Result GMSG: "));
                    }
                    paVarRemove.d(jSONObject);
                } catch (JSONException e2) {
                    paVarRemove.c(e2.getMessage());
                }
            }
        }
    }

    public final void b(String str, pa paVar) {
        synchronized (this.a) {
            this.f8353b.put(str, paVar);
        }
    }

    public final <EngineT extends jd> g52<JSONObject> c(EngineT enginet, String str, JSONObject jSONObject) throws JSONException {
        wr wrVar = new wr();
        zzs.zzc();
        String string = UUID.randomUUID().toString();
        b(string, new oa(this, wrVar));
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("id", string);
            jSONObject2.put("args", jSONObject);
            enginet.j0(str, jSONObject2);
        } catch (Exception e2) {
            wrVar.zzd(e2);
        }
        return wrVar;
    }
}