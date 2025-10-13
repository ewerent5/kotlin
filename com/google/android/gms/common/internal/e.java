package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;

/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* loaded from: classes.dex */
public class e extends com.google.android.gms.common.internal.w.a {

    @RecentlyNonNull
    public static final Parcelable.Creator<e> CREATOR = new t0();

    /* renamed from: e, reason: collision with root package name */
    private final t f4683e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f4684f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f4685g;

    /* renamed from: h, reason: collision with root package name */
    private final int[] f4686h;

    /* renamed from: i, reason: collision with root package name */
    private final int f4687i;

    /* renamed from: j, reason: collision with root package name */
    private final int[] f4688j;

    public e(@RecentlyNonNull t tVar, boolean z, boolean z2, int[] iArr, int i2, int[] iArr2) {
        this.f4683e = tVar;
        this.f4684f = z;
        this.f4685g = z2;
        this.f4686h = iArr;
        this.f4687i = i2;
        this.f4688j = iArr2;
    }

    @RecentlyNullable
    public int[] I() {
        return this.f4686h;
    }

    @RecentlyNullable
    public int[] J() {
        return this.f4688j;
    }

    public boolean K() {
        return this.f4684f;
    }

    public boolean L() {
        return this.f4685g;
    }

    @RecentlyNonNull
    public t M() {
        return this.f4683e;
    }

    public int c() {
        return this.f4687i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.w.c.a(parcel);
        com.google.android.gms.common.internal.w.c.r(parcel, 1, M(), i2, false);
        com.google.android.gms.common.internal.w.c.c(parcel, 2, K());
        com.google.android.gms.common.internal.w.c.c(parcel, 3, L());
        com.google.android.gms.common.internal.w.c.n(parcel, 4, I(), false);
        com.google.android.gms.common.internal.w.c.m(parcel, 5, c());
        com.google.android.gms.common.internal.w.c.n(parcel, 6, J(), false);
        com.google.android.gms.common.internal.w.c.b(parcel, iA);
    }
}