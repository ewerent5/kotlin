package com.google.android.gms.maps.i;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-maps@@17.0.1 */
/* loaded from: classes.dex */
public abstract class i extends e.c.b.b.c.d.b implements j {
    public i() {
        super("com.google.android.gms.maps.internal.IOnMapReadyCallback");
    }

    @Override // e.c.b.b.c.d.b
    protected final boolean R(int i2, Parcel parcel, Parcel parcel2, int i3) {
        b vVar;
        if (i2 != 1) {
            return false;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        if (strongBinder == null) {
            vVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            vVar = iInterfaceQueryLocalInterface instanceof b ? (b) iInterfaceQueryLocalInterface : new v(strongBinder);
        }
        O0(vVar);
        parcel2.writeNoException();
        return true;
    }
}