package e.c.b.b.c.e;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
/* loaded from: classes.dex */
public final class i implements Parcelable.Creator<f> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ f createFromParcel(Parcel parcel) {
        int iA = com.google.android.gms.common.internal.w.b.A(parcel);
        long jW = 0;
        long jW2 = 0;
        String strF = null;
        String strF2 = null;
        String strF3 = null;
        Bundle bundleA = null;
        boolean zM = false;
        while (parcel.dataPosition() < iA) {
            int iT = com.google.android.gms.common.internal.w.b.t(parcel);
            switch (com.google.android.gms.common.internal.w.b.l(iT)) {
                case 1:
                    jW = com.google.android.gms.common.internal.w.b.w(parcel, iT);
                    break;
                case 2:
                    jW2 = com.google.android.gms.common.internal.w.b.w(parcel, iT);
                    break;
                case 3:
                    zM = com.google.android.gms.common.internal.w.b.m(parcel, iT);
                    break;
                case 4:
                    strF = com.google.android.gms.common.internal.w.b.f(parcel, iT);
                    break;
                case 5:
                    strF2 = com.google.android.gms.common.internal.w.b.f(parcel, iT);
                    break;
                case 6:
                    strF3 = com.google.android.gms.common.internal.w.b.f(parcel, iT);
                    break;
                case 7:
                    bundleA = com.google.android.gms.common.internal.w.b.a(parcel, iT);
                    break;
                default:
                    com.google.android.gms.common.internal.w.b.z(parcel, iT);
                    break;
            }
        }
        com.google.android.gms.common.internal.w.b.k(parcel, iA);
        return new f(jW, jW2, zM, strF, strF2, strF3, bundleA);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ f[] newArray(int i2) {
        return new f[i2];
    }
}