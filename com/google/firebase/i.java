package com.google.firebase;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.internal.o;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.internal.v;
import com.google.android.gms.common.util.r;

/* compiled from: FirebaseOptions.java */
/* loaded from: classes.dex */
public final class i {
    private final String a;

    /* renamed from: b, reason: collision with root package name */
    private final String f12773b;

    /* renamed from: c, reason: collision with root package name */
    private final String f12774c;

    /* renamed from: d, reason: collision with root package name */
    private final String f12775d;

    /* renamed from: e, reason: collision with root package name */
    private final String f12776e;

    /* renamed from: f, reason: collision with root package name */
    private final String f12777f;

    /* renamed from: g, reason: collision with root package name */
    private final String f12778g;

    private i(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        p.n(!r.a(str), "ApplicationId must be set.");
        this.f12773b = str;
        this.a = str2;
        this.f12774c = str3;
        this.f12775d = str4;
        this.f12776e = str5;
        this.f12777f = str6;
        this.f12778g = str7;
    }

    public static i a(Context context) {
        v vVar = new v(context);
        String strA = vVar.a("google_app_id");
        if (TextUtils.isEmpty(strA)) {
            return null;
        }
        return new i(strA, vVar.a("google_api_key"), vVar.a("firebase_database_url"), vVar.a("ga_trackingId"), vVar.a("gcm_defaultSenderId"), vVar.a("google_storage_bucket"), vVar.a("project_id"));
    }

    public String b() {
        return this.a;
    }

    public String c() {
        return this.f12773b;
    }

    public String d() {
        return this.f12776e;
    }

    public String e() {
        return this.f12778g;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return o.a(this.f12773b, iVar.f12773b) && o.a(this.a, iVar.a) && o.a(this.f12774c, iVar.f12774c) && o.a(this.f12775d, iVar.f12775d) && o.a(this.f12776e, iVar.f12776e) && o.a(this.f12777f, iVar.f12777f) && o.a(this.f12778g, iVar.f12778g);
    }

    public int hashCode() {
        return o.b(this.f12773b, this.a, this.f12774c, this.f12775d, this.f12776e, this.f12777f, this.f12778g);
    }

    public String toString() {
        return o.c(this).a("applicationId", this.f12773b).a("apiKey", this.a).a("databaseUrl", this.f12774c).a("gcmSenderId", this.f12776e).a("storageBucket", this.f12777f).a("projectId", this.f12778g).toString();
    }
}