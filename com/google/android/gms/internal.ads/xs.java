package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class xs implements Runnable {

    /* renamed from: e */
    private final bt f10239e;

    /* renamed from: f */
    private final boolean f10240f;

    xs(bt btVar, boolean z) {
        this.f10239e = btVar;
        this.f10240f = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f10239e.h(this.f10240f);
    }
}