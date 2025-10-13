package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-maps@@17.0.1 */
/* loaded from: classes.dex */
public final class d extends com.google.android.gms.common.internal.w.a {

    @RecentlyNonNull
    public static final Parcelable.Creator<d> CREATOR = new k();

    /* renamed from: e, reason: collision with root package name */
    private LatLng f10696e;

    /* renamed from: f, reason: collision with root package name */
    private double f10697f;

    /* renamed from: g, reason: collision with root package name */
    private float f10698g;

    /* renamed from: h, reason: collision with root package name */
    private int f10699h;

    /* renamed from: i, reason: collision with root package name */
    private int f10700i;

    /* renamed from: j, reason: collision with root package name */
    private float f10701j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f10702k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f10703l;

    /* renamed from: m, reason: collision with root package name */
    private List<g> f10704m;

    public d() {
        this.f10696e = null;
        this.f10697f = 0.0d;
        this.f10698g = 10.0f;
        this.f10699h = -16777216;
        this.f10700i = 0;
        this.f10701j = 0.0f;
        this.f10702k = true;
        this.f10703l = false;
        this.f10704m = null;
    }

    @RecentlyNonNull
    public d I(int i2) {
        this.f10700i = i2;
        return this;
    }

    @RecentlyNullable
    public LatLng J() {
        return this.f10696e;
    }

    public int K() {
        return this.f10700i;
    }

    public double L() {
        return this.f10697f;
    }

    public int M() {
        return this.f10699h;
    }

    @RecentlyNullable
    public List<g> O() {
        return this.f10704m;
    }

    public float P() {
        return this.f10698g;
    }

    public float Q() {
        return this.f10701j;
    }

    public boolean R() {
        return this.f10703l;
    }

    public boolean S() {
        return this.f10702k;
    }

    @RecentlyNonNull
    public d U(double d2) {
        this.f10697f = d2;
        return this;
    }

    @RecentlyNonNull
    public d V(int i2) {
        this.f10699h = i2;
        return this;
    }

    @RecentlyNonNull
    public d c(@RecentlyNonNull LatLng latLng) {
        com.google.android.gms.common.internal.p.k(latLng, "center must not be null.");
        this.f10696e = latLng;
        return this;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.w.c.a(parcel);
        com.google.android.gms.common.internal.w.c.r(parcel, 2, J(), i2, false);
        com.google.android.gms.common.internal.w.c.h(parcel, 3, L());
        com.google.android.gms.common.internal.w.c.j(parcel, 4, P());
        com.google.android.gms.common.internal.w.c.m(parcel, 5, M());
        com.google.android.gms.common.internal.w.c.m(parcel, 6, K());
        com.google.android.gms.common.internal.w.c.j(parcel, 7, Q());
        com.google.android.gms.common.internal.w.c.c(parcel, 8, S());
        com.google.android.gms.common.internal.w.c.c(parcel, 9, R());
        com.google.android.gms.common.internal.w.c.w(parcel, 10, O(), false);
        com.google.android.gms.common.internal.w.c.b(parcel, iA);
    }

    d(LatLng latLng, double d2, float f2, int i2, int i3, float f3, boolean z, boolean z2, List<g> list) {
        this.f10696e = latLng;
        this.f10697f = d2;
        this.f10698g = f2;
        this.f10699h = i2;
        this.f10700i = i3;
        this.f10701j = f3;
        this.f10702k = z;
        this.f10703l = z2;
        this.f10704m = list;
    }
}