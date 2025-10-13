package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;

/* compiled from: com.google.android.gms:play-services-maps@@17.0.1 */
/* loaded from: classes.dex */
public final class LatLngBounds extends com.google.android.gms.common.internal.w.a implements ReflectedParcelable {

    @RecentlyNonNull
    public static final Parcelable.Creator<LatLngBounds> CREATOR = new l();

    /* renamed from: e, reason: collision with root package name */
    @RecentlyNonNull
    public final LatLng f10694e;

    /* renamed from: f, reason: collision with root package name */
    @RecentlyNonNull
    public final LatLng f10695f;

    public LatLngBounds(@RecentlyNonNull LatLng latLng, @RecentlyNonNull LatLng latLng2) {
        com.google.android.gms.common.internal.p.k(latLng, "southwest must not be null.");
        com.google.android.gms.common.internal.p.k(latLng2, "northeast must not be null.");
        double d2 = latLng2.f10692e;
        double d3 = latLng.f10692e;
        com.google.android.gms.common.internal.p.c(d2 >= d3, "southern latitude exceeds northern latitude (%s > %s)", Double.valueOf(d3), Double.valueOf(latLng2.f10692e));
        this.f10694e = latLng;
        this.f10695f = latLng2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLngBounds)) {
            return false;
        }
        LatLngBounds latLngBounds = (LatLngBounds) obj;
        return this.f10694e.equals(latLngBounds.f10694e) && this.f10695f.equals(latLngBounds.f10695f);
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.o.b(this.f10694e, this.f10695f);
    }

    @RecentlyNonNull
    public String toString() {
        return com.google.android.gms.common.internal.o.c(this).a("southwest", this.f10694e).a("northeast", this.f10695f).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.w.c.a(parcel);
        com.google.android.gms.common.internal.w.c.r(parcel, 2, this.f10694e, i2, false);
        com.google.android.gms.common.internal.w.c.r(parcel, 3, this.f10695f, i2, false);
        com.google.android.gms.common.internal.w.c.b(parcel, iA);
    }
}