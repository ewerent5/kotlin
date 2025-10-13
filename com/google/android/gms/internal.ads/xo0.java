package com.google.android.gms.internal.ads;

import ch.qos.logback.core.joran.action.Action;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class xo0 {
    private final Executor a;

    /* renamed from: b, reason: collision with root package name */
    private final so0 f10196b;

    public xo0(Executor executor, so0 so0Var) {
        this.a = executor;
        this.f10196b = so0Var;
    }

    public final g52<List<wo0>> a(JSONObject jSONObject, String str) {
        g52 g52VarA;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("custom_assets");
        if (jSONArrayOptJSONArray == null) {
            return y42.a(Collections.emptyList());
        }
        ArrayList arrayList = new ArrayList();
        int length = jSONArrayOptJSONArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i2);
            if (jSONObjectOptJSONObject == null) {
                g52VarA = y42.a(null);
            } else {
                final String strOptString = jSONObjectOptJSONObject.optString(Action.NAME_ATTRIBUTE);
                if (strOptString == null) {
                    g52VarA = y42.a(null);
                } else {
                    String strOptString2 = jSONObjectOptJSONObject.optString("type");
                    g52VarA = "string".equals(strOptString2) ? y42.a(new wo0(strOptString, jSONObjectOptJSONObject.optString("string_value"))) : "image".equals(strOptString2) ? y42.i(this.f10196b.a(jSONObjectOptJSONObject, "image_value"), new x02(strOptString) { // from class: com.google.android.gms.internal.ads.vo0
                        private final String a;

                        {
                            this.a = strOptString;
                        }

                        @Override // com.google.android.gms.internal.ads.x02
                        public final Object apply(Object obj) {
                            return new wo0(this.a, (c6) obj);
                        }
                    }, this.a) : y42.a(null);
                }
            }
            arrayList.add(g52VarA);
        }
        return y42.i(y42.j(arrayList), uo0.a, this.a);
    }
}