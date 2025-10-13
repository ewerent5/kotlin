package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
final class m3 extends o3<Float> {
    m3(int i2, String str, Float f2) {
        super(1, str, f2, null);
    }

    @Override // com.google.android.gms.internal.ads.o3
    public final /* bridge */ /* synthetic */ Float a(Bundle bundle) {
        String strE = e();
        if (!bundle.containsKey(strE.length() != 0 ? "com.google.android.gms.ads.flag.".concat(strE) : new String("com.google.android.gms.ads.flag."))) {
            return f();
        }
        String strE2 = e();
        return Float.valueOf(bundle.getFloat(strE2.length() != 0 ? "com.google.android.gms.ads.flag.".concat(strE2) : new String("com.google.android.gms.ads.flag.")));
    }

    @Override // com.google.android.gms.internal.ads.o3
    public final /* bridge */ /* synthetic */ void b(SharedPreferences.Editor editor, Float f2) {
        editor.putFloat(e(), f2.floatValue());
    }

    @Override // com.google.android.gms.internal.ads.o3
    public final /* bridge */ /* synthetic */ Float c(JSONObject jSONObject) {
        return Float.valueOf((float) jSONObject.optDouble(e(), f().floatValue()));
    }

    @Override // com.google.android.gms.internal.ads.o3
    public final /* bridge */ /* synthetic */ Float d(SharedPreferences sharedPreferences) {
        return Float.valueOf(sharedPreferences.getFloat(e(), f().floatValue()));
    }
}