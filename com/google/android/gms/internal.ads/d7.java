package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import java.util.List;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public abstract class d7 extends as2 implements e7 {
    public d7() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
    }

    @Override // com.google.android.gms.internal.ads.as2
    protected final boolean zzbA(int i2, Parcel parcel, Parcel parcel2, int i3) {
        switch (i2) {
            case 2:
                e.c.b.b.b.b bVarZzb = zzb();
                parcel2.writeNoException();
                bs2.f(parcel2, bVarZzb);
                return true;
            case 3:
                String strZzc = zzc();
                parcel2.writeNoException();
                parcel2.writeString(strZzc);
                return true;
            case 4:
                List listZzd = zzd();
                parcel2.writeNoException();
                parcel2.writeList(listZzd);
                return true;
            case 5:
                String strZze = zze();
                parcel2.writeNoException();
                parcel2.writeString(strZze);
                return true;
            case 6:
                t6 t6VarZzf = zzf();
                parcel2.writeNoException();
                bs2.f(parcel2, t6VarZzf);
                return true;
            case 7:
                String strZzg = zzg();
                parcel2.writeNoException();
                parcel2.writeString(strZzg);
                return true;
            case 8:
                double dZzh = zzh();
                parcel2.writeNoException();
                parcel2.writeDouble(dZzh);
                return true;
            case 9:
                String strZzi = zzi();
                parcel2.writeNoException();
                parcel2.writeString(strZzi);
                return true;
            case 10:
                String strZzj = zzj();
                parcel2.writeNoException();
                parcel2.writeString(strZzj);
                return true;
            case 11:
                Bundle bundleZzk = zzk();
                parcel2.writeNoException();
                bs2.e(parcel2, bundleZzk);
                return true;
            case 12:
                zzl();
                parcel2.writeNoException();
                return true;
            case 13:
                n1 n1VarZzm = zzm();
                parcel2.writeNoException();
                bs2.f(parcel2, n1VarZzm);
                return true;
            case 14:
                K((Bundle) bs2.c(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
                boolean zZzo = zzo((Bundle) bs2.c(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                bs2.b(parcel2, zZzo);
                return true;
            case 16:
                D((Bundle) bs2.c(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 17:
                l6 l6VarZzq = zzq();
                parcel2.writeNoException();
                bs2.f(parcel2, l6VarZzq);
                return true;
            case 18:
                e.c.b.b.b.b bVarZzr = zzr();
                parcel2.writeNoException();
                bs2.f(parcel2, bVarZzr);
                return true;
            case 19:
                String strZzs = zzs();
                parcel2.writeNoException();
                parcel2.writeString(strZzs);
                return true;
            default:
                return false;
        }
    }
}