package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class m51 implements x02 {
    private final q51 a;

    /* renamed from: b */
    private final ew f7429b;

    /* renamed from: c */
    private final xo1 f7430c;

    /* renamed from: d */
    private final mi0 f7431d;

    m51(q51 q51Var, ew ewVar, xo1 xo1Var, mi0 mi0Var) {
        this.a = q51Var;
        this.f7429b = ewVar;
        this.f7430c = xo1Var;
        this.f7431d = mi0Var;
    }

    @Override // com.google.android.gms.internal.ads.x02
    public final Object apply(Object obj) {
        ew ewVar = this.f7429b;
        xo1 xo1Var = this.f7430c;
        mi0 mi0Var = this.f7431d;
        if (xo1Var.H) {
            ewVar.k0();
        }
        ewVar.L();
        ewVar.onPause();
        return mi0Var.h();
    }
}