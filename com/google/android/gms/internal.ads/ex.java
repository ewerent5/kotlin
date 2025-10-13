package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class ex implements Runnable {

    /* renamed from: e */
    private final gx f5733e;

    /* renamed from: f */
    private final String f5734f;

    ex(gx gxVar, String str) {
        this.f5733e = gxVar;
        this.f5734f = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f5733e.a(this.f5734f);
    }
}