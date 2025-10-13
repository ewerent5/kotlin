package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
/* loaded from: classes.dex */
final class m5 implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ ka f11028e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ e5 f11029f;

    m5(e5 e5Var, ka kaVar) {
        this.f11029f = e5Var;
        this.f11028e = kaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f11029f.f10830e.f0();
        this.f11029f.f10830e.s(this.f11028e);
    }
}