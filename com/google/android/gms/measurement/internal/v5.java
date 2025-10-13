package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
/* loaded from: classes.dex */
final class v5 implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ ka f11296e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ e5 f11297f;

    v5(e5 e5Var, ka kaVar) {
        this.f11297f = e5Var;
        this.f11296e = kaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f11297f.f10830e.f0();
        this.f11297f.f10830e.N(this.f11296e);
    }
}