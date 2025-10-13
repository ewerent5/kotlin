package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
final class f7 implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ d f10869e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ int f10870f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ long f10871g;

    /* renamed from: h, reason: collision with root package name */
    private final /* synthetic */ boolean f10872h;

    /* renamed from: i, reason: collision with root package name */
    private final /* synthetic */ i6 f10873i;

    f7(i6 i6Var, d dVar, int i2, long j2, boolean z) {
        this.f10873i = i6Var;
        this.f10869e = dVar;
        this.f10870f = i2;
        this.f10871g = j2;
        this.f10872h = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f10873i.C(this.f10869e);
        this.f10873i.E(this.f10869e, this.f10870f, this.f10871g, false, this.f10872h);
    }
}