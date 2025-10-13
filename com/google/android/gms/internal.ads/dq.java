package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class dq extends com.google.android.gms.common.internal.w.a {
    public static final Parcelable.Creator<dq> CREATOR = new eq();

    /* renamed from: e, reason: collision with root package name */
    @Deprecated
    public final String f5502e;

    /* renamed from: f, reason: collision with root package name */
    public final String f5503f;

    /* renamed from: g, reason: collision with root package name */
    @Deprecated
    public final r93 f5504g;

    /* renamed from: h, reason: collision with root package name */
    public final m93 f5505h;

    public dq(String str, String str2, r93 r93Var, m93 m93Var) {
        this.f5502e = str;
        this.f5503f = str2;
        this.f5504g = r93Var;
        this.f5505h = m93Var;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.w.c.a(parcel);
        com.google.android.gms.common.internal.w.c.s(parcel, 1, this.f5502e, false);
        com.google.android.gms.common.internal.w.c.s(parcel, 2, this.f5503f, false);
        com.google.android.gms.common.internal.w.c.r(parcel, 3, this.f5504g, i2, false);
        com.google.android.gms.common.internal.w.c.r(parcel, 4, this.f5505h, i2, false);
        com.google.android.gms.common.internal.w.c.b(parcel, iA);
    }
}