package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* loaded from: classes.dex */
public final class r0 extends com.google.android.gms.common.internal.w.a {
    public static final Parcelable.Creator<r0> CREATOR = new s0();

    /* renamed from: e, reason: collision with root package name */
    Bundle f4725e;

    /* renamed from: f, reason: collision with root package name */
    com.google.android.gms.common.d[] f4726f;

    /* renamed from: g, reason: collision with root package name */
    int f4727g;

    /* renamed from: h, reason: collision with root package name */
    e f4728h;

    public r0() {
    }

    r0(Bundle bundle, com.google.android.gms.common.d[] dVarArr, int i2, e eVar) {
        this.f4725e = bundle;
        this.f4726f = dVarArr;
        this.f4727g = i2;
        this.f4728h = eVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.w.c.a(parcel);
        com.google.android.gms.common.internal.w.c.e(parcel, 1, this.f4725e, false);
        com.google.android.gms.common.internal.w.c.v(parcel, 2, this.f4726f, i2, false);
        com.google.android.gms.common.internal.w.c.m(parcel, 3, this.f4727g);
        com.google.android.gms.common.internal.w.c.r(parcel, 4, this.f4728h, i2, false);
        com.google.android.gms.common.internal.w.c.b(parcel, iA);
    }
}