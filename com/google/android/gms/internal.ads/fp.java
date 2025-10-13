package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class fp implements Callable {
    private final kp a;

    fp(kp kpVar) {
        this.a = kpVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.a.z();
    }
}