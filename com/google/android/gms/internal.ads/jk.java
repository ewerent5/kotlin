package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public abstract class jk extends as2 implements kk {
    public jk() {
        super("com.google.android.gms.ads.internal.query.IUpdateUrlsCallback");
    }

    public static kk I4(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.query.IUpdateUrlsCallback");
        return iInterfaceQueryLocalInterface instanceof kk ? (kk) iInterfaceQueryLocalInterface : new ik(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.as2
    protected final boolean zzbA(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 == 1) {
            U3(parcel.createTypedArrayList(Uri.CREATOR));
        } else {
            if (i2 != 2) {
                return false;
            }
            b(parcel.readString());
        }
        parcel2.writeNoException();
        return true;
    }
}