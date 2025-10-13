package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public abstract class p1 extends as2 implements q1 {
    public p1() {
        super("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    @Override // com.google.android.gms.internal.ads.as2
    protected final boolean zzbA(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 == 1) {
            zze();
        } else if (i2 == 2) {
            zzf();
        } else if (i2 == 3) {
            zzg();
        } else if (i2 == 4) {
            zzh();
        } else {
            if (i2 != 5) {
                return false;
            }
            S2(bs2.a(parcel));
        }
        parcel2.writeNoException();
        return true;
    }
}