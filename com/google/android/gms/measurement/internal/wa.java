package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
public final class wa extends com.google.android.gms.common.internal.w.a {
    public static final Parcelable.Creator<wa> CREATOR = new va();

    /* renamed from: e, reason: collision with root package name */
    public String f11318e;

    /* renamed from: f, reason: collision with root package name */
    public String f11319f;

    /* renamed from: g, reason: collision with root package name */
    public ca f11320g;

    /* renamed from: h, reason: collision with root package name */
    public long f11321h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f11322i;

    /* renamed from: j, reason: collision with root package name */
    public String f11323j;

    /* renamed from: k, reason: collision with root package name */
    public r f11324k;

    /* renamed from: l, reason: collision with root package name */
    public long f11325l;

    /* renamed from: m, reason: collision with root package name */
    public r f11326m;
    public long n;
    public r o;

    wa(wa waVar) {
        com.google.android.gms.common.internal.p.j(waVar);
        this.f11318e = waVar.f11318e;
        this.f11319f = waVar.f11319f;
        this.f11320g = waVar.f11320g;
        this.f11321h = waVar.f11321h;
        this.f11322i = waVar.f11322i;
        this.f11323j = waVar.f11323j;
        this.f11324k = waVar.f11324k;
        this.f11325l = waVar.f11325l;
        this.f11326m = waVar.f11326m;
        this.n = waVar.n;
        this.o = waVar.o;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.w.c.a(parcel);
        com.google.android.gms.common.internal.w.c.s(parcel, 2, this.f11318e, false);
        com.google.android.gms.common.internal.w.c.s(parcel, 3, this.f11319f, false);
        com.google.android.gms.common.internal.w.c.r(parcel, 4, this.f11320g, i2, false);
        com.google.android.gms.common.internal.w.c.p(parcel, 5, this.f11321h);
        com.google.android.gms.common.internal.w.c.c(parcel, 6, this.f11322i);
        com.google.android.gms.common.internal.w.c.s(parcel, 7, this.f11323j, false);
        com.google.android.gms.common.internal.w.c.r(parcel, 8, this.f11324k, i2, false);
        com.google.android.gms.common.internal.w.c.p(parcel, 9, this.f11325l);
        com.google.android.gms.common.internal.w.c.r(parcel, 10, this.f11326m, i2, false);
        com.google.android.gms.common.internal.w.c.p(parcel, 11, this.n);
        com.google.android.gms.common.internal.w.c.r(parcel, 12, this.o, i2, false);
        com.google.android.gms.common.internal.w.c.b(parcel, iA);
    }

    wa(String str, String str2, ca caVar, long j2, boolean z, String str3, r rVar, long j3, r rVar2, long j4, r rVar3) {
        this.f11318e = str;
        this.f11319f = str2;
        this.f11320g = caVar;
        this.f11321h = j2;
        this.f11322i = z;
        this.f11323j = str3;
        this.f11324k = rVar;
        this.f11325l = j3;
        this.f11326m = rVar2;
        this.n = j4;
        this.o = rVar3;
    }
}