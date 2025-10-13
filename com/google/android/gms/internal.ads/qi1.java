package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class qi1 implements Callable {
    private final g52 a;

    /* renamed from: b */
    private final g52 f8391b;

    qi1(g52 g52Var, g52 g52Var2) {
        this.a = g52Var;
        this.f8391b = g52Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        return new si1((String) this.a.get(), (String) this.f8391b.get());
    }
}