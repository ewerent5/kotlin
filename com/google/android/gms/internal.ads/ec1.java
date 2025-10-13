package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class ec1 implements ah1 {
    private final g52<String> a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f5619b;

    public ec1(g52<String> g52Var, Executor executor) {
        this.a = g52Var;
        this.f5619b = executor;
    }

    @Override // com.google.android.gms.internal.ads.ah1
    public final g52 zza() {
        return y42.h(this.a, cc1.a, this.f5619b);
    }
}