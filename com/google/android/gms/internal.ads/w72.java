package com.google.android.gms.internal.ads;

import java.security.InvalidAlgorithmParameterException;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class w72 extends k62<kb2, hb2> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ x72 f9917b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    w72(x72 x72Var, Class cls) {
        super(cls);
        this.f9917b = x72Var;
    }

    @Override // com.google.android.gms.internal.ads.k62
    public final /* bridge */ /* synthetic */ void b(lk2 lk2Var) throws InvalidAlgorithmParameterException {
        zg2.a(((kb2) lk2Var).D());
    }

    @Override // com.google.android.gms.internal.ads.k62
    public final /* bridge */ /* synthetic */ lk2 c(ci2 ci2Var) {
        return kb2.E(ci2Var, qi2.a());
    }

    @Override // com.google.android.gms.internal.ads.k62
    public final /* bridge */ /* synthetic */ hb2 d(lk2 lk2Var) {
        gb2 gb2VarG = hb2.G();
        gb2VarG.r(ci2.H(xg2.a(((kb2) lk2Var).D())));
        gb2VarG.q(0);
        return gb2VarG.n();
    }
}