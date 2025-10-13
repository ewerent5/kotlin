package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class w93 extends com.google.android.gms.common.internal.w.a {
    public static final Parcelable.Creator<w93> CREATOR = new x93();

    /* renamed from: e, reason: collision with root package name */
    public final String f9933e;

    /* renamed from: f, reason: collision with root package name */
    public long f9934f;

    /* renamed from: g, reason: collision with root package name */
    public g93 f9935g;

    /* renamed from: h, reason: collision with root package name */
    public final Bundle f9936h;

    public w93(String str, long j2, g93 g93Var, Bundle bundle) {
        this.f9933e = str;
        this.f9934f = j2;
        this.f9935g = g93Var;
        this.f9936h = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.w.c.a(parcel);
        com.google.android.gms.common.internal.w.c.s(parcel, 1, this.f9933e, false);
        com.google.android.gms.common.internal.w.c.p(parcel, 2, this.f9934f);
        com.google.android.gms.common.internal.w.c.r(parcel, 3, this.f9935g, i2, false);
        com.google.android.gms.common.internal.w.c.e(parcel, 4, this.f9936h, false);
        com.google.android.gms.common.internal.w.c.b(parcel, iA);
    }
}