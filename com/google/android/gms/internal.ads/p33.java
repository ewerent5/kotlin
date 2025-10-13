package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import e.c.b.b.b.b;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public abstract class p33 extends as2 implements q33 {
    public p33() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    @Override // com.google.android.gms.internal.ads.as2
    protected final boolean zzbA(int i2, Parcel parcel, Parcel parcel2, int i3) {
        u33 u33Var = null;
        x33 v33Var = null;
        switch (i2) {
            case 2:
                w wVarZze = zze();
                parcel2.writeNoException();
                bs2.f(parcel2, wVarZze);
                return true;
            case 3:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdPresentationCallback");
                    u33Var = iInterfaceQueryLocalInterface instanceof u33 ? (u33) iInterfaceQueryLocalInterface : new u33(strongBinder);
                }
                q3(u33Var);
                parcel2.writeNoException();
                return true;
            case 4:
                e.c.b.b.b.b bVarU = b.a.U(parcel.readStrongBinder());
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
                    v33Var = iInterfaceQueryLocalInterface2 instanceof x33 ? (x33) iInterfaceQueryLocalInterface2 : new v33(strongBinder2);
                }
                H2(bVarU, v33Var);
                parcel2.writeNoException();
                return true;
            case 5:
                k1 k1VarZzg = zzg();
                parcel2.writeNoException();
                bs2.f(parcel2, k1VarZzg);
                return true;
            case 6:
                P(bs2.a(parcel));
                parcel2.writeNoException();
                return true;
            case 7:
                j4(g1.I4(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}