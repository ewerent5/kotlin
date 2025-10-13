package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public abstract class gn extends as2 implements hn {
    public gn() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.as2
    protected final boolean zzbA(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 == 1) {
            zze();
        } else if (i2 == 2) {
            j(parcel.readInt());
        } else {
            if (i2 != 3) {
                return false;
            }
            e((g93) bs2.c(parcel, g93.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}