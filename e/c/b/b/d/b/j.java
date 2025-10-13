package e.c.b.b.d.b;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.q;

/* loaded from: classes.dex */
public final class j implements Parcelable.Creator<i> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ i createFromParcel(Parcel parcel) {
        int iA = com.google.android.gms.common.internal.w.b.A(parcel);
        int iV = 0;
        q qVar = null;
        while (parcel.dataPosition() < iA) {
            int iT = com.google.android.gms.common.internal.w.b.t(parcel);
            int iL = com.google.android.gms.common.internal.w.b.l(iT);
            if (iL == 1) {
                iV = com.google.android.gms.common.internal.w.b.v(parcel, iT);
            } else if (iL != 2) {
                com.google.android.gms.common.internal.w.b.z(parcel, iT);
            } else {
                qVar = (q) com.google.android.gms.common.internal.w.b.e(parcel, iT, q.CREATOR);
            }
        }
        com.google.android.gms.common.internal.w.b.k(parcel, iA);
        return new i(iV, qVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ i[] newArray(int i2) {
        return new i[i2];
    }
}