package com.google.android.gms.maps;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLngBounds;

/* compiled from: com.google.android.gms:play-services-maps@@17.0.1 */
/* loaded from: classes.dex */
public final class GoogleMapOptions extends com.google.android.gms.common.internal.w.a implements ReflectedParcelable {

    @RecentlyNonNull
    public static final Parcelable.Creator<GoogleMapOptions> CREATOR = new k();

    /* renamed from: e, reason: collision with root package name */
    private Boolean f10671e;

    /* renamed from: f, reason: collision with root package name */
    private Boolean f10672f;

    /* renamed from: g, reason: collision with root package name */
    private int f10673g;

    /* renamed from: h, reason: collision with root package name */
    private CameraPosition f10674h;

    /* renamed from: i, reason: collision with root package name */
    private Boolean f10675i;

    /* renamed from: j, reason: collision with root package name */
    private Boolean f10676j;

    /* renamed from: k, reason: collision with root package name */
    private Boolean f10677k;

    /* renamed from: l, reason: collision with root package name */
    private Boolean f10678l;

    /* renamed from: m, reason: collision with root package name */
    private Boolean f10679m;
    private Boolean n;
    private Boolean o;
    private Boolean p;
    private Boolean q;
    private Float r;
    private Float s;
    private LatLngBounds t;
    private Boolean u;

    GoogleMapOptions(byte b2, byte b3, int i2, CameraPosition cameraPosition, byte b4, byte b5, byte b6, byte b7, byte b8, byte b9, byte b10, byte b11, byte b12, Float f2, Float f3, LatLngBounds latLngBounds, byte b13) {
        this.f10673g = -1;
        this.r = null;
        this.s = null;
        this.t = null;
        this.f10671e = com.google.android.gms.maps.i.f.a(b2);
        this.f10672f = com.google.android.gms.maps.i.f.a(b3);
        this.f10673g = i2;
        this.f10674h = cameraPosition;
        this.f10675i = com.google.android.gms.maps.i.f.a(b4);
        this.f10676j = com.google.android.gms.maps.i.f.a(b5);
        this.f10677k = com.google.android.gms.maps.i.f.a(b6);
        this.f10678l = com.google.android.gms.maps.i.f.a(b7);
        this.f10679m = com.google.android.gms.maps.i.f.a(b8);
        this.n = com.google.android.gms.maps.i.f.a(b9);
        this.o = com.google.android.gms.maps.i.f.a(b10);
        this.p = com.google.android.gms.maps.i.f.a(b11);
        this.q = com.google.android.gms.maps.i.f.a(b12);
        this.r = f2;
        this.s = f3;
        this.t = latLngBounds;
        this.u = com.google.android.gms.maps.i.f.a(b13);
    }

    @RecentlyNullable
    public LatLngBounds I() {
        return this.t;
    }

    public int J() {
        return this.f10673g;
    }

    @RecentlyNullable
    public Float K() {
        return this.s;
    }

    @RecentlyNullable
    public Float L() {
        return this.r;
    }

    @RecentlyNullable
    public CameraPosition c() {
        return this.f10674h;
    }

    @RecentlyNonNull
    public String toString() {
        return com.google.android.gms.common.internal.o.c(this).a("MapType", Integer.valueOf(this.f10673g)).a("LiteMode", this.o).a("Camera", this.f10674h).a("CompassEnabled", this.f10676j).a("ZoomControlsEnabled", this.f10675i).a("ScrollGesturesEnabled", this.f10677k).a("ZoomGesturesEnabled", this.f10678l).a("TiltGesturesEnabled", this.f10679m).a("RotateGesturesEnabled", this.n).a("ScrollGesturesEnabledDuringRotateOrZoom", this.u).a("MapToolbarEnabled", this.p).a("AmbientEnabled", this.q).a("MinZoomPreference", this.r).a("MaxZoomPreference", this.s).a("LatLngBoundsForCameraTarget", this.t).a("ZOrderOnTop", this.f10671e).a("UseViewLifecycleInFragment", this.f10672f).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.w.c.a(parcel);
        com.google.android.gms.common.internal.w.c.f(parcel, 2, com.google.android.gms.maps.i.f.b(this.f10671e));
        com.google.android.gms.common.internal.w.c.f(parcel, 3, com.google.android.gms.maps.i.f.b(this.f10672f));
        com.google.android.gms.common.internal.w.c.m(parcel, 4, J());
        com.google.android.gms.common.internal.w.c.r(parcel, 5, c(), i2, false);
        com.google.android.gms.common.internal.w.c.f(parcel, 6, com.google.android.gms.maps.i.f.b(this.f10675i));
        com.google.android.gms.common.internal.w.c.f(parcel, 7, com.google.android.gms.maps.i.f.b(this.f10676j));
        com.google.android.gms.common.internal.w.c.f(parcel, 8, com.google.android.gms.maps.i.f.b(this.f10677k));
        com.google.android.gms.common.internal.w.c.f(parcel, 9, com.google.android.gms.maps.i.f.b(this.f10678l));
        com.google.android.gms.common.internal.w.c.f(parcel, 10, com.google.android.gms.maps.i.f.b(this.f10679m));
        com.google.android.gms.common.internal.w.c.f(parcel, 11, com.google.android.gms.maps.i.f.b(this.n));
        com.google.android.gms.common.internal.w.c.f(parcel, 12, com.google.android.gms.maps.i.f.b(this.o));
        com.google.android.gms.common.internal.w.c.f(parcel, 14, com.google.android.gms.maps.i.f.b(this.p));
        com.google.android.gms.common.internal.w.c.f(parcel, 15, com.google.android.gms.maps.i.f.b(this.q));
        com.google.android.gms.common.internal.w.c.k(parcel, 16, L(), false);
        com.google.android.gms.common.internal.w.c.k(parcel, 17, K(), false);
        com.google.android.gms.common.internal.w.c.r(parcel, 18, I(), i2, false);
        com.google.android.gms.common.internal.w.c.f(parcel, 19, com.google.android.gms.maps.i.f.b(this.u));
        com.google.android.gms.common.internal.w.c.b(parcel, iA);
    }
}