package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
final class n6 implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ long f11058e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ i6 f11059f;

    n6(i6 i6Var, long j2) {
        this.f11059f = i6Var;
        this.f11058e = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f11059f.h().r.b(this.f11058e);
        this.f11059f.zzq().H().b("Session timeout duration set", Long.valueOf(this.f11058e));
    }
}