package com.google.android.gms.common;

import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import e.c.b.b.b.b;

/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* loaded from: classes.dex */
public final class c0 extends com.google.android.gms.common.internal.w.a {
    public static final Parcelable.Creator<c0> CREATOR = new d0();

    /* renamed from: e, reason: collision with root package name */
    private final String f4635e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f4636f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f4637g;

    /* renamed from: h, reason: collision with root package name */
    private final Context f4638h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f4639i;

    c0(String str, boolean z, boolean z2, IBinder iBinder, boolean z3) {
        this.f4635e = str;
        this.f4636f = z;
        this.f4637g = z2;
        this.f4638h = (Context) e.c.b.b.b.d.Y(b.a.U(iBinder));
        this.f4639i = z3;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [android.os.IBinder, e.c.b.b.b.b] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.w.c.a(parcel);
        com.google.android.gms.common.internal.w.c.s(parcel, 1, this.f4635e, false);
        com.google.android.gms.common.internal.w.c.c(parcel, 2, this.f4636f);
        com.google.android.gms.common.internal.w.c.c(parcel, 3, this.f4637g);
        com.google.android.gms.common.internal.w.c.l(parcel, 4, e.c.b.b.b.d.m4(this.f4638h), false);
        com.google.android.gms.common.internal.w.c.c(parcel, 5, this.f4639i);
        com.google.android.gms.common.internal.w.c.b(parcel, iA);
    }
}