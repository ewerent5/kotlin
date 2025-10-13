package com.google.android.gms.maps.i;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.maps.model.LatLng;
import e.c.b.b.b.b;

/* compiled from: com.google.android.gms:play-services-maps@@17.0.1 */
/* loaded from: classes.dex */
public final class o extends e.c.b.b.c.d.a implements a {
    o(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
    }

    @Override // com.google.android.gms.maps.i.a
    public final e.c.b.b.b.b Y0(LatLng latLng) {
        Parcel parcelU = U();
        e.c.b.b.c.d.c.d(parcelU, latLng);
        Parcel parcelR = R(8, parcelU);
        e.c.b.b.b.b bVarU = b.a.U(parcelR.readStrongBinder());
        parcelR.recycle();
        return bVarU;
    }

    @Override // com.google.android.gms.maps.i.a
    public final e.c.b.b.b.b c4(LatLng latLng, float f2) {
        Parcel parcelU = U();
        e.c.b.b.c.d.c.d(parcelU, latLng);
        parcelU.writeFloat(f2);
        Parcel parcelR = R(9, parcelU);
        e.c.b.b.b.b bVarU = b.a.U(parcelR.readStrongBinder());
        parcelR.recycle();
        return bVarU;
    }
}