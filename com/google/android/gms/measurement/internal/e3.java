package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
final class e3 implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ long f10828e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ a f10829f;

    e3(a aVar, long j2) {
        this.f10829f = aVar;
        this.f10828e = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f10829f.w(this.f10828e);
    }
}