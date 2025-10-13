package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class ui1 implements Callable {
    private final vi1 a;

    ui1(vi1 vi1Var) {
        this.a = vi1Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return new wi1(this.a.f9709b);
    }
}