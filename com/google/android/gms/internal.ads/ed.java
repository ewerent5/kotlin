package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class ed implements Runnable {

    /* renamed from: e */
    private final id f5620e;

    /* renamed from: f */
    private final String f5621f;

    ed(id idVar, String str) {
        this.f5620e = idVar;
        this.f5621f = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f5620e.c(this.f5621f);
    }
}