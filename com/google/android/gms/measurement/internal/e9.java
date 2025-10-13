package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import e.c.b.b.c.e.pf;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
public final class e9 extends f5 {

    /* renamed from: c, reason: collision with root package name */
    private Handler f10844c;

    /* renamed from: d, reason: collision with root package name */
    protected final n9 f10845d;

    /* renamed from: e, reason: collision with root package name */
    protected final l9 f10846e;

    /* renamed from: f, reason: collision with root package name */
    private final f9 f10847f;

    e9(z4 z4Var) {
        super(z4Var);
        this.f10845d = new n9(this);
        this.f10846e = new l9(this);
        this.f10847f = new f9(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A() {
        d();
        if (this.f10844c == null) {
            this.f10844c = new pf(Looper.getMainLooper());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C(long j2) {
        d();
        A();
        zzq().I().b("Activity resumed, time", Long.valueOf(j2));
        if (i().o(t.w0)) {
            if (i().D().booleanValue() || h().x.b()) {
                this.f10846e.b(j2);
            }
            this.f10847f.a();
        } else {
            this.f10847f.a();
            if (i().D().booleanValue()) {
                this.f10846e.b(j2);
            }
        }
        n9 n9Var = this.f10845d;
        n9Var.a.d();
        if (n9Var.a.a.k()) {
            if (!n9Var.a.i().o(t.w0)) {
                n9Var.a.h().x.a(false);
            }
            n9Var.b(n9Var.a.zzl().a(), false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E(long j2) {
        d();
        A();
        zzq().I().b("Activity paused, time", Long.valueOf(j2));
        this.f10847f.b(j2);
        if (i().D().booleanValue()) {
            this.f10846e.f(j2);
        }
        n9 n9Var = this.f10845d;
        if (n9Var.a.i().o(t.w0)) {
            return;
        }
        n9Var.a.h().x.a(true);
    }

    @Override // com.google.android.gms.measurement.internal.d2, com.google.android.gms.measurement.internal.x5
    public final /* bridge */ /* synthetic */ void b() {
        super.b();
    }

    @Override // com.google.android.gms.measurement.internal.d2, com.google.android.gms.measurement.internal.x5
    public final /* bridge */ /* synthetic */ void c() {
        super.c();
    }

    @Override // com.google.android.gms.measurement.internal.d2, com.google.android.gms.measurement.internal.x5
    public final /* bridge */ /* synthetic */ void d() {
        super.d();
    }

    @Override // com.google.android.gms.measurement.internal.x5
    public final /* bridge */ /* synthetic */ l e() {
        return super.e();
    }

    @Override // com.google.android.gms.measurement.internal.x5
    public final /* bridge */ /* synthetic */ t3 f() {
        return super.f();
    }

    @Override // com.google.android.gms.measurement.internal.x5
    public final /* bridge */ /* synthetic */ da g() {
        return super.g();
    }

    @Override // com.google.android.gms.measurement.internal.x5
    public final /* bridge */ /* synthetic */ i4 h() {
        return super.h();
    }

    @Override // com.google.android.gms.measurement.internal.x5
    public final /* bridge */ /* synthetic */ c i() {
        return super.i();
    }

    @Override // com.google.android.gms.measurement.internal.d2
    public final /* bridge */ /* synthetic */ a j() {
        return super.j();
    }

    @Override // com.google.android.gms.measurement.internal.d2
    public final /* bridge */ /* synthetic */ i6 k() {
        return super.k();
    }

    @Override // com.google.android.gms.measurement.internal.d2
    public final /* bridge */ /* synthetic */ s3 l() {
        return super.l();
    }

    @Override // com.google.android.gms.measurement.internal.d2
    public final /* bridge */ /* synthetic */ y7 m() {
        return super.m();
    }

    @Override // com.google.android.gms.measurement.internal.d2
    public final /* bridge */ /* synthetic */ p7 n() {
        return super.n();
    }

    @Override // com.google.android.gms.measurement.internal.d2
    public final /* bridge */ /* synthetic */ r3 o() {
        return super.o();
    }

    @Override // com.google.android.gms.measurement.internal.d2
    public final /* bridge */ /* synthetic */ e9 p() {
        return super.p();
    }

    @Override // com.google.android.gms.measurement.internal.f5
    protected final boolean u() {
        return false;
    }

    final long w(long j2) {
        return this.f10846e.g(j2);
    }

    public final boolean z(boolean z, boolean z2, long j2) {
        return this.f10846e.d(z, z2, j2);
    }

    @Override // com.google.android.gms.measurement.internal.x5, com.google.android.gms.measurement.internal.z5
    public final /* bridge */ /* synthetic */ com.google.android.gms.common.util.f zzl() {
        return super.zzl();
    }

    @Override // com.google.android.gms.measurement.internal.x5, com.google.android.gms.measurement.internal.z5
    public final /* bridge */ /* synthetic */ Context zzm() {
        return super.zzm();
    }

    @Override // com.google.android.gms.measurement.internal.x5, com.google.android.gms.measurement.internal.z5
    public final /* bridge */ /* synthetic */ w4 zzp() {
        return super.zzp();
    }

    @Override // com.google.android.gms.measurement.internal.x5, com.google.android.gms.measurement.internal.z5
    public final /* bridge */ /* synthetic */ v3 zzq() {
        return super.zzq();
    }

    @Override // com.google.android.gms.measurement.internal.x5, com.google.android.gms.measurement.internal.z5
    public final /* bridge */ /* synthetic */ ta zzt() {
        return super.zzt();
    }
}