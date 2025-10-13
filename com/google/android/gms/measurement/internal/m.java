package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
final class m implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ z5 f11022e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ j f11023f;

    m(j jVar, z5 z5Var) {
        this.f11023f = jVar;
        this.f11022e = z5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f11022e.zzt();
        if (ta.a()) {
            this.f11022e.zzp().u(this);
            return;
        }
        boolean zD = this.f11023f.d();
        j.a(this.f11023f, 0L);
        if (zD) {
            this.f11023f.b();
        }
    }
}