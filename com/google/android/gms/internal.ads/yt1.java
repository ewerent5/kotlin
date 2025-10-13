package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class yt1 implements Runnable {

    /* renamed from: e */
    private final zt1 f10482e;

    /* renamed from: f */
    private final String f10483f;

    yt1(zt1 zt1Var, String str) {
        this.f10482e = zt1Var;
        this.f10483f = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f10482e.b(this.f10483f);
    }
}