package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class q21 implements Callable {
    private final x21 a;

    q21(x21 x21Var) {
        this.a = x21Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.a.getWritableDatabase();
    }
}