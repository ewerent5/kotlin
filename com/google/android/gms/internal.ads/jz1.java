package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class jz1 extends com.google.android.gms.common.internal.w.a {
    public static final Parcelable.Creator<jz1> CREATOR = new kz1();

    /* renamed from: e, reason: collision with root package name */
    public final int f6903e;

    /* renamed from: f, reason: collision with root package name */
    public final int f6904f;

    /* renamed from: g, reason: collision with root package name */
    public final String f6905g;

    /* renamed from: h, reason: collision with root package name */
    public final String f6906h;

    /* renamed from: i, reason: collision with root package name */
    public final int f6907i;

    jz1(int i2, int i3, int i4, String str, String str2) {
        this.f6903e = i2;
        this.f6904f = i3;
        this.f6905g = str;
        this.f6906h = str2;
        this.f6907i = i4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.w.c.a(parcel);
        com.google.android.gms.common.internal.w.c.m(parcel, 1, this.f6903e);
        com.google.android.gms.common.internal.w.c.m(parcel, 2, this.f6904f);
        com.google.android.gms.common.internal.w.c.s(parcel, 3, this.f6905g, false);
        com.google.android.gms.common.internal.w.c.s(parcel, 4, this.f6906h, false);
        com.google.android.gms.common.internal.w.c.m(parcel, 5, this.f6907i);
        com.google.android.gms.common.internal.w.c.b(parcel, iA);
    }

    public jz1(int i2, sr2 sr2Var, String str, String str2) {
        this(1, 1, sr2Var.zza(), str, str2);
    }
}