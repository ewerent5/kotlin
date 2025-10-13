package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.net.SyslogConstants;
import java.util.ArrayList;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class cl implements Parcelable.Creator<bl> {
    public static final bl a(Parcel parcel) {
        int iA = com.google.android.gms.common.internal.w.b.A(parcel);
        long jW = 0;
        long jW2 = 0;
        Bundle bundleA = null;
        m93 m93Var = null;
        r93 r93Var = null;
        String strF = null;
        ApplicationInfo applicationInfo = null;
        PackageInfo packageInfo = null;
        String strF2 = null;
        String strF3 = null;
        String strF4 = null;
        kr krVar = null;
        Bundle bundleA2 = null;
        ArrayList<String> arrayListH = null;
        Bundle bundleA3 = null;
        String strF5 = null;
        String strF6 = null;
        ArrayList<String> arrayListH2 = null;
        String strF7 = null;
        g6 g6Var = null;
        ArrayList<String> arrayListH3 = null;
        String strF8 = null;
        String strF9 = null;
        String strF10 = null;
        Bundle bundleA4 = null;
        String strF11 = null;
        r1 r1Var = null;
        Bundle bundleA5 = null;
        String strF12 = null;
        String strF13 = null;
        String strF14 = null;
        ArrayList<Integer> arrayListD = null;
        String strF15 = null;
        ArrayList<String> arrayListH4 = null;
        ArrayList<String> arrayListH5 = null;
        String strF16 = null;
        jc jcVar = null;
        String strF17 = null;
        Bundle bundleA6 = null;
        int iV = 0;
        int iV2 = 0;
        boolean zM = false;
        int iV3 = 0;
        int iV4 = 0;
        float fR = 0.0f;
        float fR2 = 0.0f;
        boolean zM2 = false;
        int iV5 = 0;
        int iV6 = 0;
        boolean zM3 = false;
        boolean zM4 = false;
        int iV7 = 0;
        boolean zM5 = false;
        boolean zM6 = false;
        int iV8 = 0;
        boolean zM7 = false;
        boolean zM8 = false;
        boolean zM9 = false;
        while (parcel.dataPosition() < iA) {
            int iT = com.google.android.gms.common.internal.w.b.t(parcel);
            switch (com.google.android.gms.common.internal.w.b.l(iT)) {
                case 1:
                    iV = com.google.android.gms.common.internal.w.b.v(parcel, iT);
                    break;
                case 2:
                    bundleA = com.google.android.gms.common.internal.w.b.a(parcel, iT);
                    break;
                case 3:
                    m93Var = (m93) com.google.android.gms.common.internal.w.b.e(parcel, iT, m93.CREATOR);
                    break;
                case 4:
                    r93Var = (r93) com.google.android.gms.common.internal.w.b.e(parcel, iT, r93.CREATOR);
                    break;
                case 5:
                    strF = com.google.android.gms.common.internal.w.b.f(parcel, iT);
                    break;
                case 6:
                    applicationInfo = (ApplicationInfo) com.google.android.gms.common.internal.w.b.e(parcel, iT, ApplicationInfo.CREATOR);
                    break;
                case 7:
                    packageInfo = (PackageInfo) com.google.android.gms.common.internal.w.b.e(parcel, iT, PackageInfo.CREATOR);
                    break;
                case 8:
                    strF2 = com.google.android.gms.common.internal.w.b.f(parcel, iT);
                    break;
                case 9:
                    strF3 = com.google.android.gms.common.internal.w.b.f(parcel, iT);
                    break;
                case 10:
                    strF4 = com.google.android.gms.common.internal.w.b.f(parcel, iT);
                    break;
                case 11:
                    krVar = (kr) com.google.android.gms.common.internal.w.b.e(parcel, iT, kr.CREATOR);
                    break;
                case 12:
                    bundleA2 = com.google.android.gms.common.internal.w.b.a(parcel, iT);
                    break;
                case 13:
                    iV2 = com.google.android.gms.common.internal.w.b.v(parcel, iT);
                    break;
                case 14:
                    arrayListH = com.google.android.gms.common.internal.w.b.h(parcel, iT);
                    break;
                case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
                    bundleA3 = com.google.android.gms.common.internal.w.b.a(parcel, iT);
                    break;
                case 16:
                    zM = com.google.android.gms.common.internal.w.b.m(parcel, iT);
                    break;
                case 17:
                case 22:
                case 23:
                case SyslogConstants.LOG_DAEMON /* 24 */:
                case 32:
                case 38:
                case 62:
                default:
                    com.google.android.gms.common.internal.w.b.z(parcel, iT);
                    break;
                case 18:
                    iV3 = com.google.android.gms.common.internal.w.b.v(parcel, iT);
                    break;
                case 19:
                    iV4 = com.google.android.gms.common.internal.w.b.v(parcel, iT);
                    break;
                case 20:
                    fR = com.google.android.gms.common.internal.w.b.r(parcel, iT);
                    break;
                case 21:
                    strF5 = com.google.android.gms.common.internal.w.b.f(parcel, iT);
                    break;
                case 25:
                    jW = com.google.android.gms.common.internal.w.b.w(parcel, iT);
                    break;
                case 26:
                    strF6 = com.google.android.gms.common.internal.w.b.f(parcel, iT);
                    break;
                case 27:
                    arrayListH2 = com.google.android.gms.common.internal.w.b.h(parcel, iT);
                    break;
                case 28:
                    strF7 = com.google.android.gms.common.internal.w.b.f(parcel, iT);
                    break;
                case 29:
                    g6Var = (g6) com.google.android.gms.common.internal.w.b.e(parcel, iT, g6.CREATOR);
                    break;
                case 30:
                    arrayListH3 = com.google.android.gms.common.internal.w.b.h(parcel, iT);
                    break;
                case 31:
                    jW2 = com.google.android.gms.common.internal.w.b.w(parcel, iT);
                    break;
                case 33:
                    strF8 = com.google.android.gms.common.internal.w.b.f(parcel, iT);
                    break;
                case 34:
                    fR2 = com.google.android.gms.common.internal.w.b.r(parcel, iT);
                    break;
                case 35:
                    iV5 = com.google.android.gms.common.internal.w.b.v(parcel, iT);
                    break;
                case 36:
                    iV6 = com.google.android.gms.common.internal.w.b.v(parcel, iT);
                    break;
                case 37:
                    zM3 = com.google.android.gms.common.internal.w.b.m(parcel, iT);
                    break;
                case 39:
                    strF9 = com.google.android.gms.common.internal.w.b.f(parcel, iT);
                    break;
                case 40:
                    zM2 = com.google.android.gms.common.internal.w.b.m(parcel, iT);
                    break;
                case 41:
                    strF10 = com.google.android.gms.common.internal.w.b.f(parcel, iT);
                    break;
                case 42:
                    zM4 = com.google.android.gms.common.internal.w.b.m(parcel, iT);
                    break;
                case 43:
                    iV7 = com.google.android.gms.common.internal.w.b.v(parcel, iT);
                    break;
                case 44:
                    bundleA4 = com.google.android.gms.common.internal.w.b.a(parcel, iT);
                    break;
                case 45:
                    strF11 = com.google.android.gms.common.internal.w.b.f(parcel, iT);
                    break;
                case 46:
                    r1Var = (r1) com.google.android.gms.common.internal.w.b.e(parcel, iT, r1.CREATOR);
                    break;
                case 47:
                    zM5 = com.google.android.gms.common.internal.w.b.m(parcel, iT);
                    break;
                case SyslogConstants.LOG_LPR /* 48 */:
                    bundleA5 = com.google.android.gms.common.internal.w.b.a(parcel, iT);
                    break;
                case 49:
                    strF12 = com.google.android.gms.common.internal.w.b.f(parcel, iT);
                    break;
                case 50:
                    strF13 = com.google.android.gms.common.internal.w.b.f(parcel, iT);
                    break;
                case 51:
                    strF14 = com.google.android.gms.common.internal.w.b.f(parcel, iT);
                    break;
                case 52:
                    zM6 = com.google.android.gms.common.internal.w.b.m(parcel, iT);
                    break;
                case 53:
                    arrayListD = com.google.android.gms.common.internal.w.b.d(parcel, iT);
                    break;
                case 54:
                    strF15 = com.google.android.gms.common.internal.w.b.f(parcel, iT);
                    break;
                case 55:
                    arrayListH4 = com.google.android.gms.common.internal.w.b.h(parcel, iT);
                    break;
                case SyslogConstants.LOG_NEWS /* 56 */:
                    iV8 = com.google.android.gms.common.internal.w.b.v(parcel, iT);
                    break;
                case 57:
                    zM7 = com.google.android.gms.common.internal.w.b.m(parcel, iT);
                    break;
                case 58:
                    zM8 = com.google.android.gms.common.internal.w.b.m(parcel, iT);
                    break;
                case 59:
                    zM9 = com.google.android.gms.common.internal.w.b.m(parcel, iT);
                    break;
                case 60:
                    arrayListH5 = com.google.android.gms.common.internal.w.b.h(parcel, iT);
                    break;
                case 61:
                    strF16 = com.google.android.gms.common.internal.w.b.f(parcel, iT);
                    break;
                case 63:
                    jcVar = (jc) com.google.android.gms.common.internal.w.b.e(parcel, iT, jc.CREATOR);
                    break;
                case 64:
                    strF17 = com.google.android.gms.common.internal.w.b.f(parcel, iT);
                    break;
                case 65:
                    bundleA6 = com.google.android.gms.common.internal.w.b.a(parcel, iT);
                    break;
            }
        }
        com.google.android.gms.common.internal.w.b.k(parcel, iA);
        return new bl(iV, bundleA, m93Var, r93Var, strF, applicationInfo, packageInfo, strF2, strF3, strF4, krVar, bundleA2, iV2, arrayListH, bundleA3, zM, iV3, iV4, fR, strF5, jW, strF6, arrayListH2, strF7, g6Var, arrayListH3, jW2, strF8, fR2, zM2, iV5, iV6, zM3, strF9, strF10, zM4, iV7, bundleA4, strF11, r1Var, zM5, bundleA5, strF12, strF13, strF14, zM6, arrayListD, strF15, arrayListH4, iV8, zM7, zM8, zM9, arrayListH5, strF16, jcVar, strF17, bundleA6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ bl createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ bl[] newArray(int i2) {
        return new bl[i2];
    }
}