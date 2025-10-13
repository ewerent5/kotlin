package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.internal.ads.s60;
import com.google.android.gms.internal.ads.x90;
import com.google.android.gms.internal.ads.y30;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public abstract class dk1<AppOpenAd extends s60, AppOpenRequestComponent extends y30<AppOpenAd>, AppOpenRequestComponentBuilder extends x90<AppOpenRequestComponent>> implements mb1<AppOpenAd> {
    private final Context a;

    /* renamed from: b */
    private final Executor f5477b;

    /* renamed from: c */
    protected final cy f5478c;

    /* renamed from: d */
    private final rk1 f5479d;

    /* renamed from: e */
    private final mm1<AppOpenRequestComponent, AppOpenAd> f5480e;

    /* renamed from: f */
    private final ViewGroup f5481f;

    /* renamed from: g */
    @GuardedBy("this")
    private final pp1 f5482g;

    /* renamed from: h */
    @GuardedBy("this")
    @Nullable
    private g52<AppOpenAd> f5483h;

    protected dk1(Context context, Executor executor, cy cyVar, mm1<AppOpenRequestComponent, AppOpenAd> mm1Var, rk1 rk1Var, pp1 pp1Var) {
        this.a = context;
        this.f5477b = executor;
        this.f5478c = cyVar;
        this.f5480e = mm1Var;
        this.f5479d = rk1Var;
        this.f5482g = pp1Var;
        this.f5481f = new FrameLayout(context);
    }

    static /* synthetic */ g52 e(dk1 dk1Var, g52 g52Var) {
        dk1Var.f5483h = null;
        return null;
    }

    /* renamed from: k */
    public final synchronized AppOpenRequestComponentBuilder j(km1 km1Var) {
        ck1 ck1Var = (ck1) km1Var;
        if (((Boolean) c.c().b(w3.p5)).booleanValue()) {
            o40 o40Var = new o40(this.f5481f);
            aa0 aa0Var = new aa0();
            aa0Var.a(this.a);
            aa0Var.b(ck1Var.a);
            return (AppOpenRequestComponentBuilder) b(o40Var, aa0Var.d(), new uf0().n());
        }
        rk1 rk1VarA = rk1.a(this.f5479d);
        uf0 uf0Var = new uf0();
        uf0Var.d(rk1VarA, this.f5477b);
        uf0Var.i(rk1VarA, this.f5477b);
        uf0Var.j(rk1VarA, this.f5477b);
        uf0Var.k(rk1VarA, this.f5477b);
        uf0Var.l(rk1VarA);
        o40 o40Var2 = new o40(this.f5481f);
        aa0 aa0Var2 = new aa0();
        aa0Var2.a(this.a);
        aa0Var2.b(ck1Var.a);
        return (AppOpenRequestComponentBuilder) b(o40Var2, aa0Var2.d(), uf0Var.n());
    }

    @Override // com.google.android.gms.internal.ads.mb1
    public final synchronized boolean a(m93 m93Var, String str, kb1 kb1Var, lb1<? super AppOpenAd> lb1Var) {
        com.google.android.gms.common.internal.p.e("loadAd must be called on the main UI thread.");
        if (str == null) {
            er.zzf("Ad unit ID should not be null for app open ad.");
            this.f5477b.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.yj1

                /* renamed from: e, reason: collision with root package name */
                private final dk1 f10437e;

                {
                    this.f10437e = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f10437e.d();
                }
            });
            return false;
        }
        if (this.f5483h != null) {
            return false;
        }
        gq1.b(this.a, m93Var.f7448j);
        if (((Boolean) c.c().b(w3.P5)).booleanValue() && m93Var.f7448j) {
            this.f5478c.B().b(true);
        }
        pp1 pp1Var = this.f5482g;
        pp1Var.u(str);
        pp1Var.r(r93.K());
        pp1Var.p(m93Var);
        qp1 qp1VarJ = pp1Var.J();
        ck1 ck1Var = new ck1(null);
        ck1Var.a = qp1VarJ;
        g52<AppOpenAd> g52VarA = this.f5480e.a(new nm1(ck1Var, null), new lm1(this) { // from class: com.google.android.gms.internal.ads.zj1
            private final dk1 a;

            {
                this.a = this;
            }

            @Override // com.google.android.gms.internal.ads.lm1
            public final x90 a(km1 km1Var) {
                return this.a.j(km1Var);
            }
        });
        this.f5483h = g52VarA;
        y42.o(g52VarA, new bk1(this, lb1Var, ck1Var), this.f5477b);
        return true;
    }

    protected abstract AppOpenRequestComponentBuilder b(o40 o40Var, ba0 ba0Var, vf0 vf0Var);

    public final void c(y93 y93Var) {
        this.f5482g.D(y93Var);
    }

    final /* synthetic */ void d() {
        this.f5479d.B0(mq1.d(6, null, null));
    }

    @Override // com.google.android.gms.internal.ads.mb1
    public final boolean zzb() {
        g52<AppOpenAd> g52Var = this.f5483h;
        return (g52Var == null || g52Var.isDone()) ? false : true;
    }
}