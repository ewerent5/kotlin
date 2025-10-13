package com.google.android.gms.ads.query;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.internal.ads.er;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public class AdInfo {
    private final QueryInfo zza;
    private final String zzb;

    public AdInfo(@RecentlyNonNull QueryInfo queryInfo, @RecentlyNonNull String str) {
        this.zza = queryInfo;
        this.zzb = str;
    }

    @RecentlyNonNull
    public static String getRequestId(@RecentlyNonNull String str) {
        if (str == null) {
            er.zzi("adString passed to AdInfo.getRequestId() cannot be null. Returning empty string.");
            return "";
        }
        try {
            return new JSONObject(str).optString("request_id", "");
        } catch (JSONException unused) {
            er.zzi("Invalid adString passed to AdInfo.getRequestId(). Returning empty string.");
            return "";
        }
    }

    @RecentlyNonNull
    public String getAdString() {
        return this.zzb;
    }

    @RecentlyNonNull
    public QueryInfo getQueryInfo() {
        return this.zza;
    }
}