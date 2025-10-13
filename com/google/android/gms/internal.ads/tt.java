package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class tt implements Runnable {

    /* renamed from: e */
    private final cu f9243e;

    /* renamed from: f */
    private final String f9244f;

    tt(cu cuVar, String str) {
        this.f9243e = cuVar;
        this.f9244f = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f9243e.J(this.f9244f);
    }
}