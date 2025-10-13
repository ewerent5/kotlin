package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class sv implements Runnable {

    /* renamed from: e */
    private final lt f8997e;

    /* renamed from: f */
    private final boolean f8998f;

    /* renamed from: g */
    private final long f8999g;

    sv(lt ltVar, boolean z, long j2) {
        this.f8997e = ltVar;
        this.f8998f = z;
        this.f8999g = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f8997e.B0(this.f8998f, this.f8999g);
    }
}