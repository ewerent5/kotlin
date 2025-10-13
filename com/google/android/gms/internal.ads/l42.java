package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class l42<V> extends x32<Object, V> {
    private k42<?> t;

    l42(y12<? extends g52<?>> y12Var, boolean z, Executor executor, Callable<V> callable) {
        super(y12Var, z, false);
        this.t = new i42(this, callable, executor);
        Q();
    }

    static /* synthetic */ k42 V(l42 l42Var, k42 k42Var) {
        l42Var.t = null;
        return null;
    }

    @Override // com.google.android.gms.internal.ads.x32
    final void L(int i2) {
        super.L(i2);
        if (i2 == 1) {
            this.t = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.x32
    final void R(int i2, @NullableDecl Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.x32
    final void S() {
        k42<?> k42Var = this.t;
        if (k42Var != null) {
            k42Var.g();
        }
    }

    @Override // com.google.android.gms.internal.ads.f32
    protected final void j() {
        k42<?> k42Var = this.t;
        if (k42Var != null) {
            k42Var.e();
        }
    }
}