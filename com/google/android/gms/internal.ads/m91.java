package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class m91 {
    private final Context a;

    /* renamed from: b, reason: collision with root package name */
    private final jj0 f7442b;

    public m91(Context context, jj0 jj0Var) {
        this.a = context;
        this.f7442b = jj0Var;
    }

    public final /* bridge */ /* synthetic */ Object a(kp1 kp1Var, xo1 xo1Var, View view, i91 i91Var) {
        mi0 mi0VarC = this.f7442b.c(new i70(kp1Var, xo1Var, null), new k91(this, j91.a));
        i91Var.a(new l91(this, mi0VarC));
        return mi0VarC.h();
    }
}