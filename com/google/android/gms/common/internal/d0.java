package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* loaded from: classes.dex */
public abstract class d0 extends e.c.b.b.c.c.b implements m {
    public d0() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }

    @Override // e.c.b.b.c.c.b
    protected final boolean R(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 == 1) {
            i2(parcel.readInt(), parcel.readStrongBinder(), (Bundle) e.c.b.b.c.c.c.c(parcel, Bundle.CREATOR));
        } else if (i2 == 2) {
            l1(parcel.readInt(), (Bundle) e.c.b.b.c.c.c.c(parcel, Bundle.CREATOR));
        } else {
            if (i2 != 3) {
                return false;
            }
            f3(parcel.readInt(), parcel.readStrongBinder(), (r0) e.c.b.b.c.c.c.c(parcel, r0.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}