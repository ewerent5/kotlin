package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public abstract class i extends as2 implements j {
    public i() {
        super("com.google.android.gms.ads.internal.client.IAdListener");
    }

    @Override // com.google.android.gms.internal.ads.as2
    protected final boolean zzbA(int i2, Parcel parcel, Parcel parcel2, int i3) {
        switch (i2) {
            case 1:
                zzb();
                break;
            case 2:
                g(parcel.readInt());
                break;
            case 3:
                break;
            case 4:
                zzf();
                break;
            case 5:
                zzg();
                break;
            case 6:
                zzh();
                break;
            case 7:
                zzi();
                break;
            case 8:
                x((g93) bs2.c(parcel, g93.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}