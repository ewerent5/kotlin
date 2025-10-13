package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
final class m9 {
    private final com.google.android.gms.common.util.f a;

    /* renamed from: b, reason: collision with root package name */
    private long f11040b;

    public m9(com.google.android.gms.common.util.f fVar) {
        com.google.android.gms.common.internal.p.j(fVar);
        this.a = fVar;
    }

    public final void a() {
        this.f11040b = this.a.c();
    }

    public final boolean b(long j2) {
        return this.f11040b == 0 || this.a.c() - this.f11040b >= 3600000;
    }

    public final void c() {
        this.f11040b = 0L;
    }
}