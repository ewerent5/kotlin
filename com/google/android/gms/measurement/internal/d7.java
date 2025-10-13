package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
final class d7 implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ d f10811e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ long f10812f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ int f10813g;

    /* renamed from: h, reason: collision with root package name */
    private final /* synthetic */ long f10814h;

    /* renamed from: i, reason: collision with root package name */
    private final /* synthetic */ boolean f10815i;

    /* renamed from: j, reason: collision with root package name */
    private final /* synthetic */ i6 f10816j;

    d7(i6 i6Var, d dVar, long j2, int i2, long j3, boolean z) {
        this.f10816j = i6Var;
        this.f10811e = dVar;
        this.f10812f = j2;
        this.f10813g = i2;
        this.f10814h = j3;
        this.f10815i = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f10816j.C(this.f10811e);
        this.f10816j.y(this.f10812f, false);
        this.f10816j.E(this.f10811e, this.f10813g, this.f10814h, true, this.f10815i);
    }
}