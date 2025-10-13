package com.google.android.gms.ads.query;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.internal.ads.g2;
import com.google.android.gms.internal.ads.nk;
import com.google.android.gms.internal.ads.ta3;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public class QueryInfo {
    private final g2 zza;

    public QueryInfo(g2 g2Var) {
        this.zza = g2Var;
    }

    public static void generate(@RecentlyNonNull Context context, @RecentlyNonNull AdFormat adFormat, AdRequest adRequest, @RecentlyNonNull QueryInfoGenerationCallback queryInfoGenerationCallback) {
        new nk(context, adFormat, adRequest == null ? null : adRequest.zza()).b(queryInfoGenerationCallback);
    }

    @RecentlyNonNull
    public String getQuery() {
        return this.zza.a();
    }

    @RecentlyNonNull
    public Bundle getQueryBundle() {
        return this.zza.b();
    }

    @RecentlyNonNull
    public String getRequestId() {
        String str = ta3.f().get(this);
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return new JSONObject(str).optString("request_id", "");
        } catch (JSONException unused) {
            return "";
        }
    }
}