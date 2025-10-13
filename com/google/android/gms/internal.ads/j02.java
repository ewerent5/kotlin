package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
final class j02 implements h02 {
    /* synthetic */ j02(i02 i02Var) {
    }

    @Override // com.google.android.gms.internal.ads.h02
    public final ExecutorService a(int i2, ThreadFactory threadFactory, int i3) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i2, i2, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    @Override // com.google.android.gms.internal.ads.h02
    public final ExecutorService b(ThreadFactory threadFactory, int i2) {
        return a(1, threadFactory, 1);
    }

    @Override // com.google.android.gms.internal.ads.h02
    public final ExecutorService zzb(int i2) {
        return a(1, Executors.defaultThreadFactory(), 2);
    }
}