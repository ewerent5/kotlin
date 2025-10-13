package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class c51 implements Callable {
    private final f51 a;

    /* renamed from: b */
    private final kp1 f5260b;

    /* renamed from: c */
    private final xo1 f5261c;

    c51(f51 f51Var, kp1 kp1Var, xo1 xo1Var) {
        this.a = f51Var;
        this.f5260b = kp1Var;
        this.f5261c = xo1Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.a.c(this.f5260b, this.f5261c);
    }
}