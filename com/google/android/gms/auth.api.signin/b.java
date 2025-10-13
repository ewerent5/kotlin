package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class b implements Parcelable.Creator<GoogleSignInAccount> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GoogleSignInAccount createFromParcel(Parcel parcel) {
        int iA = com.google.android.gms.common.internal.w.b.A(parcel);
        String strF = null;
        String strF2 = null;
        String strF3 = null;
        String strF4 = null;
        Uri uri = null;
        String strF5 = null;
        String strF6 = null;
        ArrayList arrayListJ = null;
        String strF7 = null;
        String strF8 = null;
        long jW = 0;
        int iV = 0;
        while (parcel.dataPosition() < iA) {
            int iT = com.google.android.gms.common.internal.w.b.t(parcel);
            switch (com.google.android.gms.common.internal.w.b.l(iT)) {
                case 1:
                    iV = com.google.android.gms.common.internal.w.b.v(parcel, iT);
                    break;
                case 2:
                    strF = com.google.android.gms.common.internal.w.b.f(parcel, iT);
                    break;
                case 3:
                    strF2 = com.google.android.gms.common.internal.w.b.f(parcel, iT);
                    break;
                case 4:
                    strF3 = com.google.android.gms.common.internal.w.b.f(parcel, iT);
                    break;
                case 5:
                    strF4 = com.google.android.gms.common.internal.w.b.f(parcel, iT);
                    break;
                case 6:
                    uri = (Uri) com.google.android.gms.common.internal.w.b.e(parcel, iT, Uri.CREATOR);
                    break;
                case 7:
                    strF5 = com.google.android.gms.common.internal.w.b.f(parcel, iT);
                    break;
                case 8:
                    jW = com.google.android.gms.common.internal.w.b.w(parcel, iT);
                    break;
                case 9:
                    strF6 = com.google.android.gms.common.internal.w.b.f(parcel, iT);
                    break;
                case 10:
                    arrayListJ = com.google.android.gms.common.internal.w.b.j(parcel, iT, Scope.CREATOR);
                    break;
                case 11:
                    strF7 = com.google.android.gms.common.internal.w.b.f(parcel, iT);
                    break;
                case 12:
                    strF8 = com.google.android.gms.common.internal.w.b.f(parcel, iT);
                    break;
                default:
                    com.google.android.gms.common.internal.w.b.z(parcel, iT);
                    break;
            }
        }
        com.google.android.gms.common.internal.w.b.k(parcel, iA);
        return new GoogleSignInAccount(iV, strF, strF2, strF3, strF4, uri, strF5, jW, strF6, arrayListJ, strF7, strF8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GoogleSignInAccount[] newArray(int i2) {
        return new GoogleSignInAccount[i2];
    }
}