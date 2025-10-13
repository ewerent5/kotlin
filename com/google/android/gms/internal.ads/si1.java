package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzbk;
import com.google.android.gms.ads.internal.util.zze;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class si1 implements zg1<JSONObject> {
    private final String a;

    /* renamed from: b, reason: collision with root package name */
    private final String f8876b;

    public si1(String str, String str2) {
        this.a = str;
        this.f8876b = str2;
    }

    @Override // com.google.android.gms.internal.ads.zg1
    public final /* bridge */ /* synthetic */ void a(JSONObject jSONObject) throws JSONException {
        try {
            JSONObject jSONObjectZzg = zzbk.zzg(jSONObject, "pii");
            jSONObjectZzg.put("doritos", this.a);
            jSONObjectZzg.put("doritos_v2", this.f8876b);
        } catch (JSONException unused) {
            zze.zza("Failed putting doritos string.");
        }
    }
}