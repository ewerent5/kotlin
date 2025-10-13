package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* loaded from: classes.dex */
public final class d1 extends e.c.b.b.c.c.a implements k {
    d1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
    }

    @Override // com.google.android.gms.common.internal.k
    public final Account zzb() {
        Parcel parcelR = R(2, U());
        Account account = (Account) e.c.b.b.c.c.c.c(parcelR, Account.CREATOR);
        parcelR.recycle();
        return account;
    }
}