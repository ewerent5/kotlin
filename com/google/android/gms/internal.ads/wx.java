package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import e.c.b.b.b.b;
import java.util.List;
import java.util.Map;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public abstract class wx extends as2 implements xx {
    public wx() {
        super("com.google.android.gms.ads.measurement.IAppMeasurementProxy");
    }

    @Override // com.google.android.gms.internal.ads.as2
    protected final boolean zzbA(int i2, Parcel parcel, Parcel parcel2, int i3) {
        switch (i2) {
            case 1:
                Y2((Bundle) bs2.c(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 2:
                Bundle bundleQ2 = q2((Bundle) bs2.c(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                bs2.e(parcel2, bundleQ2);
                return true;
            case 3:
                E(parcel.readString(), parcel.readString(), (Bundle) bs2.c(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 4:
                f1(parcel.readString(), parcel.readString(), b.a.U(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 5:
                Map mapN3 = n3(parcel.readString(), parcel.readString(), bs2.a(parcel));
                parcel2.writeNoException();
                parcel2.writeMap(mapN3);
                return true;
            case 6:
                int iU = u(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(iU);
                return true;
            case 7:
                zzh((Bundle) bs2.c(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 8:
                D1(parcel.readString(), parcel.readString(), (Bundle) bs2.c(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 9:
                List listM2 = M2(parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeList(listM2);
                return true;
            case 10:
                String strZzk = zzk();
                parcel2.writeNoException();
                parcel2.writeString(strZzk);
                return true;
            case 11:
                String strZzl = zzl();
                parcel2.writeNoException();
                parcel2.writeString(strZzl);
                return true;
            case 12:
                long jZzm = zzm();
                parcel2.writeNoException();
                parcel2.writeLong(jZzm);
                return true;
            case 13:
                J(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 14:
                S(parcel.readString());
                parcel2.writeNoException();
                return true;
            case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
                z1(b.a.U(parcel.readStrongBinder()), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 16:
                String strZzr = zzr();
                parcel2.writeNoException();
                parcel2.writeString(strZzr);
                return true;
            case 17:
                String strZzs = zzs();
                parcel2.writeNoException();
                parcel2.writeString(strZzs);
                return true;
            case 18:
                String strZzt = zzt();
                parcel2.writeNoException();
                parcel2.writeString(strZzt);
                return true;
            case 19:
                D((Bundle) bs2.c(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}