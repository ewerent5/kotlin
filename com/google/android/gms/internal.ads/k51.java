package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class k51 implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    private final zr0 f6968e;

    private k51(zr0 zr0Var) {
        this.f6968e = zr0Var;
    }

    static Runnable a(zr0 zr0Var) {
        return new k51(zr0Var);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f6968e.b();
    }
}