package com.google.android.gms.ads.internal.util;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.internal.ads.l02;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class zzf extends l02 {
    public zzf(Looper looper) {
        super(looper);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        try {
            super.handleMessage(message);
        } catch (Exception e2) {
            com.google.android.gms.ads.internal.zzs.zzg().g(e2, "AdMobHandler.handleMessage");
        }
    }

    @Override // com.google.android.gms.internal.ads.l02
    protected final void zza(Message message) {
        try {
            super.zza(message);
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.zzs.zzc();
            zzr.zzM(com.google.android.gms.ads.internal.zzs.zzg().m(), th);
            throw th;
        }
    }
}