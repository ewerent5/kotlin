package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class e81 implements Runnable {

    /* renamed from: e */
    private final f81 f5595e;

    /* renamed from: f */
    private final kp1 f5596f;

    /* renamed from: g */
    private final xo1 f5597g;

    /* renamed from: h */
    private final m31 f5598h;

    e81(f81 f81Var, kp1 kp1Var, xo1 xo1Var, m31 m31Var) {
        this.f5595e = f81Var;
        this.f5596f = kp1Var;
        this.f5597g = xo1Var;
        this.f5598h = m31Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f81 f81Var = this.f5595e;
        kp1 kp1Var = this.f5596f;
        xo1 xo1Var = this.f5597g;
        m31 m31Var = this.f5598h;
        h81 h81Var = f81Var.f5828d;
        h81.e(kp1Var, xo1Var, m31Var);
    }
}