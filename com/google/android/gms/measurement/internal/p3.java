package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
public final class p3 extends e.c.b.b.c.e.a implements n3 {
    p3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // com.google.android.gms.measurement.internal.n3
    public final void H0(r rVar, String str, String str2) {
        Parcel parcelR = R();
        e.c.b.b.c.e.x.c(parcelR, rVar);
        parcelR.writeString(str);
        parcelR.writeString(str2);
        Y(5, parcelR);
    }

    @Override // com.google.android.gms.measurement.internal.n3
    public final void H1(long j2, String str, String str2, String str3) {
        Parcel parcelR = R();
        parcelR.writeLong(j2);
        parcelR.writeString(str);
        parcelR.writeString(str2);
        parcelR.writeString(str3);
        Y(10, parcelR);
    }

    @Override // com.google.android.gms.measurement.internal.n3
    public final List<ca> I0(String str, String str2, String str3, boolean z) {
        Parcel parcelR = R();
        parcelR.writeString(str);
        parcelR.writeString(str2);
        parcelR.writeString(str3);
        e.c.b.b.c.e.x.d(parcelR, z);
        Parcel parcelU = U(15, parcelR);
        ArrayList arrayListCreateTypedArrayList = parcelU.createTypedArrayList(ca.CREATOR);
        parcelU.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.n3
    public final void L3(r rVar, ka kaVar) {
        Parcel parcelR = R();
        e.c.b.b.c.e.x.c(parcelR, rVar);
        e.c.b.b.c.e.x.c(parcelR, kaVar);
        Y(1, parcelR);
    }

    @Override // com.google.android.gms.measurement.internal.n3
    public final void M1(ka kaVar) {
        Parcel parcelR = R();
        e.c.b.b.c.e.x.c(parcelR, kaVar);
        Y(18, parcelR);
    }

    @Override // com.google.android.gms.measurement.internal.n3
    public final List<wa> N1(String str, String str2, String str3) {
        Parcel parcelR = R();
        parcelR.writeString(str);
        parcelR.writeString(str2);
        parcelR.writeString(str3);
        Parcel parcelU = U(17, parcelR);
        ArrayList arrayListCreateTypedArrayList = parcelU.createTypedArrayList(wa.CREATOR);
        parcelU.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.n3
    public final void P3(Bundle bundle, ka kaVar) {
        Parcel parcelR = R();
        e.c.b.b.c.e.x.c(parcelR, bundle);
        e.c.b.b.c.e.x.c(parcelR, kaVar);
        Y(19, parcelR);
    }

    @Override // com.google.android.gms.measurement.internal.n3
    public final List<wa> T1(String str, String str2, ka kaVar) {
        Parcel parcelR = R();
        parcelR.writeString(str);
        parcelR.writeString(str2);
        e.c.b.b.c.e.x.c(parcelR, kaVar);
        Parcel parcelU = U(16, parcelR);
        ArrayList arrayListCreateTypedArrayList = parcelU.createTypedArrayList(wa.CREATOR);
        parcelU.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.n3
    public final void Z2(ka kaVar) {
        Parcel parcelR = R();
        e.c.b.b.c.e.x.c(parcelR, kaVar);
        Y(6, parcelR);
    }

    @Override // com.google.android.gms.measurement.internal.n3
    public final void e2(wa waVar) {
        Parcel parcelR = R();
        e.c.b.b.c.e.x.c(parcelR, waVar);
        Y(13, parcelR);
    }

    @Override // com.google.android.gms.measurement.internal.n3
    public final String h1(ka kaVar) {
        Parcel parcelR = R();
        e.c.b.b.c.e.x.c(parcelR, kaVar);
        Parcel parcelU = U(11, parcelR);
        String string = parcelU.readString();
        parcelU.recycle();
        return string;
    }

    @Override // com.google.android.gms.measurement.internal.n3
    public final void i4(ca caVar, ka kaVar) {
        Parcel parcelR = R();
        e.c.b.b.c.e.x.c(parcelR, caVar);
        e.c.b.b.c.e.x.c(parcelR, kaVar);
        Y(2, parcelR);
    }

    @Override // com.google.android.gms.measurement.internal.n3
    public final byte[] m0(r rVar, String str) {
        Parcel parcelR = R();
        e.c.b.b.c.e.x.c(parcelR, rVar);
        parcelR.writeString(str);
        Parcel parcelU = U(9, parcelR);
        byte[] bArrCreateByteArray = parcelU.createByteArray();
        parcelU.recycle();
        return bArrCreateByteArray;
    }

    @Override // com.google.android.gms.measurement.internal.n3
    public final List<ca> n2(String str, String str2, boolean z, ka kaVar) {
        Parcel parcelR = R();
        parcelR.writeString(str);
        parcelR.writeString(str2);
        e.c.b.b.c.e.x.d(parcelR, z);
        e.c.b.b.c.e.x.c(parcelR, kaVar);
        Parcel parcelU = U(14, parcelR);
        ArrayList arrayListCreateTypedArrayList = parcelU.createTypedArrayList(ca.CREATOR);
        parcelU.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.n3
    public final void q4(wa waVar, ka kaVar) {
        Parcel parcelR = R();
        e.c.b.b.c.e.x.c(parcelR, waVar);
        e.c.b.b.c.e.x.c(parcelR, kaVar);
        Y(12, parcelR);
    }

    @Override // com.google.android.gms.measurement.internal.n3
    public final void r2(ka kaVar) {
        Parcel parcelR = R();
        e.c.b.b.c.e.x.c(parcelR, kaVar);
        Y(4, parcelR);
    }

    @Override // com.google.android.gms.measurement.internal.n3
    public final void s0(ka kaVar) {
        Parcel parcelR = R();
        e.c.b.b.c.e.x.c(parcelR, kaVar);
        Y(20, parcelR);
    }
}