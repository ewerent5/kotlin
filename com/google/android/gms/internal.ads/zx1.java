package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class zx1 implements Callable {
    private final fy1 a;

    zx1(fy1 fy1Var) {
        this.a = fy1Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.a.f();
    }
}