package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;

/* compiled from: com.google.android.gms:play-services-maps@@17.0.1 */
/* loaded from: classes.dex */
public final class i extends com.google.android.gms.common.internal.w.a {

    @RecentlyNonNull
    public static final Parcelable.Creator<i> CREATOR = new p();

    /* renamed from: e, reason: collision with root package name */
    @RecentlyNonNull
    public final LatLng f10717e;

    /* renamed from: f, reason: collision with root package name */
    @RecentlyNonNull
    public final LatLng f10718f;

    /* renamed from: g, reason: collision with root package name */
    @RecentlyNonNull
    public final LatLng f10719g;

    /* renamed from: h, reason: collision with root package name */
    @RecentlyNonNull
    public final LatLng f10720h;

    /* renamed from: i, reason: collision with root package name */
    @RecentlyNonNull
    public final LatLngBounds f10721i;

    public i(@RecentlyNonNull LatLng latLng, @RecentlyNonNull LatLng latLng2, @RecentlyNonNull LatLng latLng3, @RecentlyNonNull LatLng latLng4, @RecentlyNonNull LatLngBounds latLngBounds) {
        this.f10717e = latLng;
        this.f10718f = latLng2;
        this.f10719g = latLng3;
        this.f10720h = latLng4;
        this.f10721i = latLngBounds;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f10717e.equals(iVar.f10717e) && this.f10718f.equals(iVar.f10718f) && this.f10719g.equals(iVar.f10719g) && this.f10720h.equals(iVar.f10720h) && this.f10721i.equals(iVar.f10721i);
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.o.b(this.f10717e, this.f10718f, this.f10719g, this.f10720h, this.f10721i);
    }

    @RecentlyNonNull
    public String toString() {
        return com.google.android.gms.common.internal.o.c(this).a("nearLeft", this.f10717e).a("nearRight", this.f10718f).a("farLeft", this.f10719g).a("farRight", this.f10720h).a("latLngBounds", this.f10721i).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.w.c.a(parcel);
        com.google.android.gms.common.internal.w.c.r(parcel, 2, this.f10717e, i2, false);
        com.google.android.gms.common.internal.w.c.r(parcel, 3, this.f10718f, i2, false);
        com.google.android.gms.common.internal.w.c.r(parcel, 4, this.f10719g, i2, false);
        com.google.android.gms.common.internal.w.c.r(parcel, 5, this.f10720h, i2, false);
        com.google.android.gms.common.internal.w.c.r(parcel, 6, this.f10721i, i2, false);
        com.google.android.gms.common.internal.w.c.b(parcel, iA);
    }
}