package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
/* loaded from: classes.dex */
final class j4 implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ boolean f10962e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ g4 f10963f;

    j4(g4 g4Var, boolean z) {
        this.f10963f = g4Var;
        this.f10962e = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f10963f.f10887b.y(this.f10962e);
    }
}