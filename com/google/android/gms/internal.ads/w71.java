package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class w71 implements x02 {
    private final b81 a;

    /* renamed from: b */
    private final ew f9914b;

    /* renamed from: c */
    private final xo1 f9915c;

    /* renamed from: d */
    private final yq0 f9916d;

    w71(b81 b81Var, ew ewVar, xo1 xo1Var, yq0 yq0Var) {
        this.a = b81Var;
        this.f9914b = ewVar;
        this.f9915c = xo1Var;
        this.f9916d = yq0Var;
    }

    @Override // com.google.android.gms.internal.ads.x02
    public final Object apply(Object obj) {
        ew ewVar = this.f9914b;
        xo1 xo1Var = this.f9915c;
        yq0 yq0Var = this.f9916d;
        if (xo1Var.H) {
            ewVar.k0();
        }
        ewVar.L();
        ewVar.onPause();
        return yq0Var.h();
    }
}