package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class bu implements Runnable {

    /* renamed from: e */
    private final cu f5190e;

    /* renamed from: f */
    private final boolean f5191f;

    /* renamed from: g */
    private final long f5192g;

    bu(cu cuVar, boolean z, long j2) {
        this.f5190e = cuVar;
        this.f5191f = z;
        this.f5192g = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f5190e.C(this.f5191f, this.f5192g);
    }
}