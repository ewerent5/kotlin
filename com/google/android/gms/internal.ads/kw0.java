package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class kw0 implements Callable {
    private final qw0 a;

    kw0(qw0 qw0Var) {
        this.a = qw0Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        this.a.g();
        return null;
    }
}