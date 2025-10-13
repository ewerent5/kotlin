package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.y90;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class im1<R extends y90<? extends s60>> {
    private final cr1 a;

    /* renamed from: b, reason: collision with root package name */
    private final km1 f6540b;

    /* renamed from: c, reason: collision with root package name */
    private final lm1<R> f6541c;

    /* renamed from: d, reason: collision with root package name */
    private final Executor f6542d;

    /* renamed from: e, reason: collision with root package name */
    private hm1 f6543e;

    public im1(cr1 cr1Var, km1 km1Var, lm1<R> lm1Var, Executor executor) {
        this.a = cr1Var;
        this.f6540b = km1Var;
        this.f6541c = lm1Var;
        this.f6542d = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Deprecated
    public final nr1 e() {
        qp1 qp1VarZza = this.f6541c.a(this.f6540b).zzf().zza();
        return this.a.b(qp1VarZza.f8427d, qp1VarZza.f8429f, qp1VarZza.f8433j);
    }

    public final g52<hm1> a() {
        g52 g52VarE;
        hm1 hm1Var = this.f6543e;
        if (hm1Var != null) {
            return y42.a(hm1Var);
        }
        if (p5.a.e().booleanValue()) {
            x90<R> x90VarA = this.f6541c.a(this.f6540b);
            x90VarA.q(new tl1(this.a.zze().f6824l));
            g52VarE = y42.e(y42.i(p42.D(x90VarA.zzf().zzc().e(this.a.zze())), new fm1(this), this.f6542d), uz0.class, new em1(this), this.f6542d);
        } else {
            hm1 hm1Var2 = new hm1(null, e(), null);
            this.f6543e = hm1Var2;
            g52VarE = y42.a(hm1Var2);
        }
        return y42.i(g52VarE, dm1.a, this.f6542d);
    }
}