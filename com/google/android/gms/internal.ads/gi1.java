package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class gi1 implements ah1<hi1> {
    private final Context a;

    /* renamed from: b, reason: collision with root package name */
    private final oq f6128b;

    /* renamed from: c, reason: collision with root package name */
    private final ScheduledExecutorService f6129c;

    /* renamed from: d, reason: collision with root package name */
    private final Executor f6130d;

    /* renamed from: e, reason: collision with root package name */
    private final hq f6131e;

    public gi1(hq hqVar, int i2, Context context, oq oqVar, ScheduledExecutorService scheduledExecutorService, Executor executor, byte[] bArr) {
        this.f6131e = hqVar;
        this.a = context;
        this.f6128b = oqVar;
        this.f6129c = scheduledExecutorService;
        this.f6130d = executor;
    }

    final /* synthetic */ hi1 a(Exception exc) {
        this.f6128b.g(exc, "AttestationTokenSignal");
        return null;
    }

    @Override // com.google.android.gms.internal.ads.ah1
    public final g52<hi1> zza() {
        return y42.e((p42) y42.g(y42.i(p42.D(y42.d(new d42(this) { // from class: com.google.android.gms.internal.ads.di1
            private final gi1 a;

            {
                this.a = this;
            }

            @Override // com.google.android.gms.internal.ads.d42
            public final g52 zza() {
                return y42.a(null);
            }
        }, this.f6130d)), ei1.a, this.f6130d), ((Long) c.c().b(w3.G0)).longValue(), TimeUnit.MILLISECONDS, this.f6129c), Exception.class, new x02(this) { // from class: com.google.android.gms.internal.ads.fi1
            private final gi1 a;

            {
                this.a = this;
            }

            @Override // com.google.android.gms.internal.ads.x02
            public final Object apply(Object obj) {
                this.a.a((Exception) obj);
                return null;
            }
        }, o52.a());
    }
}