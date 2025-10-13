package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import e.c.b.b.b.b;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public abstract class yp extends as2 implements zp {
    public yp() {
        super("com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    public static zp zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
        return iInterfaceQueryLocalInterface instanceof zp ? (zp) iInterfaceQueryLocalInterface : new xp(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.as2
    protected final boolean zzbA(int i2, Parcel parcel, Parcel parcel2, int i3) {
        wp upVar = null;
        switch (i2) {
            case 1:
                e.c.b.b.b.b bVarU = b.a.U(parcel.readStrongBinder());
                dq dqVar = (dq) bs2.c(parcel, dq.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalCallback");
                    upVar = iInterfaceQueryLocalInterface instanceof wp ? (wp) iInterfaceQueryLocalInterface : new up(strongBinder);
                }
                zze(bVarU, dqVar, upVar);
                parcel2.writeNoException();
                return true;
            case 2:
                zzf(b.a.U(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 3:
                b.a.U(parcel.readStrongBinder());
                b.a.U(parcel.readStrongBinder());
                parcel2.writeNoException();
                bs2.f(parcel2, null);
                return true;
            case 4:
                b.a.U(parcel.readStrongBinder());
                parcel2.writeNoException();
                bs2.f(parcel2, null);
                return true;
            case 5:
                zzg(parcel.createTypedArrayList(Uri.CREATOR), b.a.U(parcel.readStrongBinder()), jk.I4(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 6:
                zzh(parcel.createTypedArrayList(Uri.CREATOR), b.a.U(parcel.readStrongBinder()), jk.I4(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 7:
                zzi((sk) bs2.c(parcel, sk.CREATOR));
                parcel2.writeNoException();
                return true;
            case 8:
                zzj(b.a.U(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}