package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class d91<AdT> implements j31<AdT> {
    private final s4 a;

    /* renamed from: b, reason: collision with root package name */
    private final h52 f5448b;

    /* renamed from: c, reason: collision with root package name */
    private final st1 f5449c;

    /* renamed from: d, reason: collision with root package name */
    private final m91 f5450d;

    /* JADX WARN: Multi-variable type inference failed */
    public d91(st1 st1Var, st1 st1Var2, h52 h52Var, s4 s4Var, m91 m91Var) {
        this.f5449c = st1Var;
        this.f5448b = st1Var2;
        this.a = h52Var;
        this.f5450d = s4Var;
    }

    @Override // com.google.android.gms.internal.ads.j31
    public final g52<AdT> a(kp1 kp1Var, xo1 xo1Var) {
        wr wrVar = new wr();
        i91 i91Var = new i91();
        i91Var.a(new c91(this, wrVar, kp1Var, xo1Var, i91Var));
        cp1 cp1Var = xo1Var.r;
        final n4 n4Var = new n4(i91Var, cp1Var.f5346b, cp1Var.a);
        st1 st1Var = this.f5449c;
        return ct1.d(new ws1(this, n4Var) { // from class: com.google.android.gms.internal.ads.b91
            private final d91 a;

            /* renamed from: b, reason: collision with root package name */
            private final n4 f5093b;

            {
                this.a = this;
                this.f5093b = n4Var;
            }

            @Override // com.google.android.gms.internal.ads.ws1
            public final void zza() {
                this.a.c(this.f5093b);
            }
        }, this.f5448b, lt1.CUSTOM_RENDER_SYN, st1Var).j(lt1.CUSTOM_RENDER_ACK).e(wrVar).i();
    }

    @Override // com.google.android.gms.internal.ads.j31
    public final boolean b(kp1 kp1Var, xo1 xo1Var) {
        cp1 cp1Var;
        return (this.a == null || (cp1Var = xo1Var.r) == null || cp1Var.a == null) ? false : true;
    }

    final /* synthetic */ void c(n4 n4Var) {
        this.a.u4(n4Var);
    }
}