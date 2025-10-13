package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class jr1 extends com.google.android.gms.common.internal.w.a {
    public static final Parcelable.Creator<jr1> CREATOR = new kr1();

    /* renamed from: e, reason: collision with root package name */
    private final gr1[] f6817e;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    public final Context f6818f;

    /* renamed from: g, reason: collision with root package name */
    private final int f6819g;

    /* renamed from: h, reason: collision with root package name */
    public final gr1 f6820h;

    /* renamed from: i, reason: collision with root package name */
    public final int f6821i;

    /* renamed from: j, reason: collision with root package name */
    public final int f6822j;

    /* renamed from: k, reason: collision with root package name */
    public final int f6823k;

    /* renamed from: l, reason: collision with root package name */
    public final String f6824l;

    /* renamed from: m, reason: collision with root package name */
    private final int f6825m;
    private final int n;
    private final int[] o;
    private final int[] p;
    public final int q;

    public jr1(int i2, int i3, int i4, int i5, String str, int i6, int i7) {
        gr1[] gr1VarArrValues = gr1.values();
        this.f6817e = gr1VarArrValues;
        int[] iArrA = hr1.a();
        this.o = iArrA;
        int[] iArrA2 = ir1.a();
        this.p = iArrA2;
        this.f6818f = null;
        this.f6819g = i2;
        this.f6820h = gr1VarArrValues[i2];
        this.f6821i = i3;
        this.f6822j = i4;
        this.f6823k = i5;
        this.f6824l = str;
        this.f6825m = i6;
        this.q = iArrA[i6];
        this.n = i7;
        int i8 = iArrA2[i7];
    }

    public static jr1 c(gr1 gr1Var, Context context) {
        if (gr1Var == gr1.Rewarded) {
            return new jr1(context, gr1Var, ((Integer) c.c().b(w3.v4)).intValue(), ((Integer) c.c().b(w3.B4)).intValue(), ((Integer) c.c().b(w3.D4)).intValue(), (String) c.c().b(w3.F4), (String) c.c().b(w3.x4), (String) c.c().b(w3.z4));
        }
        if (gr1Var == gr1.Interstitial) {
            return new jr1(context, gr1Var, ((Integer) c.c().b(w3.w4)).intValue(), ((Integer) c.c().b(w3.C4)).intValue(), ((Integer) c.c().b(w3.E4)).intValue(), (String) c.c().b(w3.G4), (String) c.c().b(w3.y4), (String) c.c().b(w3.A4));
        }
        if (gr1Var != gr1.AppOpen) {
            return null;
        }
        return new jr1(context, gr1Var, ((Integer) c.c().b(w3.J4)).intValue(), ((Integer) c.c().b(w3.L4)).intValue(), ((Integer) c.c().b(w3.M4)).intValue(), (String) c.c().b(w3.H4), (String) c.c().b(w3.I4), (String) c.c().b(w3.K4));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.w.c.a(parcel);
        com.google.android.gms.common.internal.w.c.m(parcel, 1, this.f6819g);
        com.google.android.gms.common.internal.w.c.m(parcel, 2, this.f6821i);
        com.google.android.gms.common.internal.w.c.m(parcel, 3, this.f6822j);
        com.google.android.gms.common.internal.w.c.m(parcel, 4, this.f6823k);
        com.google.android.gms.common.internal.w.c.s(parcel, 5, this.f6824l, false);
        com.google.android.gms.common.internal.w.c.m(parcel, 6, this.f6825m);
        com.google.android.gms.common.internal.w.c.m(parcel, 7, this.n);
        com.google.android.gms.common.internal.w.c.b(parcel, iA);
    }

    private jr1(@Nullable Context context, gr1 gr1Var, int i2, int i3, int i4, String str, String str2, String str3) {
        this.f6817e = gr1.values();
        this.o = hr1.a();
        this.p = ir1.a();
        this.f6818f = context;
        this.f6819g = gr1Var.ordinal();
        this.f6820h = gr1Var;
        this.f6821i = i2;
        this.f6822j = i3;
        this.f6823k = i4;
        this.f6824l = str;
        int i5 = 2;
        if ("oldest".equals(str2)) {
            i5 = 1;
        } else if (!"lru".equals(str2) && "lfu".equals(str2)) {
            i5 = 3;
        }
        this.q = i5;
        this.f6825m = i5 - 1;
        "onAdClosed".equals(str3);
        this.n = 0;
    }
}