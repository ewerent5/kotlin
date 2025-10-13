package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class fu implements Callable {
    private final hu a;

    fu(hu huVar) {
        this.a = huVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.a.i();
    }
}