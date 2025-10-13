package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class ux0 implements Callable {
    private final xx0 a;

    /* renamed from: b */
    private final ql f9585b;

    ux0(xx0 xx0Var, ql qlVar) {
        this.a = xx0Var;
        this.f9585b = qlVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.a.c(this.f9585b);
    }
}