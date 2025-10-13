package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class u71 implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    private final zr0 f9401e;

    private u71(zr0 zr0Var) {
        this.f9401e = zr0Var;
    }

    static Runnable a(zr0 zr0Var) {
        return new u71(zr0Var);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f9401e.b();
    }
}