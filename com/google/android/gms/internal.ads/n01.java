package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class n01 implements Callable {
    private final v01 a;

    /* renamed from: b */
    private final g52 f7606b;

    /* renamed from: c */
    private final g52 f7607c;

    n01(v01 v01Var, g52 g52Var, g52 g52Var2) {
        this.a = v01Var;
        this.f7606b = g52Var;
        this.f7607c = g52Var2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.a.M4(this.f7606b, this.f7607c);
    }
}