package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* loaded from: classes.dex */
public final class f0 extends com.google.android.gms.common.internal.w.a {
    public static final Parcelable.Creator<f0> CREATOR = new g0();

    /* renamed from: e, reason: collision with root package name */
    private final boolean f4649e;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    private final String f4650f;

    /* renamed from: g, reason: collision with root package name */
    private final int f4651g;

    f0(boolean z, String str, int i2) {
        this.f4649e = z;
        this.f4650f = str;
        this.f4651g = e0.a(i2) - 1;
    }

    public final int I() {
        return e0.a(this.f4651g);
    }

    @Nullable
    public final String c() {
        return this.f4650f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.w.c.a(parcel);
        com.google.android.gms.common.internal.w.c.c(parcel, 1, this.f4649e);
        com.google.android.gms.common.internal.w.c.s(parcel, 2, this.f4650f, false);
        com.google.android.gms.common.internal.w.c.m(parcel, 3, this.f4651g);
        com.google.android.gms.common.internal.w.c.b(parcel, iA);
    }

    public final boolean zza() {
        return this.f4649e;
    }
}