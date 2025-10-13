package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import ch.qos.logback.core.net.SyslogConstants;
import e.c.b.b.b.b;
import java.util.List;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public abstract class hg extends as2 implements ig {
    public hg() {
        super("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    public static ig I4(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
        return iInterfaceQueryLocalInterface instanceof ig ? (ig) iInterfaceQueryLocalInterface : new gg(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.as2
    protected final boolean zzbA(int i2, Parcel parcel, Parcel parcel2, int i3) {
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
                parcel2.writeNoException();
                bs2.f(parcel2, null);
                return true;
            case 13:
                e.c.b.b.b.b bVarZzp = zzp();
                parcel2.writeNoException();
                bs2.f(parcel2, bVarZzp);
                return true;
            case 14:
                e.c.b.b.b.b bVarZzq = zzq();
                parcel2.writeNoException();
                bs2.f(parcel2, bVarZzq);
                return true;
            case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
                e.c.b.b.b.b bVarZzr = zzr();
                parcel2.writeNoException();
                bs2.f(parcel2, bVarZzr);
                return true;
            case 16:
                Bundle bundleZzs = zzs();
                parcel2.writeNoException();
                bs2.e(parcel2, bundleZzs);
                return true;
            case 17:
                boolean zZzt = zzt();
                parcel2.writeNoException();
                bs2.b(parcel2, zZzt);
                return true;
            case 18:
                boolean zZzu = zzu();
                parcel2.writeNoException();
                bs2.b(parcel2, zZzu);
                return true;
            case 19:
                zzv();
                parcel2.writeNoException();
                return true;
            case 20:
                B(b.a.U(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 21:
                G0(b.a.U(parcel.readStrongBinder()), b.a.U(parcel.readStrongBinder()), b.a.U(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 22:
                m1(b.a.U(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 23:
                float f2 = f();
                parcel2.writeNoException();
                parcel2.writeFloat(f2);
                return true;
            case SyslogConstants.LOG_DAEMON /* 24 */:
                float fZzA = zzA();
                parcel2.writeNoException();
                parcel2.writeFloat(fZzA);
                return true;
            case 25:
                float fZzB = zzB();
                parcel2.writeNoException();
                parcel2.writeFloat(fZzB);
                return true;
            default:
                return false;
        }
    }
}