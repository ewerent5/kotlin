package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import e.c.b.b.b.b;
import java.util.List;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public abstract class i7 extends as2 implements k7 {
    public i7() {
        super("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    public static k7 I4(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
        return iInterfaceQueryLocalInterface instanceof k7 ? (k7) iInterfaceQueryLocalInterface : new h7(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.as2
    protected final boolean zzbA(int i2, Parcel parcel, Parcel parcel2, int i3) {
        switch (i2) {
            case 1:
                String strZze = zze(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeString(strZze);
                return true;
            case 2:
                t6 t6VarB = b(parcel.readString());
                parcel2.writeNoException();
                bs2.f(parcel2, t6VarB);
                return true;
            case 3:
                List<String> listZzg = zzg();
                parcel2.writeNoException();
                parcel2.writeStringList(listZzg);
                return true;
            case 4:
                String strZzh = zzh();
                parcel2.writeNoException();
                parcel2.writeString(strZzh);
                return true;
            case 5:
                zzi(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 6:
                zzj();
                parcel2.writeNoException();
                return true;
            case 7:
                n1 n1VarZzk = zzk();
                parcel2.writeNoException();
                bs2.f(parcel2, n1VarZzk);
                return true;
            case 8:
                zzl();
                parcel2.writeNoException();
                return true;
            case 9:
                e.c.b.b.b.b bVarZzm = zzm();
                parcel2.writeNoException();
                bs2.f(parcel2, bVarZzm);
                return true;
            case 10:
                boolean zZzn = zzn(b.a.U(parcel.readStrongBinder()));
                parcel2.writeNoException();
                bs2.b(parcel2, zZzn);
                return true;
            case 11:
                parcel2.writeNoException();
                bs2.f(parcel2, null);
                return true;
            case 12:
                boolean zA = a();
                parcel2.writeNoException();
                bs2.b(parcel2, zA);
                return true;
            case 13:
                boolean zZzp = zzp();
                parcel2.writeNoException();
                bs2.b(parcel2, zZzp);
                return true;
            case 14:
                y1(b.a.U(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
                zzr();
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}