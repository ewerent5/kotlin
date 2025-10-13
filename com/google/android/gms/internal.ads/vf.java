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
public abstract class vf extends as2 implements wf {
    public vf() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    @Override // com.google.android.gms.internal.ads.as2
    protected final boolean zzbA(int i2, Parcel parcel, Parcel parcel2, int i3) {
        zf xfVar = null;
        switch (i2) {
            case 1:
                e.c.b.b.b.b bVarU = b.a.U(parcel.readStrongBinder());
                r93 r93Var = (r93) bs2.c(parcel, r93.CREATOR);
                m93 m93Var = (m93) bs2.c(parcel, m93.CREATOR);
                String string = parcel.readString();
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    xfVar = iInterfaceQueryLocalInterface instanceof zf ? (zf) iInterfaceQueryLocalInterface : new xf(strongBinder);
                }
                B2(bVarU, r93Var, m93Var, string, xfVar);
                parcel2.writeNoException();
                return true;
            case 2:
                e.c.b.b.b.b bVarZzf = zzf();
                parcel2.writeNoException();
                bs2.f(parcel2, bVarZzf);
                return true;
            case 3:
                e.c.b.b.b.b bVarU2 = b.a.U(parcel.readStrongBinder());
                m93 m93Var2 = (m93) bs2.c(parcel, m93.CREATOR);
                String string2 = parcel.readString();
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    xfVar = iInterfaceQueryLocalInterface2 instanceof zf ? (zf) iInterfaceQueryLocalInterface2 : new xf(strongBinder2);
                }
                i0(bVarU2, m93Var2, string2, xfVar);
                parcel2.writeNoException();
                return true;
            case 4:
                zzh();
                parcel2.writeNoException();
                return true;
            case 5:
                zzi();
                parcel2.writeNoException();
                return true;
            case 6:
                e.c.b.b.b.b bVarU3 = b.a.U(parcel.readStrongBinder());
                r93 r93Var2 = (r93) bs2.c(parcel, r93.CREATOR);
                m93 m93Var3 = (m93) bs2.c(parcel, m93.CREATOR);
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    xfVar = iInterfaceQueryLocalInterface3 instanceof zf ? (zf) iInterfaceQueryLocalInterface3 : new xf(strongBinder3);
                }
                K2(bVarU3, r93Var2, m93Var3, string3, string4, xfVar);
                parcel2.writeNoException();
                return true;
            case 7:
                e.c.b.b.b.b bVarU4 = b.a.U(parcel.readStrongBinder());
                m93 m93Var4 = (m93) bs2.c(parcel, m93.CREATOR);
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    xfVar = iInterfaceQueryLocalInterface4 instanceof zf ? (zf) iInterfaceQueryLocalInterface4 : new xf(strongBinder4);
                }
                r0(bVarU4, m93Var4, string5, string6, xfVar);
                parcel2.writeNoException();
                return true;
            case 8:
                zzl();
                parcel2.writeNoException();
                return true;
            case 9:
                zzm();
                parcel2.writeNoException();
                return true;
            case 10:
                R1(b.a.U(parcel.readStrongBinder()), (m93) bs2.c(parcel, m93.CREATOR), parcel.readString(), rm.I4(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 11:
                F4((m93) bs2.c(parcel, m93.CREATOR), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 12:
                zzp();
                parcel2.writeNoException();
                return true;
            case 13:
                boolean zZzq = zzq();
                parcel2.writeNoException();
                bs2.b(parcel2, zZzq);
                return true;
            case 14:
                e.c.b.b.b.b bVarU5 = b.a.U(parcel.readStrongBinder());
                m93 m93Var5 = (m93) bs2.c(parcel, m93.CREATOR);
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    xfVar = iInterfaceQueryLocalInterface5 instanceof zf ? (zf) iInterfaceQueryLocalInterface5 : new xf(strongBinder5);
                }
                X0(bVarU5, m93Var5, string7, string8, xfVar, (g6) bs2.c(parcel, g6.CREATOR), parcel.createStringArrayList());
                parcel2.writeNoException();
                return true;
            case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
                parcel2.writeNoException();
                bs2.f(parcel2, null);
                return true;
            case 16:
                parcel2.writeNoException();
                bs2.f(parcel2, null);
                return true;
            case 17:
                Bundle bundleZzs = zzs();
                parcel2.writeNoException();
                bs2.e(parcel2, bundleZzs);
                return true;
            case 18:
                Bundle bundleZzt = zzt();
                parcel2.writeNoException();
                bs2.e(parcel2, bundleZzt);
                return true;
            case 19:
                Bundle bundleZzu = zzu();
                parcel2.writeNoException();
                bs2.e(parcel2, bundleZzu);
                return true;
            case 20:
                b1((m93) bs2.c(parcel, m93.CREATOR), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 21:
                B(b.a.U(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 22:
                parcel2.writeNoException();
                bs2.b(parcel2, false);
                return true;
            case 23:
                Q1(b.a.U(parcel.readStrongBinder()), rm.I4(parcel.readStrongBinder()), parcel.createStringArrayList());
                parcel2.writeNoException();
                return true;
            case SyslogConstants.LOG_DAEMON /* 24 */:
                k7 k7VarF = f();
                parcel2.writeNoException();
                bs2.f(parcel2, k7VarF);
                return true;
            case 25:
                zzA(bs2.a(parcel));
                parcel2.writeNoException();
                return true;
            case 26:
                n1 n1VarZzB = zzB();
                parcel2.writeNoException();
                bs2.f(parcel2, n1VarZzB);
                return true;
            case 27:
                ig igVarA3 = A3();
                parcel2.writeNoException();
                bs2.f(parcel2, igVarA3);
                return true;
            case 28:
                e.c.b.b.b.b bVarU6 = b.a.U(parcel.readStrongBinder());
                m93 m93Var6 = (m93) bs2.c(parcel, m93.CREATOR);
                String string9 = parcel.readString();
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    xfVar = iInterfaceQueryLocalInterface6 instanceof zf ? (zf) iInterfaceQueryLocalInterface6 : new xf(strongBinder6);
                }
                N0(bVarU6, m93Var6, string9, xfVar);
                parcel2.writeNoException();
                return true;
            case 29:
            default:
                return false;
            case 30:
                U1(b.a.U(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 31:
                W0(b.a.U(parcel.readStrongBinder()), ac.I4(parcel.readStrongBinder()), parcel.createTypedArrayList(hc.CREATOR));
                parcel2.writeNoException();
                return true;
            case 32:
                e.c.b.b.b.b bVarU7 = b.a.U(parcel.readStrongBinder());
                m93 m93Var7 = (m93) bs2.c(parcel, m93.CREATOR);
                String string10 = parcel.readString();
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    xfVar = iInterfaceQueryLocalInterface7 instanceof zf ? (zf) iInterfaceQueryLocalInterface7 : new xf(strongBinder7);
                }
                I3(bVarU7, m93Var7, string10, xfVar);
                parcel2.writeNoException();
                return true;
            case 33:
                gi giVarN = n();
                parcel2.writeNoException();
                bs2.e(parcel2, giVarN);
                return true;
            case 34:
                gi giVarX = X();
                parcel2.writeNoException();
                bs2.e(parcel2, giVarX);
                return true;
            case 35:
                e.c.b.b.b.b bVarU8 = b.a.U(parcel.readStrongBinder());
                r93 r93Var3 = (r93) bs2.c(parcel, r93.CREATOR);
                m93 m93Var8 = (m93) bs2.c(parcel, m93.CREATOR);
                String string11 = parcel.readString();
                String string12 = parcel.readString();
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    xfVar = iInterfaceQueryLocalInterface8 instanceof zf ? (zf) iInterfaceQueryLocalInterface8 : new xf(strongBinder8);
                }
                v1(bVarU8, r93Var3, m93Var8, string11, string12, xfVar);
                parcel2.writeNoException();
                return true;
            case 36:
                cg cgVarT = t();
                parcel2.writeNoException();
                bs2.f(parcel2, cgVarT);
                return true;
            case 37:
                T0(b.a.U(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
        }
    }
}