package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
public final class s implements Parcelable.Creator<q> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ q createFromParcel(Parcel parcel) {
        int iA = com.google.android.gms.common.internal.w.b.A(parcel);
        Bundle bundleA = null;
        while (parcel.dataPosition() < iA) {
            int iT = com.google.android.gms.common.internal.w.b.t(parcel);
            if (com.google.android.gms.common.internal.w.b.l(iT) != 2) {
                com.google.android.gms.common.internal.w.b.z(parcel, iT);
            } else {
                bundleA = com.google.android.gms.common.internal.w.b.a(parcel, iT);
            }
        }
        com.google.android.gms.common.internal.w.b.k(parcel, iA);
        return new q(bundleA);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ q[] newArray(int i2) {
        return new q[i2];
    }
}