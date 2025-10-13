package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.ads.internal.util.zzf;
import com.google.android.gms.ads.internal.util.zzr;
import com.google.android.gms.ads.internal.zzs;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class or implements Executor {

    /* renamed from: e */
    private final Handler f8004e = new zzf(Looper.getMainLooper());

    or() {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            this.f8004e.post(runnable);
            return;
        }
        try {
            runnable.run();
        } catch (Throwable th) {
            zzs.zzc();
            zzr.zzM(zzs.zzg().m(), th);
            throw th;
        }
    }
}