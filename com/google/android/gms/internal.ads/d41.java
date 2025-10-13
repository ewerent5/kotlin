package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class d41 implements j31<z30> {
    private final t30 a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f5424b;

    /* renamed from: c, reason: collision with root package name */
    private final vr0 f5425c;

    /* renamed from: d, reason: collision with root package name */
    private final Executor f5426d;

    public d41(t30 t30Var, Context context, Executor executor, vr0 vr0Var) {
        this.f5424b = context;
        this.a = t30Var;
        this.f5426d = executor;
        this.f5425c = vr0Var;
    }

    @Override // com.google.android.gms.internal.ads.j31
    public final g52<z30> a(final kp1 kp1Var, final xo1 xo1Var) {
        return y42.h(y42.a(null), new e42(this, kp1Var, xo1Var) { // from class: com.google.android.gms.internal.ads.a41
            private final d41 a;

            /* renamed from: b, reason: collision with root package name */
            private final kp1 f4839b;

            /* renamed from: c, reason: collision with root package name */
            private final xo1 f4840c;

            {
                this.a = this;
                this.f4839b = kp1Var;
                this.f4840c = xo1Var;
            }

            @Override // com.google.android.gms.internal.ads.e42
            public final g52 zza(Object obj) {
                return this.a.c(this.f4839b, this.f4840c, obj);
            }
        }, this.f5426d);
    }

    @Override // com.google.android.gms.internal.ads.j31
    public final boolean b(kp1 kp1Var, xo1 xo1Var) {
        cp1 cp1Var = xo1Var.r;
        return (cp1Var == null || cp1Var.a == null) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ g52 c(kp1 kp1Var, xo1 xo1Var, Object obj) {
        r93 r93VarB = up1.b(this.f5424b, xo1Var.t);
        final ew ewVarA = this.f5425c.a(r93VarB, xo1Var, kp1Var.f7035b.f6562b);
        final m30 m30VarA = this.a.a(new i70(kp1Var, xo1Var, null), new n30((View) ewVarA, ewVarA, up1.c(r93VarB), xo1Var.U, xo1Var.Y, xo1Var.J));
        m30VarA.i().i(ewVarA, false, null);
        gb0 gb0VarD = m30VarA.d();
        ib0 ib0Var = new ib0(ewVarA) { // from class: com.google.android.gms.internal.ads.b41

            /* renamed from: e, reason: collision with root package name */
            private final ew f5070e;

            {
                this.f5070e = ewVarA;
            }

            @Override // com.google.android.gms.internal.ads.ib0
            public final void b() {
                ew ewVar = this.f5070e;
                if (ewVar.E0() != null) {
                    ewVar.E0().zzh();
                }
            }
        };
        h52 h52Var = qr.f8451f;
        gb0VarD.H0(ib0Var, h52Var);
        m30VarA.i();
        cp1 cp1Var = xo1Var.r;
        return y42.i(ur0.j(ewVarA, cp1Var.f5346b, cp1Var.a), new x02(m30VarA) { // from class: com.google.android.gms.internal.ads.c41
            private final m30 a;

            {
                this.a = m30VarA;
            }

            @Override // com.google.android.gms.internal.ads.x02
            public final Object apply(Object obj2) {
                return this.a.h();
            }
        }, h52Var);
    }
}