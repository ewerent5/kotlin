package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class nm extends com.google.android.gms.common.internal.w.a {
    public static final Parcelable.Creator<nm> CREATOR = new pm();

    /* renamed from: e, reason: collision with root package name */
    public final m93 f7741e;

    /* renamed from: f, reason: collision with root package name */
    public final String f7742f;

    public nm(m93 m93Var, String str) {
        this.f7741e = m93Var;
        this.f7742f = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.w.c.a(parcel);
        com.google.android.gms.common.internal.w.c.r(parcel, 2, this.f7741e, i2, false);
        com.google.android.gms.common.internal.w.c.s(parcel, 3, this.f7742f, false);
        com.google.android.gms.common.internal.w.c.b(parcel, iA);
    }
}