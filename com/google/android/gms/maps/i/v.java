package com.google.android.gms.maps.i;

import android.location.Location;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-maps@@17.0.1 */
/* loaded from: classes.dex */
public final class v extends e.c.b.b.c.d.a implements b {
    v(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IGoogleMapDelegate");
    }

    @Override // com.google.android.gms.maps.i.b
    public final Location A() {
        Parcel parcelR = R(23, U());
        Location location = (Location) e.c.b.b.c.d.c.c(parcelR, Location.CREATOR);
        parcelR.recycle();
        return location;
    }

    @Override // com.google.android.gms.maps.i.b
    public final void B0(h hVar) {
        Parcel parcelU = U();
        e.c.b.b.c.d.c.e(parcelU, hVar);
        Y(86, parcelU);
    }

    @Override // com.google.android.gms.maps.i.b
    public final e.c.b.b.c.d.i E0(com.google.android.gms.maps.model.d dVar) {
        Parcel parcelU = U();
        e.c.b.b.c.d.c.d(parcelU, dVar);
        Parcel parcelR = R(35, parcelU);
        e.c.b.b.c.d.i iVarU = e.c.b.b.c.d.h.U(parcelR.readStrongBinder());
        parcelR.recycle();
        return iVarU;
    }

    @Override // com.google.android.gms.maps.i.b
    public final void M3(e.c.b.b.b.b bVar) {
        Parcel parcelU = U();
        e.c.b.b.c.d.c.e(parcelU, bVar);
        Y(5, parcelU);
    }

    @Override // com.google.android.gms.maps.i.b
    public final e N2() {
        e qVar;
        Parcel parcelR = R(25, U());
        IBinder strongBinder = parcelR.readStrongBinder();
        if (strongBinder == null) {
            qVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
            qVar = iInterfaceQueryLocalInterface instanceof e ? (e) iInterfaceQueryLocalInterface : new q(strongBinder);
        }
        parcelR.recycle();
        return qVar;
    }

    @Override // com.google.android.gms.maps.i.b
    public final void b3(l lVar) {
        Parcel parcelU = U();
        e.c.b.b.c.d.c.e(parcelU, lVar);
        Y(30, parcelU);
    }

    @Override // com.google.android.gms.maps.i.b
    public final void i1(y yVar) {
        Parcel parcelU = U();
        e.c.b.b.c.d.c.e(parcelU, yVar);
        Y(99, parcelU);
    }

    @Override // com.google.android.gms.maps.i.b
    public final void s(int i2) {
        Parcel parcelU = U();
        parcelU.writeInt(i2);
        Y(16, parcelU);
    }

    @Override // com.google.android.gms.maps.i.b
    public final d s3() {
        d pVar;
        Parcel parcelR = R(26, U());
        IBinder strongBinder = parcelR.readStrongBinder();
        if (strongBinder == null) {
            pVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IProjectionDelegate");
            pVar = iInterfaceQueryLocalInterface instanceof d ? (d) iInterfaceQueryLocalInterface : new p(strongBinder);
        }
        parcelR.recycle();
        return pVar;
    }

    @Override // com.google.android.gms.maps.i.b
    public final void v3(n nVar) {
        Parcel parcelU = U();
        e.c.b.b.c.d.c.e(parcelU, nVar);
        Y(36, parcelU);
    }

    @Override // com.google.android.gms.maps.i.b
    public final void y(boolean z) {
        Parcel parcelU = U();
        e.c.b.b.c.d.c.b(parcelU, z);
        Y(22, parcelU);
    }

    @Override // com.google.android.gms.maps.i.b
    public final e.c.b.b.c.d.l z4(com.google.android.gms.maps.model.f fVar) {
        Parcel parcelU = U();
        e.c.b.b.c.d.c.d(parcelU, fVar);
        Parcel parcelR = R(11, parcelU);
        e.c.b.b.c.d.l lVarU = e.c.b.b.c.d.k.U(parcelR.readStrongBinder());
        parcelR.recycle();
        return lVarU;
    }
}