package com.google.android.gms.maps.i;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.maps.GoogleMapOptions;

/* compiled from: com.google.android.gms:play-services-maps@@17.0.1 */
/* loaded from: classes.dex */
public final class t extends e.c.b.b.c.d.a implements u {
    t(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.ICreator");
    }

    @Override // com.google.android.gms.maps.i.u
    public final c R3(e.c.b.b.b.b bVar, GoogleMapOptions googleMapOptions) {
        c wVar;
        Parcel parcelU = U();
        e.c.b.b.c.d.c.e(parcelU, bVar);
        e.c.b.b.c.d.c.d(parcelU, googleMapOptions);
        Parcel parcelR = R(3, parcelU);
        IBinder strongBinder = parcelR.readStrongBinder();
        if (strongBinder == null) {
            wVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
            wVar = iInterfaceQueryLocalInterface instanceof c ? (c) iInterfaceQueryLocalInterface : new w(strongBinder);
        }
        parcelR.recycle();
        return wVar;
    }

    @Override // com.google.android.gms.maps.i.u
    public final a zzf() {
        a oVar;
        Parcel parcelR = R(4, U());
        IBinder strongBinder = parcelR.readStrongBinder();
        if (strongBinder == null) {
            oVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            oVar = iInterfaceQueryLocalInterface instanceof a ? (a) iInterfaceQueryLocalInterface : new o(strongBinder);
        }
        parcelR.recycle();
        return oVar;
    }

    @Override // com.google.android.gms.maps.i.u
    public final e.c.b.b.c.d.f zzg() {
        Parcel parcelR = R(5, U());
        e.c.b.b.c.d.f fVarU = e.c.b.b.c.d.e.U(parcelR.readStrongBinder());
        parcelR.recycle();
        return fVarU;
    }

    @Override // com.google.android.gms.maps.i.u
    public final void zzh(e.c.b.b.b.b bVar, int i2) {
        Parcel parcelU = U();
        e.c.b.b.c.d.c.e(parcelU, bVar);
        parcelU.writeInt(i2);
        Y(6, parcelU);
    }
}