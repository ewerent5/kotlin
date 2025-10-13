package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class yt implements Runnable {

    /* renamed from: e */
    private final cu f10471e;

    /* renamed from: f */
    private final int f10472f;

    /* renamed from: g */
    private final int f10473g;

    yt(cu cuVar, int i2, int i3) {
        this.f10471e = cuVar;
        this.f10472f = i2;
        this.f10473g = i3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f10471e.F(this.f10472f, this.f10473g);
    }
}