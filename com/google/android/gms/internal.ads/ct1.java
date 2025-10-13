package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class ct1 {
    public static final <O> it1<O> a(g52<O> g52Var, Object obj, jt1 jt1Var) {
        return new it1<>(jt1Var, obj, jt1.a, Collections.emptyList(), g52Var);
    }

    public static final <O> it1<O> b(Callable<O> callable, Object obj, jt1 jt1Var) {
        return c(callable, jt1Var.f6842b, obj, jt1Var);
    }

    public static final <O> it1<O> c(Callable<O> callable, h52 h52Var, Object obj, jt1 jt1Var) {
        return new it1<>(jt1Var, obj, jt1.a, Collections.emptyList(), h52Var.N(callable));
    }

    public static final it1 d(final ws1 ws1Var, h52 h52Var, Object obj, jt1 jt1Var) {
        return c(new Callable(ws1Var) { // from class: com.google.android.gms.internal.ads.bt1
            private final ws1 a;

            {
                this.a = ws1Var;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                this.a.zza();
                return null;
            }
        }, h52Var, obj, jt1Var);
    }
}