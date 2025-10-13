package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
final class f9 {
    private j9 a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ e9 f10876b;

    f9(e9 e9Var) {
        this.f10876b = e9Var;
    }

    final void a() {
        this.f10876b.d();
        if (this.a != null) {
            this.f10876b.f10844c.removeCallbacks(this.a);
        }
        if (this.f10876b.i().o(t.w0)) {
            this.f10876b.h().x.a(false);
        }
    }

    final void b(long j2) {
        this.a = new j9(this, this.f10876b.zzl().a(), j2);
        this.f10876b.f10844c.postDelayed(this.a, 2000L);
    }
}