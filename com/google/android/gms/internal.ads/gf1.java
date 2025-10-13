package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class gf1 implements Callable {
    private final kf1 a;

    gf1(kf1 kf1Var) {
        this.a = kf1Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.a.b();
    }
}