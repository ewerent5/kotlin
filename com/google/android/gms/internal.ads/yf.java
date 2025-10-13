package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import ch.qos.logback.core.net.SyslogConstants;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public abstract class yf extends as2 implements zf {
    public yf() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    public static zf I4(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
        return iInterfaceQueryLocalInterface instanceof zf ? (zf) iInterfaceQueryLocalInterface : new xf(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.as2
    protected final boolean zzbA(int i2, Parcel parcel, Parcel parcel2, int i3) {
        switch (i2) {
            case 1:
                zze();
                break;
            case 2:
                zzf();
                break;
            case 3:
                W(parcel.readInt());
                break;
            case 4:
                zzh();
                break;
            case 5:
                zzi();
                break;
            case 6:
                zzj();
                break;
            case 7:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata");
                    if (!(iInterfaceQueryLocalInterface instanceof dg)) {
                        new dg(strongBinder);
                        break;
                    } else {
                        break;
                    }
                }
                break;
            case 8:
                zzk();
                break;
            case 9:
                S3(parcel.readString(), parcel.readString());
                break;
            case 10:
                i7.I4(parcel.readStrongBinder());
                parcel.readString();
                break;
            case 11:
                zzn();
                break;
            case 12:
                parcel.readString();
                break;
            case 13:
                a();
                break;
            case 14:
                w3((tm) bs2.c(parcel, tm.CREATOR));
                break;
            case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
                zzq();
                break;
            case 16:
                A4(wm.I4(parcel.readStrongBinder()));
                break;
            case 17:
                g1(parcel.readInt());
                break;
            case 18:
                zzt();
                break;
            case 19:
                break;
            case 20:
                zzu();
                break;
            case 21:
                o1(parcel.readString());
                break;
            case 22:
                D4(parcel.readInt(), parcel.readString());
                break;
            case 23:
                v0((g93) bs2.c(parcel, g93.CREATOR));
                break;
            case SyslogConstants.LOG_DAEMON /* 24 */:
                Y1((g93) bs2.c(parcel, g93.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}