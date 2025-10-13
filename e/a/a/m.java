package e.a.a;

import android.content.Context;
import android.content.SharedPreferences;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Utils.java */
/* loaded from: classes.dex */
public class m {
    private static final String a = "e.a.a.m";

    /* renamed from: b, reason: collision with root package name */
    private static e f14196b = e.d();

    static JSONObject a(JSONObject jSONObject) {
        JSONArray jSONArrayNames;
        if (jSONObject == null) {
            return null;
        }
        if (jSONObject.length() == 0) {
            return new JSONObject();
        }
        try {
            jSONArrayNames = jSONObject.names();
        } catch (ArrayIndexOutOfBoundsException e2) {
            f14196b.b(a, e2.toString());
            jSONArrayNames = null;
        }
        int length = jSONArrayNames != null ? jSONArrayNames.length() : 0;
        String[] strArr = new String[length];
        for (int i2 = 0; i2 < length; i2++) {
            strArr[i2] = jSONArrayNames.optString(i2);
        }
        try {
            return new JSONObject(jSONObject, strArr);
        } catch (JSONException e3) {
            f14196b.b(a, e3.toString());
            return null;
        }
    }

    static SharedPreferences b(Context context, String str) {
        return context.getSharedPreferences("com.amplitude.api." + str + "." + context.getPackageName(), 4);
    }

    static String c(Context context, String str, String str2) {
        return b(context, str).getString(str2, null);
    }

    public static boolean d(String str) {
        return str == null || str.length() == 0;
    }

    static String e(String str) {
        if (d(str)) {
            str = "$default_instance";
        }
        return str.toLowerCase();
    }

    static void f(Context context, String str, String str2, String str3) {
        SharedPreferences.Editor editorEdit = b(context, str).edit();
        editorEdit.putString(str2, str3);
        editorEdit.apply();
    }
}