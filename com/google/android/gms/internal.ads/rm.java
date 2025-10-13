package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import e.c.b.b.b.b;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public abstract class rm extends as2 implements sm {
    public rm() {
        super("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    public static sm I4(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
        return iInterfaceQueryLocalInterface instanceof sm ? (sm) iInterfaceQueryLocalInterface : new qm(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.as2
    protected final boolean zzbA(int i2, Parcel parcel, Parcel parcel2, int i3) {
        switch (i2) {
            case 1:
                i(b.a.U(parcel.readStrongBinder()));
                break;
            case 2:
                M(b.a.U(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 3:
                zzg(b.a.U(parcel.readStrongBinder()));
                break;
            case 4:
                H(b.a.U(parcel.readStrongBinder()));
                break;
            case 5:
                m(b.a.U(parcel.readStrongBinder()));
                break;
            case 6:
                zzj(b.a.U(parcel.readStrongBinder()));
                break;
            case 7:
                j0(b.a.U(parcel.readStrongBinder()), (tm) bs2.c(parcel, tm.CREATOR));
                break;
            case 8:
                t4(b.a.U(parcel.readStrongBinder()));
                break;
            case 9:
                w1(b.a.U(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 10:
                zzn(b.a.U(parcel.readStrongBinder()));
                break;
            case 11:
                C0(b.a.U(parcel.readStrongBinder()));
                break;
            case 12:
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}