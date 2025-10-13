package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.net.SyslogConstants;
import java.util.ArrayList;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
public final class ma implements Parcelable.Creator<ka> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ka createFromParcel(Parcel parcel) {
        int iA = com.google.android.gms.common.internal.w.b.A(parcel);
        long jW = 0;
        long jW2 = 0;
        long jW3 = 0;
        long jW4 = 0;
        long jW5 = 0;
        String strF = null;
        String strF2 = null;
        String strF3 = null;
        String strF4 = null;
        String strF5 = null;
        String strF6 = null;
        String strF7 = null;
        Boolean boolN = null;
        ArrayList<String> arrayListH = null;
        String strF8 = null;
        long jW6 = -2147483648L;
        String strF9 = "";
        boolean zM = true;
        boolean zM2 = false;
        int iV = 0;
        boolean zM3 = true;
        boolean zM4 = true;
        boolean zM5 = false;
        while (parcel.dataPosition() < iA) {
            int iT = com.google.android.gms.common.internal.w.b.t(parcel);
            switch (com.google.android.gms.common.internal.w.b.l(iT)) {
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
                    jW = com.google.android.gms.common.internal.w.b.w(parcel, iT);
                    break;
                case 7:
                    jW2 = com.google.android.gms.common.internal.w.b.w(parcel, iT);
                    break;
                case 8:
                    strF5 = com.google.android.gms.common.internal.w.b.f(parcel, iT);
                    break;
                case 9:
                    zM = com.google.android.gms.common.internal.w.b.m(parcel, iT);
                    break;
                case 10:
                    zM2 = com.google.android.gms.common.internal.w.b.m(parcel, iT);
                    break;
                case 11:
                    jW6 = com.google.android.gms.common.internal.w.b.w(parcel, iT);
                    break;
                case 12:
                    strF6 = com.google.android.gms.common.internal.w.b.f(parcel, iT);
                    break;
                case 13:
                    jW3 = com.google.android.gms.common.internal.w.b.w(parcel, iT);
                    break;
                case 14:
                    jW4 = com.google.android.gms.common.internal.w.b.w(parcel, iT);
                    break;
                case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
                    iV = com.google.android.gms.common.internal.w.b.v(parcel, iT);
                    break;
                case 16:
                    zM3 = com.google.android.gms.common.internal.w.b.m(parcel, iT);
                    break;
                case 17:
                    zM4 = com.google.android.gms.common.internal.w.b.m(parcel, iT);
                    break;
                case 18:
                    zM5 = com.google.android.gms.common.internal.w.b.m(parcel, iT);
                    break;
                case 19:
                    strF7 = com.google.android.gms.common.internal.w.b.f(parcel, iT);
                    break;
                case 20:
                default:
                    com.google.android.gms.common.internal.w.b.z(parcel, iT);
                    break;
                case 21:
                    boolN = com.google.android.gms.common.internal.w.b.n(parcel, iT);
                    break;
                case 22:
                    jW5 = com.google.android.gms.common.internal.w.b.w(parcel, iT);
                    break;
                case 23:
                    arrayListH = com.google.android.gms.common.internal.w.b.h(parcel, iT);
                    break;
                case SyslogConstants.LOG_DAEMON /* 24 */:
                    strF8 = com.google.android.gms.common.internal.w.b.f(parcel, iT);
                    break;
                case 25:
                    strF9 = com.google.android.gms.common.internal.w.b.f(parcel, iT);
                    break;
            }
        }
        com.google.android.gms.common.internal.w.b.k(parcel, iA);
        return new ka(strF, strF2, strF3, strF4, jW, jW2, strF5, zM, zM2, jW6, strF6, jW3, jW4, iV, zM3, zM4, zM5, strF7, boolN, jW5, arrayListH, strF8, strF9);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ka[] newArray(int i2) {
        return new ka[i2];
    }
}