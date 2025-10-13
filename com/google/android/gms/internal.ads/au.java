package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class au implements Runnable {

    /* renamed from: e */
    private final cu f5000e;

    /* renamed from: f */
    private final int f5001f;

    au(cu cuVar, int i2) {
        this.f5000e = cuVar;
        this.f5001f = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f5000e.D(this.f5001f);
    }
}