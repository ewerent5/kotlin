package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class cl1 implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    private final wa1 f5326e;

    private cl1(wa1 wa1Var) {
        this.f5326e = wa1Var;
    }

    static Runnable a(wa1 wa1Var) {
        return new cl1(wa1Var);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f5326e.b0();
    }
}