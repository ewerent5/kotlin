package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class bt1 implements Callable {
    private final ws1 a;

    bt1(ws1 ws1Var) {
        this.a = ws1Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        this.a.zza();
        return null;
    }
}