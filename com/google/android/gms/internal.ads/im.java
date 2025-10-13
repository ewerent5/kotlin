package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import e.c.b.b.b.b;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public abstract class im extends as2 implements jm {
    public im() {
        super("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
    }

    @Override // com.google.android.gms.internal.ads.as2
    protected final boolean zzbA(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 == 1) {
            P1((nm) bs2.c(parcel, nm.CREATOR));
            parcel2.writeNoException();
        } else if (i2 != 2) {
            mm kmVar = null;
            hm hmVar = null;
            if (i2 == 3) {
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
                    kmVar = iInterfaceQueryLocalInterface instanceof mm ? (mm) iInterfaceQueryLocalInterface : new km(strongBinder);
                }
                n1(kmVar);
                parcel2.writeNoException();
            } else if (i2 != 34) {
                switch (i2) {
                    case 5:
                        boolean zZze = zze();
                        parcel2.writeNoException();
                        bs2.b(parcel2, zZze);
                        break;
                    case 6:
                        zzf();
                        parcel2.writeNoException();
                        break;
                    case 7:
                        zzg();
                        parcel2.writeNoException();
                        break;
                    case 8:
                        zzh();
                        parcel2.writeNoException();
                        break;
                    case 9:
                        m(b.a.U(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        break;
                    case 10:
                        zzj(b.a.U(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        break;
                    case 11:
                        Q(b.a.U(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        break;
                    case 12:
                        String strZzl = zzl();
                        parcel2.writeNoException();
                        parcel2.writeString(strZzl);
                        break;
                    case 13:
                        zzm(parcel.readString());
                        parcel2.writeNoException();
                        break;
                    case 14:
                        S0(z.I4(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        break;
                    case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
                        Bundle bundleA = a();
                        parcel2.writeNoException();
                        bs2.e(parcel2, bundleA);
                        break;
                    case 16:
                        IBinder strongBinder2 = parcel.readStrongBinder();
                        if (strongBinder2 != null) {
                            IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
                            hmVar = iInterfaceQueryLocalInterface2 instanceof hm ? (hm) iInterfaceQueryLocalInterface2 : new hm(strongBinder2);
                        }
                        w4(hmVar);
                        parcel2.writeNoException();
                        break;
                    case 17:
                        parcel.readString();
                        parcel2.writeNoException();
                        break;
                    case 18:
                        a2(b.a.U(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        break;
                    case 19:
                        f4(parcel.readString());
                        parcel2.writeNoException();
                        break;
                    case 20:
                        boolean zZzs = zzs();
                        parcel2.writeNoException();
                        bs2.b(parcel2, zZzs);
                        break;
                    case 21:
                        k1 k1VarZzt = zzt();
                        parcel2.writeNoException();
                        bs2.f(parcel2, k1VarZzt);
                        break;
                    default:
                        return false;
                }
            } else {
                zzr(bs2.a(parcel));
                parcel2.writeNoException();
            }
        } else {
            zzc();
            parcel2.writeNoException();
        }
        return true;
    }
}