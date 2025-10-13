package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public abstract class s6 extends as2 implements t6 {
    public s6() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    public static t6 I4(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
        return iInterfaceQueryLocalInterface instanceof t6 ? (t6) iInterfaceQueryLocalInterface : new r6(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.as2
    protected final boolean zzbA(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 == 1) {
            e.c.b.b.b.b bVarZzb = zzb();
            parcel2.writeNoException();
            bs2.f(parcel2, bVarZzb);
        } else if (i2 == 2) {
            Uri uriZzc = zzc();
            parcel2.writeNoException();
            bs2.e(parcel2, uriZzc);
        } else if (i2 == 3) {
            double dZzd = zzd();
            parcel2.writeNoException();
            parcel2.writeDouble(dZzd);
        } else if (i2 == 4) {
            int iZze = zze();
            parcel2.writeNoException();
            parcel2.writeInt(iZze);
        } else {
            if (i2 != 5) {
                return false;
            }
            int iZzf = zzf();
            parcel2.writeNoException();
            parcel2.writeInt(iZzf);
        }
        return true;
    }
}