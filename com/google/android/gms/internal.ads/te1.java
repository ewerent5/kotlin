package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class te1 implements Callable {
    private final ue1 a;

    te1(ue1 ue1Var) {
        this.a = ue1Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.a.a();
    }
}