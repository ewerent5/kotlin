package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class dd implements Runnable {

    /* renamed from: e */
    private final id f5463e;

    /* renamed from: f */
    private final String f5464f;

    dd(id idVar, String str) {
        this.f5463e = idVar;
        this.f5464f = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f5463e.J(this.f5464f);
    }
}