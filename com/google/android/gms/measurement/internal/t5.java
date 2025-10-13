package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
/* loaded from: classes.dex */
final class t5 implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ ca f11236e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ ka f11237f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ e5 f11238g;

    t5(e5 e5Var, ca caVar, ka kaVar) {
        this.f11238g = e5Var;
        this.f11236e = caVar;
        this.f11237f = kaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f11238g.f10830e.f0();
        if (this.f11236e.c() == null) {
            this.f11238g.f10830e.M(this.f11236e, this.f11237f);
        } else {
            this.f11238g.f10830e.r(this.f11236e, this.f11237f);
        }
    }
}