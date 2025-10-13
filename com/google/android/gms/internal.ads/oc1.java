package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class oc1 implements Callable {
    private final pc1 a;

    oc1(pc1 pc1Var) {
        this.a = pc1Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.a.a();
    }
}