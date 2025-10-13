package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class at1 {
    private final Object a;

    /* renamed from: b */
    private final List<g52<?>> f4998b;

    /* renamed from: c */
    final /* synthetic */ jt1 f4999c;

    /* synthetic */ at1(jt1 jt1Var, Object obj, List list, ys1 ys1Var) {
        this.f4999c = jt1Var;
        this.a = obj;
        this.f4998b = list;
    }

    public final <O> it1<O> a(Callable<O> callable) {
        x42 x42VarN = y42.n(this.f4998b);
        g52 g52VarA = x42VarN.a(zs1.a, qr.f8451f);
        jt1 jt1Var = this.f4999c;
        return new it1<>(jt1Var, this.a, g52VarA, this.f4998b, x42VarN.a(callable, jt1Var.f6842b));
    }
}