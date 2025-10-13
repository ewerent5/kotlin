package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class yi1 implements ah1<zi1> {
    final ScheduledExecutorService a;

    /* renamed from: b, reason: collision with root package name */
    final Context f10428b;

    /* renamed from: c, reason: collision with root package name */
    final zj f10429c;

    public yi1(zj zjVar, ScheduledExecutorService scheduledExecutorService, Context context, byte[] bArr) {
        this.f10429c = zjVar;
        this.a = scheduledExecutorService;
        this.f10428b = context;
    }

    @Override // com.google.android.gms.internal.ads.ah1
    public final g52<zi1> zza() {
        return y42.i(y42.g(y42.a(new Bundle()), ((Long) c.c().b(w3.n2)).longValue(), TimeUnit.MILLISECONDS, this.a), xi1.a, qr.a);
    }
}