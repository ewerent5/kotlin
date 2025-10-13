package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
final class a7 implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ Boolean f10750e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ i6 f10751f;

    a7(i6 i6Var, Boolean bool) {
        this.f10751f = i6Var;
        this.f10750e = bool;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f10751f.M(this.f10750e, true);
    }
}