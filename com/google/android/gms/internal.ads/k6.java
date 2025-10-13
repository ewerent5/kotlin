package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public abstract class k6 extends as2 implements l6 {
    public k6() {
        super("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
    }

    public static l6 I4(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
        return iInterfaceQueryLocalInterface instanceof l6 ? (l6) iInterfaceQueryLocalInterface : new j6(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.as2
    protected final boolean zzbA(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 == 2) {
            String strZzb = zzb();
            parcel2.writeNoException();
            parcel2.writeString(strZzb);
            return true;
        }
        if (i2 != 3) {
            return false;
        }
        List<t6> listZzc = zzc();
        parcel2.writeNoException();
        parcel2.writeList(listZzc);
        return true;
    }
}