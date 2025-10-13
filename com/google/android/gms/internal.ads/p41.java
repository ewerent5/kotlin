package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class p41 implements e42 {
    private final q41 a;

    /* renamed from: b */
    private final View f8085b;

    /* renamed from: c */
    private final xo1 f8086c;

    p41(q41 q41Var, View view, xo1 xo1Var) {
        this.a = q41Var;
        this.f8085b = view;
        this.f8086c = xo1Var;
    }

    @Override // com.google.android.gms.internal.ads.e42
    public final g52 zza(Object obj) {
        return this.a.c(this.f8085b, this.f8086c, obj);
    }
}