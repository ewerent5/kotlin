package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
final class z7 implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ boolean f11381e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ ca f11382f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ ka f11383g;

    /* renamed from: h, reason: collision with root package name */
    private final /* synthetic */ y7 f11384h;

    z7(y7 y7Var, boolean z, ca caVar, ka kaVar) {
        this.f11384h = y7Var;
        this.f11381e = z;
        this.f11382f = caVar;
        this.f11383g = kaVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        n3 n3Var = this.f11384h.f11352d;
        if (n3Var == null) {
            this.f11384h.zzq().A().a("Discarding data. Failed to set user property");
        } else {
            this.f11384h.G(n3Var, this.f11381e ? null : this.f11382f, this.f11383g);
            this.f11384h.Z();
        }
    }
}