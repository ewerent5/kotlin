package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
final class r6 implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ long f11178e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ i6 f11179f;

    r6(i6 i6Var, long j2) {
        this.f11179f = i6Var;
        this.f11178e = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f11179f.y(this.f11178e, true);
        this.f11179f.m().M(new AtomicReference<>());
    }
}