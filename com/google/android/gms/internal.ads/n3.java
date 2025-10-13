package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
final class n3 extends o3<String> {
    n3(int i2, String str, String str2) {
        super(1, str, str2, null);
    }

    @Override // com.google.android.gms.internal.ads.o3
    public final /* bridge */ /* synthetic */ String a(Bundle bundle) {
        String strE = e();
        if (!bundle.containsKey(strE.length() != 0 ? "com.google.android.gms.ads.flag.".concat(strE) : new String("com.google.android.gms.ads.flag."))) {
            return f();
        }
        String strE2 = e();
        return bundle.getString(strE2.length() != 0 ? "com.google.android.gms.ads.flag.".concat(strE2) : new String("com.google.android.gms.ads.flag."));
    }

    @Override // com.google.android.gms.internal.ads.o3
    public final /* bridge */ /* synthetic */ void b(SharedPreferences.Editor editor, String str) {
        editor.putString(e(), str);
    }

    @Override // com.google.android.gms.internal.ads.o3
    public final /* bridge */ /* synthetic */ String c(JSONObject jSONObject) {
        return jSONObject.optString(e(), f());
    }

    @Override // com.google.android.gms.internal.ads.o3
    public final /* bridge */ /* synthetic */ String d(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString(e(), f());
    }
}