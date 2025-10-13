package com.google.android.gms.measurement.internal;

import e.c.b.b.c.e.qc;

/* compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
/* loaded from: classes.dex */
final class ua extends ra {

    /* renamed from: g, reason: collision with root package name */
    private e.c.b.b.c.e.s0 f11283g;

    /* renamed from: h, reason: collision with root package name */
    private final /* synthetic */ oa f11284h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ua(oa oaVar, String str, int i2, e.c.b.b.c.e.s0 s0Var) {
        super(str, i2);
        this.f11284h = oaVar;
        this.f11283g = s0Var;
    }

    @Override // com.google.android.gms.measurement.internal.ra
    final int a() {
        return this.f11283g.B();
    }

    @Override // com.google.android.gms.measurement.internal.ra
    final boolean i() {
        return true;
    }

    @Override // com.google.android.gms.measurement.internal.ra
    final boolean j() {
        return false;
    }

    final boolean k(Long l2, Long l3, e.c.b.b.c.e.o1 o1Var, boolean z) {
        boolean z2 = qc.a() && this.f11284h.i().v(this.a, t.b0);
        boolean zE = this.f11283g.E();
        boolean zF = this.f11283g.F();
        boolean zH = this.f11283g.H();
        boolean z3 = zE || zF || zH;
        Boolean boolD = null;
        boolD = null;
        boolD = null;
        boolD = null;
        boolD = null;
        if (z && !z3) {
            this.f11284h.zzq().I().c("Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", Integer.valueOf(this.f11188b), this.f11283g.A() ? Integer.valueOf(this.f11283g.B()) : null);
            return true;
        }
        e.c.b.b.c.e.q0 q0VarD = this.f11283g.D();
        boolean zF2 = q0VarD.F();
        if (o1Var.Q()) {
            if (q0VarD.C()) {
                boolD = ra.d(ra.c(o1Var.S(), q0VarD.D()), zF2);
            } else {
                this.f11284h.zzq().D().b("No number filter for long property. property", this.f11284h.f().v(o1Var.M()));
            }
        } else if (o1Var.T()) {
            if (q0VarD.C()) {
                boolD = ra.d(ra.b(o1Var.U(), q0VarD.D()), zF2);
            } else {
                this.f11284h.zzq().D().b("No number filter for double property. property", this.f11284h.f().v(o1Var.M()));
            }
        } else if (!o1Var.O()) {
            this.f11284h.zzq().D().b("User property has no value, property", this.f11284h.f().v(o1Var.M()));
        } else if (q0VarD.A()) {
            boolD = ra.d(ra.g(o1Var.P(), q0VarD.B(), this.f11284h.zzq()), zF2);
        } else if (!q0VarD.C()) {
            this.f11284h.zzq().D().b("No string or number filter defined. property", this.f11284h.f().v(o1Var.M()));
        } else if (z9.Q(o1Var.P())) {
            boolD = ra.d(ra.e(o1Var.P(), q0VarD.D()), zF2);
        } else {
            this.f11284h.zzq().D().c("Invalid user property value for Numeric number filter. property, value", this.f11284h.f().v(o1Var.M()), o1Var.P());
        }
        this.f11284h.zzq().I().b("Property filter result", boolD == null ? "null" : boolD);
        if (boolD == null) {
            return false;
        }
        this.f11189c = Boolean.TRUE;
        if (zH && !boolD.booleanValue()) {
            return true;
        }
        if (!z || this.f11283g.E()) {
            this.f11190d = boolD;
        }
        if (boolD.booleanValue() && z3 && o1Var.F()) {
            long jG = o1Var.G();
            if (l2 != null) {
                jG = l2.longValue();
            }
            if (z2 && this.f11283g.E() && !this.f11283g.F() && l3 != null) {
                jG = l3.longValue();
            }
            if (this.f11283g.F()) {
                this.f11192f = Long.valueOf(jG);
            } else {
                this.f11191e = Long.valueOf(jG);
            }
        }
        return true;
    }
}