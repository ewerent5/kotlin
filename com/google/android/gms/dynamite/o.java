package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import e.c.b.b.b.b;

/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* loaded from: classes.dex */
public final class o extends e.c.b.b.c.c.a implements IInterface {
    o(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    public final e.c.b.b.b.b I4(e.c.b.b.b.b bVar, String str, int i2) {
        Parcel parcelU = U();
        e.c.b.b.c.c.c.e(parcelU, bVar);
        parcelU.writeString(str);
        parcelU.writeInt(i2);
        Parcel parcelR = R(4, parcelU);
        e.c.b.b.b.b bVarU = b.a.U(parcelR.readStrongBinder());
        parcelR.recycle();
        return bVarU;
    }

    public final int J4(e.c.b.b.b.b bVar, String str, boolean z) {
        Parcel parcelU = U();
        e.c.b.b.c.c.c.e(parcelU, bVar);
        parcelU.writeString(str);
        e.c.b.b.c.c.c.b(parcelU, z);
        Parcel parcelR = R(5, parcelU);
        int i2 = parcelR.readInt();
        parcelR.recycle();
        return i2;
    }

    public final e.c.b.b.b.b K4(e.c.b.b.b.b bVar, String str, boolean z, long j2) {
        Parcel parcelU = U();
        e.c.b.b.c.c.c.e(parcelU, bVar);
        parcelU.writeString(str);
        e.c.b.b.c.c.c.b(parcelU, z);
        parcelU.writeLong(j2);
        Parcel parcelR = R(7, parcelU);
        e.c.b.b.b.b bVarU = b.a.U(parcelR.readStrongBinder());
        parcelR.recycle();
        return bVarU;
    }

    public final e.c.b.b.b.b L4(e.c.b.b.b.b bVar, String str, int i2, e.c.b.b.b.b bVar2) {
        Parcel parcelU = U();
        e.c.b.b.c.c.c.e(parcelU, bVar);
        parcelU.writeString(str);
        parcelU.writeInt(i2);
        e.c.b.b.c.c.c.e(parcelU, bVar2);
        Parcel parcelR = R(8, parcelU);
        e.c.b.b.b.b bVarU = b.a.U(parcelR.readStrongBinder());
        parcelR.recycle();
        return bVarU;
    }

    public final e.c.b.b.b.b Y(e.c.b.b.b.b bVar, String str, int i2) {
        Parcel parcelU = U();
        e.c.b.b.c.c.c.e(parcelU, bVar);
        parcelU.writeString(str);
        parcelU.writeInt(i2);
        Parcel parcelR = R(2, parcelU);
        e.c.b.b.b.b bVarU = b.a.U(parcelR.readStrongBinder());
        parcelR.recycle();
        return bVarU;
    }

    public final int m4(e.c.b.b.b.b bVar, String str, boolean z) {
        Parcel parcelU = U();
        e.c.b.b.c.c.c.e(parcelU, bVar);
        parcelU.writeString(str);
        e.c.b.b.c.c.c.b(parcelU, z);
        Parcel parcelR = R(3, parcelU);
        int i2 = parcelR.readInt();
        parcelR.recycle();
        return i2;
    }

    public final int zzi() {
        Parcel parcelR = R(6, U());
        int i2 = parcelR.readInt();
        parcelR.recycle();
        return i2;
    }
}