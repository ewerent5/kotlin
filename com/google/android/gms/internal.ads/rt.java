package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class rt implements Runnable {

    /* renamed from: e */
    private final cu f8735e;

    /* renamed from: f */
    private final String f8736f;

    rt(cu cuVar, String str) {
        this.f8735e = cuVar;
        this.f8736f = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f8735e.B(this.f8736f);
    }
}