package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.ads.internal.util.zzaq;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public abstract class kl extends as2 implements ll {
    public kl() {
        super("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    @Override // com.google.android.gms.internal.ads.as2
    protected final boolean zzbA(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 == 1) {
            c3((ParcelFileDescriptor) bs2.c(parcel, ParcelFileDescriptor.CREATOR));
        } else {
            if (i2 != 2) {
                return false;
            }
            v4((zzaq) bs2.c(parcel, zzaq.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}