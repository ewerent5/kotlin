package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class u40 extends r40 {

    /* renamed from: i, reason: collision with root package name */
    private final Context f9373i;

    /* renamed from: j, reason: collision with root package name */
    private final View f9374j;

    /* renamed from: k, reason: collision with root package name */
    private final ew f9375k;

    /* renamed from: l, reason: collision with root package name */
    private final yo1 f9376l;

    /* renamed from: m, reason: collision with root package name */
    private final q60 f9377m;
    private final fm0 n;
    private final th0 o;
    private final go2<y91> p;
    private final Executor q;
    private r93 r;

    u40(r60 r60Var, Context context, yo1 yo1Var, View view, ew ewVar, q60 q60Var, fm0 fm0Var, th0 th0Var, go2<y91> go2Var, Executor executor) {
        super(r60Var);
        this.f9373i = context;
        this.f9374j = view;
        this.f9375k = ewVar;
        this.f9376l = yo1Var;
        this.f9377m = q60Var;
        this.n = fm0Var;
        this.o = th0Var;
        this.p = go2Var;
        this.q = executor;
    }

    @Override // com.google.android.gms.internal.ads.s60
    public final void a() {
        this.q.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.t40

            /* renamed from: e, reason: collision with root package name */
            private final u40 f9077e;

            {
                this.f9077e = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f9077e.n();
            }
        });
        super.a();
    }

    @Override // com.google.android.gms.internal.ads.r40
    public final View g() {
        return this.f9374j;
    }

    @Override // com.google.android.gms.internal.ads.r40
    public final void h(ViewGroup viewGroup, r93 r93Var) {
        ew ewVar;
        if (viewGroup == null || (ewVar = this.f9375k) == null) {
            return;
        }
        ewVar.p0(vx.a(r93Var));
        viewGroup.setMinimumHeight(r93Var.f8617g);
        viewGroup.setMinimumWidth(r93Var.f8620j);
        this.r = r93Var;
    }

    @Override // com.google.android.gms.internal.ads.r40
    public final n1 i() {
        try {
            return this.f9377m.zza();
        } catch (vp1 unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.r40
    public final yo1 j() {
        r93 r93Var = this.r;
        if (r93Var != null) {
            return up1.c(r93Var);
        }
        xo1 xo1Var = this.f8822b;
        if (xo1Var.W) {
            for (String str : xo1Var.a) {
                if (str == null || !str.contains("FirstParty")) {
                }
            }
            return new yo1(this.f9374j.getWidth(), this.f9374j.getHeight(), false);
        }
        return up1.a(this.f8822b.q, this.f9376l);
    }

    @Override // com.google.android.gms.internal.ads.r40
    public final yo1 k() {
        return this.f9376l;
    }

    @Override // com.google.android.gms.internal.ads.r40
    public final int l() {
        if (((Boolean) c.c().b(w3.b5)).booleanValue() && this.f8822b.b0) {
            if (!((Boolean) c.c().b(w3.c5)).booleanValue()) {
                return 0;
            }
        }
        return this.a.f7035b.f6562b.f4968c;
    }

    @Override // com.google.android.gms.internal.ads.r40
    public final void m() {
        this.o.zza();
    }

    final /* bridge */ /* synthetic */ void n() {
        if (this.n.d() == null) {
            return;
        }
        try {
            this.n.d().X1(this.p.zzb(), e.c.b.b.b.d.m4(this.f9373i));
        } catch (RemoteException e2) {
            er.zzg("RemoteException when notifyAdLoad is called", e2);
        }
    }
}