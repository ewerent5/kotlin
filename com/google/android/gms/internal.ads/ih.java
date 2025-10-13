package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public abstract class ih extends as2 implements jh {
    public ih() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
    }

    @Override // com.google.android.gms.internal.ads.as2
    protected final boolean zzbA(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 == 2) {
            zze();
        } else if (i2 == 3) {
            b(parcel.readString());
        } else {
            if (i2 != 4) {
                return false;
            }
            e((g93) bs2.c(parcel, g93.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}