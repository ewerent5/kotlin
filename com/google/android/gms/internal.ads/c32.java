package com.google.android.gms.internal.ads;

import java.lang.Throwable;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class c32<V, X extends Throwable> extends e32<V, X, e42<? super X, ? extends V>, g52<? extends V>> {
    c32(g52<? extends V> g52Var, Class<X> cls, e42<? super X, ? extends V> e42Var) {
        super(g52Var, cls, e42Var);
    }

    @Override // com.google.android.gms.internal.ads.e32
    final /* bridge */ /* synthetic */ void E(Object obj) {
        n((g52) obj);
    }

    @Override // com.google.android.gms.internal.ads.e32
    final /* bridge */ /* synthetic */ Object F(Object obj, Throwable th) {
        e42 e42Var = (e42) obj;
        g52 g52VarZza = e42Var.zza(th);
        h12.c(g52VarZza, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", e42Var);
        return g52VarZza;
    }
}