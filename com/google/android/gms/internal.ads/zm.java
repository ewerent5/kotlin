package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import e.c.b.b.b.b;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public abstract class zm extends as2 implements an {
    public zm() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    public static an I4(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
        return iInterfaceQueryLocalInterface instanceof an ? (an) iInterfaceQueryLocalInterface : new ym(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.as2
    protected final boolean zzbA(int i2, Parcel parcel, Parcel parcel2, int i3) {
        hn fnVar = null;
        hn fnVar2 = null;
        in inVar = null;
        dn bnVar = null;
        switch (i2) {
            case 1:
                m93 m93Var = (m93) bs2.c(parcel, m93.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    fnVar = iInterfaceQueryLocalInterface instanceof hn ? (hn) iInterfaceQueryLocalInterface : new fn(strongBinder);
                }
                w2(m93Var, fnVar);
                parcel2.writeNoException();
                return true;
            case 2:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
                    bnVar = iInterfaceQueryLocalInterface2 instanceof dn ? (dn) iInterfaceQueryLocalInterface2 : new bn(strongBinder2);
                }
                e3(bnVar);
                parcel2.writeNoException();
                return true;
            case 3:
                boolean zZzi = zzi();
                parcel2.writeNoException();
                bs2.b(parcel2, zZzi);
                return true;
            case 4:
                String strZzj = zzj();
                parcel2.writeNoException();
                parcel2.writeString(strZzj);
                return true;
            case 5:
                k(b.a.U(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 6:
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");
                    inVar = iInterfaceQueryLocalInterface3 instanceof in ? (in) iInterfaceQueryLocalInterface3 : new in(strongBinder3);
                }
                J3(inVar);
                parcel2.writeNoException();
                return true;
            case 7:
                d0((on) bs2.c(parcel, on.CREATOR));
                parcel2.writeNoException();
                return true;
            case 8:
                y3(c1.I4(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 9:
                Bundle bundleZzg = zzg();
                parcel2.writeNoException();
                bs2.e(parcel2, bundleZzg);
                return true;
            case 10:
                o0(b.a.U(parcel.readStrongBinder()), bs2.a(parcel));
                parcel2.writeNoException();
                return true;
            case 11:
                xm xmVarZzl = zzl();
                parcel2.writeNoException();
                bs2.f(parcel2, xmVarZzl);
                return true;
            case 12:
                k1 k1VarZzm = zzm();
                parcel2.writeNoException();
                bs2.f(parcel2, k1VarZzm);
                return true;
            case 13:
                c1(g1.I4(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 14:
                m93 m93Var2 = (m93) bs2.c(parcel, m93.CREATOR);
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    fnVar2 = iInterfaceQueryLocalInterface4 instanceof hn ? (hn) iInterfaceQueryLocalInterface4 : new fn(strongBinder4);
                }
                V2(m93Var2, fnVar2);
                parcel2.writeNoException();
                return true;
            case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
                V(bs2.a(parcel));
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}