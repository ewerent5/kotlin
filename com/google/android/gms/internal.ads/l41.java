package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.util.zzak;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class l41 implements j31<r40> {
    private final p50 a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f7190b;

    /* renamed from: c, reason: collision with root package name */
    private final vr0 f7191c;

    /* renamed from: d, reason: collision with root package name */
    private final qp1 f7192d;

    /* renamed from: e, reason: collision with root package name */
    private final Executor f7193e;

    /* renamed from: f, reason: collision with root package name */
    private final x02<xo1, zzak> f7194f;

    public l41(p50 p50Var, Context context, Executor executor, vr0 vr0Var, qp1 qp1Var, x02<xo1, zzak> x02Var) {
        this.f7190b = context;
        this.a = p50Var;
        this.f7193e = executor;
        this.f7191c = vr0Var;
        this.f7192d = qp1Var;
        this.f7194f = x02Var;
    }

    @Override // com.google.android.gms.internal.ads.j31
    public final g52<r40> a(final kp1 kp1Var, final xo1 xo1Var) {
        return y42.h(y42.a(null), new e42(this, kp1Var, xo1Var) { // from class: com.google.android.gms.internal.ads.f41
            private final l41 a;

            /* renamed from: b, reason: collision with root package name */
            private final kp1 f5795b;

            /* renamed from: c, reason: collision with root package name */
            private final xo1 f5796c;

            {
                this.a = this;
                this.f5795b = kp1Var;
                this.f5796c = xo1Var;
            }

            @Override // com.google.android.gms.internal.ads.e42
            public final g52 zza(Object obj) {
                return this.a.d(this.f5795b, this.f5796c, obj);
            }
        }, this.f7193e);
    }

    @Override // com.google.android.gms.internal.ads.j31
    public final boolean b(kp1 kp1Var, xo1 xo1Var) {
        cp1 cp1Var = xo1Var.r;
        return (cp1Var == null || cp1Var.a == null) ? false : true;
    }

    final /* synthetic */ void c(ew ewVar) {
        ewVar.L();
        bx bxVarZzh = ewVar.zzh();
        d3 d3Var = this.f7192d.a;
        if (d3Var == null || bxVarZzh == null) {
            return;
        }
        bxVarZzh.J4(d3Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ g52 d(kp1 kp1Var, xo1 xo1Var, Object obj) {
        View yr0Var;
        r93 r93VarB = up1.b(this.f7190b, xo1Var.t);
        final ew ewVarA = this.f7191c.a(r93VarB, xo1Var, kp1Var.f7035b.f6562b);
        ewVarA.w(xo1Var.Q);
        if (((Boolean) c.c().b(w3.b5)).booleanValue() && xo1Var.b0) {
            yr0Var = h60.a(this.f7190b, (View) ewVarA, xo1Var);
        } else {
            yr0Var = new yr0(this.f7190b, (View) ewVarA, this.f7194f.apply(xo1Var));
        }
        final s40 s40VarD = this.a.d(new i70(kp1Var, xo1Var, null), new y40(yr0Var, ewVarA, g41.a(ewVarA), up1.c(r93VarB)));
        s40VarD.i().i(ewVarA, false, null);
        gb0 gb0VarD = s40VarD.d();
        ib0 ib0Var = new ib0(ewVarA) { // from class: com.google.android.gms.internal.ads.h41

            /* renamed from: e, reason: collision with root package name */
            private final ew f6285e;

            {
                this.f6285e = ewVarA;
            }

            @Override // com.google.android.gms.internal.ads.ib0
            public final void b() {
                ew ewVar = this.f6285e;
                if (ewVar.E0() != null) {
                    ewVar.E0().zzh();
                }
            }
        };
        h52 h52Var = qr.f8451f;
        gb0VarD.H0(ib0Var, h52Var);
        s40VarD.i();
        cp1 cp1Var = xo1Var.r;
        g52<?> g52VarJ = ur0.j(ewVarA, cp1Var.f5346b, cp1Var.a);
        if (xo1Var.H) {
            g52VarJ.zze(i41.a(ewVarA), this.f7193e);
        }
        g52VarJ.zze(new Runnable(this, ewVarA) { // from class: com.google.android.gms.internal.ads.j41

            /* renamed from: e, reason: collision with root package name */
            private final l41 f6677e;

            /* renamed from: f, reason: collision with root package name */
            private final ew f6678f;

            {
                this.f6677e = this;
                this.f6678f = ewVarA;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f6677e.c(this.f6678f);
            }
        }, this.f7193e);
        return y42.i(g52VarJ, new x02(s40VarD) { // from class: com.google.android.gms.internal.ads.k41
            private final s40 a;

            {
                this.a = s40VarD;
            }

            @Override // com.google.android.gms.internal.ads.x02
            public final Object apply(Object obj2) {
                return this.a.h();
            }
        }, h52Var);
    }
}