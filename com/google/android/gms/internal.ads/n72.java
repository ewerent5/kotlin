package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class n72 extends k62<la2, ia2> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ o72 f7665b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    n72(o72 o72Var, Class cls) {
        super(cls);
        this.f7665b = o72Var;
    }

    @Override // com.google.android.gms.internal.ads.k62
    public final /* bridge */ /* synthetic */ void b(lk2 lk2Var) throws GeneralSecurityException {
        la2 la2Var = (la2) lk2Var;
        ((q72) new r72().i()).b(la2Var.D());
        new r92().i().b(la2Var.E());
        zg2.a(la2Var.D().E());
    }

    @Override // com.google.android.gms.internal.ads.k62
    public final /* bridge */ /* synthetic */ lk2 c(ci2 ci2Var) {
        return la2.F(ci2Var, qi2.a());
    }

    @Override // com.google.android.gms.internal.ads.k62
    public final /* bridge */ /* synthetic */ ia2 d(lk2 lk2Var) {
        la2 la2Var = (la2) lk2Var;
        new r72();
        oa2 oa2VarF = q72.f(la2Var.D());
        fd2 fd2VarD = new r92().i().d(la2Var.E());
        ha2 ha2VarH = ia2.H();
        ha2VarH.r(oa2VarF);
        ha2VarH.s(fd2VarD);
        ha2VarH.q(0);
        return ha2VarH.n();
    }
}