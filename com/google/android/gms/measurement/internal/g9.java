package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
final class g9 implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ long f10904e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ e9 f10905f;

    g9(e9 e9Var, long j2) {
        this.f10905f = e9Var;
        this.f10904e = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f10905f.E(this.f10904e);
    }
}