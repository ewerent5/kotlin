package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class uk implements Runnable {

    /* renamed from: e */
    private final jr f9479e;

    /* renamed from: f */
    private final String f9480f;

    uk(jr jrVar, String str) {
        this.f9479e = jrVar;
        this.f9480f = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f9479e.zza(this.f9480f);
    }
}