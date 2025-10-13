package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class ko1 implements mb1<xq0> {
    private final Context a;

    /* renamed from: b */
    private final Executor f7015b;

    /* renamed from: c */
    private final cy f7016c;

    /* renamed from: d */
    private final ao1 f7017d;

    /* renamed from: e */
    private final mm1<dr0, xq0> f7018e;

    /* renamed from: f */
    private final lp1 f7019f;

    /* renamed from: g */
    @GuardedBy("this")
    private final pp1 f7020g;

    /* renamed from: h */
    @GuardedBy("this")
    private g52<xq0> f7021h;

    public ko1(Context context, Executor executor, cy cyVar, mm1<dr0, xq0> mm1Var, ao1 ao1Var, pp1 pp1Var, lp1 lp1Var) {
        this.a = context;
        this.f7015b = executor;
        this.f7016c = cyVar;
        this.f7018e = mm1Var;
        this.f7017d = ao1Var;
        this.f7020g = pp1Var;
        this.f7019f = lp1Var;
    }

    /* renamed from: i */
    public final cr0 g(km1 km1Var) {
        cr0 cr0VarV = this.f7016c.v();
        aa0 aa0Var = new aa0();
        aa0Var.a(this.a);
        aa0Var.b(((jo1) km1Var).a);
        aa0Var.e(this.f7019f);
        cr0VarV.l(aa0Var.d());
        cr0VarV.d(new uf0().n());
        return cr0VarV;
    }

    @Override // com.google.android.gms.internal.ads.mb1
    public final boolean a(m93 m93Var, String str, kb1 kb1Var, lb1<? super xq0> lb1Var) {
        nm nmVar = new nm(m93Var, str);
        if (nmVar.f7742f == null) {
            er.zzf("Ad unit ID should not be null for rewarded video ad.");
            this.f7015b.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.do1

                /* renamed from: e, reason: collision with root package name */
                private final ko1 f5494e;

                {
                    this.f5494e = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f5494e.b();
                }
            });
        } else {
            g52<xq0> g52Var = this.f7021h;
            if (g52Var == null || g52Var.isDone()) {
                gq1.b(this.a, nmVar.f7741e.f7448j);
                if (((Boolean) c.c().b(w3.P5)).booleanValue() && nmVar.f7741e.f7448j) {
                    this.f7016c.B().b(true);
                }
                pp1 pp1Var = this.f7020g;
                pp1Var.u(nmVar.f7742f);
                pp1Var.r(r93.J());
                pp1Var.p(nmVar.f7741e);
                qp1 qp1VarJ = pp1Var.J();
                jo1 jo1Var = new jo1(null);
                jo1Var.a = qp1VarJ;
                jo1Var.f6800b = null;
                g52<xq0> g52VarA = this.f7018e.a(new nm1(jo1Var, null), new lm1(this) { // from class: com.google.android.gms.internal.ads.eo1
                    private final ko1 a;

                    {
                        this.a = this;
                    }

                    @Override // com.google.android.gms.internal.ads.lm1
                    public final x90 a(km1 km1Var) {
                        return this.a.g(km1Var);
                    }
                });
                this.f7021h = g52VarA;
                y42.o(g52VarA, new ho1(this, lb1Var, jo1Var), this.f7015b);
                return true;
            }
        }
        return false;
    }

    final /* synthetic */ void b() {
        this.f7017d.B0(mq1.d(6, null, null));
    }

    final void h(int i2) {
        this.f7020g.x().a(i2);
    }

    @Override // com.google.android.gms.internal.ads.mb1
    public final boolean zzb() {
        throw null;
    }
}