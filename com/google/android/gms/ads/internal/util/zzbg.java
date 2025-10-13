package com.google.android.gms.ads.internal.util;

import android.os.Parcel;
import com.google.android.gms.internal.ads.as2;
import com.google.android.gms.internal.ads.bs2;
import e.c.b.b.b.b;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public abstract class zzbg extends as2 implements zzbh {
    public zzbg() {
        super("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
    }

    @Override // com.google.android.gms.internal.ads.as2
    protected final boolean zzbA(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 == 1) {
            boolean zZze = zze(b.a.U(parcel.readStrongBinder()), parcel.readString(), parcel.readString());
            parcel2.writeNoException();
            bs2.b(parcel2, zZze);
        } else {
            if (i2 != 2) {
                return false;
            }
            zzf(b.a.U(parcel.readStrongBinder()));
            parcel2.writeNoException();
        }
        return true;
    }
}