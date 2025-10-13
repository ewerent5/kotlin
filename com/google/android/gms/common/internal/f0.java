package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* loaded from: classes.dex */
public final class f0 extends e.c.b.b.c.c.a implements h0 {
    f0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    @Override // com.google.android.gms.common.internal.h0
    public final com.google.android.gms.common.f0 L1(com.google.android.gms.common.c0 c0Var) {
        Parcel parcelU = U();
        e.c.b.b.c.c.c.d(parcelU, c0Var);
        Parcel parcelR = R(6, parcelU);
        com.google.android.gms.common.f0 f0Var = (com.google.android.gms.common.f0) e.c.b.b.c.c.c.c(parcelR, com.google.android.gms.common.f0.CREATOR);
        parcelR.recycle();
        return f0Var;
    }

    @Override // com.google.android.gms.common.internal.h0
    public final boolean u2(com.google.android.gms.common.h0 h0Var, e.c.b.b.b.b bVar) {
        Parcel parcelU = U();
        e.c.b.b.c.c.c.d(parcelU, h0Var);
        e.c.b.b.c.c.c.e(parcelU, bVar);
        Parcel parcelR = R(5, parcelU);
        boolean zA = e.c.b.b.c.c.c.a(parcelR);
        parcelR.recycle();
        return zA;
    }

    @Override // com.google.android.gms.common.internal.h0
    public final boolean zzg() {
        Parcel parcelR = R(7, U());
        boolean zA = e.c.b.b.c.c.c.a(parcelR);
        parcelR.recycle();
        return zA;
    }
}