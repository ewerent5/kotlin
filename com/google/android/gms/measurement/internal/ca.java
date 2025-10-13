package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
public final class ca extends com.google.android.gms.common.internal.w.a {
    public static final Parcelable.Creator<ca> CREATOR = new ba();

    /* renamed from: e, reason: collision with root package name */
    private final int f10791e;

    /* renamed from: f, reason: collision with root package name */
    public final String f10792f;

    /* renamed from: g, reason: collision with root package name */
    public final long f10793g;

    /* renamed from: h, reason: collision with root package name */
    public final Long f10794h;

    /* renamed from: i, reason: collision with root package name */
    private final Float f10795i;

    /* renamed from: j, reason: collision with root package name */
    public final String f10796j;

    /* renamed from: k, reason: collision with root package name */
    public final String f10797k;

    /* renamed from: l, reason: collision with root package name */
    public final Double f10798l;

    ca(ea eaVar) {
        this(eaVar.f10849c, eaVar.f10850d, eaVar.f10851e, eaVar.f10848b);
    }

    public final Object c() {
        Long l2 = this.f10794h;
        if (l2 != null) {
            return l2;
        }
        Double d2 = this.f10798l;
        if (d2 != null) {
            return d2;
        }
        String str = this.f10796j;
        if (str != null) {
            return str;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.w.c.a(parcel);
        com.google.android.gms.common.internal.w.c.m(parcel, 1, this.f10791e);
        com.google.android.gms.common.internal.w.c.s(parcel, 2, this.f10792f, false);
        com.google.android.gms.common.internal.w.c.p(parcel, 3, this.f10793g);
        com.google.android.gms.common.internal.w.c.q(parcel, 4, this.f10794h, false);
        com.google.android.gms.common.internal.w.c.k(parcel, 5, null, false);
        com.google.android.gms.common.internal.w.c.s(parcel, 6, this.f10796j, false);
        com.google.android.gms.common.internal.w.c.s(parcel, 7, this.f10797k, false);
        com.google.android.gms.common.internal.w.c.i(parcel, 8, this.f10798l, false);
        com.google.android.gms.common.internal.w.c.b(parcel, iA);
    }

    ca(String str, long j2, Object obj, String str2) {
        com.google.android.gms.common.internal.p.f(str);
        this.f10791e = 2;
        this.f10792f = str;
        this.f10793g = j2;
        this.f10797k = str2;
        if (obj == null) {
            this.f10794h = null;
            this.f10795i = null;
            this.f10798l = null;
            this.f10796j = null;
            return;
        }
        if (obj instanceof Long) {
            this.f10794h = (Long) obj;
            this.f10795i = null;
            this.f10798l = null;
            this.f10796j = null;
            return;
        }
        if (obj instanceof String) {
            this.f10794h = null;
            this.f10795i = null;
            this.f10798l = null;
            this.f10796j = (String) obj;
            return;
        }
        if (!(obj instanceof Double)) {
            throw new IllegalArgumentException("User attribute given of un-supported type");
        }
        this.f10794h = null;
        this.f10795i = null;
        this.f10798l = (Double) obj;
        this.f10796j = null;
    }

    ca(int i2, String str, long j2, Long l2, Float f2, String str2, String str3, Double d2) {
        this.f10791e = i2;
        this.f10792f = str;
        this.f10793g = j2;
        this.f10794h = l2;
        this.f10795i = null;
        if (i2 == 1) {
            this.f10798l = f2 != null ? Double.valueOf(f2.doubleValue()) : null;
        } else {
            this.f10798l = d2;
        }
        this.f10796j = str2;
        this.f10797k = str3;
    }
}