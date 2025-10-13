package com.google.android.gms.maps.i;

import android.os.Parcel;
import e.c.b.b.b.b;

/* compiled from: com.google.android.gms:play-services-maps@@17.0.1 */
/* loaded from: classes.dex */
public abstract class m extends e.c.b.b.c.d.b implements n {
    public m() {
        super("com.google.android.gms.maps.internal.IOnMyLocationChangeListener");
    }

    @Override // e.c.b.b.c.d.b
    protected final boolean R(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 != 1) {
            return false;
        }
        k(b.a.U(parcel.readStrongBinder()));
        parcel2.writeNoException();
        return true;
    }
}