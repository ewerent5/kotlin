package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class jb1 {
    private final fm0 a;

    /* renamed from: b, reason: collision with root package name */
    private final wa1 f6725b;

    /* renamed from: c, reason: collision with root package name */
    private final ta0 f6726c;

    public jb1(fm0 fm0Var, cu1 cu1Var) {
        this.a = fm0Var;
        final wa1 wa1Var = new wa1(cu1Var);
        this.f6725b = wa1Var;
        final tc tcVarE = fm0Var.e();
        this.f6726c = new ta0(wa1Var, tcVarE) { // from class: com.google.android.gms.internal.ads.ib1

            /* renamed from: e, reason: collision with root package name */
            private final wa1 f6515e;

            /* renamed from: f, reason: collision with root package name */
            private final tc f6516f;

            {
                this.f6515e = wa1Var;
                this.f6516f = tcVarE;
            }

            @Override // com.google.android.gms.internal.ads.ta0
            public final void B0(g93 g93Var) {
                wa1 wa1Var2 = this.f6515e;
                tc tcVar = this.f6516f;
                wa1Var2.B0(g93Var);
                if (tcVar != null) {
                    try {
                        tcVar.e(g93Var);
                    } catch (RemoteException e2) {
                        er.zzl("#007 Could not call remote method.", e2);
                    }
                }
                if (tcVar != null) {
                    try {
                        tcVar.j(g93Var.f6091e);
                    } catch (RemoteException e3) {
                        er.zzl("#007 Could not call remote method.", e3);
                    }
                }
            }
        };
    }

    public final void a(j jVar) {
        this.f6725b.u(jVar);
    }

    public final bk0 b() {
        return new bk0(this.a, this.f6725b.m());
    }

    public final wa1 c() {
        return this.f6725b;
    }

    public final dc0 d() {
        return this.f6725b;
    }

    public final ta0 e() {
        return this.f6726c;
    }
}