package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class cd implements Runnable {

    /* renamed from: e */
    private final id f5303e;

    /* renamed from: f */
    private final String f5304f;

    cd(id idVar, String str) {
        this.f5303e = idVar;
        this.f5304f = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f5303e.R(this.f5304f);
    }
}