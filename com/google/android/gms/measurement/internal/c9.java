package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
/* loaded from: classes.dex */
final class c9 implements Runnable {

    /* renamed from: e */
    private final /* synthetic */ t9 f10789e;

    /* renamed from: f */
    private final /* synthetic */ Runnable f10790f;

    c9(x8 x8Var, t9 t9Var, Runnable runnable) {
        this.f10789e = t9Var;
        this.f10790f = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f10789e.f0();
        this.f10789e.v(this.f10790f);
        this.f10789e.e0();
    }
}