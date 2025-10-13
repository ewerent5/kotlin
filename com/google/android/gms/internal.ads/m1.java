package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public abstract class m1 extends as2 implements n1 {
    public m1() {
        super("com.google.android.gms.ads.internal.client.IVideoController");
    }

    public static n1 I4(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
        return iInterfaceQueryLocalInterface instanceof n1 ? (n1) iInterfaceQueryLocalInterface : new l1(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.as2
    protected final boolean zzbA(int i2, Parcel parcel, Parcel parcel2, int i3) {
        q1 o1Var;
        switch (i2) {
            case 1:
                zze();
                parcel2.writeNoException();
                return true;
            case 2:
                zzf();
                parcel2.writeNoException();
                return true;
            case 3:
                zzg(bs2.a(parcel));
                parcel2.writeNoException();
                return true;
            case 4:
                boolean zZzh = zzh();
                parcel2.writeNoException();
                bs2.b(parcel2, zZzh);
                return true;
            case 5:
                int iZzi = zzi();
                parcel2.writeNoException();
                parcel2.writeInt(iZzi);
                return true;
            case 6:
                float fZzj = zzj();
                parcel2.writeNoException();
                parcel2.writeFloat(fZzj);
                return true;
            case 7:
                float fZzk = zzk();
                parcel2.writeNoException();
                parcel2.writeFloat(fZzk);
                return true;
            case 8:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    o1Var = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
                    o1Var = iInterfaceQueryLocalInterface instanceof q1 ? (q1) iInterfaceQueryLocalInterface : new o1(strongBinder);
                }
                R2(o1Var);
                parcel2.writeNoException();
                return true;
            case 9:
                float fZzm = zzm();
                parcel2.writeNoException();
                parcel2.writeFloat(fZzm);
                return true;
            case 10:
                boolean zZzn = zzn();
                parcel2.writeNoException();
                bs2.b(parcel2, zZzn);
                return true;
            case 11:
                q1 q1VarA = a();
                parcel2.writeNoException();
                bs2.f(parcel2, q1VarA);
                return true;
            case 12:
                boolean zZzp = zzp();
                parcel2.writeNoException();
                bs2.b(parcel2, zZzp);
                return true;
            case 13:
                zzq();
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}