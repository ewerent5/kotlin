package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class r03 implements j03 {
    private boolean a;

    /* renamed from: b, reason: collision with root package name */
    private long f8552b;

    /* renamed from: c, reason: collision with root package name */
    private long f8553c;

    /* renamed from: d, reason: collision with root package name */
    private bt2 f8554d = bt2.a;

    public final void a() {
        if (this.a) {
            return;
        }
        this.f8553c = SystemClock.elapsedRealtime();
        this.a = true;
    }

    public final void b() {
        if (this.a) {
            c(p());
            this.a = false;
        }
    }

    public final void c(long j2) {
        this.f8552b = j2;
        if (this.a) {
            this.f8553c = SystemClock.elapsedRealtime();
        }
    }

    public final void d(j03 j03Var) {
        c(j03Var.p());
        this.f8554d = j03Var.e();
    }

    @Override // com.google.android.gms.internal.ads.j03
    public final bt2 e() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.j03
    public final bt2 i(bt2 bt2Var) {
        if (this.a) {
            c(p());
        }
        this.f8554d = bt2Var;
        return bt2Var;
    }

    @Override // com.google.android.gms.internal.ads.j03
    public final long p() {
        long j2 = this.f8552b;
        if (!this.a) {
            return j2;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f8553c;
        bt2 bt2Var = this.f8554d;
        return j2 + (bt2Var.f5187b == 1.0f ? is2.b(jElapsedRealtime) : bt2Var.a(jElapsedRealtime));
    }
}