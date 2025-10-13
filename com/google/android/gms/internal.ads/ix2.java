package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class ix2 implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ d1 f6636e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ jy2 f6637f;

    ix2(jy2 jy2Var, d1 d1Var) {
        this.f6637f = jy2Var;
        this.f6636e = d1Var;
    }

    @Override // java.lang.Runnable
    public final void run() throws InterruptedException {
        try {
            this.f6637f.f6893g.put(this.f6636e);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}