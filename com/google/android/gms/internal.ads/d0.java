package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public abstract class d0 extends as2 implements e0 {
    public d0() {
        super("com.google.android.gms.ads.internal.client.IAppEventListener");
    }

    public static e0 I4(IBinder iBinder) {
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
        return iInterfaceQueryLocalInterface instanceof e0 ? (e0) iInterfaceQueryLocalInterface : new b0(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.as2
    protected final boolean zzbA(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 != 1) {
            return false;
        }
        o(parcel.readString(), parcel.readString());
        parcel2.writeNoException();
        return true;
    }
}