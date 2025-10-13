package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
final class w7 implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ q7 f11314e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ long f11315f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ p7 f11316g;

    w7(p7 p7Var, q7 q7Var, long j2) {
        this.f11316g = p7Var;
        this.f11314e = q7Var;
        this.f11315f = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f11316g.L(this.f11314e, false, this.f11315f);
        p7 p7Var = this.f11316g;
        p7Var.f11116e = null;
        p7Var.m().H(null);
    }
}