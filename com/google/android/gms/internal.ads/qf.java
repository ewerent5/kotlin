package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class qf extends zr2 implements tf {
    qf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    @Override // com.google.android.gms.internal.ads.tf
    public final boolean O(String str) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzbi = zzbi(4, parcelZza);
        boolean zA = bs2.a(parcelZzbi);
        parcelZzbi.recycle();
        return zA;
    }

    @Override // com.google.android.gms.internal.ads.tf
    public final th b(String str) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzbi = zzbi(3, parcelZza);
        th thVarI4 = sh.I4(parcelZzbi.readStrongBinder());
        parcelZzbi.recycle();
        return thVarI4;
    }

    @Override // com.google.android.gms.internal.ads.tf
    public final wf c(String str) {
        wf ufVar;
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzbi = zzbi(1, parcelZza);
        IBinder strongBinder = parcelZzbi.readStrongBinder();
        if (strongBinder == null) {
            ufVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            ufVar = iInterfaceQueryLocalInterface instanceof wf ? (wf) iInterfaceQueryLocalInterface : new uf(strongBinder);
        }
        parcelZzbi.recycle();
        return ufVar;
    }

    @Override // com.google.android.gms.internal.ads.tf
    public final boolean d(String str) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzbi = zzbi(2, parcelZza);
        boolean zA = bs2.a(parcelZzbi);
        parcelZzbi.recycle();
        return zA;
    }
}