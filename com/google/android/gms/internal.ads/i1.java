package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class i1 extends zr2 implements k1 {
    i1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IResponseInfo");
    }

    @Override // com.google.android.gms.internal.ads.k1
    public final String zze() {
        Parcel parcelZzbi = zzbi(1, zza());
        String string = parcelZzbi.readString();
        parcelZzbi.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.k1
    public final String zzf() {
        Parcel parcelZzbi = zzbi(2, zza());
        String string = parcelZzbi.readString();
        parcelZzbi.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.k1
    public final List<w93> zzg() {
        Parcel parcelZzbi = zzbi(3, zza());
        ArrayList arrayListCreateTypedArrayList = parcelZzbi.createTypedArrayList(w93.CREATOR);
        parcelZzbi.recycle();
        return arrayListCreateTypedArrayList;
    }
}