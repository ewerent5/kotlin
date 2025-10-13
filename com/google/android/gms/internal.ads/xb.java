package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class xb extends com.google.android.gms.common.internal.w.a {
    public static final Parcelable.Creator<xb> CREATOR = new yb();

    /* renamed from: e, reason: collision with root package name */
    public final String f10149e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f10150f;

    /* renamed from: g, reason: collision with root package name */
    public final int f10151g;

    /* renamed from: h, reason: collision with root package name */
    public final String f10152h;

    public xb(String str, boolean z, int i2, String str2) {
        this.f10149e = str;
        this.f10150f = z;
        this.f10151g = i2;
        this.f10152h = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.w.c.a(parcel);
        com.google.android.gms.common.internal.w.c.s(parcel, 1, this.f10149e, false);
        com.google.android.gms.common.internal.w.c.c(parcel, 2, this.f10150f);
        com.google.android.gms.common.internal.w.c.m(parcel, 3, this.f10151g);
        com.google.android.gms.common.internal.w.c.s(parcel, 4, this.f10152h, false);
        com.google.android.gms.common.internal.w.c.b(parcel, iA);
    }
}