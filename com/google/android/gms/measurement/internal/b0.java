package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
final class b0 implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ String f10762e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ long f10763f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ a f10764g;

    b0(a aVar, String str, long j2) {
        this.f10764g = aVar;
        this.f10762e = str;
        this.f10763f = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f10764g.A(this.f10762e, this.f10763f);
    }
}