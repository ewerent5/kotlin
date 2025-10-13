package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class b81 implements j31<xq0> {
    private final Context a;

    /* renamed from: b, reason: collision with root package name */
    private final vr0 f5084b;

    /* renamed from: c, reason: collision with root package name */
    private final dr0 f5085c;

    /* renamed from: d, reason: collision with root package name */
    private final qp1 f5086d;

    /* renamed from: e, reason: collision with root package name */
    private final Executor f5087e;

    /* renamed from: f, reason: collision with root package name */
    private final kr f5088f;

    /* renamed from: g, reason: collision with root package name */
    private final ea f5089g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f5090h = ((Boolean) c.c().b(w3.O5)).booleanValue();

    public b81(Context context, kr krVar, qp1 qp1Var, Executor executor, dr0 dr0Var, vr0 vr0Var, ea eaVar) {
        this.a = context;
        this.f5086d = qp1Var;
        this.f5085c = dr0Var;
        this.f5087e = executor;
        this.f5088f = krVar;
        this.f5084b = vr0Var;
        this.f5089g = eaVar;
    }

    @Override // com.google.android.gms.internal.ads.j31
    public final g52<xq0> a(final kp1 kp1Var, final xo1 xo1Var) {
        final zr0 zr0Var = new zr0();
        g52<xq0> g52VarH = y42.h(y42.a(null), new e42(this, xo1Var, kp1Var, zr0Var) { // from class: com.google.android.gms.internal.ads.t71
            private final b81 a;

            /* renamed from: b, reason: collision with root package name */
            private final xo1 f9084b;

            /* renamed from: c, reason: collision with root package name */
            private final kp1 f9085c;

            /* renamed from: d, reason: collision with root package name */
            private final zr0 f9086d;

            {
                this.a = this;
                this.f9084b = xo1Var;
                this.f9085c = kp1Var;
                this.f9086d = zr0Var;
            }

            @Override // com.google.android.gms.internal.ads.e42
            public final g52 zza(Object obj) {
                return this.a.c(this.f9084b, this.f9085c, this.f9086d, obj);
            }
        }, this.f5087e);
        g52VarH.zze(u71.a(zr0Var), this.f5087e);
        return g52VarH;
    }

    @Override // com.google.android.gms.internal.ads.j31
    public final boolean b(kp1 kp1Var, xo1 xo1Var) {
        cp1 cp1Var = xo1Var.r;
        return (cp1Var == null || cp1Var.a == null) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ g52 c(final xo1 xo1Var, kp1 kp1Var, zr0 zr0Var, Object obj) {
        final ew ewVarA = this.f5084b.a(this.f5086d.f8428e, xo1Var, kp1Var.f7035b.f6562b);
        ewVarA.w(xo1Var.Q);
        zr0Var.a(this.a, (View) ewVarA);
        wr wrVar = new wr();
        final yq0 yq0VarA = this.f5085c.a(new i70(kp1Var, xo1Var, null), new zq0(new a81(this.a, this.f5084b, this.f5086d, this.f5088f, xo1Var, wrVar, ewVarA, this.f5089g, this.f5090h, null), ewVarA));
        wrVar.zzc(yq0VarA);
        sa.b(ewVarA, yq0VarA.k());
        yq0VarA.d().H0(new ib0(ewVarA) { // from class: com.google.android.gms.internal.ads.v71

            /* renamed from: e, reason: collision with root package name */
            private final ew f9667e;

            {
                this.f9667e = ewVarA;
            }

            @Override // com.google.android.gms.internal.ads.ib0
            public final void b() {
                ew ewVar = this.f9667e;
                if (ewVar.E0() != null) {
                    ewVar.E0().zzh();
                }
            }
        }, qr.f8451f);
        yq0VarA.l().i(ewVarA, true, this.f5090h ? this.f5089g : null);
        yq0VarA.l();
        cp1 cp1Var = xo1Var.r;
        return y42.i(ur0.j(ewVarA, cp1Var.f5346b, cp1Var.a), new x02(this, ewVarA, xo1Var, yq0VarA) { // from class: com.google.android.gms.internal.ads.w71
            private final b81 a;

            /* renamed from: b, reason: collision with root package name */
            private final ew f9914b;

            /* renamed from: c, reason: collision with root package name */
            private final xo1 f9915c;

            /* renamed from: d, reason: collision with root package name */
            private final yq0 f9916d;

            {
                this.a = this;
                this.f9914b = ewVarA;
                this.f9915c = xo1Var;
                this.f9916d = yq0VarA;
            }

            @Override // com.google.android.gms.internal.ads.x02
            public final Object apply(Object obj2) {
                ew ewVar = this.f9914b;
                xo1 xo1Var2 = this.f9915c;
                yq0 yq0Var = this.f9916d;
                if (xo1Var2.H) {
                    ewVar.k0();
                }
                ewVar.L();
                ewVar.onPause();
                return yq0Var.h();
            }
        }, this.f5087e);
    }
}