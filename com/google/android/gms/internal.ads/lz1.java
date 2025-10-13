package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class lz1 extends com.google.android.gms.common.internal.w.a {
    public static final Parcelable.Creator<lz1> CREATOR = new mz1();

    /* renamed from: e, reason: collision with root package name */
    public final int f7373e;

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f7374f;

    /* renamed from: g, reason: collision with root package name */
    public final int f7375g;

    lz1(int i2, byte[] bArr, int i3) {
        this.f7373e = i2;
        this.f7374f = bArr == null ? null : Arrays.copyOf(bArr, bArr.length);
        this.f7375g = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.w.c.a(parcel);
        com.google.android.gms.common.internal.w.c.m(parcel, 1, this.f7373e);
        com.google.android.gms.common.internal.w.c.g(parcel, 2, this.f7374f, false);
        com.google.android.gms.common.internal.w.c.m(parcel, 3, this.f7375g);
        com.google.android.gms.common.internal.w.c.b(parcel, iA);
    }

    public lz1(byte[] bArr, int i2) {
        this(1, null, 1);
    }
}