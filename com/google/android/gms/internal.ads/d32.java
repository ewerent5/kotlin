package com.google.android.gms.internal.ads;

import java.lang.Throwable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class d32<V, X extends Throwable> extends e32<V, X, x02<? super X, ? extends V>, V> {
    d32(g52<? extends V> g52Var, Class<X> cls, x02<? super X, ? extends V> x02Var) {
        super(g52Var, cls, x02Var);
    }

    @Override // com.google.android.gms.internal.ads.e32
    final void E(@NullableDecl V v) {
        l(v);
    }

    @Override // com.google.android.gms.internal.ads.e32
    @NullableDecl
    final /* bridge */ /* synthetic */ Object F(Object obj, Throwable th) {
        return ((x02) obj).apply(th);
    }
}