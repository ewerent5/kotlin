package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;

/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* loaded from: classes.dex */
public class t extends com.google.android.gms.common.internal.w.a {

    @RecentlyNonNull
    public static final Parcelable.Creator<t> CREATOR = new k0();

    /* renamed from: e, reason: collision with root package name */
    private final int f4731e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f4732f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f4733g;

    /* renamed from: h, reason: collision with root package name */
    private final int f4734h;

    /* renamed from: i, reason: collision with root package name */
    private final int f4735i;

    public t(int i2, boolean z, boolean z2, int i3, int i4) {
        this.f4731e = i2;
        this.f4732f = z;
        this.f4733g = z2;
        this.f4734h = i3;
        this.f4735i = i4;
    }

    public int I() {
        return this.f4735i;
    }

    public boolean J() {
        return this.f4732f;
    }

    public boolean K() {
        return this.f4733g;
    }

    public int L() {
        return this.f4731e;
    }

    public int c() {
        return this.f4734h;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.w.c.a(parcel);
        com.google.android.gms.common.internal.w.c.m(parcel, 1, L());
        com.google.android.gms.common.internal.w.c.c(parcel, 2, J());
        com.google.android.gms.common.internal.w.c.c(parcel, 3, K());
        com.google.android.gms.common.internal.w.c.m(parcel, 4, c());
        com.google.android.gms.common.internal.w.c.m(parcel, 5, I());
        com.google.android.gms.common.internal.w.c.b(parcel, iA);
    }
}