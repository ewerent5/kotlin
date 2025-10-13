package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public abstract class gl extends as2 implements hl {
    public gl() {
        super("com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // com.google.android.gms.internal.ads.as2
    protected final boolean zzbA(int i2, Parcel parcel, Parcel parcel2, int i3) {
        ll jlVar = null;
        if (i2 == 1) {
            parcel2.writeNoException();
            bs2.e(parcel2, null);
        } else if (i2 == 2) {
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdResponseListener");
                if (iInterfaceQueryLocalInterface instanceof il) {
                } else {
                    new il(strongBinder);
                }
            }
            parcel2.writeNoException();
        } else if (i2 == 4) {
            ql qlVar = (ql) bs2.c(parcel, ql.CREATOR);
            IBinder strongBinder2 = parcel.readStrongBinder();
            if (strongBinder2 != null) {
                IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                jlVar = iInterfaceQueryLocalInterface2 instanceof ll ? (ll) iInterfaceQueryLocalInterface2 : new jl(strongBinder2);
            }
            s4(qlVar, jlVar);
            parcel2.writeNoException();
        } else if (i2 == 5) {
            ql qlVar2 = (ql) bs2.c(parcel, ql.CREATOR);
            IBinder strongBinder3 = parcel.readStrongBinder();
            if (strongBinder3 != null) {
                IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                jlVar = iInterfaceQueryLocalInterface3 instanceof ll ? (ll) iInterfaceQueryLocalInterface3 : new jl(strongBinder3);
            }
            p0(qlVar2, jlVar);
            parcel2.writeNoException();
        } else if (i2 == 6) {
            ql qlVar3 = (ql) bs2.c(parcel, ql.CREATOR);
            IBinder strongBinder4 = parcel.readStrongBinder();
            if (strongBinder4 != null) {
                IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                jlVar = iInterfaceQueryLocalInterface4 instanceof ll ? (ll) iInterfaceQueryLocalInterface4 : new jl(strongBinder4);
            }
            J0(qlVar3, jlVar);
            parcel2.writeNoException();
        } else {
            if (i2 != 7) {
                return false;
            }
            String string = parcel.readString();
            IBinder strongBinder5 = parcel.readStrongBinder();
            if (strongBinder5 != null) {
                IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                jlVar = iInterfaceQueryLocalInterface5 instanceof ll ? (ll) iInterfaceQueryLocalInterface5 : new jl(strongBinder5);
            }
            i3(string, jlVar);
            parcel2.writeNoException();
        }
        return true;
    }
}