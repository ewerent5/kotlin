package e.c.b.b.d.b;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class c implements Parcelable.Creator<b> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ b createFromParcel(Parcel parcel) {
        int iA = com.google.android.gms.common.internal.w.b.A(parcel);
        int iV = 0;
        Intent intent = null;
        int iV2 = 0;
        while (parcel.dataPosition() < iA) {
            int iT = com.google.android.gms.common.internal.w.b.t(parcel);
            int iL = com.google.android.gms.common.internal.w.b.l(iT);
            if (iL == 1) {
                iV = com.google.android.gms.common.internal.w.b.v(parcel, iT);
            } else if (iL == 2) {
                iV2 = com.google.android.gms.common.internal.w.b.v(parcel, iT);
            } else if (iL != 3) {
                com.google.android.gms.common.internal.w.b.z(parcel, iT);
            } else {
                intent = (Intent) com.google.android.gms.common.internal.w.b.e(parcel, iT, Intent.CREATOR);
            }
        }
        com.google.android.gms.common.internal.w.b.k(parcel, iA);
        return new b(iV, iV2, intent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ b[] newArray(int i2) {
        return new b[i2];
    }
}