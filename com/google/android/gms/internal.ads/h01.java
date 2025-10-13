package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class h01 implements Callable {
    private final g52 a;

    /* renamed from: b */
    private final g52 f6263b;

    h01(g52 g52Var, g52 g52Var2) {
        this.a = g52Var;
        this.f6263b = g52Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        g52 g52Var = this.a;
        g52 g52Var2 = this.f6263b;
        return new u01((y01) g52Var.get(), ((s01) g52Var2.get()).f8807b, ((s01) g52Var2.get()).a);
    }
}