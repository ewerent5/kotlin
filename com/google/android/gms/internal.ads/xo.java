package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class xo implements Runnable {

    /* renamed from: e */
    private final kp f10193e;

    /* renamed from: f */
    private final jp f10194f;

    /* renamed from: g */
    private final String f10195g;

    xo(kp kpVar, jp jpVar, String str) {
        this.f10193e = kpVar;
        this.f10194f = jpVar;
        this.f10195g = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f10193e.x(this.f10194f, this.f10195g);
    }
}