package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class f51 implements j31<r40> {
    private final p50 a;

    /* renamed from: b, reason: collision with root package name */
    private final l41 f5799b;

    /* renamed from: c, reason: collision with root package name */
    private final h52 f5800c;

    /* renamed from: d, reason: collision with root package name */
    private final sa0 f5801d;

    /* renamed from: e, reason: collision with root package name */
    private final ScheduledExecutorService f5802e;

    public f51(p50 p50Var, l41 l41Var, sa0 sa0Var, ScheduledExecutorService scheduledExecutorService, h52 h52Var) {
        this.a = p50Var;
        this.f5799b = l41Var;
        this.f5801d = sa0Var;
        this.f5802e = scheduledExecutorService;
        this.f5800c = h52Var;
    }

    @Override // com.google.android.gms.internal.ads.j31
    public final g52<r40> a(final kp1 kp1Var, final xo1 xo1Var) {
        return this.f5800c.N(new Callable(this, kp1Var, xo1Var) { // from class: com.google.android.gms.internal.ads.c51
            private final f51 a;

            /* renamed from: b, reason: collision with root package name */
            private final kp1 f5260b;

            /* renamed from: c, reason: collision with root package name */
            private final xo1 f5261c;

            {
                this.a = this;
                this.f5260b = kp1Var;
                this.f5261c = xo1Var;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.c(this.f5260b, this.f5261c);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.j31
    public final boolean b(kp1 kp1Var, xo1 xo1Var) {
        return kp1Var.a.a.a() != null && this.f5799b.b(kp1Var, xo1Var);
    }

    final /* synthetic */ r40 c(final kp1 kp1Var, final xo1 xo1Var) {
        return this.a.e(new i70(kp1Var, xo1Var, null), new c60(kp1Var.a.a.a(), new Runnable(this, kp1Var, xo1Var) { // from class: com.google.android.gms.internal.ads.d51

            /* renamed from: e, reason: collision with root package name */
            private final f51 f5436e;

            /* renamed from: f, reason: collision with root package name */
            private final kp1 f5437f;

            /* renamed from: g, reason: collision with root package name */
            private final xo1 f5438g;

            {
                this.f5436e = this;
                this.f5437f = kp1Var;
                this.f5438g = xo1Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f5436e.d(this.f5437f, this.f5438g);
            }
        })).zza();
    }

    final /* synthetic */ void d(kp1 kp1Var, xo1 xo1Var) {
        y42.o(y42.g(this.f5799b.a(kp1Var, xo1Var), xo1Var.M, TimeUnit.SECONDS, this.f5802e), new e51(this), this.f5800c);
    }
}