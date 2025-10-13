package com.google.android.gms.maps.i;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import e.c.b.b.b.b;

/* compiled from: com.google.android.gms:play-services-maps@@17.0.1 */
/* loaded from: classes.dex */
public final class w extends e.c.b.b.c.d.a implements c {
    w(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IMapViewDelegate");
    }

    @Override // com.google.android.gms.maps.i.c
    public final e.c.b.b.b.b getView() {
        Parcel parcelR = R(8, U());
        e.c.b.b.b.b bVarU = b.a.U(parcelR.readStrongBinder());
        parcelR.recycle();
        return bVarU;
    }

    @Override // com.google.android.gms.maps.i.c
    public final void h() {
        Y(12, U());
    }

    @Override // com.google.android.gms.maps.i.c
    public final void l() {
        Y(13, U());
    }

    @Override // com.google.android.gms.maps.i.c
    public final void m2(j jVar) {
        Parcel parcelU = U();
        e.c.b.b.c.d.c.e(parcelU, jVar);
        Y(9, parcelU);
    }

    @Override // com.google.android.gms.maps.i.c
    public final void onDestroy() {
        Y(5, U());
    }

    @Override // com.google.android.gms.maps.i.c
    public final void onLowMemory() {
        Y(6, U());
    }

    @Override // com.google.android.gms.maps.i.c
    public final void onPause() {
        Y(4, U());
    }

    @Override // com.google.android.gms.maps.i.c
    public final void onResume() {
        Y(3, U());
    }

    @Override // com.google.android.gms.maps.i.c
    public final void r(Bundle bundle) {
        Parcel parcelU = U();
        e.c.b.b.c.d.c.d(parcelU, bundle);
        Parcel parcelR = R(7, parcelU);
        if (parcelR.readInt() != 0) {
            bundle.readFromParcel(parcelR);
        }
        parcelR.recycle();
    }

    @Override // com.google.android.gms.maps.i.c
    public final void z(Bundle bundle) {
        Parcel parcelU = U();
        e.c.b.b.c.d.c.d(parcelU, bundle);
        Y(2, parcelU);
    }
}