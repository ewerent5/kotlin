package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.util.zzr;
import com.google.android.gms.ads.internal.zzs;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class gl1 implements mb1<r40> {
    private final Context a;

    /* renamed from: b */
    private final Executor f6136b;

    /* renamed from: c */
    private final cy f6137c;

    /* renamed from: d */
    private final wa1 f6138d;

    /* renamed from: e */
    private final ab1 f6139e;

    /* renamed from: f */
    private final ViewGroup f6140f;

    /* renamed from: g */
    private s4 f6141g;

    /* renamed from: h */
    private final ed0 f6142h;

    /* renamed from: i */
    @GuardedBy("this")
    private final pp1 f6143i;

    /* renamed from: j */
    @GuardedBy("this")
    private g52<r40> f6144j;

    public gl1(Context context, Executor executor, r93 r93Var, cy cyVar, wa1 wa1Var, ab1 ab1Var, pp1 pp1Var) {
        this.a = context;
        this.f6136b = executor;
        this.f6137c = cyVar;
        this.f6138d = wa1Var;
        this.f6139e = ab1Var;
        this.f6143i = pp1Var;
        this.f6142h = cyVar.k();
        this.f6140f = new FrameLayout(context);
        pp1Var.r(r93Var);
    }

    static /* synthetic */ g52 j(gl1 gl1Var, g52 g52Var) {
        gl1Var.f6144j = null;
        return null;
    }

    @Override // com.google.android.gms.internal.ads.mb1
    public final boolean a(m93 m93Var, String str, kb1 kb1Var, lb1<? super r40> lb1Var) {
        p50 p50VarZza;
        if (str == null) {
            er.zzf("Ad unit ID should not be null for banner ad.");
            this.f6136b.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.bl1

                /* renamed from: e, reason: collision with root package name */
                private final gl1 f5136e;

                {
                    this.f5136e = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f5136e.i();
                }
            });
            return false;
        }
        if (zzb()) {
            return false;
        }
        if (((Boolean) c.c().b(w3.P5)).booleanValue() && m93Var.f7448j) {
            this.f6137c.B().b(true);
        }
        pp1 pp1Var = this.f6143i;
        pp1Var.u(str);
        pp1Var.p(m93Var);
        qp1 qp1VarJ = pp1Var.J();
        if (o5.f7901c.e().booleanValue() && this.f6143i.t().o) {
            wa1 wa1Var = this.f6138d;
            if (wa1Var != null) {
                wa1Var.B0(mq1.d(7, null, null));
            }
            return false;
        }
        if (((Boolean) c.c().b(w3.o5)).booleanValue()) {
            o50 o50VarN = this.f6137c.n();
            aa0 aa0Var = new aa0();
            aa0Var.a(this.a);
            aa0Var.b(qp1VarJ);
            o50VarN.k(aa0Var.d());
            uf0 uf0Var = new uf0();
            uf0Var.m(this.f6138d, this.f6136b);
            uf0Var.f(this.f6138d, this.f6136b);
            o50VarN.c(uf0Var.n());
            o50VarN.r(new f91(this.f6141g));
            o50VarN.i(new bk0(fm0.a, null));
            o50VarN.n(new m60(this.f6142h));
            o50VarN.j(new o40(this.f6140f));
            p50VarZza = o50VarN.zza();
        } else {
            o50 o50VarN2 = this.f6137c.n();
            aa0 aa0Var2 = new aa0();
            aa0Var2.a(this.a);
            aa0Var2.b(qp1VarJ);
            o50VarN2.k(aa0Var2.d());
            uf0 uf0Var2 = new uf0();
            uf0Var2.m(this.f6138d, this.f6136b);
            uf0Var2.g(this.f6138d, this.f6136b);
            uf0Var2.g(this.f6139e, this.f6136b);
            uf0Var2.h(this.f6138d, this.f6136b);
            uf0Var2.b(this.f6138d, this.f6136b);
            uf0Var2.c(this.f6138d, this.f6136b);
            uf0Var2.d(this.f6138d, this.f6136b);
            uf0Var2.f(this.f6138d, this.f6136b);
            uf0Var2.k(this.f6138d, this.f6136b);
            o50VarN2.c(uf0Var2.n());
            o50VarN2.r(new f91(this.f6141g));
            o50VarN2.i(new bk0(fm0.a, null));
            o50VarN2.n(new m60(this.f6142h));
            o50VarN2.j(new o40(this.f6140f));
            p50VarZza = o50VarN2.zza();
        }
        w70<r40> w70VarB = p50VarZza.b();
        g52<r40> g52VarC = w70VarB.c(w70VarB.b());
        this.f6144j = g52VarC;
        y42.o(g52VarC, new el1(this, lb1Var, p50VarZza), this.f6136b);
        return true;
    }

    public final ViewGroup b() {
        return this.f6140f;
    }

    public final void c(s4 s4Var) {
        this.f6141g = s4Var;
    }

    public final void d(g gVar) {
        this.f6139e.a(gVar);
    }

    public final pp1 e() {
        return this.f6143i;
    }

    public final boolean f() {
        Object parent = this.f6140f.getParent();
        if (!(parent instanceof View)) {
            return false;
        }
        View view = (View) parent;
        zzs.zzc();
        return zzr.zzX(view, view.getContext());
    }

    public final void g(fd0 fd0Var) {
        this.f6142h.H0(fd0Var, this.f6136b);
    }

    public final void h() {
        this.f6142h.L0(60);
    }

    final /* synthetic */ void i() {
        this.f6138d.B0(mq1.d(6, null, null));
    }

    @Override // com.google.android.gms.internal.ads.mb1
    public final boolean zzb() {
        g52<r40> g52Var = this.f6144j;
        return (g52Var == null || g52Var.isDone()) ? false : true;
    }
}