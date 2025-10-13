package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
public final class ka extends com.google.android.gms.common.internal.w.a {
    public static final Parcelable.Creator<ka> CREATOR = new ma();
    public final String A;

    /* renamed from: e, reason: collision with root package name */
    public final String f10989e;

    /* renamed from: f, reason: collision with root package name */
    public final String f10990f;

    /* renamed from: g, reason: collision with root package name */
    public final String f10991g;

    /* renamed from: h, reason: collision with root package name */
    public final String f10992h;

    /* renamed from: i, reason: collision with root package name */
    public final long f10993i;

    /* renamed from: j, reason: collision with root package name */
    public final long f10994j;

    /* renamed from: k, reason: collision with root package name */
    public final String f10995k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f10996l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f10997m;
    public final long n;
    public final String o;
    public final long p;
    public final long q;
    public final int r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public final String v;
    public final Boolean w;
    public final long x;
    public final List<String> y;
    public final String z;

    ka(String str, String str2, String str3, long j2, String str4, long j3, long j4, String str5, boolean z, boolean z2, String str6, long j5, long j6, int i2, boolean z3, boolean z4, boolean z5, String str7, Boolean bool, long j7, List<String> list, String str8, String str9) {
        com.google.android.gms.common.internal.p.f(str);
        this.f10989e = str;
        this.f10990f = TextUtils.isEmpty(str2) ? null : str2;
        this.f10991g = str3;
        this.n = j2;
        this.f10992h = str4;
        this.f10993i = j3;
        this.f10994j = j4;
        this.f10995k = str5;
        this.f10996l = z;
        this.f10997m = z2;
        this.o = str6;
        this.p = j5;
        this.q = j6;
        this.r = i2;
        this.s = z3;
        this.t = z4;
        this.u = z5;
        this.v = str7;
        this.w = bool;
        this.x = j7;
        this.y = list;
        this.z = str8;
        this.A = str9;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.w.c.a(parcel);
        com.google.android.gms.common.internal.w.c.s(parcel, 2, this.f10989e, false);
        com.google.android.gms.common.internal.w.c.s(parcel, 3, this.f10990f, false);
        com.google.android.gms.common.internal.w.c.s(parcel, 4, this.f10991g, false);
        com.google.android.gms.common.internal.w.c.s(parcel, 5, this.f10992h, false);
        com.google.android.gms.common.internal.w.c.p(parcel, 6, this.f10993i);
        com.google.android.gms.common.internal.w.c.p(parcel, 7, this.f10994j);
        com.google.android.gms.common.internal.w.c.s(parcel, 8, this.f10995k, false);
        com.google.android.gms.common.internal.w.c.c(parcel, 9, this.f10996l);
        com.google.android.gms.common.internal.w.c.c(parcel, 10, this.f10997m);
        com.google.android.gms.common.internal.w.c.p(parcel, 11, this.n);
        com.google.android.gms.common.internal.w.c.s(parcel, 12, this.o, false);
        com.google.android.gms.common.internal.w.c.p(parcel, 13, this.p);
        com.google.android.gms.common.internal.w.c.p(parcel, 14, this.q);
        com.google.android.gms.common.internal.w.c.m(parcel, 15, this.r);
        com.google.android.gms.common.internal.w.c.c(parcel, 16, this.s);
        com.google.android.gms.common.internal.w.c.c(parcel, 17, this.t);
        com.google.android.gms.common.internal.w.c.c(parcel, 18, this.u);
        com.google.android.gms.common.internal.w.c.s(parcel, 19, this.v, false);
        com.google.android.gms.common.internal.w.c.d(parcel, 21, this.w, false);
        com.google.android.gms.common.internal.w.c.p(parcel, 22, this.x);
        com.google.android.gms.common.internal.w.c.u(parcel, 23, this.y, false);
        com.google.android.gms.common.internal.w.c.s(parcel, 24, this.z, false);
        com.google.android.gms.common.internal.w.c.s(parcel, 25, this.A, false);
        com.google.android.gms.common.internal.w.c.b(parcel, iA);
    }

    ka(String str, String str2, String str3, String str4, long j2, long j3, String str5, boolean z, boolean z2, long j4, String str6, long j5, long j6, int i2, boolean z3, boolean z4, boolean z5, String str7, Boolean bool, long j7, List<String> list, String str8, String str9) {
        this.f10989e = str;
        this.f10990f = str2;
        this.f10991g = str3;
        this.n = j4;
        this.f10992h = str4;
        this.f10993i = j2;
        this.f10994j = j3;
        this.f10995k = str5;
        this.f10996l = z;
        this.f10997m = z2;
        this.o = str6;
        this.p = j5;
        this.q = j6;
        this.r = i2;
        this.s = z3;
        this.t = z4;
        this.u = z5;
        this.v = str7;
        this.w = bool;
        this.x = j7;
        this.y = list;
        this.z = str8;
        this.A = str9;
    }
}