package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class cc extends zr2 implements ec {
    cc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.initialization.IInitializationCallback");
    }

    @Override // com.google.android.gms.internal.ads.ec
    public final void t3(List<xb> list) {
        Parcel parcelZza = zza();
        parcelZza.writeTypedList(list);
        zzbj(1, parcelZza);
    }
}