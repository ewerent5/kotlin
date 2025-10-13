package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class kr extends com.google.android.gms.common.internal.w.a {
    public static final Parcelable.Creator<kr> CREATOR = new lr();

    /* renamed from: e, reason: collision with root package name */
    public String f7054e;

    /* renamed from: f, reason: collision with root package name */
    public int f7055f;

    /* renamed from: g, reason: collision with root package name */
    public int f7056g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f7057h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f7058i;

    public kr(int i2, int i3, boolean z, boolean z2) {
        this(210890000, i3, true, false, false);
    }

    public static kr c() {
        return new kr(12451000, 12451000, true, false, false);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.w.c.a(parcel);
        com.google.android.gms.common.internal.w.c.s(parcel, 2, this.f7054e, false);
        com.google.android.gms.common.internal.w.c.m(parcel, 3, this.f7055f);
        com.google.android.gms.common.internal.w.c.m(parcel, 4, this.f7056g);
        com.google.android.gms.common.internal.w.c.c(parcel, 5, this.f7057h);
        com.google.android.gms.common.internal.w.c.c(parcel, 6, this.f7058i);
        com.google.android.gms.common.internal.w.c.b(parcel, iA);
    }

    public kr(int i2, int i3, boolean z, boolean z2, boolean z3) {
        String str = z ? "0" : "1";
        StringBuilder sb = new StringBuilder(str.length() + 36);
        sb.append("afma-sdk-a-v");
        sb.append(i2);
        sb.append(".");
        sb.append(i3);
        sb.append(".");
        sb.append(str);
        this(sb.toString(), i2, i3, z, false);
    }

    kr(String str, int i2, int i3, boolean z, boolean z2) {
        this.f7054e = str;
        this.f7055f = i2;
        this.f7056g = i3;
        this.f7057h = z;
        this.f7058i = z2;
    }
}