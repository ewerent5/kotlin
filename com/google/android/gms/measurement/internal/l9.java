package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import e.c.b.b.c.e.dd;
import e.c.b.b.c.e.ed;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
final class l9 {
    private long a;

    /* renamed from: b, reason: collision with root package name */
    private long f11019b;

    /* renamed from: c, reason: collision with root package name */
    private final j f11020c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ e9 f11021d;

    public l9(e9 e9Var) {
        this.f11021d = e9Var;
        this.f11020c = new k9(this, e9Var.a);
        long jC = e9Var.zzl().c();
        this.a = jC;
        this.f11019b = jC;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h() {
        this.f11021d.d();
        d(false, false, this.f11021d.zzl().c());
        this.f11021d.j().q(this.f11021d.zzl().c());
    }

    final void a() {
        this.f11020c.e();
        this.a = 0L;
        this.f11019b = 0L;
    }

    final void b(long j2) {
        this.f11021d.d();
        this.f11020c.e();
        this.a = j2;
        this.f11019b = j2;
    }

    public final boolean d(boolean z, boolean z2, long j2) {
        this.f11021d.d();
        this.f11021d.r();
        if (!dd.a() || !this.f11021d.i().o(t.r0) || this.f11021d.a.k()) {
            this.f11021d.h().v.b(this.f11021d.zzl().a());
        }
        long jG = j2 - this.a;
        if (!z && jG < 1000) {
            this.f11021d.zzq().I().b("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(jG));
            return false;
        }
        if (this.f11021d.i().o(t.U) && !z2) {
            jG = (ed.a() && this.f11021d.i().o(t.W)) ? g(j2) : e();
        }
        this.f11021d.zzq().I().b("Recording user engagement, ms", Long.valueOf(jG));
        Bundle bundle = new Bundle();
        bundle.putLong("_et", jG);
        p7.J(this.f11021d.n().y(!this.f11021d.i().D().booleanValue()), bundle, true);
        if (this.f11021d.i().o(t.U) && !this.f11021d.i().o(t.V) && z2) {
            bundle.putLong("_fr", 1L);
        }
        if (!this.f11021d.i().o(t.V) || !z2) {
            this.f11021d.k().R("auto", "_e", bundle);
        }
        this.a = j2;
        this.f11020c.e();
        this.f11020c.c(3600000L);
        return true;
    }

    final long e() {
        long jC = this.f11021d.zzl().c();
        long j2 = jC - this.f11019b;
        this.f11019b = jC;
        return j2;
    }

    final void f(long j2) {
        this.f11020c.e();
    }

    final long g(long j2) {
        long j3 = j2 - this.f11019b;
        this.f11019b = j2;
        return j3;
    }
}