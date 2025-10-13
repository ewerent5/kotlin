package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class hc extends com.google.android.gms.common.internal.w.a {
    public static final Parcelable.Creator<hc> CREATOR = new ic();

    /* renamed from: e, reason: collision with root package name */
    public final String f6321e;

    /* renamed from: f, reason: collision with root package name */
    public final Bundle f6322f;

    public hc(String str, Bundle bundle) {
        this.f6321e = str;
        this.f6322f = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.w.c.a(parcel);
        com.google.android.gms.common.internal.w.c.s(parcel, 1, this.f6321e, false);
        com.google.android.gms.common.internal.w.c.e(parcel, 2, this.f6322f, false);
        com.google.android.gms.common.internal.w.c.b(parcel, iA);
    }
}