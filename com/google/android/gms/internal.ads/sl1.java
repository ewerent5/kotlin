package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.s60;
import com.google.android.gms.internal.ads.y90;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class sl1<R extends y90<AdT>, AdT extends s60> implements mm1<R, AdT> {
    private final mm1<R, AdT> a;

    /* renamed from: b, reason: collision with root package name */
    private final mm1<R, xl1<AdT>> f8907b;

    /* renamed from: c, reason: collision with root package name */
    private final as1<AdT> f8908c;

    /* renamed from: d, reason: collision with root package name */
    @GuardedBy("this")
    private R f8909d;

    /* renamed from: e, reason: collision with root package name */
    private final Executor f8910e;

    public sl1(mm1<R, AdT> mm1Var, mm1<R, xl1<AdT>> mm1Var2, as1<AdT> as1Var, Executor executor) {
        this.a = mm1Var;
        this.f8907b = mm1Var2;
        this.f8908c = as1Var;
        this.f8910e = executor;
    }

    private final g52<AdT> e(mr1<AdT> mr1Var, nm1 nm1Var, lm1<R> lm1Var) {
        final x90<R> x90VarA = lm1Var.a(nm1Var.f7749b);
        if (mr1Var.f7532c != null) {
            R rZzf = x90VarA.zzf();
            if (rZzf.zzd() != null) {
                mr1Var.f7532c.e().f(rZzf.zzd());
            }
            return y42.a(mr1Var.f7532c);
        }
        x90VarA.m(mr1Var.f7531b);
        g52<AdT> g52VarA = this.a.a(nm1Var, new lm1(x90VarA) { // from class: com.google.android.gms.internal.ads.ol1
            private final x90 a;

            {
                this.a = x90VarA;
            }

            @Override // com.google.android.gms.internal.ads.lm1
            public final x90 a(km1 km1Var) {
                return this.a;
            }
        });
        this.f8909d = (R) ((cm1) this.a).zzc();
        return g52VarA;
    }

    @Override // com.google.android.gms.internal.ads.mm1
    public final synchronized g52<AdT> a(final nm1 nm1Var, final lm1<R> lm1Var) {
        final rl1 rl1Var;
        qp1 qp1VarZza = lm1Var.a(nm1Var.f7749b).zzf().zza();
        rl1Var = new rl1(lm1Var, nm1Var, qp1VarZza.f8427d, qp1VarZza.f8429f, this.f8910e, qp1VarZza.f8433j, null);
        return y42.h(p42.D(this.f8907b.a(nm1Var, lm1Var)), new e42(this, nm1Var, rl1Var, lm1Var) { // from class: com.google.android.gms.internal.ads.nl1
            private final sl1 a;

            /* renamed from: b, reason: collision with root package name */
            private final nm1 f7732b;

            /* renamed from: c, reason: collision with root package name */
            private final rl1 f7733c;

            /* renamed from: d, reason: collision with root package name */
            private final lm1 f7734d;

            {
                this.a = this;
                this.f7732b = nm1Var;
                this.f7733c = rl1Var;
                this.f7734d = lm1Var;
            }

            @Override // com.google.android.gms.internal.ads.e42
            public final g52 zza(Object obj) {
                return this.a.d(this.f7732b, this.f7733c, this.f7734d, (xl1) obj);
            }
        }, this.f8910e);
    }

    @Override // com.google.android.gms.internal.ads.mm1
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final synchronized R zzc() {
        return this.f8909d;
    }

    final /* synthetic */ g52 c(lm1 lm1Var, xr1 xr1Var) throws tx0 {
        zr1 zr1Var;
        if (xr1Var == null || xr1Var.a == null || (zr1Var = xr1Var.f10238b) == null) {
            throw new tx0(1, "Empty prefetch");
        }
        l53 l53VarD = u53.D();
        j53 j53VarD = k53.D();
        j53VarD.q(o53.IN_MEMORY);
        j53VarD.r(r53.D());
        l53VarD.q(j53VarD);
        xr1Var.a.a.d().q0(l53VarD.n());
        return e(xr1Var.a, ((rl1) zr1Var).f8676b, lm1Var);
    }

    final /* synthetic */ g52 d(nm1 nm1Var, rl1 rl1Var, final lm1 lm1Var, xl1 xl1Var) {
        if (xl1Var != null) {
            rl1 rl1Var2 = new rl1(rl1Var.a, rl1Var.f8676b, rl1Var.f8677c, rl1Var.f8678d, rl1Var.f8679e, rl1Var.f8680f, xl1Var.a);
            if (xl1Var.f10190c != null) {
                this.f8909d = null;
                this.f8908c.a(rl1Var2);
                return e(xl1Var.f10190c, nm1Var, lm1Var);
            }
            g52<xr1<AdT>> g52VarB = this.f8908c.b(rl1Var2);
            if (g52VarB != null) {
                this.f8909d = (R) lm1Var.a(nm1Var.f7749b).zzf();
                return y42.h(g52VarB, new e42(this, lm1Var) { // from class: com.google.android.gms.internal.ads.pl1
                    private final sl1 a;

                    /* renamed from: b, reason: collision with root package name */
                    private final lm1 f8196b;

                    {
                        this.a = this;
                        this.f8196b = lm1Var;
                    }

                    @Override // com.google.android.gms.internal.ads.e42
                    public final g52 zza(Object obj) {
                        return this.a.c(this.f8196b, (xr1) obj);
                    }
                }, this.f8910e);
            }
            this.f8908c.a(rl1Var2);
            nm1Var = new nm1(nm1Var.f7749b, xl1Var.f10189b);
        }
        g52<AdT> g52VarA = this.a.a(nm1Var, lm1Var);
        this.f8909d = (R) ((cm1) this.a).zzc();
        return g52VarA;
    }
}