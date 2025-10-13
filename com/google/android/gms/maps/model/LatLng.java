package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;

/* compiled from: com.google.android.gms:play-services-maps@@17.0.1 */
/* loaded from: classes.dex */
public final class LatLng extends com.google.android.gms.common.internal.w.a implements ReflectedParcelable {

    @RecentlyNonNull
    public static final Parcelable.Creator<LatLng> CREATOR = new m();

    /* renamed from: e */
    public final double f10692e;

    /* renamed from: f */
    public final double f10693f;

    public LatLng(double d2, double d3) {
        if (d3 < -180.0d || d3 >= 180.0d) {
            this.f10693f = ((((d3 - 180.0d) % 360.0d) + 360.0d) % 360.0d) - 180.0d;
        } else {
            this.f10693f = d3;
        }
        this.f10692e = Math.max(-90.0d, Math.min(90.0d, d2));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLng)) {
            return false;
        }
        LatLng latLng = (LatLng) obj;
        return Double.doubleToLongBits(this.f10692e) == Double.doubleToLongBits(latLng.f10692e) && Double.doubleToLongBits(this.f10693f) == Double.doubleToLongBits(latLng.f10693f);
    }

    public int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.f10692e);
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.f10693f);
        return ((((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) + 31) * 31) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)));
    }

    @RecentlyNonNull
    public String toString() {
        double d2 = this.f10692e;
        double d3 = this.f10693f;
        StringBuilder sb = new StringBuilder(60);
        sb.append("lat/lng: (");
        sb.append(d2);
        sb.append(",");
        sb.append(d3);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.w.c.a(parcel);
        com.google.android.gms.common.internal.w.c.h(parcel, 2, this.f10692e);
        com.google.android.gms.common.internal.w.c.h(parcel, 3, this.f10693f);
        com.google.android.gms.common.internal.w.c.b(parcel, iA);
    }
}