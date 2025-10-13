package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzs;
import com.google.android.gms.internal.ads.s60;
import java.util.LinkedList;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class as1<AdT extends s60> {
    private final yq1 a;

    /* renamed from: b, reason: collision with root package name */
    @GuardedBy("this")
    private zr1 f4988b;

    /* renamed from: c, reason: collision with root package name */
    @GuardedBy("this")
    private p52<mr1<AdT>> f4989c;

    /* renamed from: d, reason: collision with root package name */
    @GuardedBy("this")
    private g52<mr1<AdT>> f4990d;

    /* renamed from: e, reason: collision with root package name */
    private final cr1 f4991e;

    /* renamed from: f, reason: collision with root package name */
    private final yr1<AdT> f4992f;

    /* renamed from: i, reason: collision with root package name */
    @GuardedBy("this")
    private int f4995i = 1;

    /* renamed from: h, reason: collision with root package name */
    private final u42<mr1<AdT>> f4994h = new wr1(this);

    /* renamed from: g, reason: collision with root package name */
    @GuardedBy("this.pendingTopOffs")
    private final LinkedList<zr1> f4993g = new LinkedList<>();

    public as1(cr1 cr1Var, yq1 yq1Var, yr1<AdT> yr1Var) {
        this.f4991e = cr1Var;
        this.a = yq1Var;
        this.f4992f = yr1Var;
        yq1Var.a(new xq1(this) { // from class: com.google.android.gms.internal.ads.vr1
            private final as1 a;

            {
                this.a = this;
            }

            @Override // com.google.android.gms.internal.ads.xq1
            public final void zza() {
                this.a.c();
            }
        });
    }

    static /* synthetic */ int k(as1 as1Var, int i2) {
        as1Var.f4995i = 1;
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l(zr1 zr1Var) {
        synchronized (this.f4993g) {
            if (((Boolean) c.c().b(w3.t4)).booleanValue() && !zzs.zzg().l().zzn().i()) {
                this.f4993g.clear();
                return;
            }
            if (!m()) {
                if (zr1Var != null) {
                    this.f4993g.add(zr1Var);
                }
                return;
            }
            if (zr1Var == null && this.f4993g.isEmpty()) {
                return;
            }
            if (zr1Var == null) {
                zr1Var = this.f4993g.pollFirst();
            }
            if (zr1Var.zzb() == null || !this.f4991e.d(zr1Var.zzb())) {
                l(null);
                return;
            }
            this.f4988b = zr1Var.zzc();
            this.f4989c = p52.D();
            g52<mr1<AdT>> g52VarB = this.f4992f.b(this.f4988b);
            this.f4990d = g52VarB;
            y42.o(g52VarB, this.f4994h, zr1Var.zza());
        }
    }

    private final boolean m() {
        g52<mr1<AdT>> g52Var = this.f4990d;
        return g52Var == null || g52Var.isDone();
    }

    public final void a(zr1 zr1Var) {
        synchronized (this.f4993g) {
            this.f4993g.add(zr1Var);
        }
    }

    public final synchronized g52<xr1<AdT>> b(zr1 zr1Var) {
        if (m()) {
            return null;
        }
        if (this.f4995i == 2) {
            return null;
        }
        if (this.f4988b.zzb() != null && zr1Var.zzb() != null && this.f4988b.zzb().equals(zr1Var.zzb())) {
            this.f4995i = 2;
            return y42.h(this.f4989c, new e42(this) { // from class: com.google.android.gms.internal.ads.ur1
                private final as1 a;

                {
                    this.a = this;
                }

                @Override // com.google.android.gms.internal.ads.e42
                public final g52 zza(Object obj) {
                    return this.a.d((mr1) obj);
                }
            }, zr1Var.zza());
        }
        this.f4995i = 3;
        return null;
    }

    final /* synthetic */ void c() {
        synchronized (this) {
            l(this.f4988b);
        }
    }

    final /* synthetic */ g52 d(mr1 mr1Var) {
        g52 g52VarA;
        synchronized (this) {
            g52VarA = y42.a(new xr1(mr1Var, this.f4988b));
        }
        return g52VarA;
    }
}