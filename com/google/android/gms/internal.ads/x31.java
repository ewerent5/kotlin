package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class x31 implements j31<k40> {
    private final f40 a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f10112b;

    /* renamed from: c, reason: collision with root package name */
    private final vr0 f10113c;

    /* renamed from: d, reason: collision with root package name */
    private final qp1 f10114d;

    /* renamed from: e, reason: collision with root package name */
    private final Executor f10115e;

    /* renamed from: f, reason: collision with root package name */
    private final kr f10116f;

    /* renamed from: g, reason: collision with root package name */
    private final ea f10117g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f10118h = ((Boolean) c.c().b(w3.O5)).booleanValue();

    public x31(f40 f40Var, Context context, Executor executor, vr0 vr0Var, qp1 qp1Var, kr krVar, ea eaVar) {
        this.f10112b = context;
        this.a = f40Var;
        this.f10115e = executor;
        this.f10113c = vr0Var;
        this.f10114d = qp1Var;
        this.f10116f = krVar;
        this.f10117g = eaVar;
    }

    @Override // com.google.android.gms.internal.ads.j31
    public final g52<k40> a(final kp1 kp1Var, final xo1 xo1Var) {
        final zr0 zr0Var = new zr0();
        g52<k40> g52VarH = y42.h(y42.a(null), new e42(this, xo1Var, kp1Var, zr0Var) { // from class: com.google.android.gms.internal.ads.t31
            private final x31 a;

            /* renamed from: b, reason: collision with root package name */
            private final xo1 f9074b;

            /* renamed from: c, reason: collision with root package name */
            private final kp1 f9075c;

            /* renamed from: d, reason: collision with root package name */
            private final zr0 f9076d;

            {
                this.a = this;
                this.f9074b = xo1Var;
                this.f9075c = kp1Var;
                this.f9076d = zr0Var;
            }

            @Override // com.google.android.gms.internal.ads.e42
            public final g52 zza(Object obj) {
                return this.a.c(this.f9074b, this.f9075c, this.f9076d, obj);
            }
        }, this.f10115e);
        g52VarH.zze(u31.a(zr0Var), this.f10115e);
        return g52VarH;
    }

    @Override // com.google.android.gms.internal.ads.j31
    public final boolean b(kp1 kp1Var, xo1 xo1Var) {
        cp1 cp1Var = xo1Var.r;
        return (cp1Var == null || cp1Var.a == null) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ g52 c(final xo1 xo1Var, kp1 kp1Var, zr0 zr0Var, Object obj) {
        final ew ewVarA = this.f10113c.a(this.f10114d.f8428e, xo1Var, kp1Var.f7035b.f6562b);
        ewVarA.w(xo1Var.Q);
        zr0Var.a(this.f10112b, (View) ewVarA);
        wr wrVar = new wr();
        final b40 b40VarA = this.a.a(new i70(kp1Var, xo1Var, null), new pi0(new z31(this.f10116f, wrVar, xo1Var, ewVarA, this.f10114d, this.f10118h, this.f10117g), ewVarA), new c40(xo1Var.U));
        b40VarA.i().i(ewVarA, false, this.f10118h ? this.f10117g : null);
        wrVar.zzc(b40VarA);
        b40VarA.d().H0(new ib0(ewVarA) { // from class: com.google.android.gms.internal.ads.v31

            /* renamed from: e, reason: collision with root package name */
            private final ew f9635e;

            {
                this.f9635e = ewVarA;
            }

            @Override // com.google.android.gms.internal.ads.ib0
            public final void b() {
                ew ewVar = this.f9635e;
                if (ewVar.E0() != null) {
                    ewVar.E0().zzh();
                }
            }
        }, qr.f8451f);
        b40VarA.i();
        cp1 cp1Var = xo1Var.r;
        return y42.i(ur0.j(ewVarA, cp1Var.f5346b, cp1Var.a), new x02(this, ewVarA, xo1Var, b40VarA) { // from class: com.google.android.gms.internal.ads.w31
            private final x31 a;

            /* renamed from: b, reason: collision with root package name */
            private final ew f9874b;

            /* renamed from: c, reason: collision with root package name */
            private final xo1 f9875c;

            /* renamed from: d, reason: collision with root package name */
            private final b40 f9876d;

            {
                this.a = this;
                this.f9874b = ewVarA;
                this.f9875c = xo1Var;
                this.f9876d = b40VarA;
            }

            @Override // com.google.android.gms.internal.ads.x02
            public final Object apply(Object obj2) {
                ew ewVar = this.f9874b;
                xo1 xo1Var2 = this.f9875c;
                b40 b40Var = this.f9876d;
                if (xo1Var2.H) {
                    ewVar.k0();
                }
                ewVar.L();
                ewVar.onPause();
                return b40Var.h();
            }
        }, this.f10115e);
    }
}