package com.google.android.gms.maps.i;

import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-maps@@17.0.1 */
/* loaded from: classes.dex */
public abstract class k extends e.c.b.b.c.d.b implements l {
    public k() {
        super("com.google.android.gms.maps.internal.IOnMarkerClickListener");
    }

    @Override // e.c.b.b.c.d.b
    protected final boolean R(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 != 1) {
            return false;
        }
        boolean zC = C(e.c.b.b.c.d.k.U(parcel.readStrongBinder()));
        parcel2.writeNoException();
        e.c.b.b.c.d.c.b(parcel2, zC);
        return true;
    }
}