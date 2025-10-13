package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.zzp;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class uf0 {
    private final Set<nh0<hc0>> a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    private final Set<nh0<jd0>> f9428b = new HashSet();

    /* renamed from: c, reason: collision with root package name */
    private final Set<nh0<c93>> f9429c = new HashSet();

    /* renamed from: d, reason: collision with root package name */
    private final Set<nh0<qa0>> f9430d = new HashSet();

    /* renamed from: e, reason: collision with root package name */
    private final Set<nh0<ib0>> f9431e = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    private final Set<nh0<pc0>> f9432f = new HashSet();

    /* renamed from: g, reason: collision with root package name */
    private final Set<nh0<dc0>> f9433g = new HashSet();

    /* renamed from: h, reason: collision with root package name */
    private final Set<nh0<ta0>> f9434h = new HashSet();

    /* renamed from: i, reason: collision with root package name */
    private final Set<nh0<gx1>> f9435i = new HashSet();

    /* renamed from: j, reason: collision with root package name */
    private final Set<nh0<gs2>> f9436j = new HashSet();

    /* renamed from: k, reason: collision with root package name */
    private final Set<nh0<eb0>> f9437k = new HashSet();

    /* renamed from: l, reason: collision with root package name */
    private final Set<nh0<ad0>> f9438l = new HashSet();

    /* renamed from: m, reason: collision with root package name */
    private final Set<nh0<zzp>> f9439m = new HashSet();
    private jm1 n;

    public final uf0 b(qa0 qa0Var, Executor executor) {
        this.f9430d.add(new nh0<>(qa0Var, executor));
        return this;
    }

    public final uf0 c(dc0 dc0Var, Executor executor) {
        this.f9433g.add(new nh0<>(dc0Var, executor));
        return this;
    }

    public final uf0 d(ta0 ta0Var, Executor executor) {
        this.f9434h.add(new nh0<>(ta0Var, executor));
        return this;
    }

    public final uf0 e(eb0 eb0Var, Executor executor) {
        this.f9437k.add(new nh0<>(eb0Var, executor));
        return this;
    }

    public final uf0 f(gs2 gs2Var, Executor executor) {
        this.f9436j.add(new nh0<>(gs2Var, executor));
        return this;
    }

    public final uf0 g(c93 c93Var, Executor executor) {
        this.f9429c.add(new nh0<>(c93Var, executor));
        return this;
    }

    public final uf0 h(ib0 ib0Var, Executor executor) {
        this.f9431e.add(new nh0<>(ib0Var, executor));
        return this;
    }

    public final uf0 i(pc0 pc0Var, Executor executor) {
        this.f9432f.add(new nh0<>(pc0Var, executor));
        return this;
    }

    public final uf0 j(zzp zzpVar, Executor executor) {
        this.f9439m.add(new nh0<>(zzpVar, executor));
        return this;
    }

    public final uf0 k(ad0 ad0Var, Executor executor) {
        this.f9438l.add(new nh0<>(ad0Var, executor));
        return this;
    }

    public final uf0 l(jm1 jm1Var) {
        this.n = jm1Var;
        return this;
    }

    public final uf0 m(jd0 jd0Var, Executor executor) {
        this.f9428b.add(new nh0<>(jd0Var, executor));
        return this;
    }

    public final vf0 n() {
        return new vf0(this, null);
    }
}