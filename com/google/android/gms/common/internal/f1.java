package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* loaded from: classes.dex */
public abstract class f1 extends e.c.b.b.c.c.b implements g1 {
    public f1() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    public static g1 U(IBinder iBinder) {
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
        return iInterfaceQueryLocalInterface instanceof g1 ? (g1) iInterfaceQueryLocalInterface : new e1(iBinder);
    }

    @Override // e.c.b.b.c.c.b
    protected final boolean R(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 == 1) {
            e.c.b.b.b.b bVarZzd = zzd();
            parcel2.writeNoException();
            e.c.b.b.c.c.c.e(parcel2, bVarZzd);
        } else {
            if (i2 != 2) {
                return false;
            }
            int iZze = zze();
            parcel2.writeNoException();
            parcel2.writeInt(iZze);
        }
        return true;
    }
}