package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public abstract class r extends as2 implements s {
    public r() {
        super("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // com.google.android.gms.internal.ads.as2
    protected final boolean zzbA(int i2, Parcel parcel, Parcel parcel2, int i3) {
        j hVar = null;
        i0 i0Var = null;
        switch (i2) {
            case 1:
                p pVarZze = zze();
                parcel2.writeNoException();
                bs2.f(parcel2, pVarZze);
                return true;
            case 2:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    hVar = iInterfaceQueryLocalInterface instanceof j ? (j) iInterfaceQueryLocalInterface : new h(strongBinder);
                }
                b0(hVar);
                parcel2.writeNoException();
                return true;
            case 3:
                F0(n7.I4(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 4:
                X3(q7.I4(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 5:
                G4(parcel.readString(), w7.I4(parcel.readStrongBinder()), t7.I4(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 6:
                V3((g6) bs2.c(parcel, g6.CREATOR));
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    i0Var = iInterfaceQueryLocalInterface2 instanceof i0 ? (i0) iInterfaceQueryLocalInterface2 : new i0(strongBinder2);
                }
                k2(i0Var);
                parcel2.writeNoException();
                return true;
            case 8:
                p1(a8.I4(parcel.readStrongBinder()), (r93) bs2.c(parcel, r93.CREATOR));
                parcel2.writeNoException();
                return true;
            case 9:
                b2((PublisherAdViewOptions) bs2.c(parcel, PublisherAdViewOptions.CREATOR));
                parcel2.writeNoException();
                return true;
            case 10:
                B3(d8.I4(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 11:
            case 12:
            default:
                return false;
            case 13:
                K3((jc) bs2.c(parcel, jc.CREATOR));
                parcel2.writeNoException();
                return true;
            case 14:
                g0(sc.I4(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
                x1((AdManagerAdViewOptions) bs2.c(parcel, AdManagerAdViewOptions.CREATOR));
                parcel2.writeNoException();
                return true;
        }
    }
}