package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public abstract class w33 extends as2 implements x33 {
    public w33() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
    }

    @Override // com.google.android.gms.internal.ads.as2
    protected final boolean zzbA(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 == 1) {
            zzc();
        } else if (i2 == 2) {
            zzd();
        } else if (i2 == 3) {
            F((g93) bs2.c(parcel, g93.CREATOR));
        } else {
            if (i2 != 4) {
                return false;
            }
            zzf();
        }
        parcel2.writeNoException();
        return true;
    }
}