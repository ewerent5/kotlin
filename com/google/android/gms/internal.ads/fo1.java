package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class fo1 implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    private final ao1 f5911e;

    private fo1(ao1 ao1Var) {
        this.f5911e = ao1Var;
    }

    static Runnable a(ao1 ao1Var) {
        return new fo1(ao1Var);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f5911e.b0();
    }
}