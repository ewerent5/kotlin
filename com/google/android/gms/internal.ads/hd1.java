package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class hd1 implements Callable {
    private final id1 a;

    hd1(id1 id1Var) {
        this.a = id1Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.a.a();
    }
}