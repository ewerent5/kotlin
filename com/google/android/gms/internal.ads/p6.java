package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import e.c.b.b.b.b;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public abstract class p6 extends as2 implements q6 {
    public p6() {
        super("com.google.android.gms.ads.internal.formats.client.IMediaContent");
    }

    @Override // com.google.android.gms.internal.ads.as2
    protected final boolean zzbA(int i2, Parcel parcel, Parcel parcel2, int i3) {
        y7 y7Var;
        switch (i2) {
            case 2:
                float fZze = zze();
                parcel2.writeNoException();
                parcel2.writeFloat(fZze);
                return true;
            case 3:
                zzf(b.a.U(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 4:
                e.c.b.b.b.b bVarZzg = zzg();
                parcel2.writeNoException();
                bs2.f(parcel2, bVarZzg);
                return true;
            case 5:
                float fZzh = zzh();
                parcel2.writeNoException();
                parcel2.writeFloat(fZzh);
                return true;
            case 6:
                float fZzi = zzi();
                parcel2.writeNoException();
                parcel2.writeFloat(fZzi);
                return true;
            case 7:
                n1 n1VarZzj = zzj();
                parcel2.writeNoException();
                bs2.f(parcel2, n1VarZzj);
                return true;
            case 8:
                boolean zZzk = zzk();
                parcel2.writeNoException();
                bs2.b(parcel2, zZzk);
                return true;
            case 9:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    y7Var = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnMediaContentChangedListener");
                    y7Var = iInterfaceQueryLocalInterface instanceof y7 ? (y7) iInterfaceQueryLocalInterface : new y7(strongBinder);
                }
                E1(y7Var);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}