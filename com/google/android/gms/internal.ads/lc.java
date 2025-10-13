package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import e.c.b.b.b.b;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public abstract class lc extends as2 implements mc {
    public lc() {
        super("com.google.android.gms.ads.internal.instream.client.IInstreamAd");
    }

    @Override // com.google.android.gms.internal.ads.as2
    protected final boolean zzbA(int i2, Parcel parcel, Parcel parcel2, int i3) {
        qc ncVar;
        if (i2 == 3) {
            n1 n1VarZzb = zzb();
            parcel2.writeNoException();
            bs2.f(parcel2, n1VarZzb);
            return true;
        }
        if (i2 == 4) {
            zzc();
            parcel2.writeNoException();
            return true;
        }
        if (i2 == 5) {
            e.c.b.b.b.b bVarU = b.a.U(parcel.readStrongBinder());
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder == null) {
                ncVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
                ncVar = iInterfaceQueryLocalInterface instanceof qc ? (qc) iInterfaceQueryLocalInterface : new nc(strongBinder);
            }
            x2(bVarU, ncVar);
            parcel2.writeNoException();
            return true;
        }
        if (i2 == 6) {
            i(b.a.U(parcel.readStrongBinder()));
            parcel2.writeNoException();
            return true;
        }
        if (i2 != 7) {
            return false;
        }
        q6 q6VarZzf = zzf();
        parcel2.writeNoException();
        bs2.f(parcel2, q6VarZzf);
        return true;
    }
}