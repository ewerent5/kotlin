package e.c.b.b.d.b;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.r;

/* loaded from: classes.dex */
public final class l implements Parcelable.Creator<k> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ k createFromParcel(Parcel parcel) {
        int iA = com.google.android.gms.common.internal.w.b.A(parcel);
        com.google.android.gms.common.b bVar = null;
        r rVar = null;
        int iV = 0;
        while (parcel.dataPosition() < iA) {
            int iT = com.google.android.gms.common.internal.w.b.t(parcel);
            int iL = com.google.android.gms.common.internal.w.b.l(iT);
            if (iL == 1) {
                iV = com.google.android.gms.common.internal.w.b.v(parcel, iT);
            } else if (iL == 2) {
                bVar = (com.google.android.gms.common.b) com.google.android.gms.common.internal.w.b.e(parcel, iT, com.google.android.gms.common.b.CREATOR);
            } else if (iL != 3) {
                com.google.android.gms.common.internal.w.b.z(parcel, iT);
            } else {
                rVar = (r) com.google.android.gms.common.internal.w.b.e(parcel, iT, r.CREATOR);
            }
        }
        com.google.android.gms.common.internal.w.b.k(parcel, iA);
        return new k(iV, bVar, rVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ k[] newArray(int i2) {
        return new k[i2];
    }
}