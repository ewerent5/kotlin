package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import e.c.b.b.b.b;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public abstract class sh extends as2 implements th {
    public sh() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    public static th I4(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
        return iInterfaceQueryLocalInterface instanceof th ? (th) iInterfaceQueryLocalInterface : new rh(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.as2
    protected final boolean zzbA(int i2, Parcel parcel, Parcel parcel2, int i3) {
        wh uhVar;
        gh ehVar = null;
        nh lhVar = null;
        gh ehVar2 = null;
        qh ohVar = null;
        nh lhVar2 = null;
        qh ohVar2 = null;
        jh hhVar = null;
        if (i2 == 1) {
            e.c.b.b.b.b bVarU = b.a.U(parcel.readStrongBinder());
            String string = parcel.readString();
            Parcelable.Creator creator = Bundle.CREATOR;
            Bundle bundle = (Bundle) bs2.c(parcel, creator);
            Bundle bundle2 = (Bundle) bs2.c(parcel, creator);
            r93 r93Var = (r93) bs2.c(parcel, r93.CREATOR);
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder == null) {
                uhVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
                uhVar = iInterfaceQueryLocalInterface instanceof wh ? (wh) iInterfaceQueryLocalInterface : new uh(strongBinder);
            }
            j1(bVarU, string, bundle, bundle2, r93Var, uhVar);
            parcel2.writeNoException();
        } else if (i2 == 2) {
            gi giVarZzf = zzf();
            parcel2.writeNoException();
            bs2.e(parcel2, giVarZzf);
        } else if (i2 == 3) {
            gi giVarZzg = zzg();
            parcel2.writeNoException();
            bs2.e(parcel2, giVarZzg);
        } else if (i2 == 5) {
            n1 n1VarZzh = zzh();
            parcel2.writeNoException();
            bs2.f(parcel2, n1VarZzh);
        } else if (i2 == 10) {
            b.a.U(parcel.readStrongBinder());
            parcel2.writeNoException();
        } else if (i2 != 11) {
            switch (i2) {
                case 13:
                    String string2 = parcel.readString();
                    String string3 = parcel.readString();
                    m93 m93Var = (m93) bs2.c(parcel, m93.CREATOR);
                    e.c.b.b.b.b bVarU2 = b.a.U(parcel.readStrongBinder());
                    IBinder strongBinder2 = parcel.readStrongBinder();
                    if (strongBinder2 != null) {
                        IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                        ehVar = iInterfaceQueryLocalInterface2 instanceof gh ? (gh) iInterfaceQueryLocalInterface2 : new eh(strongBinder2);
                    }
                    U2(string2, string3, m93Var, bVarU2, ehVar, yf.I4(parcel.readStrongBinder()), (r93) bs2.c(parcel, r93.CREATOR));
                    parcel2.writeNoException();
                    break;
                case 14:
                    String string4 = parcel.readString();
                    String string5 = parcel.readString();
                    m93 m93Var2 = (m93) bs2.c(parcel, m93.CREATOR);
                    e.c.b.b.b.b bVarU3 = b.a.U(parcel.readStrongBinder());
                    IBinder strongBinder3 = parcel.readStrongBinder();
                    if (strongBinder3 != null) {
                        IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
                        hhVar = iInterfaceQueryLocalInterface3 instanceof jh ? (jh) iInterfaceQueryLocalInterface3 : new hh(strongBinder3);
                    }
                    C3(string4, string5, m93Var2, bVarU3, hhVar, yf.I4(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    break;
                case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
                    boolean zQ = Q(b.a.U(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    bs2.b(parcel2, zQ);
                    break;
                case 16:
                    String string6 = parcel.readString();
                    String string7 = parcel.readString();
                    m93 m93Var3 = (m93) bs2.c(parcel, m93.CREATOR);
                    e.c.b.b.b.b bVarU4 = b.a.U(parcel.readStrongBinder());
                    IBinder strongBinder4 = parcel.readStrongBinder();
                    if (strongBinder4 != null) {
                        IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                        ohVar2 = iInterfaceQueryLocalInterface4 instanceof qh ? (qh) iInterfaceQueryLocalInterface4 : new oh(strongBinder4);
                    }
                    o2(string6, string7, m93Var3, bVarU4, ohVar2, yf.I4(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    break;
                case 17:
                    boolean zQ3 = Q3(b.a.U(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    bs2.b(parcel2, zQ3);
                    break;
                case 18:
                    String string8 = parcel.readString();
                    String string9 = parcel.readString();
                    m93 m93Var4 = (m93) bs2.c(parcel, m93.CREATOR);
                    e.c.b.b.b.b bVarU5 = b.a.U(parcel.readStrongBinder());
                    IBinder strongBinder5 = parcel.readStrongBinder();
                    if (strongBinder5 != null) {
                        IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                        lhVar2 = iInterfaceQueryLocalInterface5 instanceof nh ? (nh) iInterfaceQueryLocalInterface5 : new lh(strongBinder5);
                    }
                    s1(string8, string9, m93Var4, bVarU5, lhVar2, yf.I4(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    break;
                case 19:
                    S(parcel.readString());
                    parcel2.writeNoException();
                    break;
                case 20:
                    String string10 = parcel.readString();
                    String string11 = parcel.readString();
                    m93 m93Var5 = (m93) bs2.c(parcel, m93.CREATOR);
                    e.c.b.b.b.b bVarU6 = b.a.U(parcel.readStrongBinder());
                    IBinder strongBinder6 = parcel.readStrongBinder();
                    if (strongBinder6 != null) {
                        IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                        ohVar = iInterfaceQueryLocalInterface6 instanceof qh ? (qh) iInterfaceQueryLocalInterface6 : new oh(strongBinder6);
                    }
                    n0(string10, string11, m93Var5, bVarU6, ohVar, yf.I4(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    break;
                case 21:
                    String string12 = parcel.readString();
                    String string13 = parcel.readString();
                    m93 m93Var6 = (m93) bs2.c(parcel, m93.CREATOR);
                    e.c.b.b.b.b bVarU7 = b.a.U(parcel.readStrongBinder());
                    IBinder strongBinder7 = parcel.readStrongBinder();
                    if (strongBinder7 != null) {
                        IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                        ehVar2 = iInterfaceQueryLocalInterface7 instanceof gh ? (gh) iInterfaceQueryLocalInterface7 : new eh(strongBinder7);
                    }
                    p3(string12, string13, m93Var6, bVarU7, ehVar2, yf.I4(parcel.readStrongBinder()), (r93) bs2.c(parcel, r93.CREATOR));
                    parcel2.writeNoException();
                    break;
                case 22:
                    String string14 = parcel.readString();
                    String string15 = parcel.readString();
                    m93 m93Var7 = (m93) bs2.c(parcel, m93.CREATOR);
                    e.c.b.b.b.b bVarU8 = b.a.U(parcel.readStrongBinder());
                    IBinder strongBinder8 = parcel.readStrongBinder();
                    if (strongBinder8 != null) {
                        IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                        lhVar = iInterfaceQueryLocalInterface8 instanceof nh ? (nh) iInterfaceQueryLocalInterface8 : new lh(strongBinder8);
                    }
                    B4(string14, string15, m93Var7, bVarU8, lhVar, yf.I4(parcel.readStrongBinder()), (g6) bs2.c(parcel, g6.CREATOR));
                    parcel2.writeNoException();
                    break;
                default:
                    return false;
            }
        } else {
            parcel.createStringArray();
            parcel2.writeNoException();
        }
        return true;
    }
}