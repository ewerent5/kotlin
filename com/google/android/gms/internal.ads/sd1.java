package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zg1;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class sd1<S extends zg1<?>> {
    public final g52<S> a;

    /* renamed from: b, reason: collision with root package name */
    private final long f8853b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.common.util.f f8854c;

    public sd1(g52<S> g52Var, long j2, com.google.android.gms.common.util.f fVar) {
        this.a = g52Var;
        this.f8854c = fVar;
        this.f8853b = fVar.c() + j2;
    }

    public final boolean a() {
        return this.f8853b < this.f8854c.c();
    }
}