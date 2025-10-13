package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import e.c.b.b.b.b;

/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* loaded from: classes.dex */
public final class e1 extends e.c.b.b.c.c.a implements g1 {
    e1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    @Override // com.google.android.gms.common.internal.g1
    public final e.c.b.b.b.b zzd() {
        Parcel parcelR = R(1, U());
        e.c.b.b.b.b bVarU = b.a.U(parcelR.readStrongBinder());
        parcelR.recycle();
        return bVarU;
    }

    @Override // com.google.android.gms.common.internal.g1
    public final int zze() {
        Parcel parcelR = R(2, U());
        int i2 = parcelR.readInt();
        parcelR.recycle();
        return i2;
    }
}