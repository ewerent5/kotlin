package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public abstract class s33 extends as2 implements t33 {
    public s33() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
    }

    public static t33 I4(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
        return iInterfaceQueryLocalInterface instanceof t33 ? (t33) iInterfaceQueryLocalInterface : new r33(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.as2
    protected final boolean zzbA(int i2, Parcel parcel, Parcel parcel2, int i3) {
        q33 n33Var;
        if (i2 == 1) {
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder == null) {
                n33Var = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
                n33Var = iInterfaceQueryLocalInterface instanceof q33 ? (q33) iInterfaceQueryLocalInterface : new n33(strongBinder);
            }
            c0(n33Var);
        } else if (i2 == 2) {
            parcel.readInt();
        } else {
            if (i2 != 3) {
                return false;
            }
            x((g93) bs2.c(parcel, g93.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}