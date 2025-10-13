package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class d51 implements Runnable {

    /* renamed from: e */
    private final f51 f5436e;

    /* renamed from: f */
    private final kp1 f5437f;

    /* renamed from: g */
    private final xo1 f5438g;

    d51(f51 f51Var, kp1 kp1Var, xo1 xo1Var) {
        this.f5436e = f51Var;
        this.f5437f = kp1Var;
        this.f5438g = xo1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f5436e.d(this.f5437f, this.f5438g);
    }
}