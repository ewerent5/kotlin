package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class m93 extends com.google.android.gms.common.internal.w.a {
    public static final Parcelable.Creator<m93> CREATOR = new o93();
    public final int A;

    /* renamed from: e, reason: collision with root package name */
    public final int f7443e;

    /* renamed from: f, reason: collision with root package name */
    @Deprecated
    public final long f7444f;

    /* renamed from: g, reason: collision with root package name */
    public final Bundle f7445g;

    /* renamed from: h, reason: collision with root package name */
    @Deprecated
    public final int f7446h;

    /* renamed from: i, reason: collision with root package name */
    public final List<String> f7447i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f7448j;

    /* renamed from: k, reason: collision with root package name */
    public final int f7449k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f7450l;

    /* renamed from: m, reason: collision with root package name */
    public final String f7451m;
    public final z2 n;
    public final Location o;
    public final String p;
    public final Bundle q;
    public final Bundle r;
    public final List<String> s;
    public final String t;
    public final String u;

    @Deprecated
    public final boolean v;
    public final e93 w;
    public final int x;
    public final String y;
    public final List<String> z;

    public m93(int i2, long j2, Bundle bundle, int i3, List<String> list, boolean z, int i4, boolean z2, String str, z2 z2Var, Location location, String str2, Bundle bundle2, Bundle bundle3, List<String> list2, String str3, String str4, boolean z3, e93 e93Var, int i5, String str5, List<String> list3, int i6) {
        this.f7443e = i2;
        this.f7444f = j2;
        this.f7445g = bundle == null ? new Bundle() : bundle;
        this.f7446h = i3;
        this.f7447i = list;
        this.f7448j = z;
        this.f7449k = i4;
        this.f7450l = z2;
        this.f7451m = str;
        this.n = z2Var;
        this.o = location;
        this.p = str2;
        this.q = bundle2 == null ? new Bundle() : bundle2;
        this.r = bundle3;
        this.s = list2;
        this.t = str3;
        this.u = str4;
        this.v = z3;
        this.w = e93Var;
        this.x = i5;
        this.y = str5;
        this.z = list3 == null ? new ArrayList<>() : list3;
        this.A = i6;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m93)) {
            return false;
        }
        m93 m93Var = (m93) obj;
        return this.f7443e == m93Var.f7443e && this.f7444f == m93Var.f7444f && fr.a(this.f7445g, m93Var.f7445g) && this.f7446h == m93Var.f7446h && com.google.android.gms.common.internal.o.a(this.f7447i, m93Var.f7447i) && this.f7448j == m93Var.f7448j && this.f7449k == m93Var.f7449k && this.f7450l == m93Var.f7450l && com.google.android.gms.common.internal.o.a(this.f7451m, m93Var.f7451m) && com.google.android.gms.common.internal.o.a(this.n, m93Var.n) && com.google.android.gms.common.internal.o.a(this.o, m93Var.o) && com.google.android.gms.common.internal.o.a(this.p, m93Var.p) && fr.a(this.q, m93Var.q) && fr.a(this.r, m93Var.r) && com.google.android.gms.common.internal.o.a(this.s, m93Var.s) && com.google.android.gms.common.internal.o.a(this.t, m93Var.t) && com.google.android.gms.common.internal.o.a(this.u, m93Var.u) && this.v == m93Var.v && this.x == m93Var.x && com.google.android.gms.common.internal.o.a(this.y, m93Var.y) && com.google.android.gms.common.internal.o.a(this.z, m93Var.z) && this.A == m93Var.A;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.o.b(Integer.valueOf(this.f7443e), Long.valueOf(this.f7444f), this.f7445g, Integer.valueOf(this.f7446h), this.f7447i, Boolean.valueOf(this.f7448j), Integer.valueOf(this.f7449k), Boolean.valueOf(this.f7450l), this.f7451m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, Boolean.valueOf(this.v), Integer.valueOf(this.x), this.y, this.z, Integer.valueOf(this.A));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.w.c.a(parcel);
        com.google.android.gms.common.internal.w.c.m(parcel, 1, this.f7443e);
        com.google.android.gms.common.internal.w.c.p(parcel, 2, this.f7444f);
        com.google.android.gms.common.internal.w.c.e(parcel, 3, this.f7445g, false);
        com.google.android.gms.common.internal.w.c.m(parcel, 4, this.f7446h);
        com.google.android.gms.common.internal.w.c.u(parcel, 5, this.f7447i, false);
        com.google.android.gms.common.internal.w.c.c(parcel, 6, this.f7448j);
        com.google.android.gms.common.internal.w.c.m(parcel, 7, this.f7449k);
        com.google.android.gms.common.internal.w.c.c(parcel, 8, this.f7450l);
        com.google.android.gms.common.internal.w.c.s(parcel, 9, this.f7451m, false);
        com.google.android.gms.common.internal.w.c.r(parcel, 10, this.n, i2, false);
        com.google.android.gms.common.internal.w.c.r(parcel, 11, this.o, i2, false);
        com.google.android.gms.common.internal.w.c.s(parcel, 12, this.p, false);
        com.google.android.gms.common.internal.w.c.e(parcel, 13, this.q, false);
        com.google.android.gms.common.internal.w.c.e(parcel, 14, this.r, false);
        com.google.android.gms.common.internal.w.c.u(parcel, 15, this.s, false);
        com.google.android.gms.common.internal.w.c.s(parcel, 16, this.t, false);
        com.google.android.gms.common.internal.w.c.s(parcel, 17, this.u, false);
        com.google.android.gms.common.internal.w.c.c(parcel, 18, this.v);
        com.google.android.gms.common.internal.w.c.r(parcel, 19, this.w, i2, false);
        com.google.android.gms.common.internal.w.c.m(parcel, 20, this.x);
        com.google.android.gms.common.internal.w.c.s(parcel, 21, this.y, false);
        com.google.android.gms.common.internal.w.c.u(parcel, 22, this.z, false);
        com.google.android.gms.common.internal.w.c.m(parcel, 23, this.A);
        com.google.android.gms.common.internal.w.c.b(parcel, iA);
    }
}