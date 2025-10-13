package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzs;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class w70<T> {
    private final cz0 a;

    /* renamed from: b, reason: collision with root package name */
    private final qp1 f9903b;

    /* renamed from: c, reason: collision with root package name */
    private final st1 f9904c;

    /* renamed from: d, reason: collision with root package name */
    private final r10 f9905d;

    /* renamed from: e, reason: collision with root package name */
    private final g71<T> f9906e;

    /* renamed from: f, reason: collision with root package name */
    private final mf0 f9907f;

    /* renamed from: g, reason: collision with root package name */
    private final kp1 f9908g;

    /* renamed from: h, reason: collision with root package name */
    private final e01 f9909h;

    /* renamed from: i, reason: collision with root package name */
    private final v90 f9910i;

    /* renamed from: j, reason: collision with root package name */
    private final Executor f9911j;

    /* renamed from: k, reason: collision with root package name */
    private final sz0 f9912k;

    /* renamed from: l, reason: collision with root package name */
    private final p31 f9913l;

    w70(cz0 cz0Var, qp1 qp1Var, st1 st1Var, r10 r10Var, g71<T> g71Var, mf0 mf0Var, kp1 kp1Var, e01 e01Var, v90 v90Var, Executor executor, sz0 sz0Var, p31 p31Var) {
        this.a = cz0Var;
        this.f9903b = qp1Var;
        this.f9904c = st1Var;
        this.f9905d = r10Var;
        this.f9906e = g71Var;
        this.f9907f = mf0Var;
        this.f9908g = kp1Var;
        this.f9909h = e01Var;
        this.f9910i = v90Var;
        this.f9911j = executor;
        this.f9912k = sz0Var;
        this.f9913l = p31Var;
    }

    public final g52<kp1> a(g52<ql> g52Var) {
        kp1 kp1Var = this.f9908g;
        if (kp1Var != null) {
            st1 st1Var = this.f9904c;
            return ct1.a(y42.a(kp1Var), lt1.SERVER_TRANSACTION, st1Var).i();
        }
        zzs.zzi().b();
        if (this.f9903b.f8427d.w == null) {
            return this.f9904c.a(lt1.SERVER_TRANSACTION, g52Var).c(r70.a(this.f9912k)).i();
        }
        st1 st1Var2 = this.f9904c;
        return ct1.a(this.a.a(), lt1.SERVER_TRANSACTION, st1Var2).i();
    }

    public final g52<kp1> b() {
        return a(this.f9910i.b());
    }

    public final g52<T> c(g52<kp1> g52Var) {
        it1 it1VarC = this.f9904c.a(lt1.RENDERER, g52Var).b(new vs1(this) { // from class: com.google.android.gms.internal.ads.s70
            private final w70 a;

            {
                this.a = this;
            }

            @Override // com.google.android.gms.internal.ads.vs1
            public final Object zza(Object obj) {
                kp1 kp1Var = (kp1) obj;
                this.a.i(kp1Var);
                return kp1Var;
            }
        }).c(this.f9906e);
        if (!((Boolean) c.c().b(w3.G3)).booleanValue()) {
            it1VarC = it1VarC.h(((Integer) c.c().b(w3.H3)).intValue(), TimeUnit.SECONDS);
        }
        return it1VarC.i();
    }

    public final mf0 d() {
        return this.f9907f;
    }

    public final g52<ql> e(final jr1 jr1Var) {
        xs1 xs1VarI = this.f9904c.a(lt1.GET_CACHE_KEY, this.f9910i.b()).c(new e42(this, jr1Var) { // from class: com.google.android.gms.internal.ads.t70
            private final w70 a;

            /* renamed from: b, reason: collision with root package name */
            private final jr1 f9083b;

            {
                this.a = this;
                this.f9083b = jr1Var;
            }

            @Override // com.google.android.gms.internal.ads.e42
            public final g52 zza(Object obj) {
                return this.a.h(this.f9083b, (ql) obj);
            }
        }).i();
        y42.o(xs1VarI, new u70(this), this.f9911j);
        return xs1VarI;
    }

    public final g52<Void> f(ql qlVar) {
        xs1 xs1VarI = this.f9904c.a(lt1.NOTIFY_CACHE_HIT, this.f9909h.b(qlVar)).i();
        y42.o(xs1VarI, new v70(this), this.f9911j);
        return xs1VarI;
    }

    public final g93 g(Throwable th) {
        return mq1.b(th, this.f9913l);
    }

    final /* synthetic */ g52 h(jr1 jr1Var, ql qlVar) {
        qlVar.f8409m = jr1Var;
        return this.f9909h.a(qlVar);
    }

    final /* synthetic */ kp1 i(kp1 kp1Var) {
        this.f9905d.a(kp1Var);
        return kp1Var;
    }
}