package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
final class k3 extends o3<Integer> {
    k3(int i2, String str, Integer num) {
        super(1, str, num, null);
    }

    @Override // com.google.android.gms.internal.ads.o3
    public final /* bridge */ /* synthetic */ Integer a(Bundle bundle) {
        String strE = e();
        if (!bundle.containsKey(strE.length() != 0 ? "com.google.android.gms.ads.flag.".concat(strE) : new String("com.google.android.gms.ads.flag."))) {
            return f();
        }
        String strE2 = e();
        return Integer.valueOf(bundle.getInt(strE2.length() != 0 ? "com.google.android.gms.ads.flag.".concat(strE2) : new String("com.google.android.gms.ads.flag.")));
    }

    @Override // com.google.android.gms.internal.ads.o3
    public final /* bridge */ /* synthetic */ void b(SharedPreferences.Editor editor, Integer num) {
        editor.putInt(e(), num.intValue());
    }

    @Override // com.google.android.gms.internal.ads.o3
    public final /* bridge */ /* synthetic */ Integer c(JSONObject jSONObject) {
        return Integer.valueOf(jSONObject.optInt(e(), f().intValue()));
    }

    @Override // com.google.android.gms.internal.ads.o3
    public final /* bridge */ /* synthetic */ Integer d(SharedPreferences sharedPreferences) {
        return Integer.valueOf(sharedPreferences.getInt(e(), f().intValue()));
    }
}