package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class vg1 implements Callable {
    private final xg1 a;

    vg1(xg1 xg1Var) {
        this.a = xg1Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.a.b();
    }
}