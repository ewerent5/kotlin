package com.google.android.gms.internal.ads;

import android.os.Parcel;
import e.c.b.b.b.b;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public abstract class fh extends as2 implements gh {
    public fh() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
    }

    @Override // com.google.android.gms.internal.ads.as2
    protected final boolean zzbA(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 == 1) {
            i(b.a.U(parcel.readStrongBinder()));
        } else if (i2 == 2) {
            b(parcel.readString());
        } else if (i2 == 3) {
            e((g93) bs2.c(parcel, g93.CREATOR));
        } else {
            if (i2 != 4) {
                return false;
            }
            k1(bg.I4(parcel.readStrongBinder()));
        }
        parcel2.writeNoException();
        return true;
    }
}