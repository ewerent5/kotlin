package com.google.android.gms.ads.internal.util;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.internal.ads.l02;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class zzbl {
    private HandlerThread zza = null;
    private Handler zzb = null;
    private int zzc = 0;
    private final Object zzd = new Object();

    public final Looper zza() {
        Looper looper;
        synchronized (this.zzd) {
            if (this.zzc != 0) {
                p.k(this.zza, "Invalid state: mHandlerThread should already been initialized.");
            } else if (this.zza == null) {
                zze.zza("Starting the looper thread.");
                HandlerThread handlerThread = new HandlerThread("LooperProvider");
                this.zza = handlerThread;
                handlerThread.start();
                this.zzb = new l02(this.zza.getLooper());
                zze.zza("Looper thread started.");
            } else {
                zze.zza("Resuming the looper thread");
                this.zzd.notifyAll();
            }
            this.zzc++;
            looper = this.zza.getLooper();
        }
        return looper;
    }

    public final Handler zzb() {
        return this.zzb;
    }
}