package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class ld1 implements Callable {
    private final md1 a;

    ld1(md1 md1Var) {
        this.a = md1Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.a.a();
    }
}