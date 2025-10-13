package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class u90 implements Callable {
    private final v90 a;

    /* renamed from: b */
    private final g52 f9407b;

    u90(v90 v90Var, g52 g52Var) {
        this.a = v90Var;
        this.f9407b = g52Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.a.c(this.f9407b);
    }
}