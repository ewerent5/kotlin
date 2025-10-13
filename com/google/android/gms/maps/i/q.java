package com.google.android.gms.maps.i;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-maps@@17.0.1 */
/* loaded from: classes.dex */
public final class q extends e.c.b.b.c.d.a implements e {
    q(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IUiSettingsDelegate");
    }

    @Override // com.google.android.gms.maps.i.e
    public final void W1(boolean z) {
        Parcel parcelU = U();
        e.c.b.b.c.d.c.b(parcelU, z);
        Y(1, parcelU);
    }

    @Override // com.google.android.gms.maps.i.e
    public final void z0(boolean z) {
        Parcel parcelU = U();
        e.c.b.b.c.d.c.b(parcelU, z);
        Y(3, parcelU);
    }
}