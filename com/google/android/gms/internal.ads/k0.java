package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public abstract class k0 extends as2 implements l0 {
    public k0() {
        super("com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
    }

    @Override // com.google.android.gms.internal.ads.as2
    protected final boolean zzbA(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 == 1) {
            s2((g93) bs2.c(parcel, g93.CREATOR));
        } else if (i2 == 2) {
            zzc();
        } else if (i2 == 3) {
            zzd();
        } else {
            if (i2 != 4) {
                return false;
            }
            zze();
        }
        parcel2.writeNoException();
        return true;
    }
}