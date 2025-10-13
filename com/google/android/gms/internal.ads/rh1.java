package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.internal.util.zzbk;
import com.google.android.gms.ads.internal.util.zze;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class rh1 implements zg1<JSONObject> {
    private final AdvertisingIdClient.Info a;

    /* renamed from: b, reason: collision with root package name */
    private final String f8651b;

    public rh1(AdvertisingIdClient.Info info, String str) {
        this.a = info;
        this.f8651b = str;
    }

    @Override // com.google.android.gms.internal.ads.zg1
    public final /* bridge */ /* synthetic */ void a(JSONObject jSONObject) throws JSONException {
        try {
            JSONObject jSONObjectZzg = zzbk.zzg(jSONObject, "pii");
            AdvertisingIdClient.Info info = this.a;
            if (info == null || TextUtils.isEmpty(info.getId())) {
                jSONObjectZzg.put("pdid", this.f8651b);
                jSONObjectZzg.put("pdidtype", "ssaid");
            } else {
                jSONObjectZzg.put("rdid", this.a.getId());
                jSONObjectZzg.put("is_lat", this.a.isLimitAdTrackingEnabled());
                jSONObjectZzg.put("idtype", "adid");
            }
        } catch (JSONException e2) {
            zze.zzb("Failed putting Ad ID.", e2);
        }
    }
}