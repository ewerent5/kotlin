package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import e.c.b.b.b.b;

/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* loaded from: classes.dex */
public final class p extends e.c.b.b.c.c.a implements IInterface {
    p(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    public final e.c.b.b.b.b Y(e.c.b.b.b.b bVar, String str, int i2, e.c.b.b.b.b bVar2) {
        Parcel parcelU = U();
        e.c.b.b.c.c.c.e(parcelU, bVar);
        parcelU.writeString(str);
        parcelU.writeInt(i2);
        e.c.b.b.c.c.c.e(parcelU, bVar2);
        Parcel parcelR = R(2, parcelU);
        e.c.b.b.b.b bVarU = b.a.U(parcelR.readStrongBinder());
        parcelR.recycle();
        return bVarU;
    }

    public final e.c.b.b.b.b m4(e.c.b.b.b.b bVar, String str, int i2, e.c.b.b.b.b bVar2) {
        Parcel parcelU = U();
        e.c.b.b.c.c.c.e(parcelU, bVar);
        parcelU.writeString(str);
        parcelU.writeInt(i2);
        e.c.b.b.c.c.c.e(parcelU, bVar2);
        Parcel parcelR = R(3, parcelU);
        e.c.b.b.b.b bVarU = b.a.U(parcelR.readStrongBinder());
        parcelR.recycle();
        return bVarU;
    }
}