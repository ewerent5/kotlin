package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import java.util.List;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public abstract class f7 extends as2 implements g7 {
    public f7() {
        super("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
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
                String strZzh = zzh();
                parcel2.writeNoException();
                parcel2.writeString(strZzh);
                return true;
            case 9:
                Bundle bundleZzi = zzi();
                parcel2.writeNoException();
                bs2.e(parcel2, bundleZzi);
                return true;
            case 10:
                zzj();
                parcel2.writeNoException();
                return true;
            case 11:
                n1 n1VarZzk = zzk();
                parcel2.writeNoException();
                bs2.f(parcel2, n1VarZzk);
                return true;
            case 12:
                C2((Bundle) bs2.c(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 13:
                boolean zH2 = h2((Bundle) bs2.c(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                bs2.b(parcel2, zH2);
                return true;
            case 14:
                K((Bundle) bs2.c(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
                l6 l6VarA = a();
                parcel2.writeNoException();
                bs2.f(parcel2, l6VarA);
                return true;
            case 16:
                e.c.b.b.b.b bVarZzp = zzp();
                parcel2.writeNoException();
                bs2.f(parcel2, bVarZzp);
                return true;
            case 17:
                String strZzq = zzq();
                parcel2.writeNoException();
                parcel2.writeString(strZzq);
                return true;
            default:
                return false;
        }
    }
}