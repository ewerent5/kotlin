package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
public final class a extends d2 {

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, Long> f10740b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, Integer> f10741c;

    /* renamed from: d, reason: collision with root package name */
    private long f10742d;

    public a(z4 z4Var) {
        super(z4Var);
        this.f10741c = new c.e.a();
        this.f10740b = new c.e.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A(String str, long j2) {
        d();
        com.google.android.gms.common.internal.p.f(str);
        Integer num = this.f10741c.get(str);
        if (num == null) {
            zzq().A().b("Call to endAdUnitExposure for unknown ad unit id", str);
            return;
        }
        q7 q7VarY = n().y(false);
        int iIntValue = num.intValue() - 1;
        if (iIntValue != 0) {
            this.f10741c.put(str, Integer.valueOf(iIntValue));
            return;
        }
        this.f10741c.remove(str);
        Long l2 = this.f10740b.get(str);
        if (l2 == null) {
            zzq().A().a("First ad unit exposure time was never set");
        } else {
            long jLongValue = j2 - l2.longValue();
            this.f10740b.remove(str);
            v(str, jLongValue, q7VarY);
        }
        if (this.f10741c.isEmpty()) {
            long j3 = this.f10742d;
            if (j3 == 0) {
                zzq().A().a("First ad exposure time was never set");
            } else {
                r(j2 - j3, q7VarY);
                this.f10742d = 0L;
            }
        }
    }

    private final void r(long j2, q7 q7Var) {
        if (q7Var == null) {
            zzq().I().a("Not logging ad exposure. No active activity");
            return;
        }
        if (j2 < 1000) {
            zzq().I().b("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j2));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("_xt", j2);
        p7.J(q7Var, bundle, true);
        k().R("am", "_xa", bundle);
    }

    private final void v(String str, long j2, q7 q7Var) {
        if (q7Var == null) {
            zzq().I().a("Not logging ad unit exposure. No active activity");
            return;
        }
        if (j2 < 1000) {
            zzq().I().b("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j2));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("_ai", str);
        bundle.putLong("_xt", j2);
        p7.J(q7Var, bundle, true);
        k().R("am", "_xu", bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w(long j2) {
        Iterator<String> it = this.f10740b.keySet().iterator();
        while (it.hasNext()) {
            this.f10740b.put(it.next(), Long.valueOf(j2));
        }
        if (this.f10740b.isEmpty()) {
            return;
        }
        this.f10742d = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z(String str, long j2) {
        d();
        com.google.android.gms.common.internal.p.f(str);
        if (this.f10741c.isEmpty()) {
            this.f10742d = j2;
        }
        Integer num = this.f10741c.get(str);
        if (num != null) {
            this.f10741c.put(str, Integer.valueOf(num.intValue() + 1));
        } else if (this.f10741c.size() >= 100) {
            zzq().D().a("Too many ads visible");
        } else {
            this.f10741c.put(str, 1);
            this.f10740b.put(str, Long.valueOf(j2));
        }
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

    public final void q(long j2) {
        q7 q7VarY = n().y(false);
        for (String str : this.f10740b.keySet()) {
            v(str, j2 - this.f10740b.get(str).longValue(), q7VarY);
        }
        if (!this.f10740b.isEmpty()) {
            r(j2 - this.f10742d, q7VarY);
        }
        w(j2);
    }

    public final void u(String str, long j2) {
        if (str == null || str.length() == 0) {
            zzq().A().a("Ad unit id must be a non-empty string");
        } else {
            zzp().u(new c1(this, str, j2));
        }
    }

    public final void y(String str, long j2) {
        if (str == null || str.length() == 0) {
            zzq().A().a("Ad unit id must be a non-empty string");
        } else {
            zzp().u(new b0(this, str, j2));
        }
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