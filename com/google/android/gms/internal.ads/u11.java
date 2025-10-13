package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class u11 implements Callable {
    private final s11 a;

    private u11(s11 s11Var) {
        this.a = s11Var;
    }

    static Callable a(s11 s11Var) {
        return new u11(s11Var);
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.a.getWritableDatabase();
    }
}