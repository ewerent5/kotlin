package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
final class o6 implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ long f11086e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ i6 f11087f;

    o6(i6 i6Var, long j2) {
        this.f11087f = i6Var;
        this.f11086e = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f11087f.h().q.b(this.f11086e);
        this.f11087f.zzq().H().b("Minimum session duration set", Long.valueOf(this.f11086e));
    }
}