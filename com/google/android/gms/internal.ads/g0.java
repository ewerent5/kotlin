package com.google.android.gms.internal.ads;

import android.os.Parcel;
import e.c.b.b.b.b;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public abstract class g0 extends as2 implements h0 {
    public g0() {
        super("com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // com.google.android.gms.internal.ads.as2
    protected final boolean zzbA(int i2, Parcel parcel, Parcel parcel2, int i3) {
        switch (i2) {
            case 1:
                w wVarZzb = zzb(b.a.U(parcel.readStrongBinder()), (r93) bs2.c(parcel, r93.CREATOR), parcel.readString(), sf.I4(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                bs2.f(parcel2, wVarZzb);
                return true;
            case 2:
                w wVarZzc = zzc(b.a.U(parcel.readStrongBinder()), (r93) bs2.c(parcel, r93.CREATOR), parcel.readString(), sf.I4(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                bs2.f(parcel2, wVarZzc);
                return true;
            case 3:
                s sVarZzd = zzd(b.a.U(parcel.readStrongBinder()), parcel.readString(), sf.I4(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                bs2.f(parcel2, sVarZzd);
                return true;
            case 4:
                b.a.U(parcel.readStrongBinder());
                parcel2.writeNoException();
                bs2.f(parcel2, null);
                return true;
            case 5:
                x6 x6VarZze = zze(b.a.U(parcel.readStrongBinder()), b.a.U(parcel.readStrongBinder()));
                parcel2.writeNoException();
                bs2.f(parcel2, x6VarZze);
                return true;
            case 6:
                jm jmVarZzf = zzf(b.a.U(parcel.readStrongBinder()), sf.I4(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                bs2.f(parcel2, jmVarZzf);
                return true;
            case 7:
                b.a.U(parcel.readStrongBinder());
                parcel2.writeNoException();
                bs2.f(parcel2, null);
                return true;
            case 8:
                xj xjVarZzg = zzg(b.a.U(parcel.readStrongBinder()));
                parcel2.writeNoException();
                bs2.f(parcel2, xjVarZzg);
                return true;
            case 9:
                o0 o0VarZzh = zzh(b.a.U(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                bs2.f(parcel2, o0VarZzh);
                return true;
            case 10:
                w wVarZzi = zzi(b.a.U(parcel.readStrongBinder()), (r93) bs2.c(parcel, r93.CREATOR), parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                bs2.f(parcel2, wVarZzi);
                return true;
            case 11:
                b7 b7VarZzj = zzj(b.a.U(parcel.readStrongBinder()), b.a.U(parcel.readStrongBinder()), b.a.U(parcel.readStrongBinder()));
                parcel2.writeNoException();
                bs2.f(parcel2, b7VarZzj);
                return true;
            case 12:
                an anVarZzk = zzk(b.a.U(parcel.readStrongBinder()), parcel.readString(), sf.I4(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                bs2.f(parcel2, anVarZzk);
                return true;
            case 13:
                w wVarZzl = zzl(b.a.U(parcel.readStrongBinder()), (r93) bs2.c(parcel, r93.CREATOR), parcel.readString(), sf.I4(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                bs2.f(parcel2, wVarZzl);
                return true;
            case 14:
                zp zpVarZzm = zzm(b.a.U(parcel.readStrongBinder()), sf.I4(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                bs2.f(parcel2, zpVarZzm);
                return true;
            case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
                kj kjVarZzn = zzn(b.a.U(parcel.readStrongBinder()), sf.I4(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                bs2.f(parcel2, kjVarZzn);
                return true;
            case 16:
                ab abVarZzo = zzo(b.a.U(parcel.readStrongBinder()), sf.I4(parcel.readStrongBinder()), parcel.readInt(), wa.I4(parcel.readStrongBinder()));
                parcel2.writeNoException();
                bs2.f(parcel2, abVarZzo);
                return true;
            default:
                return false;
        }
    }
}