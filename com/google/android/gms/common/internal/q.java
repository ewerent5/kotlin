package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* loaded from: classes.dex */
public class q extends com.google.android.gms.common.internal.w.a {
    public static final Parcelable.Creator<q> CREATOR = new a0();

    /* renamed from: e */
    private final int f4715e;

    /* renamed from: f */
    private final Account f4716f;

    /* renamed from: g */
    private final int f4717g;

    /* renamed from: h */
    private final GoogleSignInAccount f4718h;

    q(int i2, Account account, int i3, GoogleSignInAccount googleSignInAccount) {
        this.f4715e = i2;
        this.f4716f = account;
        this.f4717g = i3;
        this.f4718h = googleSignInAccount;
    }

    public int I() {
        return this.f4717g;
    }

    public GoogleSignInAccount J() {
        return this.f4718h;
    }

    public Account c() {
        return this.f4716f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.w.c.a(parcel);
        com.google.android.gms.common.internal.w.c.m(parcel, 1, this.f4715e);
        com.google.android.gms.common.internal.w.c.r(parcel, 2, c(), i2, false);
        com.google.android.gms.common.internal.w.c.m(parcel, 3, I());
        com.google.android.gms.common.internal.w.c.r(parcel, 4, J(), i2, false);
        com.google.android.gms.common.internal.w.c.b(parcel, iA);
    }

    public q(Account account, int i2, GoogleSignInAccount googleSignInAccount) {
        this(2, account, i2, googleSignInAccount);
    }
}