package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class jb extends com.google.android.gms.common.internal.w.a {
    public static final Parcelable.Creator<jb> CREATOR = new kb();

    /* renamed from: e, reason: collision with root package name */
    public final String f6722e;

    /* renamed from: f, reason: collision with root package name */
    public final String[] f6723f;

    /* renamed from: g, reason: collision with root package name */
    public final String[] f6724g;

    jb(String str, String[] strArr, String[] strArr2) {
        this.f6722e = str;
        this.f6723f = strArr;
        this.f6724g = strArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.w.c.a(parcel);
        com.google.android.gms.common.internal.w.c.s(parcel, 1, this.f6722e, false);
        com.google.android.gms.common.internal.w.c.t(parcel, 2, this.f6723f, false);
        com.google.android.gms.common.internal.w.c.t(parcel, 3, this.f6724g, false);
        com.google.android.gms.common.internal.w.c.b(parcel, iA);
    }
}