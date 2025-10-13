package com.google.android.gms.maps.i;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-maps@@17.0.1 */
/* loaded from: classes.dex */
public final class p extends e.c.b.b.c.d.a implements d {
    p(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IProjectionDelegate");
    }

    @Override // com.google.android.gms.maps.i.d
    public final com.google.android.gms.maps.model.i L() {
        Parcel parcelR = R(3, U());
        com.google.android.gms.maps.model.i iVar = (com.google.android.gms.maps.model.i) e.c.b.b.c.d.c.c(parcelR, com.google.android.gms.maps.model.i.CREATOR);
        parcelR.recycle();
        return iVar;
    }
}