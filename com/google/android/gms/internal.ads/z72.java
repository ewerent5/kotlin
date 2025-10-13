package com.google.android.gms.internal.ads;

import java.security.InvalidAlgorithmParameterException;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class z72 extends k62<rb2, nb2> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ a82 f10570b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    z72(a82 a82Var, Class cls) {
        super(cls);
        this.f10570b = a82Var;
    }

    @Override // com.google.android.gms.internal.ads.k62
    public final /* bridge */ /* synthetic */ void b(lk2 lk2Var) throws InvalidAlgorithmParameterException {
        zg2.a(((rb2) lk2Var).D());
    }

    @Override // com.google.android.gms.internal.ads.k62
    public final /* bridge */ /* synthetic */ lk2 c(ci2 ci2Var) {
        return rb2.E(ci2Var, qi2.a());
    }

    @Override // com.google.android.gms.internal.ads.k62
    public final /* bridge */ /* synthetic */ nb2 d(lk2 lk2Var) {
        mb2 mb2VarG = nb2.G();
        mb2VarG.r(ci2.H(xg2.a(((rb2) lk2Var).D())));
        mb2VarG.q(0);
        return mb2VarG.n();
    }
}