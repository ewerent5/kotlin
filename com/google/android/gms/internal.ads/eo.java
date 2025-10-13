package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.util.zzbk;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class eo extends com.google.android.gms.common.internal.w.a {
    public static final Parcelable.Creator<eo> CREATOR = new fo();

    /* renamed from: e, reason: collision with root package name */
    public final String f5671e;

    /* renamed from: f, reason: collision with root package name */
    public final String f5672f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f5673g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f5674h;

    /* renamed from: i, reason: collision with root package name */
    public final List<String> f5675i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f5676j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f5677k;

    /* renamed from: l, reason: collision with root package name */
    public final List<String> f5678l;

    public eo(String str, String str2, boolean z, boolean z2, List<String> list, boolean z3, boolean z4, List<String> list2) {
        this.f5671e = str;
        this.f5672f = str2;
        this.f5673g = z;
        this.f5674h = z2;
        this.f5675i = list;
        this.f5676j = z3;
        this.f5677k = z4;
        this.f5678l = list2 == null ? new ArrayList<>() : list2;
    }

    public static eo c(JSONObject jSONObject) {
        return new eo(jSONObject.optString("click_string", ""), jSONObject.optString("report_url", ""), jSONObject.optBoolean("rendered_ad_enabled", false), jSONObject.optBoolean("non_malicious_reporting_enabled", false), zzbk.zza(jSONObject.optJSONArray("allowed_headers"), null), jSONObject.optBoolean("protection_enabled", false), jSONObject.optBoolean("malicious_reporting_enabled", false), zzbk.zza(jSONObject.optJSONArray("webview_permissions"), null));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.w.c.a(parcel);
        com.google.android.gms.common.internal.w.c.s(parcel, 2, this.f5671e, false);
        com.google.android.gms.common.internal.w.c.s(parcel, 3, this.f5672f, false);
        com.google.android.gms.common.internal.w.c.c(parcel, 4, this.f5673g);
        com.google.android.gms.common.internal.w.c.c(parcel, 5, this.f5674h);
        com.google.android.gms.common.internal.w.c.u(parcel, 6, this.f5675i, false);
        com.google.android.gms.common.internal.w.c.c(parcel, 7, this.f5676j);
        com.google.android.gms.common.internal.w.c.c(parcel, 8, this.f5677k);
        com.google.android.gms.common.internal.w.c.u(parcel, 9, this.f5678l, false);
        com.google.android.gms.common.internal.w.c.b(parcel, iA);
    }
}