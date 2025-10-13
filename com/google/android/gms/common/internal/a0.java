package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* loaded from: classes.dex */
public final class a0 implements Parcelable.Creator<q> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ q createFromParcel(Parcel parcel) {
        int iA = com.google.android.gms.common.internal.w.b.A(parcel);
        Account account = null;
        GoogleSignInAccount googleSignInAccount = null;
        int iV = 0;
        int iV2 = 0;
        while (parcel.dataPosition() < iA) {
            int iT = com.google.android.gms.common.internal.w.b.t(parcel);
            int iL = com.google.android.gms.common.internal.w.b.l(iT);
            if (iL == 1) {
                iV = com.google.android.gms.common.internal.w.b.v(parcel, iT);
            } else if (iL == 2) {
                account = (Account) com.google.android.gms.common.internal.w.b.e(parcel, iT, Account.CREATOR);
            } else if (iL == 3) {
                iV2 = com.google.android.gms.common.internal.w.b.v(parcel, iT);
            } else if (iL != 4) {
                com.google.android.gms.common.internal.w.b.z(parcel, iT);
            } else {
                googleSignInAccount = (GoogleSignInAccount) com.google.android.gms.common.internal.w.b.e(parcel, iT, GoogleSignInAccount.CREATOR);
            }
        }
        com.google.android.gms.common.internal.w.b.k(parcel, iA);
        return new q(iV, account, iV2, googleSignInAccount);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ q[] newArray(int i2) {
        return new q[i2];
    }
}