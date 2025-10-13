package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
final class c7 implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ d f10781e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ int f10782f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ long f10783g;

    /* renamed from: h, reason: collision with root package name */
    private final /* synthetic */ boolean f10784h;

    /* renamed from: i, reason: collision with root package name */
    private final /* synthetic */ i6 f10785i;

    c7(i6 i6Var, d dVar, int i2, long j2, boolean z) {
        this.f10785i = i6Var;
        this.f10781e = dVar;
        this.f10782f = i2;
        this.f10783g = j2;
        this.f10784h = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f10785i.C(this.f10781e);
        this.f10785i.E(this.f10781e, this.f10782f, this.f10783g, false, this.f10784h);
    }
}