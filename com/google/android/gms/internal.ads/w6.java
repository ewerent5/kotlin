package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import e.c.b.b.b.b;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public abstract class w6 extends as2 implements x6 {
    public w6() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    public static x6 I4(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
        return iInterfaceQueryLocalInterface instanceof x6 ? (x6) iInterfaceQueryLocalInterface : new v6(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.as2
    protected final boolean zzbA(int i2, Parcel parcel, Parcel parcel2, int i3) {
        q6 o6Var;
        switch (i2) {
            case 1:
                r1(parcel.readString(), b.a.U(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 2:
                e.c.b.b.b.b bVarD = d(parcel.readString());
                parcel2.writeNoException();
                bs2.f(parcel2, bVarD);
                return true;
            case 3:
                v(b.a.U(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 4:
                zze();
                parcel2.writeNoException();
                return true;
            case 5:
                b.a.U(parcel.readStrongBinder());
                parcel.readInt();
                parcel2.writeNoException();
                return true;
            case 6:
                zzg(b.a.U(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 7:
                P2(b.a.U(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    o6Var = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
                    o6Var = iInterfaceQueryLocalInterface instanceof q6 ? (q6) iInterfaceQueryLocalInterface : new o6(strongBinder);
                }
                K0(o6Var);
                parcel2.writeNoException();
                return true;
            case 9:
                H4(b.a.U(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}