package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.util.Pair;
import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class wa1 implements jd0, dc0, ta0, ib0, c93, qa0, ad0, gs2, eb0 {

    /* renamed from: m, reason: collision with root package name */
    private final cu1 f9945m;

    /* renamed from: e, reason: collision with root package name */
    private final AtomicReference<j> f9937e = new AtomicReference<>();

    /* renamed from: f, reason: collision with root package name */
    private final AtomicReference<e0> f9938f = new AtomicReference<>();

    /* renamed from: g, reason: collision with root package name */
    private final AtomicReference<h1> f9939g = new AtomicReference<>();

    /* renamed from: h, reason: collision with root package name */
    private final AtomicReference<m> f9940h = new AtomicReference<>();

    /* renamed from: i, reason: collision with root package name */
    private final AtomicReference<l0> f9941i = new AtomicReference<>();

    /* renamed from: j, reason: collision with root package name */
    private final AtomicBoolean f9942j = new AtomicBoolean(true);

    /* renamed from: k, reason: collision with root package name */
    private final AtomicBoolean f9943k = new AtomicBoolean(false);

    /* renamed from: l, reason: collision with root package name */
    private final AtomicBoolean f9944l = new AtomicBoolean(false);
    final BlockingQueue<Pair<String, String>> n = new ArrayBlockingQueue(((Integer) c.c().b(w3.M5)).intValue());

    public wa1(cu1 cu1Var) {
        this.f9945m = cu1Var;
    }

    @TargetApi(5)
    private final void V() {
        if (this.f9943k.get() && this.f9944l.get()) {
            Iterator it = this.n.iterator();
            while (it.hasNext()) {
                final Pair pair = (Pair) it.next();
                am1.a(this.f9938f, new zl1(pair) { // from class: com.google.android.gms.internal.ads.la1
                    private final Pair a;

                    {
                        this.a = pair;
                    }

                    @Override // com.google.android.gms.internal.ads.zl1
                    public final void zza(Object obj) {
                        Pair pair2 = this.a;
                        ((e0) obj).o((String) pair2.first, (String) pair2.second);
                    }
                });
            }
            this.n.clear();
            this.f9942j.set(false);
        }
    }

    public final void A(m mVar) {
        this.f9940h.set(mVar);
    }

    @Override // com.google.android.gms.internal.ads.ta0
    public final void B0(final g93 g93Var) {
        am1.a(this.f9937e, new zl1(g93Var) { // from class: com.google.android.gms.internal.ads.na1
            private final g93 a;

            {
                this.a = g93Var;
            }

            @Override // com.google.android.gms.internal.ads.zl1
            public final void zza(Object obj) {
                ((j) obj).x(this.a);
            }
        });
        am1.a(this.f9937e, new zl1(g93Var) { // from class: com.google.android.gms.internal.ads.oa1
            private final g93 a;

            {
                this.a = g93Var;
            }

            @Override // com.google.android.gms.internal.ads.zl1
            public final void zza(Object obj) {
                ((j) obj).g(this.a.f6091e);
            }
        });
        am1.a(this.f9940h, new zl1(g93Var) { // from class: com.google.android.gms.internal.ads.pa1
            private final g93 a;

            {
                this.a = g93Var;
            }

            @Override // com.google.android.gms.internal.ads.zl1
            public final void zza(Object obj) {
                ((m) obj).o4(this.a);
            }
        });
        this.f9942j.set(false);
        this.n.clear();
    }

    public final void G(l0 l0Var) {
        this.f9941i.set(l0Var);
    }

    @Override // com.google.android.gms.internal.ads.eb0
    public final void I(final g93 g93Var) {
        am1.a(this.f9941i, new zl1(g93Var) { // from class: com.google.android.gms.internal.ads.ka1
            private final g93 a;

            {
                this.a = g93Var;
            }

            @Override // com.google.android.gms.internal.ads.zl1
            public final void zza(Object obj) {
                ((l0) obj).s2(this.a);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.jd0
    public final void R(kp1 kp1Var) {
        this.f9942j.set(true);
        this.f9944l.set(false);
    }

    @Override // com.google.android.gms.internal.ads.gs2
    @TargetApi(5)
    public final synchronized void a(final String str, final String str2) {
        if (!this.f9942j.get()) {
            am1.a(this.f9938f, new zl1(str, str2) { // from class: com.google.android.gms.internal.ads.ja1
                private final String a;

                /* renamed from: b, reason: collision with root package name */
                private final String f6716b;

                {
                    this.a = str;
                    this.f6716b = str2;
                }

                @Override // com.google.android.gms.internal.ads.zl1
                public final void zza(Object obj) {
                    ((e0) obj).o(this.a, this.f6716b);
                }
            });
            return;
        }
        if (!this.n.offer(new Pair<>(str, str2))) {
            er.zzd("The queue for app events is full, dropping the new event.");
            cu1 cu1Var = this.f9945m;
            if (cu1Var != null) {
                bu1 bu1VarA = bu1.a("dae_action");
                bu1VarA.c("dae_name", str);
                bu1VarA.c("dae_data", str2);
                cu1Var.b(bu1VarA);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.ib0
    public final void b() {
        am1.a(this.f9937e, ha1.a);
    }

    @Override // com.google.android.gms.internal.ads.dc0
    public final synchronized void b0() {
        am1.a(this.f9937e, ra1.a);
        am1.a(this.f9940h, sa1.a);
        this.f9944l.set(true);
        V();
    }

    @Override // com.google.android.gms.internal.ads.ad0
    public final void c(final t93 t93Var) {
        am1.a(this.f9939g, new zl1(t93Var) { // from class: com.google.android.gms.internal.ads.ia1
            private final t93 a;

            {
                this.a = t93Var;
            }

            @Override // com.google.android.gms.internal.ads.zl1
            public final void zza(Object obj) {
                ((h1) obj).W2(this.a);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.qa0
    public final void d(gm gmVar, String str, String str2) {
    }

    @Override // com.google.android.gms.internal.ads.jd0
    public final void f(ql qlVar) {
    }

    public final synchronized j m() {
        return this.f9937e.get();
    }

    public final synchronized e0 o() {
        return this.f9938f.get();
    }

    @Override // com.google.android.gms.internal.ads.c93
    public final void onAdClicked() {
        am1.a(this.f9937e, ga1.a);
    }

    public final void u(j jVar) {
        this.f9937e.set(jVar);
    }

    public final void x(e0 e0Var) {
        this.f9938f.set(e0Var);
        this.f9943k.set(true);
        V();
    }

    public final void z(h1 h1Var) {
        this.f9939g.set(h1Var);
    }

    @Override // com.google.android.gms.internal.ads.qa0
    public final void zzc() {
        am1.a(this.f9937e, ta1.a);
        am1.a(this.f9941i, ua1.a);
        am1.a(this.f9941i, fa1.a);
    }

    @Override // com.google.android.gms.internal.ads.qa0
    public final void zzd() {
        am1.a(this.f9937e, ea1.a);
        am1.a(this.f9941i, ma1.a);
    }

    @Override // com.google.android.gms.internal.ads.qa0
    public final void zze() {
        am1.a(this.f9937e, qa1.a);
    }

    @Override // com.google.android.gms.internal.ads.qa0
    public final void zzg() {
    }

    @Override // com.google.android.gms.internal.ads.qa0
    public final void zzh() {
    }
}