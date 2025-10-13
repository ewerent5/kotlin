package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import e.c.b.b.b.b;

/* compiled from: com.google.android.gms:play-services-maps@@17.0.1 */
/* loaded from: classes.dex */
public final class f extends com.google.android.gms.common.internal.w.a {

    @RecentlyNonNull
    public static final Parcelable.Creator<f> CREATOR = new n();

    /* renamed from: e, reason: collision with root package name */
    private LatLng f10705e;

    /* renamed from: f, reason: collision with root package name */
    private String f10706f;

    /* renamed from: g, reason: collision with root package name */
    private String f10707g;

    /* renamed from: h, reason: collision with root package name */
    private a f10708h;

    /* renamed from: i, reason: collision with root package name */
    private float f10709i;

    /* renamed from: j, reason: collision with root package name */
    private float f10710j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f10711k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f10712l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f10713m;
    private float n;
    private float o;
    private float p;
    private float q;
    private float r;

    public f() {
        this.f10709i = 0.5f;
        this.f10710j = 1.0f;
        this.f10712l = true;
        this.f10713m = false;
        this.n = 0.0f;
        this.o = 0.5f;
        this.p = 0.0f;
        this.q = 1.0f;
    }

    public float I() {
        return this.f10709i;
    }

    public float J() {
        return this.f10710j;
    }

    public float K() {
        return this.o;
    }

    public float L() {
        return this.p;
    }

    @RecentlyNonNull
    public LatLng M() {
        return this.f10705e;
    }

    public float O() {
        return this.n;
    }

    @RecentlyNullable
    public String P() {
        return this.f10707g;
    }

    @RecentlyNullable
    public String Q() {
        return this.f10706f;
    }

    public float R() {
        return this.r;
    }

    @RecentlyNonNull
    public f S(a aVar) {
        this.f10708h = aVar;
        return this;
    }

    public boolean U() {
        return this.f10711k;
    }

    public boolean V() {
        return this.f10713m;
    }

    public boolean X() {
        return this.f10712l;
    }

    @RecentlyNonNull
    public f Y(@RecentlyNonNull LatLng latLng) {
        if (latLng == null) {
            throw new IllegalArgumentException("latlng cannot be null - a position is required.");
        }
        this.f10705e = latLng;
        return this;
    }

    @RecentlyNonNull
    public f b0(String str) {
        this.f10707g = str;
        return this;
    }

    public float c() {
        return this.q;
    }

    @RecentlyNonNull
    public f c0(String str) {
        this.f10706f = str;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.w.c.a(parcel);
        com.google.android.gms.common.internal.w.c.r(parcel, 2, M(), i2, false);
        com.google.android.gms.common.internal.w.c.s(parcel, 3, Q(), false);
        com.google.android.gms.common.internal.w.c.s(parcel, 4, P(), false);
        a aVar = this.f10708h;
        com.google.android.gms.common.internal.w.c.l(parcel, 5, aVar == null ? null : aVar.a().asBinder(), false);
        com.google.android.gms.common.internal.w.c.j(parcel, 6, I());
        com.google.android.gms.common.internal.w.c.j(parcel, 7, J());
        com.google.android.gms.common.internal.w.c.c(parcel, 8, U());
        com.google.android.gms.common.internal.w.c.c(parcel, 9, X());
        com.google.android.gms.common.internal.w.c.c(parcel, 10, V());
        com.google.android.gms.common.internal.w.c.j(parcel, 11, O());
        com.google.android.gms.common.internal.w.c.j(parcel, 12, K());
        com.google.android.gms.common.internal.w.c.j(parcel, 13, L());
        com.google.android.gms.common.internal.w.c.j(parcel, 14, c());
        com.google.android.gms.common.internal.w.c.j(parcel, 15, R());
        com.google.android.gms.common.internal.w.c.b(parcel, iA);
    }

    f(LatLng latLng, String str, String str2, IBinder iBinder, float f2, float f3, boolean z, boolean z2, boolean z3, float f4, float f5, float f6, float f7, float f8) {
        this.f10709i = 0.5f;
        this.f10710j = 1.0f;
        this.f10712l = true;
        this.f10713m = false;
        this.n = 0.0f;
        this.o = 0.5f;
        this.p = 0.0f;
        this.q = 1.0f;
        this.f10705e = latLng;
        this.f10706f = str;
        this.f10707g = str2;
        if (iBinder == null) {
            this.f10708h = null;
        } else {
            this.f10708h = new a(b.a.U(iBinder));
        }
        this.f10709i = f2;
        this.f10710j = f3;
        this.f10711k = z;
        this.f10712l = z2;
        this.f10713m = z3;
        this.n = f4;
        this.o = f5;
        this.p = f6;
        this.q = f7;
        this.r = f8;
    }
}