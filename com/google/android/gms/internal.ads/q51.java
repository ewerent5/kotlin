package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class q51 implements j31<li0> {
    private final Context a;

    /* renamed from: b, reason: collision with root package name */
    private final vr0 f8332b;

    /* renamed from: c, reason: collision with root package name */
    private final jj0 f8333c;

    /* renamed from: d, reason: collision with root package name */
    private final qp1 f8334d;

    /* renamed from: e, reason: collision with root package name */
    private final Executor f8335e;

    /* renamed from: f, reason: collision with root package name */
    private final kr f8336f;

    /* renamed from: g, reason: collision with root package name */
    private final ea f8337g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f8338h = ((Boolean) c.c().b(w3.O5)).booleanValue();

    public q51(Context context, kr krVar, qp1 qp1Var, Executor executor, jj0 jj0Var, vr0 vr0Var, ea eaVar) {
        this.a = context;
        this.f8334d = qp1Var;
        this.f8333c = jj0Var;
        this.f8335e = executor;
        this.f8336f = krVar;
        this.f8332b = vr0Var;
        this.f8337g = eaVar;
    }

    @Override // com.google.android.gms.internal.ads.j31
    public final g52<li0> a(final kp1 kp1Var, final xo1 xo1Var) {
        final zr0 zr0Var = new zr0();
        g52<li0> g52VarH = y42.h(y42.a(null), new e42(this, xo1Var, kp1Var, zr0Var) { // from class: com.google.android.gms.internal.ads.j51
            private final q51 a;

            /* renamed from: b, reason: collision with root package name */
            private final xo1 f6690b;

            /* renamed from: c, reason: collision with root package name */
            private final kp1 f6691c;

            /* renamed from: d, reason: collision with root package name */
            private final zr0 f6692d;

            {
                this.a = this;
                this.f6690b = xo1Var;
                this.f6691c = kp1Var;
                this.f6692d = zr0Var;
            }

            @Override // com.google.android.gms.internal.ads.e42
            public final g52 zza(Object obj) {
                return this.a.c(this.f6690b, this.f6691c, this.f6692d, obj);
            }
        }, this.f8335e);
        g52VarH.zze(k51.a(zr0Var), this.f8335e);
        return g52VarH;
    }

    @Override // com.google.android.gms.internal.ads.j31
    public final boolean b(kp1 kp1Var, xo1 xo1Var) {
        cp1 cp1Var = xo1Var.r;
        return (cp1Var == null || cp1Var.a == null) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ g52 c(final xo1 xo1Var, kp1 kp1Var, zr0 zr0Var, Object obj) {
        final ew ewVarA = this.f8332b.a(this.f8334d.f8428e, xo1Var, kp1Var.f7035b.f6562b);
        ewVarA.w(xo1Var.Q);
        zr0Var.a(this.a, (View) ewVarA);
        wr wrVar = new wr();
        final mi0 mi0VarC = this.f8333c.c(new i70(kp1Var, xo1Var, null), new pi0(new o51(this.a, this.f8336f, wrVar, xo1Var, ewVarA, this.f8334d, this.f8338h, this.f8337g, null), ewVarA));
        wrVar.zzc(mi0VarC);
        mi0VarC.d().H0(new ib0(ewVarA) { // from class: com.google.android.gms.internal.ads.l51

            /* renamed from: e, reason: collision with root package name */
            private final ew f7199e;

            {
                this.f7199e = ewVarA;
            }

            @Override // com.google.android.gms.internal.ads.ib0
            public final void b() {
                ew ewVar = this.f7199e;
                if (ewVar.E0() != null) {
                    ewVar.E0().zzh();
                }
            }
        }, qr.f8451f);
        mi0VarC.k().i(ewVarA, true, this.f8338h ? this.f8337g : null);
        mi0VarC.k();
        cp1 cp1Var = xo1Var.r;
        return y42.i(ur0.j(ewVarA, cp1Var.f5346b, cp1Var.a), new x02(this, ewVarA, xo1Var, mi0VarC) { // from class: com.google.android.gms.internal.ads.m51
            private final q51 a;

            /* renamed from: b, reason: collision with root package name */
            private final ew f7429b;

            /* renamed from: c, reason: collision with root package name */
            private final xo1 f7430c;

            /* renamed from: d, reason: collision with root package name */
            private final mi0 f7431d;

            {
                this.a = this;
                this.f7429b = ewVarA;
                this.f7430c = xo1Var;
                this.f7431d = mi0VarC;
            }

            @Override // com.google.android.gms.internal.ads.x02
            public final Object apply(Object obj2) {
                ew ewVar = this.f7429b;
                xo1 xo1Var2 = this.f7430c;
                mi0 mi0Var = this.f7431d;
                if (xo1Var2.H) {
                    ewVar.k0();
                }
                ewVar.L();
                ewVar.onPause();
                return mi0Var.h();
            }
        }, this.f8335e);
    }
}