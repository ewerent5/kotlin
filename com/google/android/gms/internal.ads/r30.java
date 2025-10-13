package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class r30 {
    private final cu1 a;

    /* renamed from: b */
    private final nu0 f8574b;

    /* renamed from: c */
    private final kp1 f8575c;

    public r30(nu0 nu0Var, kp1 kp1Var, cu1 cu1Var) {
        this.a = cu1Var;
        this.f8574b = nu0Var;
        this.f8575c = kp1Var;
    }

    private static String b(int i2) {
        int i3 = i2 - 1;
        return i3 != 0 ? i3 != 1 ? i3 != 2 ? i3 != 3 ? i3 != 4 ? "u" : "ac" : "cb" : "cc" : "bb" : "h";
    }

    public final void a(long j2, int i2) {
        if (((Boolean) c.c().b(w3.I5)).booleanValue()) {
            cu1 cu1Var = this.a;
            bu1 bu1VarA = bu1.a("ad_closed");
            bu1VarA.h(this.f8575c.f7035b.f6562b);
            bu1VarA.c("show_time", String.valueOf(j2));
            bu1VarA.c("ad_format", "app_open_ad");
            bu1VarA.c("acr", b(i2));
            cu1Var.b(bu1VarA);
            return;
        }
        mu0 mu0VarA = this.f8574b.a();
        mu0VarA.a(this.f8575c.f7035b.f6562b);
        mu0VarA.c("action", "ad_closed");
        mu0VarA.c("show_time", String.valueOf(j2));
        mu0VarA.c("ad_format", "app_open_ad");
        mu0VarA.c("acr", b(i2));
        mu0VarA.d();
    }
}