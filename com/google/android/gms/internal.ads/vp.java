package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public abstract class vp extends as2 implements wp {
    public vp() {
        super("com.google.android.gms.ads.internal.signals.ISignalCallback");
    }

    @Override // com.google.android.gms.internal.ads.as2
    protected final boolean zzbA(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 == 1) {
            o(parcel.readString(), parcel.readString());
        } else if (i2 == 2) {
            d(parcel.readString());
        } else {
            if (i2 != 3) {
                return false;
            }
            E(parcel.readString(), parcel.readString(), (Bundle) bs2.c(parcel, Bundle.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}