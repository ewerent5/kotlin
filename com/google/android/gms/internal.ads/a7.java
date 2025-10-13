package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import e.c.b.b.b.b;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public abstract class a7 extends as2 implements b7 {
    public a7() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
    }

    public static b7 I4(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
        return iInterfaceQueryLocalInterface instanceof b7 ? (b7) iInterfaceQueryLocalInterface : new z6(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.as2
    protected final boolean zzbA(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 == 1) {
            k(b.a.U(parcel.readStrongBinder()));
        } else if (i2 == 2) {
            zzc();
        } else {
            if (i2 != 3) {
                return false;
            }
            v(b.a.U(parcel.readStrongBinder()));
        }
        parcel2.writeNoException();
        return true;
    }
}