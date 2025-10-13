package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class is implements Runnable {

    /* renamed from: e */
    private final rs f6583e;

    /* renamed from: f */
    private final int f6584f;

    is(rs rsVar, int i2) {
        this.f6583e = rsVar;
        this.f6584f = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f6583e.H(this.f6584f);
    }
}