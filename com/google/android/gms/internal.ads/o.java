package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public abstract class o extends as2 implements p {
    public o() {
        super("com.google.android.gms.ads.internal.client.IAdLoader");
    }

    @Override // com.google.android.gms.internal.ads.as2
    protected final boolean zzbA(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 == 1) {
            zze((m93) bs2.c(parcel, m93.CREATOR));
            parcel2.writeNoException();
        } else if (i2 == 2) {
            String strZzf = zzf();
            parcel2.writeNoException();
            parcel2.writeString(strZzf);
        } else if (i2 == 3) {
            boolean zZzg = zzg();
            parcel2.writeNoException();
            bs2.b(parcel2, zZzg);
        } else if (i2 == 4) {
            String strZzh = zzh();
            parcel2.writeNoException();
            parcel2.writeString(strZzh);
        } else {
            if (i2 != 5) {
                return false;
            }
            Q2((m93) bs2.c(parcel, m93.CREATOR), parcel.readInt());
            parcel2.writeNoException();
        }
        return true;
    }
}