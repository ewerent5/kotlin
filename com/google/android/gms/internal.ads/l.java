package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public abstract class l extends as2 implements m {
    public l() {
        super("com.google.android.gms.ads.internal.client.IAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.as2
    protected final boolean zzbA(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 == 1) {
            zzb();
        } else {
            if (i2 != 2) {
                return false;
            }
            o4((g93) bs2.c(parcel, g93.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}