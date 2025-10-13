package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import ch.qos.logback.core.net.SyslogConstants;
import e.c.b.b.b.b;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public abstract class v extends as2 implements w {
    public v() {
        super("com.google.android.gms.ads.internal.client.IAdManager");
    }

    public static w zzac(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
        return iInterfaceQueryLocalInterface instanceof w ? (w) iInterfaceQueryLocalInterface : new u(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.as2
    protected final boolean zzbA(int i2, Parcel parcel, Parcel parcel2, int i3) {
        j hVar = null;
        l0 j0Var = null;
        m kVar = null;
        h1 f1Var = null;
        a0 yVar = null;
        i0 i0Var = null;
        g eVar = null;
        e0 b0Var = null;
        switch (i2) {
            case 1:
                e.c.b.b.b.b bVarZzb = zzb();
                parcel2.writeNoException();
                bs2.f(parcel2, bVarZzb);
                return true;
            case 2:
                zzc();
                parcel2.writeNoException();
                return true;
            case 3:
                boolean zZzbI = zzbI();
                parcel2.writeNoException();
                bs2.b(parcel2, zZzbI);
                return true;
            case 4:
                boolean zZze = zze((m93) bs2.c(parcel, m93.CREATOR));
                parcel2.writeNoException();
                bs2.b(parcel2, zZze);
                return true;
            case 5:
                zzf();
                parcel2.writeNoException();
                return true;
            case 6:
                zzg();
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    hVar = iInterfaceQueryLocalInterface instanceof j ? (j) iInterfaceQueryLocalInterface : new h(strongBinder);
                }
                zzh(hVar);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
                    b0Var = iInterfaceQueryLocalInterface2 instanceof e0 ? (e0) iInterfaceQueryLocalInterface2 : new b0(strongBinder2);
                }
                zzi(b0Var);
                parcel2.writeNoException();
                return true;
            case 9:
                zzl();
                parcel2.writeNoException();
                return true;
            case 10:
                parcel2.writeNoException();
                return true;
            case 11:
                zzm();
                parcel2.writeNoException();
                return true;
            case 12:
                r93 r93VarZzn = zzn();
                parcel2.writeNoException();
                bs2.e(parcel2, r93VarZzn);
                return true;
            case 13:
                zzo((r93) bs2.c(parcel, r93.CREATOR));
                parcel2.writeNoException();
                return true;
            case 14:
                zzp(dk.I4(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
                zzq(gk.I4(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 16:
            case 17:
            case 27:
            case 28:
            default:
                return false;
            case 18:
                String strZzr = zzr();
                parcel2.writeNoException();
                parcel2.writeString(strZzr);
                return true;
            case 19:
                zzx(r4.I4(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 20:
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdClickListener");
                    eVar = iInterfaceQueryLocalInterface3 instanceof g ? (g) iInterfaceQueryLocalInterface3 : new e(strongBinder3);
                }
                zzy(eVar);
                parcel2.writeNoException();
                return true;
            case 21:
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    i0Var = iInterfaceQueryLocalInterface4 instanceof i0 ? (i0) iInterfaceQueryLocalInterface4 : new i0(strongBinder4);
                }
                zzab(i0Var);
                parcel2.writeNoException();
                return true;
            case 22:
                zzz(bs2.a(parcel));
                parcel2.writeNoException();
                return true;
            case 23:
                boolean zZzA = zzA();
                parcel2.writeNoException();
                bs2.b(parcel2, zZzA);
                return true;
            case SyslogConstants.LOG_DAEMON /* 24 */:
                zzB(lm.I4(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 25:
                zzC(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 26:
                n1 n1VarZzE = zzE();
                parcel2.writeNoException();
                bs2.f(parcel2, n1VarZzE);
                return true;
            case 29:
                zzF((d3) bs2.c(parcel, d3.CREATOR));
                parcel2.writeNoException();
                return true;
            case 30:
                zzG((r1) bs2.c(parcel, r1.CREATOR));
                parcel2.writeNoException();
                return true;
            case 31:
                String strZzu = zzu();
                parcel2.writeNoException();
                parcel2.writeString(strZzu);
                return true;
            case 32:
                e0 e0VarZzv = zzv();
                parcel2.writeNoException();
                bs2.f(parcel2, e0VarZzv);
                return true;
            case 33:
                j jVarZzw = zzw();
                parcel2.writeNoException();
                bs2.f(parcel2, jVarZzw);
                return true;
            case 34:
                zzJ(bs2.a(parcel));
                parcel2.writeNoException();
                return true;
            case 35:
                String strZzs = zzs();
                parcel2.writeNoException();
                parcel2.writeString(strZzs);
                return true;
            case 36:
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
                    yVar = iInterfaceQueryLocalInterface5 instanceof a0 ? (a0) iInterfaceQueryLocalInterface5 : new y(strongBinder5);
                }
                zzj(yVar);
                parcel2.writeNoException();
                return true;
            case 37:
                Bundle bundleZzk = zzk();
                parcel2.writeNoException();
                bs2.e(parcel2, bundleZzk);
                return true;
            case 38:
                zzD(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 39:
                zzH((y93) bs2.c(parcel, y93.CREATOR));
                parcel2.writeNoException();
                return true;
            case 40:
                zzI(s33.I4(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 41:
                k1 k1VarZzt = zzt();
                parcel2.writeNoException();
                bs2.f(parcel2, k1VarZzt);
                return true;
            case 42:
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
                    f1Var = iInterfaceQueryLocalInterface6 instanceof h1 ? (h1) iInterfaceQueryLocalInterface6 : new f1(strongBinder6);
                }
                zzO(f1Var);
                parcel2.writeNoException();
                return true;
            case 43:
                m93 m93Var = (m93) bs2.c(parcel, m93.CREATOR);
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoadCallback");
                    kVar = iInterfaceQueryLocalInterface7 instanceof m ? (m) iInterfaceQueryLocalInterface7 : new k(strongBinder7);
                }
                zzP(m93Var, kVar);
                parcel2.writeNoException();
                return true;
            case 44:
                zzQ(b.a.U(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 45:
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
                    j0Var = iInterfaceQueryLocalInterface8 instanceof l0 ? (l0) iInterfaceQueryLocalInterface8 : new j0(strongBinder8);
                }
                zzR(j0Var);
                parcel2.writeNoException();
                return true;
        }
    }
}