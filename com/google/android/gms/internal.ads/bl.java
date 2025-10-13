package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class bl extends com.google.android.gms.common.internal.w.a {
    public static final Parcelable.Creator<bl> CREATOR = new cl();
    public final List<String> A;
    public final String B;
    public final g6 C;
    public final List<String> D;
    public final long E;
    public final String F;
    public final float G;
    public final int H;
    public final int I;
    public final boolean J;
    public final String K;
    public final boolean L;
    public final String M;
    public final boolean N;
    public final int O;
    public final Bundle P;
    public final String Q;
    public final r1 R;
    public final boolean S;
    public final Bundle T;
    public final String U;
    public final String V;
    public final String W;
    public final boolean X;
    public final List<Integer> Y;
    public final String Z;
    public final List<String> a0;
    public final int b0;
    public final boolean c0;
    public final boolean d0;

    /* renamed from: e, reason: collision with root package name */
    public final int f5126e;
    public final boolean e0;

    /* renamed from: f, reason: collision with root package name */
    public final Bundle f5127f;
    public final ArrayList<String> f0;

    /* renamed from: g, reason: collision with root package name */
    public final m93 f5128g;
    public final String g0;

    /* renamed from: h, reason: collision with root package name */
    public final r93 f5129h;
    public final jc h0;

    /* renamed from: i, reason: collision with root package name */
    public final String f5130i;
    public final String i0;

    /* renamed from: j, reason: collision with root package name */
    public final ApplicationInfo f5131j;
    public final Bundle j0;

    /* renamed from: k, reason: collision with root package name */
    public final PackageInfo f5132k;

    /* renamed from: l, reason: collision with root package name */
    public final String f5133l;

    /* renamed from: m, reason: collision with root package name */
    public final String f5134m;
    public final String n;
    public final kr o;
    public final Bundle p;
    public final int q;
    public final List<String> r;
    public final Bundle s;
    public final boolean t;
    public final int u;
    public final int v;
    public final float w;
    public final String x;
    public final long y;
    public final String z;

    bl(int i2, Bundle bundle, m93 m93Var, r93 r93Var, String str, ApplicationInfo applicationInfo, PackageInfo packageInfo, String str2, String str3, String str4, kr krVar, Bundle bundle2, int i3, List<String> list, Bundle bundle3, boolean z, int i4, int i5, float f2, String str5, long j2, String str6, List<String> list2, String str7, g6 g6Var, List<String> list3, long j3, String str8, float f3, boolean z2, int i6, int i7, boolean z3, String str9, String str10, boolean z4, int i8, Bundle bundle4, String str11, r1 r1Var, boolean z5, Bundle bundle5, String str12, String str13, String str14, boolean z6, List<Integer> list4, String str15, List<String> list5, int i9, boolean z7, boolean z8, boolean z9, ArrayList<String> arrayList, String str16, jc jcVar, String str17, Bundle bundle6) {
        this.f5126e = i2;
        this.f5127f = bundle;
        this.f5128g = m93Var;
        this.f5129h = r93Var;
        this.f5130i = str;
        this.f5131j = applicationInfo;
        this.f5132k = packageInfo;
        this.f5133l = str2;
        this.f5134m = str3;
        this.n = str4;
        this.o = krVar;
        this.p = bundle2;
        this.q = i3;
        this.r = list;
        this.D = list3 == null ? Collections.emptyList() : Collections.unmodifiableList(list3);
        this.s = bundle3;
        this.t = z;
        this.u = i4;
        this.v = i5;
        this.w = f2;
        this.x = str5;
        this.y = j2;
        this.z = str6;
        this.A = list2 == null ? Collections.emptyList() : Collections.unmodifiableList(list2);
        this.B = str7;
        this.C = g6Var;
        this.E = j3;
        this.F = str8;
        this.G = f3;
        this.L = z2;
        this.H = i6;
        this.I = i7;
        this.J = z3;
        this.K = str9;
        this.M = str10;
        this.N = z4;
        this.O = i8;
        this.P = bundle4;
        this.Q = str11;
        this.R = r1Var;
        this.S = z5;
        this.T = bundle5;
        this.U = str12;
        this.V = str13;
        this.W = str14;
        this.X = z6;
        this.Y = list4;
        this.Z = str15;
        this.a0 = list5;
        this.b0 = i9;
        this.c0 = z7;
        this.d0 = z8;
        this.e0 = z9;
        this.f0 = arrayList;
        this.g0 = str16;
        this.h0 = jcVar;
        this.i0 = str17;
        this.j0 = bundle6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.w.c.a(parcel);
        com.google.android.gms.common.internal.w.c.m(parcel, 1, this.f5126e);
        com.google.android.gms.common.internal.w.c.e(parcel, 2, this.f5127f, false);
        com.google.android.gms.common.internal.w.c.r(parcel, 3, this.f5128g, i2, false);
        com.google.android.gms.common.internal.w.c.r(parcel, 4, this.f5129h, i2, false);
        com.google.android.gms.common.internal.w.c.s(parcel, 5, this.f5130i, false);
        com.google.android.gms.common.internal.w.c.r(parcel, 6, this.f5131j, i2, false);
        com.google.android.gms.common.internal.w.c.r(parcel, 7, this.f5132k, i2, false);
        com.google.android.gms.common.internal.w.c.s(parcel, 8, this.f5133l, false);
        com.google.android.gms.common.internal.w.c.s(parcel, 9, this.f5134m, false);
        com.google.android.gms.common.internal.w.c.s(parcel, 10, this.n, false);
        com.google.android.gms.common.internal.w.c.r(parcel, 11, this.o, i2, false);
        com.google.android.gms.common.internal.w.c.e(parcel, 12, this.p, false);
        com.google.android.gms.common.internal.w.c.m(parcel, 13, this.q);
        com.google.android.gms.common.internal.w.c.u(parcel, 14, this.r, false);
        com.google.android.gms.common.internal.w.c.e(parcel, 15, this.s, false);
        com.google.android.gms.common.internal.w.c.c(parcel, 16, this.t);
        com.google.android.gms.common.internal.w.c.m(parcel, 18, this.u);
        com.google.android.gms.common.internal.w.c.m(parcel, 19, this.v);
        com.google.android.gms.common.internal.w.c.j(parcel, 20, this.w);
        com.google.android.gms.common.internal.w.c.s(parcel, 21, this.x, false);
        com.google.android.gms.common.internal.w.c.p(parcel, 25, this.y);
        com.google.android.gms.common.internal.w.c.s(parcel, 26, this.z, false);
        com.google.android.gms.common.internal.w.c.u(parcel, 27, this.A, false);
        com.google.android.gms.common.internal.w.c.s(parcel, 28, this.B, false);
        com.google.android.gms.common.internal.w.c.r(parcel, 29, this.C, i2, false);
        com.google.android.gms.common.internal.w.c.u(parcel, 30, this.D, false);
        com.google.android.gms.common.internal.w.c.p(parcel, 31, this.E);
        com.google.android.gms.common.internal.w.c.s(parcel, 33, this.F, false);
        com.google.android.gms.common.internal.w.c.j(parcel, 34, this.G);
        com.google.android.gms.common.internal.w.c.m(parcel, 35, this.H);
        com.google.android.gms.common.internal.w.c.m(parcel, 36, this.I);
        com.google.android.gms.common.internal.w.c.c(parcel, 37, this.J);
        com.google.android.gms.common.internal.w.c.s(parcel, 39, this.K, false);
        com.google.android.gms.common.internal.w.c.c(parcel, 40, this.L);
        com.google.android.gms.common.internal.w.c.s(parcel, 41, this.M, false);
        com.google.android.gms.common.internal.w.c.c(parcel, 42, this.N);
        com.google.android.gms.common.internal.w.c.m(parcel, 43, this.O);
        com.google.android.gms.common.internal.w.c.e(parcel, 44, this.P, false);
        com.google.android.gms.common.internal.w.c.s(parcel, 45, this.Q, false);
        com.google.android.gms.common.internal.w.c.r(parcel, 46, this.R, i2, false);
        com.google.android.gms.common.internal.w.c.c(parcel, 47, this.S);
        com.google.android.gms.common.internal.w.c.e(parcel, 48, this.T, false);
        com.google.android.gms.common.internal.w.c.s(parcel, 49, this.U, false);
        com.google.android.gms.common.internal.w.c.s(parcel, 50, this.V, false);
        com.google.android.gms.common.internal.w.c.s(parcel, 51, this.W, false);
        com.google.android.gms.common.internal.w.c.c(parcel, 52, this.X);
        com.google.android.gms.common.internal.w.c.o(parcel, 53, this.Y, false);
        com.google.android.gms.common.internal.w.c.s(parcel, 54, this.Z, false);
        com.google.android.gms.common.internal.w.c.u(parcel, 55, this.a0, false);
        com.google.android.gms.common.internal.w.c.m(parcel, 56, this.b0);
        com.google.android.gms.common.internal.w.c.c(parcel, 57, this.c0);
        com.google.android.gms.common.internal.w.c.c(parcel, 58, this.d0);
        com.google.android.gms.common.internal.w.c.c(parcel, 59, this.e0);
        com.google.android.gms.common.internal.w.c.u(parcel, 60, this.f0, false);
        com.google.android.gms.common.internal.w.c.s(parcel, 61, this.g0, false);
        com.google.android.gms.common.internal.w.c.r(parcel, 63, this.h0, i2, false);
        com.google.android.gms.common.internal.w.c.s(parcel, 64, this.i0, false);
        com.google.android.gms.common.internal.w.c.e(parcel, 65, this.j0, false);
        com.google.android.gms.common.internal.w.c.b(parcel, iA);
    }
}