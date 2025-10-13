package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
final class c1 implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ String f10777e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ long f10778f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ a f10779g;

    c1(a aVar, String str, long j2) {
        this.f10779g = aVar;
        this.f10777e = str;
        this.f10778f = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f10779g.z(this.f10777e, this.f10778f);
    }
}