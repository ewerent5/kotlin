package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
final class l3 extends o3<Long> {
    l3(int i2, String str, Long l2) {
        super(1, str, l2, null);
    }

    @Override // com.google.android.gms.internal.ads.o3
    public final /* bridge */ /* synthetic */ Long a(Bundle bundle) {
        String strE = e();
        if (!bundle.containsKey(strE.length() != 0 ? "com.google.android.gms.ads.flag.".concat(strE) : new String("com.google.android.gms.ads.flag."))) {
            return f();
        }
        String strE2 = e();
        return Long.valueOf(bundle.getLong(strE2.length() != 0 ? "com.google.android.gms.ads.flag.".concat(strE2) : new String("com.google.android.gms.ads.flag.")));
    }

    @Override // com.google.android.gms.internal.ads.o3
    public final /* bridge */ /* synthetic */ void b(SharedPreferences.Editor editor, Long l2) {
        editor.putLong(e(), l2.longValue());
    }

    @Override // com.google.android.gms.internal.ads.o3
    public final /* bridge */ /* synthetic */ Long c(JSONObject jSONObject) {
        return Long.valueOf(jSONObject.optLong(e(), f().longValue()));
    }

    @Override // com.google.android.gms.internal.ads.o3
    public final /* bridge */ /* synthetic */ Long d(SharedPreferences sharedPreferences) {
        return Long.valueOf(sharedPreferences.getLong(e(), f().longValue()));
    }
}