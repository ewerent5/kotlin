package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;

/* compiled from: com.google.android.gms:play-services-maps@@17.0.1 */
/* loaded from: classes.dex */
public class g extends com.google.android.gms.common.internal.w.a {

    /* renamed from: f, reason: collision with root package name */
    private final int f10715f;

    /* renamed from: g, reason: collision with root package name */
    private final Float f10716g;

    /* renamed from: e, reason: collision with root package name */
    private static final String f10714e = g.class.getSimpleName();

    @RecentlyNonNull
    public static final Parcelable.Creator<g> CREATOR = new o();

    public g(int i2, Float f2) {
        boolean z = false;
        if (i2 == 1 || (f2 != null && f2.floatValue() >= 0.0f)) {
            z = true;
        }
        String strValueOf = String.valueOf(f2);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 45);
        sb.append("Invalid PatternItem: type=");
        sb.append(i2);
        sb.append(" length=");
        sb.append(strValueOf);
        com.google.android.gms.common.internal.p.b(z, sb.toString());
        this.f10715f = i2;
        this.f10716g = f2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f10715f == gVar.f10715f && com.google.android.gms.common.internal.o.a(this.f10716g, gVar.f10716g);
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.o.b(Integer.valueOf(this.f10715f), this.f10716g);
    }

    @RecentlyNonNull
    public String toString() {
        int i2 = this.f10715f;
        String strValueOf = String.valueOf(this.f10716g);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 39);
        sb.append("[PatternItem: type=");
        sb.append(i2);
        sb.append(" length=");
        sb.append(strValueOf);
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.w.c.a(parcel);
        com.google.android.gms.common.internal.w.c.m(parcel, 2, this.f10715f);
        com.google.android.gms.common.internal.w.c.k(parcel, 3, this.f10716g, false);
        com.google.android.gms.common.internal.w.c.b(parcel, iA);
    }
}