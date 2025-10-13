package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class o93 implements Parcelable.Creator<m93> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ m93 createFromParcel(Parcel parcel) {
        int iA = com.google.android.gms.common.internal.w.b.A(parcel);
        Bundle bundleA = null;
        ArrayList<String> arrayListH = null;
        String strF = null;
        z2 z2Var = null;
        Location location = null;
        String strF2 = null;
        Bundle bundleA2 = null;
        Bundle bundleA3 = null;
        ArrayList<String> arrayListH2 = null;
        String strF3 = null;
        String strF4 = null;
        e93 e93Var = null;
        String strF5 = null;
        ArrayList<String> arrayListH3 = null;
        long jW = 0;
        int iV = 0;
        int iV2 = 0;
        boolean zM = false;
        int iV3 = 0;
        boolean zM2 = false;
        boolean zM3 = false;
        int iV4 = 0;
        int iV5 = 0;
        while (parcel.dataPosition() < iA) {
            int iT = com.google.android.gms.common.internal.w.b.t(parcel);
            switch (com.google.android.gms.common.internal.w.b.l(iT)) {
                case 1:
                    iV = com.google.android.gms.common.internal.w.b.v(parcel, iT);
                    break;
                case 2:
                    jW = com.google.android.gms.common.internal.w.b.w(parcel, iT);
                    break;
                case 3:
                    bundleA = com.google.android.gms.common.internal.w.b.a(parcel, iT);
                    break;
                case 4:
                    iV2 = com.google.android.gms.common.internal.w.b.v(parcel, iT);
                    break;
                case 5:
                    arrayListH = com.google.android.gms.common.internal.w.b.h(parcel, iT);
                    break;
                case 6:
                    zM = com.google.android.gms.common.internal.w.b.m(parcel, iT);
                    break;
                case 7:
                    iV3 = com.google.android.gms.common.internal.w.b.v(parcel, iT);
                    break;
                case 8:
                    zM2 = com.google.android.gms.common.internal.w.b.m(parcel, iT);
                    break;
                case 9:
                    strF = com.google.android.gms.common.internal.w.b.f(parcel, iT);
                    break;
                case 10:
                    z2Var = (z2) com.google.android.gms.common.internal.w.b.e(parcel, iT, z2.CREATOR);
                    break;
                case 11:
                    location = (Location) com.google.android.gms.common.internal.w.b.e(parcel, iT, Location.CREATOR);
                    break;
                case 12:
                    strF2 = com.google.android.gms.common.internal.w.b.f(parcel, iT);
                    break;
                case 13:
                    bundleA2 = com.google.android.gms.common.internal.w.b.a(parcel, iT);
                    break;
                case 14:
                    bundleA3 = com.google.android.gms.common.internal.w.b.a(parcel, iT);
                    break;
                case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
                    arrayListH2 = com.google.android.gms.common.internal.w.b.h(parcel, iT);
                    break;
                case 16:
                    strF3 = com.google.android.gms.common.internal.w.b.f(parcel, iT);
                    break;
                case 17:
                    strF4 = com.google.android.gms.common.internal.w.b.f(parcel, iT);
                    break;
                case 18:
                    zM3 = com.google.android.gms.common.internal.w.b.m(parcel, iT);
                    break;
                case 19:
                    e93Var = (e93) com.google.android.gms.common.internal.w.b.e(parcel, iT, e93.CREATOR);
                    break;
                case 20:
                    iV4 = com.google.android.gms.common.internal.w.b.v(parcel, iT);
                    break;
                case 21:
                    strF5 = com.google.android.gms.common.internal.w.b.f(parcel, iT);
                    break;
                case 22:
                    arrayListH3 = com.google.android.gms.common.internal.w.b.h(parcel, iT);
                    break;
                case 23:
                    iV5 = com.google.android.gms.common.internal.w.b.v(parcel, iT);
                    break;
                default:
                    com.google.android.gms.common.internal.w.b.z(parcel, iT);
                    break;
            }
        }
        com.google.android.gms.common.internal.w.b.k(parcel, iA);
        return new m93(iV, jW, bundleA, iV2, arrayListH, zM, iV3, zM2, strF, z2Var, location, strF2, bundleA2, bundleA3, arrayListH2, strF3, strF4, zM3, e93Var, iV4, strF5, arrayListH3, iV5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ m93[] newArray(int i2) {
        return new m93[i2];
    }
}