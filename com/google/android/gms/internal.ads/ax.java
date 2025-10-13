package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class ax implements Runnable {

    /* renamed from: e */
    private final bx f5014e;

    /* renamed from: f */
    private final int f5015f;

    /* renamed from: g */
    private final int f5016g;

    /* renamed from: h */
    private final boolean f5017h;

    /* renamed from: i */
    private final boolean f5018i;

    ax(bx bxVar, int i2, int i3, boolean z, boolean z2) {
        this.f5014e = bxVar;
        this.f5015f = i2;
        this.f5016g = i3;
        this.f5017h = z;
        this.f5018i = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f5014e.M4(this.f5015f, this.f5016g, this.f5017h, this.f5018i);
    }
}