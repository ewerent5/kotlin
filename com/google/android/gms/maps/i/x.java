package com.google.android.gms.maps.i;

import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-maps@@17.0.1 */
/* loaded from: classes.dex */
public abstract class x extends e.c.b.b.c.d.b implements y {
    public x() {
        super("com.google.android.gms.maps.internal.IOnCameraIdleListener");
    }

    @Override // e.c.b.b.c.d.b
    protected final boolean R(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 != 1) {
            return false;
        }
        zzb();
        parcel2.writeNoException();
        return true;
    }
}