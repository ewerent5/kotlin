package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class e93 extends com.google.android.gms.common.internal.w.a {
    public static final Parcelable.Creator<e93> CREATOR = new f93();

    /* renamed from: e, reason: collision with root package name */
    public final String f5603e;

    /* renamed from: f, reason: collision with root package name */
    public final String f5604f;

    public e93(String str, String str2) {
        this.f5603e = str;
        this.f5604f = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.w.c.a(parcel);
        com.google.android.gms.common.internal.w.c.s(parcel, 1, this.f5603e, false);
        com.google.android.gms.common.internal.w.c.s(parcel, 2, this.f5604f, false);
        com.google.android.gms.common.internal.w.c.b(parcel, iA);
    }
}