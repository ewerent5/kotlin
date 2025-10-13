package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;

/* compiled from: com.google.android.gms:play-services-maps@@17.0.1 */
/* loaded from: classes.dex */
public final class CameraPosition extends com.google.android.gms.common.internal.w.a implements ReflectedParcelable {

    @RecentlyNonNull
    public static final Parcelable.Creator<CameraPosition> CREATOR = new j();

    /* renamed from: e, reason: collision with root package name */
    @RecentlyNonNull
    public final LatLng f10688e;

    /* renamed from: f, reason: collision with root package name */
    public final float f10689f;

    /* renamed from: g, reason: collision with root package name */
    public final float f10690g;

    /* renamed from: h, reason: collision with root package name */
    public final float f10691h;

    public CameraPosition(@RecentlyNonNull LatLng latLng, float f2, float f3, float f4) {
        com.google.android.gms.common.internal.p.k(latLng, "camera target must not be null.");
        com.google.android.gms.common.internal.p.c(f3 >= 0.0f && f3 <= 90.0f, "Tilt needs to be between 0 and 90 inclusive: %s", Float.valueOf(f3));
        this.f10688e = latLng;
        this.f10689f = f2;
        this.f10690g = f3 + 0.0f;
        this.f10691h = (((double) f4) <= 0.0d ? (f4 % 360.0f) + 360.0f : f4) % 360.0f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CameraPosition)) {
            return false;
        }
        CameraPosition cameraPosition = (CameraPosition) obj;
        return this.f10688e.equals(cameraPosition.f10688e) && Float.floatToIntBits(this.f10689f) == Float.floatToIntBits(cameraPosition.f10689f) && Float.floatToIntBits(this.f10690g) == Float.floatToIntBits(cameraPosition.f10690g) && Float.floatToIntBits(this.f10691h) == Float.floatToIntBits(cameraPosition.f10691h);
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.o.b(this.f10688e, Float.valueOf(this.f10689f), Float.valueOf(this.f10690g), Float.valueOf(this.f10691h));
    }

    @RecentlyNonNull
    public String toString() {
        return com.google.android.gms.common.internal.o.c(this).a("target", this.f10688e).a("zoom", Float.valueOf(this.f10689f)).a("tilt", Float.valueOf(this.f10690g)).a("bearing", Float.valueOf(this.f10691h)).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.w.c.a(parcel);
        com.google.android.gms.common.internal.w.c.r(parcel, 2, this.f10688e, i2, false);
        com.google.android.gms.common.internal.w.c.j(parcel, 3, this.f10689f);
        com.google.android.gms.common.internal.w.c.j(parcel, 4, this.f10690g);
        com.google.android.gms.common.internal.w.c.j(parcel, 5, this.f10691h);
        com.google.android.gms.common.internal.w.c.b(parcel, iA);
    }
}