package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
final class b5 implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ e6 f10765e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ z4 f10766f;

    b5(z4 z4Var, e6 e6Var) {
        this.f10766f = z4Var;
        this.f10765e = e6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f10766f.h(this.f10765e);
        this.f10766f.c(this.f10765e.f10838g);
    }
}