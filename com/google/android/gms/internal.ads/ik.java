package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class ik extends zr2 implements kk {
    ik(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.query.IUpdateUrlsCallback");
    }

    @Override // com.google.android.gms.internal.ads.kk
    public final void U3(List<Uri> list) {
        Parcel parcelZza = zza();
        parcelZza.writeTypedList(list);
        zzbj(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.kk
    public final void b(String str) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzbj(2, parcelZza);
    }
}