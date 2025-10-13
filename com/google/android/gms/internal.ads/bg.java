package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public abstract class bg extends as2 implements cg {
    public bg() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
    }

    public static cg I4(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
        return iInterfaceQueryLocalInterface instanceof cg ? (cg) iInterfaceQueryLocalInterface : new ag(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.as2
    protected final boolean zzbA(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 == 1) {
            e.c.b.b.b.b bVarZze = zze();
            parcel2.writeNoException();
            bs2.f(parcel2, bVarZze);
        } else {
            if (i2 != 2) {
                return false;
            }
            boolean zZzf = zzf();
            parcel2.writeNoException();
            bs2.b(parcel2, zZzf);
        }
        return true;
    }
}