package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class s32<I, O> extends u32<I, O, e42<? super I, ? extends O>, g52<? extends O>> {
    s32(g52<? extends I> g52Var, e42<? super I, ? extends O> e42Var) {
        super(g52Var, e42Var);
    }

    @Override // com.google.android.gms.internal.ads.u32
    final /* bridge */ /* synthetic */ void E(Object obj) {
        n((g52) obj);
    }

    @Override // com.google.android.gms.internal.ads.u32
    final /* bridge */ /* synthetic */ Object F(Object obj, @NullableDecl Object obj2) {
        e42 e42Var = (e42) obj;
        g52<O> g52VarZza = e42Var.zza(obj2);
        h12.c(g52VarZza, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", e42Var);
        return g52VarZza;
    }
}