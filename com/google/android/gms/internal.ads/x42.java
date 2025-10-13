package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class x42<V> {
    private final boolean a;

    /* renamed from: b, reason: collision with root package name */
    private final b22<g52<? extends V>> f10123b;

    /* synthetic */ x42(boolean z, b22 b22Var, v42 v42Var) {
        this.a = z;
        this.f10123b = b22Var;
    }

    public final <C> g52<C> a(Callable<C> callable, Executor executor) {
        return new l42(this.f10123b, this.a, executor, callable);
    }
}