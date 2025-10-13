package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class an1 implements mb1<li0> {
    private final Context a;

    /* renamed from: b */
    private final Executor f4941b;

    /* renamed from: c */
    private final cy f4942c;

    /* renamed from: d */
    private final wa1 f4943d;

    /* renamed from: e */
    private final ao1 f4944e;

    /* renamed from: f */
    private s4 f4945f;

    /* renamed from: g */
    @GuardedBy("this")
    private final pp1 f4946g;

    /* renamed from: h */
    @GuardedBy("this")
    private g52<li0> f4947h;

    public an1(Context context, Executor executor, cy cyVar, wa1 wa1Var, ao1 ao1Var, pp1 pp1Var) {
        this.a = context;
        this.f4941b = executor;
        this.f4942c = cyVar;
        this.f4943d = wa1Var;
        this.f4946g = pp1Var;
        this.f4944e = ao1Var;
    }

    static /* synthetic */ g52 d(an1 an1Var, g52 g52Var) {
        an1Var.f4947h = null;
        return null;
    }

    @Override // com.google.android.gms.internal.ads.mb1
    public final boolean a(m93 m93Var, String str, kb1 kb1Var, lb1<? super li0> lb1Var) {
        jj0 jj0VarZza;
        if (str == null) {
            er.zzf("Ad unit ID should not be null for interstitial ad.");
            this.f4941b.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.um1

                /* renamed from: e, reason: collision with root package name */
                private final an1 f9515e;

                {
                    this.f9515e = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f9515e.c();
                }
            });
            return false;
        }
        if (zzb()) {
            return false;
        }
        if (((Boolean) c.c().b(w3.P5)).booleanValue() && m93Var.f7448j) {
            this.f4942c.B().b(true);
        }
        r93 r93Var = ((tm1) kb1Var).a;
        pp1 pp1Var = this.f4946g;
        pp1Var.u(str);
        pp1Var.r(r93Var);
        pp1Var.p(m93Var);
        qp1 qp1VarJ = pp1Var.J();
        if (((Boolean) c.c().b(w3.q5)).booleanValue()) {
            ij0 ij0VarS = this.f4942c.s();
            aa0 aa0Var = new aa0();
            aa0Var.a(this.a);
            aa0Var.b(qp1VarJ);
            ij0VarS.zzc(aa0Var.d());
            uf0 uf0Var = new uf0();
            uf0Var.m(this.f4943d, this.f4941b);
            uf0Var.f(this.f4943d, this.f4941b);
            ij0VarS.s(uf0Var.n());
            ij0VarS.h(new f91(this.f4945f));
            jj0VarZza = ij0VarS.zza();
        } else {
            uf0 uf0Var2 = new uf0();
            ao1 ao1Var = this.f4944e;
            if (ao1Var != null) {
                uf0Var2.b(ao1Var, this.f4941b);
                uf0Var2.c(this.f4944e, this.f4941b);
                uf0Var2.d(this.f4944e, this.f4941b);
            }
            ij0 ij0VarS2 = this.f4942c.s();
            aa0 aa0Var2 = new aa0();
            aa0Var2.a(this.a);
            aa0Var2.b(qp1VarJ);
            ij0VarS2.zzc(aa0Var2.d());
            uf0Var2.m(this.f4943d, this.f4941b);
            uf0Var2.b(this.f4943d, this.f4941b);
            uf0Var2.c(this.f4943d, this.f4941b);
            uf0Var2.d(this.f4943d, this.f4941b);
            uf0Var2.g(this.f4943d, this.f4941b);
            uf0Var2.f(this.f4943d, this.f4941b);
            uf0Var2.k(this.f4943d, this.f4941b);
            uf0Var2.e(this.f4943d, this.f4941b);
            ij0VarS2.s(uf0Var2.n());
            ij0VarS2.h(new f91(this.f4945f));
            jj0VarZza = ij0VarS2.zza();
        }
        w70<li0> w70VarB = jj0VarZza.b();
        g52<li0> g52VarC = w70VarB.c(w70VarB.b());
        this.f4947h = g52VarC;
        y42.o(g52VarC, new zm1(this, lb1Var, jj0VarZza), this.f4941b);
        return true;
    }

    public final void b(s4 s4Var) {
        this.f4945f = s4Var;
    }

    final /* synthetic */ void c() {
        this.f4943d.B0(mq1.d(6, null, null));
    }

    @Override // com.google.android.gms.internal.ads.mb1
    public final boolean zzb() {
        g52<li0> g52Var = this.f4947h;
        return (g52Var == null || g52Var.isDone()) ? false : true;
    }
}