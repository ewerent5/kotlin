package com.google.android.gms.internal.ads;

import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class c71 {
    private final dq1 a;

    /* renamed from: b, reason: collision with root package name */
    private final gs0 f5275b;

    /* renamed from: c, reason: collision with root package name */
    private final nu0 f5276c;

    /* renamed from: d, reason: collision with root package name */
    private final cu1 f5277d;

    public c71(dq1 dq1Var, gs0 gs0Var, nu0 nu0Var, cu1 cu1Var) {
        this.a = dq1Var;
        this.f5275b = gs0Var;
        this.f5276c = nu0Var;
        this.f5277d = cu1Var;
    }

    public final void a(ap1 ap1Var, xo1 xo1Var, int i2, @Nullable o31 o31Var, long j2) {
        if (((Boolean) c.c().b(w3.I5)).booleanValue()) {
            bu1 bu1VarA = bu1.a("adapter_status");
            bu1VarA.h(ap1Var);
            bu1VarA.i(xo1Var);
            bu1VarA.c("adapter_l", String.valueOf(j2));
            bu1VarA.c("sc", Integer.toString(i2));
            if (o31Var != null) {
                bu1VarA.c("arec", Integer.toString(o31Var.b().f6091e));
                String strA = this.a.a(o31Var.getMessage());
                if (strA != null) {
                    bu1VarA.c("areec", strA);
                }
            }
            fs0 fs0VarD = this.f5275b.d(xo1Var.s);
            if (fs0VarD != null) {
                bu1VarA.c("ancn", fs0VarD.a);
                gi giVar = fs0VarD.f5940b;
                if (giVar != null) {
                    bu1VarA.c("adapter_v", giVar.toString());
                }
                gi giVar2 = fs0VarD.f5941c;
                if (giVar2 != null) {
                    bu1VarA.c("adapter_sv", giVar2.toString());
                }
            }
            this.f5277d.b(bu1VarA);
            return;
        }
        mu0 mu0VarA = this.f5276c.a();
        mu0VarA.a(ap1Var);
        mu0VarA.b(xo1Var);
        mu0VarA.c("action", "adapter_status");
        mu0VarA.c("adapter_l", String.valueOf(j2));
        mu0VarA.c("sc", Integer.toString(i2));
        if (o31Var != null) {
            mu0VarA.c("arec", Integer.toString(o31Var.b().f6091e));
            String strA2 = this.a.a(o31Var.getMessage());
            if (strA2 != null) {
                mu0VarA.c("areec", strA2);
            }
        }
        fs0 fs0VarD2 = this.f5275b.d(xo1Var.s);
        if (fs0VarD2 != null) {
            mu0VarA.c("ancn", fs0VarD2.a);
            gi giVar3 = fs0VarD2.f5940b;
            if (giVar3 != null) {
                mu0VarA.c("adapter_v", giVar3.toString());
            }
            gi giVar4 = fs0VarD2.f5941c;
            if (giVar4 != null) {
                mu0VarA.c("adapter_sv", giVar4.toString());
            }
        }
        mu0VarA.d();
    }
}