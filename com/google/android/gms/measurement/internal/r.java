package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
public final class r extends com.google.android.gms.common.internal.w.a {
    public static final Parcelable.Creator<r> CREATOR = new u();

    /* renamed from: e, reason: collision with root package name */
    public final String f11169e;

    /* renamed from: f, reason: collision with root package name */
    public final q f11170f;

    /* renamed from: g, reason: collision with root package name */
    public final String f11171g;

    /* renamed from: h, reason: collision with root package name */
    public final long f11172h;

    public r(String str, q qVar, String str2, long j2) {
        this.f11169e = str;
        this.f11170f = qVar;
        this.f11171g = str2;
        this.f11172h = j2;
    }

    public final String toString() {
        String str = this.f11171g;
        String str2 = this.f11169e;
        String strValueOf = String.valueOf(this.f11170f);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(str2).length() + strValueOf.length());
        sb.append("origin=");
        sb.append(str);
        sb.append(",name=");
        sb.append(str2);
        sb.append(",params=");
        sb.append(strValueOf);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.w.c.a(parcel);
        com.google.android.gms.common.internal.w.c.s(parcel, 2, this.f11169e, false);
        com.google.android.gms.common.internal.w.c.r(parcel, 3, this.f11170f, i2, false);
        com.google.android.gms.common.internal.w.c.s(parcel, 4, this.f11171g, false);
        com.google.android.gms.common.internal.w.c.p(parcel, 5, this.f11172h);
        com.google.android.gms.common.internal.w.c.b(parcel, iA);
    }

    r(r rVar, long j2) {
        com.google.android.gms.common.internal.p.j(rVar);
        this.f11169e = rVar.f11169e;
        this.f11170f = rVar.f11170f;
        this.f11171g = rVar.f11171g;
        this.f11172h = j2;
    }
}