package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import ch.qos.logback.core.net.SyslogConstants;
import java.util.List;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public abstract class n8 extends as2 implements o8 {
    public n8() {
        super("com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    @Override // com.google.android.gms.internal.ads.as2
    protected final boolean zzbA(int i2, Parcel parcel, Parcel parcel2, int i3) {
        l8 i8Var;
        switch (i2) {
            case 2:
                String strZze = zze();
                parcel2.writeNoException();
                parcel2.writeString(strZze);
                return true;
            case 3:
                List listZzf = zzf();
                parcel2.writeNoException();
                parcel2.writeList(listZzf);
                return true;
            case 4:
                String strZzg = zzg();
                parcel2.writeNoException();
                parcel2.writeString(strZzg);
                return true;
            case 5:
                t6 t6VarZzh = zzh();
                parcel2.writeNoException();
                bs2.f(parcel2, t6VarZzh);
                return true;
            case 6:
                String strZzi = zzi();
                parcel2.writeNoException();
                parcel2.writeString(strZzi);
                return true;
            case 7:
                String strZzj = zzj();
                parcel2.writeNoException();
                parcel2.writeString(strZzj);
                return true;
            case 8:
                double dZzk = zzk();
                parcel2.writeNoException();
                parcel2.writeDouble(dZzk);
                return true;
            case 9:
                String strZzl = zzl();
                parcel2.writeNoException();
                parcel2.writeString(strZzl);
                return true;
            case 10:
                String strZzm = zzm();
                parcel2.writeNoException();
                parcel2.writeString(strZzm);
                return true;
            case 11:
                n1 n1VarZzn = zzn();
                parcel2.writeNoException();
                bs2.f(parcel2, n1VarZzn);
                return true;
            case 12:
                String strA = a();
                parcel2.writeNoException();
                parcel2.writeString(strA);
                return true;
            case 13:
                zzp();
                parcel2.writeNoException();
                return true;
            case 14:
                l6 l6VarZzq = zzq();
                parcel2.writeNoException();
                bs2.f(parcel2, l6VarZzq);
                return true;
            case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
                G3((Bundle) bs2.c(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 16:
                boolean zT2 = T2((Bundle) bs2.c(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                bs2.b(parcel2, zT2);
                return true;
            case 17:
                l2((Bundle) bs2.c(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 18:
                e.c.b.b.b.b bVarZzu = zzu();
                parcel2.writeNoException();
                bs2.f(parcel2, bVarZzu);
                return true;
            case 19:
                e.c.b.b.b.b bVarZzv = zzv();
                parcel2.writeNoException();
                bs2.f(parcel2, bVarZzv);
                return true;
            case 20:
                Bundle bundleZzw = zzw();
                parcel2.writeNoException();
                bs2.e(parcel2, bundleZzw);
                return true;
            case 21:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    i8Var = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
                    i8Var = iInterfaceQueryLocalInterface instanceof l8 ? (l8) iInterfaceQueryLocalInterface : new i8(strongBinder);
                }
                q0(i8Var);
                parcel2.writeNoException();
                return true;
            case 22:
                zzy();
                parcel2.writeNoException();
                return true;
            case 23:
                List listF = f();
                parcel2.writeNoException();
                parcel2.writeList(listF);
                return true;
            case SyslogConstants.LOG_DAEMON /* 24 */:
                boolean zZzA = zzA();
                parcel2.writeNoException();
                bs2.b(parcel2, zZzA);
                return true;
            case 25:
                A1(v0.I4(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 26:
                u3(r0.I4(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 27:
                zzD();
                parcel2.writeNoException();
                return true;
            case 28:
                zzE();
                parcel2.writeNoException();
                return true;
            case 29:
                q6 q6VarZzF = zzF();
                parcel2.writeNoException();
                bs2.f(parcel2, q6VarZzF);
                return true;
            case 30:
                boolean zQ = q();
                parcel2.writeNoException();
                bs2.b(parcel2, zQ);
                return true;
            case 31:
                k1 k1VarN = n();
                parcel2.writeNoException();
                bs2.f(parcel2, k1VarN);
                return true;
            case 32:
                g3(g1.I4(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}