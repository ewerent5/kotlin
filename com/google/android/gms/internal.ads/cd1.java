package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class cd1 implements ah1<zg1<Bundle>> {
    private final Executor a;

    /* renamed from: b, reason: collision with root package name */
    private final oq f5305b;

    cd1(Executor executor, oq oqVar) {
        this.a = executor;
        this.f5305b = oqVar;
    }

    @Override // com.google.android.gms.internal.ads.ah1
    public final g52<zg1<Bundle>> zza() {
        return ((Boolean) c.c().b(w3.G1)).booleanValue() ? y42.a(null) : y42.i(this.f5305b.n(), ad1.a, this.a);
    }
}