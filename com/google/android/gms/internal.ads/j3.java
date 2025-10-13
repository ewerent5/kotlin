package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
final class j3 extends o3<Boolean> {
    j3(int i2, String str, Boolean bool) {
        super(i2, str, bool, null);
    }

    @Override // com.google.android.gms.internal.ads.o3
    public final /* bridge */ /* synthetic */ Boolean a(Bundle bundle) {
        String strE = e();
        if (!bundle.containsKey(strE.length() != 0 ? "com.google.android.gms.ads.flag.".concat(strE) : new String("com.google.android.gms.ads.flag."))) {
            return f();
        }
        String strE2 = e();
        return Boolean.valueOf(bundle.getBoolean(strE2.length() != 0 ? "com.google.android.gms.ads.flag.".concat(strE2) : new String("com.google.android.gms.ads.flag.")));
    }

    @Override // com.google.android.gms.internal.ads.o3
    public final /* bridge */ /* synthetic */ void b(SharedPreferences.Editor editor, Boolean bool) {
        editor.putBoolean(e(), bool.booleanValue());
    }

    @Override // com.google.android.gms.internal.ads.o3
    public final /* bridge */ /* synthetic */ Boolean c(JSONObject jSONObject) {
        return Boolean.valueOf(jSONObject.optBoolean(e(), f().booleanValue()));
    }

    @Override // com.google.android.gms.internal.ads.o3
    public final /* bridge */ /* synthetic */ Boolean d(SharedPreferences sharedPreferences) {
        return Boolean.valueOf(sharedPreferences.getBoolean(e(), f().booleanValue()));
    }
}