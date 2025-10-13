package com.google.android.gms.ads.internal.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.telephony.TelephonyManager;
import com.google.android.gms.internal.ads.p63;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
@TargetApi(26)
/* loaded from: classes.dex */
public class zzz extends zzy {
    @Override // com.google.android.gms.ads.internal.util.zzac
    public final p63 zzq(Context context, TelephonyManager telephonyManager) {
        com.google.android.gms.ads.internal.zzs.zzc();
        return zzr.zzD(context, "android.permission.ACCESS_NETWORK_STATE") ? telephonyManager.isDataEnabled() ? p63.ENUM_TRUE : p63.ENUM_FALSE : p63.ENUM_FALSE;
    }
}