package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class u52 extends f52<g52> {

    /* renamed from: h, reason: collision with root package name */
    private final d42 f9385h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ w52 f9386i;

    u52(w52 w52Var, d42 d42Var) {
        this.f9386i = w52Var;
        Objects.requireNonNull(d42Var);
        this.f9385h = d42Var;
    }

    @Override // com.google.android.gms.internal.ads.f52
    final /* bridge */ /* synthetic */ g52 a() {
        g52 g52VarZza = this.f9385h.zza();
        h12.c(g52VarZza, "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", this.f9385h);
        return g52VarZza;
    }

    @Override // com.google.android.gms.internal.ads.f52
    final String b() {
        return this.f9385h.toString();
    }

    @Override // com.google.android.gms.internal.ads.f52
    final boolean c() {
        return this.f9386i.isDone();
    }

    @Override // com.google.android.gms.internal.ads.f52
    final /* bridge */ /* synthetic */ void d(g52 g52Var, Throwable th) {
        g52 g52Var2 = g52Var;
        if (th == null) {
            this.f9386i.n(g52Var2);
        } else {
            this.f9386i.m(th);
        }
    }
}