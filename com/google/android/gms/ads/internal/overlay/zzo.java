package com.google.android.gms.ads.internal.overlay;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.gms.common.internal.w.b;
import com.google.android.gms.internal.ads.kr;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class zzo implements Parcelable.Creator<AdOverlayInfoParcel> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ AdOverlayInfoParcel createFromParcel(Parcel parcel) {
        int iA = b.A(parcel);
        zzc zzcVar = null;
        IBinder iBinderU = null;
        IBinder iBinderU2 = null;
        IBinder iBinderU3 = null;
        IBinder iBinderU4 = null;
        String strF = null;
        String strF2 = null;
        IBinder iBinderU5 = null;
        String strF3 = null;
        kr krVar = null;
        String strF4 = null;
        com.google.android.gms.ads.internal.zzj zzjVar = null;
        IBinder iBinderU6 = null;
        String strF5 = null;
        IBinder iBinderU7 = null;
        IBinder iBinderU8 = null;
        IBinder iBinderU9 = null;
        IBinder iBinderU10 = null;
        String strF6 = null;
        String strF7 = null;
        boolean zM = false;
        int iV = 0;
        int iV2 = 0;
        while (parcel.dataPosition() < iA) {
            int iT = b.t(parcel);
            switch (b.l(iT)) {
                case 2:
                    zzcVar = (zzc) b.e(parcel, iT, zzc.CREATOR);
                    break;
                case 3:
                    iBinderU = b.u(parcel, iT);
                    break;
                case 4:
                    iBinderU2 = b.u(parcel, iT);
                    break;
                case 5:
                    iBinderU3 = b.u(parcel, iT);
                    break;
                case 6:
                    iBinderU4 = b.u(parcel, iT);
                    break;
                case 7:
                    strF = b.f(parcel, iT);
                    break;
                case 8:
                    zM = b.m(parcel, iT);
                    break;
                case 9:
                    strF2 = b.f(parcel, iT);
                    break;
                case 10:
                    iBinderU5 = b.u(parcel, iT);
                    break;
                case 11:
                    iV = b.v(parcel, iT);
                    break;
                case 12:
                    iV2 = b.v(parcel, iT);
                    break;
                case 13:
                    strF3 = b.f(parcel, iT);
                    break;
                case 14:
                    krVar = (kr) b.e(parcel, iT, kr.CREATOR);
                    break;
                case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
                default:
                    b.z(parcel, iT);
                    break;
                case 16:
                    strF4 = b.f(parcel, iT);
                    break;
                case 17:
                    zzjVar = (com.google.android.gms.ads.internal.zzj) b.e(parcel, iT, com.google.android.gms.ads.internal.zzj.CREATOR);
                    break;
                case 18:
                    iBinderU6 = b.u(parcel, iT);
                    break;
                case 19:
                    strF5 = b.f(parcel, iT);
                    break;
                case 20:
                    iBinderU7 = b.u(parcel, iT);
                    break;
                case 21:
                    iBinderU8 = b.u(parcel, iT);
                    break;
                case 22:
                    iBinderU9 = b.u(parcel, iT);
                    break;
                case 23:
                    iBinderU10 = b.u(parcel, iT);
                    break;
                case SyslogConstants.LOG_DAEMON /* 24 */:
                    strF6 = b.f(parcel, iT);
                    break;
                case 25:
                    strF7 = b.f(parcel, iT);
                    break;
            }
        }
        b.k(parcel, iA);
        return new AdOverlayInfoParcel(zzcVar, iBinderU, iBinderU2, iBinderU3, iBinderU4, strF, zM, strF2, iBinderU5, iV, iV2, strF3, krVar, strF4, zzjVar, iBinderU6, strF5, iBinderU7, iBinderU8, iBinderU9, iBinderU10, strF6, strF7);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ AdOverlayInfoParcel[] newArray(int i2) {
        return new AdOverlayInfoParcel[i2];
    }
}