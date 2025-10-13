package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class w31 implements x02 {
    private final x31 a;

    /* renamed from: b */
    private final ew f9874b;

    /* renamed from: c */
    private final xo1 f9875c;

    /* renamed from: d */
    private final b40 f9876d;

    w31(x31 x31Var, ew ewVar, xo1 xo1Var, b40 b40Var) {
        this.a = x31Var;
        this.f9874b = ewVar;
        this.f9875c = xo1Var;
        this.f9876d = b40Var;
    }

    @Override // com.google.android.gms.internal.ads.x02
    public final Object apply(Object obj) {
        ew ewVar = this.f9874b;
        xo1 xo1Var = this.f9875c;
        b40 b40Var = this.f9876d;
        if (xo1Var.H) {
            ewVar.k0();
        }
        ewVar.L();
        ewVar.onPause();
        return b40Var.h();
    }
}