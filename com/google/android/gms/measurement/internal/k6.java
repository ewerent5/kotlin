package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
final /* synthetic */ class k6 implements Runnable {

    /* renamed from: e */
    private final i6 f10982e;

    k6(i6 i6Var) {
        this.f10982e = i6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        i6 i6Var = this.f10982e;
        i6Var.d();
        if (i6Var.h().y.b()) {
            i6Var.zzq().H().a("Deferred Deep Link already retrieved. Not fetching again.");
            return;
        }
        long jA = i6Var.h().z.a();
        i6Var.h().z.b(1 + jA);
        if (jA < 5) {
            i6Var.a.q();
        } else {
            i6Var.zzq().D().a("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
            i6Var.h().y.a(true);
        }
    }
}