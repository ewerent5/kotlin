package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
/* loaded from: classes.dex */
final class r5 implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ r f11175e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ String f11176f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ e5 f11177g;

    r5(e5 e5Var, r rVar, String str) {
        this.f11177g = e5Var;
        this.f11175e = rVar;
        this.f11176f = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f11177g.f10830e.f0();
        this.f11177g.f10830e.m(this.f11175e, this.f11176f);
    }
}