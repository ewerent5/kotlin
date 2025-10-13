package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class rl implements Parcelable.Creator<ql> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ql createFromParcel(Parcel parcel) {
        int iA = com.google.android.gms.common.internal.w.b.A(parcel);
        Bundle bundleA = null;
        kr krVar = null;
        ApplicationInfo applicationInfo = null;
        String strF = null;
        ArrayList<String> arrayListH = null;
        PackageInfo packageInfo = null;
        String strF2 = null;
        String strF3 = null;
        jr1 jr1Var = null;
        String strF4 = null;
        while (parcel.dataPosition() < iA) {
            int iT = com.google.android.gms.common.internal.w.b.t(parcel);
            switch (com.google.android.gms.common.internal.w.b.l(iT)) {
                case 1:
                    bundleA = com.google.android.gms.common.internal.w.b.a(parcel, iT);
                    break;
                case 2:
                    krVar = (kr) com.google.android.gms.common.internal.w.b.e(parcel, iT, kr.CREATOR);
                    break;
                case 3:
                    applicationInfo = (ApplicationInfo) com.google.android.gms.common.internal.w.b.e(parcel, iT, ApplicationInfo.CREATOR);
                    break;
                case 4:
                    strF = com.google.android.gms.common.internal.w.b.f(parcel, iT);
                    break;
                case 5:
                    arrayListH = com.google.android.gms.common.internal.w.b.h(parcel, iT);
                    break;
                case 6:
                    packageInfo = (PackageInfo) com.google.android.gms.common.internal.w.b.e(parcel, iT, PackageInfo.CREATOR);
                    break;
                case 7:
                    strF2 = com.google.android.gms.common.internal.w.b.f(parcel, iT);
                    break;
                case 8:
                default:
                    com.google.android.gms.common.internal.w.b.z(parcel, iT);
                    break;
                case 9:
                    strF3 = com.google.android.gms.common.internal.w.b.f(parcel, iT);
                    break;
                case 10:
                    jr1Var = (jr1) com.google.android.gms.common.internal.w.b.e(parcel, iT, jr1.CREATOR);
                    break;
                case 11:
                    strF4 = com.google.android.gms.common.internal.w.b.f(parcel, iT);
                    break;
            }
        }
        com.google.android.gms.common.internal.w.b.k(parcel, iA);
        return new ql(bundleA, krVar, applicationInfo, strF, arrayListH, packageInfo, strF2, strF3, jr1Var, strF4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ql[] newArray(int i2) {
        return new ql[i2];
    }
}