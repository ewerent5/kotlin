package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public abstract class t7 extends as2 implements u7 {
    public t7() {
        super("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    public static u7 I4(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
        return iInterfaceQueryLocalInterface instanceof u7 ? (u7) iInterfaceQueryLocalInterface : new s7(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.as2
    protected final boolean zzbA(int i2, Parcel parcel, Parcel parcel2, int i3) {
        k7 h7Var;
        if (i2 != 1) {
            return false;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        if (strongBinder == null) {
            h7Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
            h7Var = iInterfaceQueryLocalInterface instanceof k7 ? (k7) iInterfaceQueryLocalInterface : new h7(strongBinder);
        }
        y4(h7Var, parcel.readString());
        parcel2.writeNoException();
        return true;
    }
}