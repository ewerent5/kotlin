package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import e.c.b.b.b.b;
import java.util.List;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public abstract class n0 extends as2 implements o0 {
    public n0() {
        super("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    @Override // com.google.android.gms.internal.ads.as2
    protected final boolean zzbA(int i2, Parcel parcel, Parcel parcel2, int i3) {
        a1 y0Var;
        switch (i2) {
            case 1:
                zze();
                parcel2.writeNoException();
                return true;
            case 2:
                V0(parcel.readFloat());
                parcel2.writeNoException();
                return true;
            case 3:
                u(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 4:
                P(bs2.a(parcel));
                parcel2.writeNoException();
                return true;
            case 5:
                U0(b.a.U(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 6:
                Z0(parcel.readString(), b.a.U(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 7:
                float fZzk = zzk();
                parcel2.writeNoException();
                parcel2.writeFloat(fZzk);
                return true;
            case 8:
                boolean zZzl = zzl();
                parcel2.writeNoException();
                bs2.b(parcel2, zZzl);
                return true;
            case 9:
                String strZzm = zzm();
                parcel2.writeNoException();
                parcel2.writeString(strZzm);
                return true;
            case 10:
                J(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 11:
                L2(sf.I4(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 12:
                D0(dc.I4(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 13:
                List<xb> listZzq = zzq();
                parcel2.writeNoException();
                parcel2.writeTypedList(listZzq);
                return true;
            case 14:
                F1((x2) bs2.c(parcel, x2.CREATOR));
                parcel2.writeNoException();
                return true;
            case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
                zzs();
                parcel2.writeNoException();
                return true;
            case 16:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    y0Var = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener");
                    y0Var = iInterfaceQueryLocalInterface instanceof a1 ? (a1) iInterfaceQueryLocalInterface : new y0(strongBinder);
                }
                k4(y0Var);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}