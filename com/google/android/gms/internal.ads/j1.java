package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public abstract class j1 extends as2 implements k1 {
    public j1() {
        super("com.google.android.gms.ads.internal.client.IResponseInfo");
    }

    public static k1 I4(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
        return iInterfaceQueryLocalInterface instanceof k1 ? (k1) iInterfaceQueryLocalInterface : new i1(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.as2
    protected final boolean zzbA(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 == 1) {
            String strZze = zze();
            parcel2.writeNoException();
            parcel2.writeString(strZze);
        } else if (i2 == 2) {
            String strZzf = zzf();
            parcel2.writeNoException();
            parcel2.writeString(strZzf);
        } else {
            if (i2 != 3) {
                return false;
            }
            List<w93> listZzg = zzg();
            parcel2.writeNoException();
            parcel2.writeTypedList(listZzg);
        }
        return true;
    }
}