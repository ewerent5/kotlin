package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zg1;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class sf1<S extends zg1> implements ah1<S> {
    private final ah1<S> a;

    /* renamed from: b, reason: collision with root package name */
    private final long f8861b;

    /* renamed from: c, reason: collision with root package name */
    private final ScheduledExecutorService f8862c;

    public sf1(ah1<S> ah1Var, long j2, ScheduledExecutorService scheduledExecutorService) {
        this.a = ah1Var;
        this.f8861b = j2;
        this.f8862c = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.ah1
    public final g52<S> zza() {
        g52 g52VarZza = this.a.zza();
        long j2 = this.f8861b;
        if (j2 > 0) {
            g52VarZza = y42.g(g52VarZza, j2, TimeUnit.MILLISECONDS, this.f8862c);
        }
        return y42.f(g52VarZza, Throwable.class, rf1.a, qr.f8451f);
    }
}