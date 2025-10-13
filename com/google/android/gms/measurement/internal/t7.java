package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
final class t7 implements Runnable {

    /* renamed from: e */
    private final /* synthetic */ long f11241e;

    /* renamed from: f */
    private final /* synthetic */ p7 f11242f;

    t7(p7 p7Var, long j2) {
        this.f11242f = p7Var;
        this.f11241e = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f11242f.j().q(this.f11241e);
        this.f11242f.f11116e = null;
    }
}