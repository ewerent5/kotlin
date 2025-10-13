package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class h43 extends com.google.android.gms.common.internal.w.a {
    public static final Parcelable.Creator<h43> CREATOR = new i43();

    /* renamed from: e, reason: collision with root package name */
    public final String f6286e;

    /* renamed from: f, reason: collision with root package name */
    public final long f6287f;

    /* renamed from: g, reason: collision with root package name */
    public final String f6288g;

    /* renamed from: h, reason: collision with root package name */
    public final String f6289h;

    /* renamed from: i, reason: collision with root package name */
    public final String f6290i;

    /* renamed from: j, reason: collision with root package name */
    public final Bundle f6291j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f6292k;

    /* renamed from: l, reason: collision with root package name */
    public long f6293l;

    /* renamed from: m, reason: collision with root package name */
    public String f6294m;
    public int n;

    h43(String str, long j2, String str2, String str3, String str4, Bundle bundle, boolean z, long j3, String str5, int i2) {
        this.f6286e = str;
        this.f6287f = j2;
        this.f6288g = str2 == null ? "" : str2;
        this.f6289h = str3 == null ? "" : str3;
        this.f6290i = str4 == null ? "" : str4;
        this.f6291j = bundle == null ? new Bundle() : bundle;
        this.f6292k = z;
        this.f6293l = j3;
        this.f6294m = str5;
        this.n = i2;
    }

    public static h43 c(Uri uri) {
        try {
            if (!"gcache".equals(uri.getScheme())) {
                return null;
            }
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments.size() != 2) {
                int size = pathSegments.size();
                StringBuilder sb = new StringBuilder(62);
                sb.append("Expected 2 path parts for namespace and id, found :");
                sb.append(size);
                er.zzi(sb.toString());
                return null;
            }
            String str = pathSegments.get(0);
            String str2 = pathSegments.get(1);
            String host = uri.getHost();
            String queryParameter = uri.getQueryParameter("url");
            boolean zEquals = "1".equals(uri.getQueryParameter("read_only"));
            String queryParameter2 = uri.getQueryParameter("expiration");
            long j2 = queryParameter2 == null ? 0L : Long.parseLong(queryParameter2);
            Bundle bundle = new Bundle();
            for (String str3 : uri.getQueryParameterNames()) {
                if (str3.startsWith("tag.")) {
                    bundle.putString(str3.substring(4), uri.getQueryParameter(str3));
                }
            }
            return new h43(queryParameter, j2, host, str, str2, bundle, zEquals, 0L, "", 0);
        } catch (NullPointerException | NumberFormatException e2) {
            er.zzj("Unable to parse Uri into cache offering.", e2);
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.w.c.a(parcel);
        com.google.android.gms.common.internal.w.c.s(parcel, 2, this.f6286e, false);
        com.google.android.gms.common.internal.w.c.p(parcel, 3, this.f6287f);
        com.google.android.gms.common.internal.w.c.s(parcel, 4, this.f6288g, false);
        com.google.android.gms.common.internal.w.c.s(parcel, 5, this.f6289h, false);
        com.google.android.gms.common.internal.w.c.s(parcel, 6, this.f6290i, false);
        com.google.android.gms.common.internal.w.c.e(parcel, 7, this.f6291j, false);
        com.google.android.gms.common.internal.w.c.c(parcel, 8, this.f6292k);
        com.google.android.gms.common.internal.w.c.p(parcel, 9, this.f6293l);
        com.google.android.gms.common.internal.w.c.s(parcel, 10, this.f6294m, false);
        com.google.android.gms.common.internal.w.c.m(parcel, 11, this.n);
        com.google.android.gms.common.internal.w.c.b(parcel, iA);
    }
}