package com.google.android.gms.internal.ads;

import java.util.List;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
abstract class h42<V, C> extends x32<V, C> {
    private List<g42<V>> t;

    h42(y12<? extends g52<? extends V>> y12Var, boolean z) {
        super(y12Var, true, true);
        List<g42<V>> listN = y12Var.isEmpty() ? b22.n() : j22.a(y12Var.size());
        for (int i2 = 0; i2 < y12Var.size(); i2++) {
            listN.add(null);
        }
        this.t = listN;
    }

    @Override // com.google.android.gms.internal.ads.x32
    final void L(int i2) {
        super.L(i2);
        this.t = null;
    }

    @Override // com.google.android.gms.internal.ads.x32
    final void R(int i2, @NullableDecl V v) {
        List<g42<V>> list = this.t;
        if (list != null) {
            list.set(i2, new g42<>(v));
        }
    }

    @Override // com.google.android.gms.internal.ads.x32
    final void S() {
        List<g42<V>> list = this.t;
        if (list != null) {
            l(V(list));
        }
    }

    abstract C V(List<g42<V>> list);
}