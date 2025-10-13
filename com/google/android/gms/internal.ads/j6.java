package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class j6 extends zr2 implements l6 {
    j6(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
    }

    @Override // com.google.android.gms.internal.ads.l6
    public final String zzb() {
        Parcel parcelZzbi = zzbi(2, zza());
        String string = parcelZzbi.readString();
        parcelZzbi.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.l6
    public final List<t6> zzc() {
        Parcel parcelZzbi = zzbi(3, zza());
        ArrayList arrayListG = bs2.g(parcelZzbi);
        parcelZzbi.recycle();
        return arrayListG;
    }
}