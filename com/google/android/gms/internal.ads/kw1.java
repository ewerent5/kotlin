package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.view.WindowManager;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class kw1 {
    private static WindowManager a;

    /* renamed from: b, reason: collision with root package name */
    private static final String[] f7106b = {"x", "y", "width", "height"};

    /* renamed from: c, reason: collision with root package name */
    static float f7107c = Resources.getSystem().getDisplayMetrics().density;

    public static void a(Context context) {
        if (context != null) {
            f7107c = context.getResources().getDisplayMetrics().density;
            a = (WindowManager) context.getSystemService("window");
        }
    }

    public static JSONObject b(int i2, int i3, int i4, int i5) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", i2 / f7107c);
            jSONObject.put("y", i3 / f7107c);
            jSONObject.put("width", i4 / f7107c);
            jSONObject.put("height", i5 / f7107c);
        } catch (JSONException e2) {
            lw1.a("Error with creating viewStateObject", e2);
        }
        return jSONObject;
    }

    public static void c(JSONObject jSONObject, String str, Object obj) throws JSONException {
        try {
            jSONObject.put(str, obj);
        } catch (JSONException e2) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 47);
            sb.append("JSONException during JSONObject.put for name [");
            sb.append(str);
            sb.append("]");
            lw1.a(sb.toString(), e2);
        }
    }

    public static void d(JSONObject jSONObject, String str) throws JSONException {
        try {
            jSONObject.put("adSessionId", str);
        } catch (JSONException e2) {
            lw1.a("Error with setting ad session id", e2);
        }
    }

    public static void e(JSONObject jSONObject, String str) throws JSONException {
        try {
            jSONObject.put("notVisibleReason", str);
        } catch (JSONException e2) {
            lw1.a("Error with setting not visible reason", e2);
        }
    }

    public static void f(JSONObject jSONObject, ow1 ow1Var) throws JSONException {
        wv1 wv1VarB = ow1Var.b();
        JSONArray jSONArray = new JSONArray();
        ArrayList<String> arrayListC = ow1Var.c();
        int size = arrayListC.size();
        for (int i2 = 0; i2 < size; i2++) {
            jSONArray.put(arrayListC.get(i2));
        }
        try {
            jSONObject.put("isFriendlyObstructionFor", jSONArray);
            jSONObject.put("friendlyObstructionClass", wv1VarB.b());
            jSONObject.put("friendlyObstructionPurpose", wv1VarB.c());
            jSONObject.put("friendlyObstructionReason", wv1VarB.d());
        } catch (JSONException e2) {
            lw1.a("Error with setting friendly obstruction", e2);
        }
    }

    public static void g(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        try {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("childViews");
            if (jSONArrayOptJSONArray == null) {
                jSONArrayOptJSONArray = new JSONArray();
                jSONObject.put("childViews", jSONArrayOptJSONArray);
            }
            jSONArrayOptJSONArray.put(jSONObject2);
        } catch (JSONException e2) {
            ih2.b(e2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void h(org.json.JSONObject r17) throws org.json.JSONException {
        /*
            r0 = r17
            int r1 = android.os.Build.VERSION.SDK_INT
            java.lang.String r2 = "height"
            java.lang.String r3 = "width"
            r4 = 0
            r5 = 0
            r6 = 17
            if (r1 < r6) goto L2e
            android.view.WindowManager r1 = com.google.android.gms.internal.ads.kw1.a
            if (r1 == 0) goto L66
            android.graphics.Point r1 = new android.graphics.Point
            r1.<init>(r4, r4)
            android.view.WindowManager r4 = com.google.android.gms.internal.ads.kw1.a
            android.view.Display r4 = r4.getDefaultDisplay()
            r4.getRealSize(r1)
            int r4 = r1.x
            float r4 = (float) r4
            float r5 = com.google.android.gms.internal.ads.kw1.f7107c
            float r4 = r4 / r5
            int r1 = r1.y
            float r1 = (float) r1
            float r5 = r1 / r5
            r7 = r5
            r5 = r4
            goto L67
        L2e:
            java.lang.String r1 = "childViews"
            org.json.JSONArray r1 = r0.optJSONArray(r1)
            if (r1 == 0) goto L66
            int r6 = r1.length()
            r7 = 0
        L3b:
            if (r4 >= r6) goto L67
            org.json.JSONObject r8 = r1.optJSONObject(r4)
            if (r8 == 0) goto L63
            java.lang.String r9 = "x"
            double r9 = r8.optDouble(r9)
            java.lang.String r11 = "y"
            double r11 = r8.optDouble(r11)
            double r13 = r8.optDouble(r3)
            double r15 = r8.optDouble(r2)
            double r9 = r9 + r13
            float r8 = (float) r9
            float r5 = java.lang.Math.max(r5, r8)
            double r11 = r11 + r15
            float r8 = (float) r11
            float r7 = java.lang.Math.max(r7, r8)
        L63:
            int r4 = r4 + 1
            goto L3b
        L66:
            r7 = 0
        L67:
            double r4 = (double) r5
            r0.put(r3, r4)     // Catch: org.json.JSONException -> L70
            double r3 = (double) r7     // Catch: org.json.JSONException -> L70
            r0.put(r2, r3)     // Catch: org.json.JSONException -> L70
            return
        L70:
            r0 = move-exception
            com.google.android.gms.internal.ads.ih2.b(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.kw1.h(org.json.JSONObject):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean i(org.json.JSONObject r9, org.json.JSONObject r10) {
        /*
            r0 = 1
            if (r9 != 0) goto L7
            if (r10 == 0) goto L6
            goto L7
        L6:
            return r0
        L7:
            r1 = 0
            if (r9 == 0) goto L94
            if (r10 != 0) goto Le
            goto L94
        Le:
            java.lang.String[] r2 = com.google.android.gms.internal.ads.kw1.f7106b
            int r3 = r2.length
            r3 = 0
        L12:
            r4 = 4
            if (r3 >= r4) goto L28
            r4 = r2[r3]
            double r5 = r9.optDouble(r4)
            double r7 = r10.optDouble(r4)
            int r4 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r4 == 0) goto L25
            goto L94
        L25:
            int r3 = r3 + 1
            goto L12
        L28:
            java.lang.String r2 = "adSessionId"
            java.lang.String r3 = ""
            java.lang.String r4 = r9.optString(r2, r3)
            java.lang.String r2 = r10.optString(r2, r3)
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L94
            java.lang.String r2 = "isFriendlyObstructionFor"
            org.json.JSONArray r4 = r9.optJSONArray(r2)
            org.json.JSONArray r2 = r10.optJSONArray(r2)
            if (r4 != 0) goto L49
            if (r2 != 0) goto L49
            goto L67
        L49:
            boolean r5 = j(r4, r2)
            if (r5 == 0) goto L94
            r5 = 0
        L50:
            int r6 = r4.length()
            if (r5 >= r6) goto L67
            java.lang.String r6 = r4.optString(r5, r3)
            java.lang.String r7 = r2.optString(r5, r3)
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L94
            int r5 = r5 + 1
            goto L50
        L67:
            java.lang.String r2 = "childViews"
            org.json.JSONArray r9 = r9.optJSONArray(r2)
            org.json.JSONArray r10 = r10.optJSONArray(r2)
            if (r9 != 0) goto L75
            if (r10 == 0) goto L93
        L75:
            boolean r2 = j(r9, r10)
            if (r2 == 0) goto L94
            r2 = 0
        L7c:
            int r3 = r9.length()
            if (r2 >= r3) goto L93
            org.json.JSONObject r3 = r9.optJSONObject(r2)
            org.json.JSONObject r4 = r10.optJSONObject(r2)
            boolean r3 = i(r3, r4)
            if (r3 == 0) goto L94
            int r2 = r2 + 1
            goto L7c
        L93:
            return r0
        L94:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.kw1.i(org.json.JSONObject, org.json.JSONObject):boolean");
    }

    private static boolean j(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray == null && jSONArray2 == null) {
            return true;
        }
        return (jSONArray == null || jSONArray2 == null || jSONArray.length() != jSONArray2.length()) ? false : true;
    }
}