package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class qm0 implements Runnable {

    /* renamed from: e */
    private final tm0 f8410e;

    /* renamed from: f */
    private final pn0 f8411f;

    qm0(tm0 tm0Var, pn0 pn0Var) {
        this.f8410e = tm0Var;
        this.f8411f = pn0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f8410e.f(this.f8411f);
    }
}