package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class k60 implements dc0, v13 {

    /* renamed from: e, reason: collision with root package name */
    private final xo1 f6969e;

    /* renamed from: f, reason: collision with root package name */
    private final gb0 f6970f;

    /* renamed from: g, reason: collision with root package name */
    private final nc0 f6971g;

    /* renamed from: h, reason: collision with root package name */
    private final AtomicBoolean f6972h = new AtomicBoolean();

    /* renamed from: i, reason: collision with root package name */
    private final AtomicBoolean f6973i = new AtomicBoolean();

    public k60(xo1 xo1Var, gb0 gb0Var, nc0 nc0Var) {
        this.f6969e = xo1Var;
        this.f6970f = gb0Var;
        this.f6971g = nc0Var;
    }

    private final void a() {
        if (this.f6972h.compareAndSet(false, true)) {
            this.f6970f.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.dc0
    public final synchronized void b0() {
        if (this.f6969e.f10200e != 1) {
            a();
        }
    }

    @Override // com.google.android.gms.internal.ads.v13
    public final void c0(u13 u13Var) {
        if (this.f6969e.f10200e == 1 && u13Var.f9355j) {
            a();
        }
        if (u13Var.f9355j && this.f6973i.compareAndSet(false, true)) {
            this.f6971g.zza();
        }
    }
}