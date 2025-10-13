package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class t41 implements e42 {
    private final w41 a;

    /* renamed from: b */
    private final View f9078b;

    /* renamed from: c */
    private final xo1 f9079c;

    t41(w41 w41Var, View view, xo1 xo1Var) {
        this.a = w41Var;
        this.f9078b = view;
        this.f9079c = xo1Var;
    }

    @Override // com.google.android.gms.internal.ads.e42
    public final g52 zza(Object obj) {
        return this.a.c(this.f9078b, this.f9079c, obj);
    }
}