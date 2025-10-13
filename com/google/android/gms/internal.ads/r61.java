package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class r61 extends t61<z60> {
    private final cy a;

    /* renamed from: b, reason: collision with root package name */
    private final bk0 f8601b;

    /* renamed from: c, reason: collision with root package name */
    private final aa0 f8602c;

    /* renamed from: d, reason: collision with root package name */
    private final vf0 f8603d;

    public r61(cy cyVar, bk0 bk0Var, aa0 aa0Var, vf0 vf0Var) {
        this.a = cyVar;
        this.f8601b = bk0Var;
        this.f8602c = aa0Var;
        this.f8603d = vf0Var;
    }

    @Override // com.google.android.gms.internal.ads.t61
    protected final g52<z60> c(qp1 qp1Var, Bundle bundle) {
        fk0 fk0VarU = this.a.u();
        aa0 aa0Var = this.f8602c;
        aa0Var.b(qp1Var);
        aa0Var.c(bundle);
        fk0VarU.f(aa0Var.d());
        fk0VarU.p(this.f8603d);
        fk0VarU.e(this.f8601b);
        fk0VarU.o(new o40(null));
        w70<z60> w70VarA = fk0VarU.zza().a();
        return w70VarA.c(w70VarA.b());
    }
}