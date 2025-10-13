package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.g;
import com.google.android.gms.common.h;
import com.google.android.gms.internal.ads.dr;
import com.google.android.gms.internal.ads.er;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class zzc extends zzb {
    private final Context zza;

    zzc(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
        boolean isAdIdFakeForDebugLogging;
        try {
            isAdIdFakeForDebugLogging = AdvertisingIdClient.getIsAdIdFakeForDebugLogging(this.zza);
        } catch (g | h | IOException | IllegalStateException e2) {
            er.zzg("Fail to get isAdIdFakeForDebugLogging", e2);
            isAdIdFakeForDebugLogging = false;
        }
        dr.h(isAdIdFakeForDebugLogging);
        StringBuilder sb = new StringBuilder(43);
        sb.append("Update ad debug logging enablement as ");
        sb.append(isAdIdFakeForDebugLogging);
        er.zzi(sb.toString());
    }
}