package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class uu1 implements Runnable {

    /* renamed from: e */
    private final vu1 f9567e;

    /* renamed from: f */
    private final String f9568f;

    uu1(vu1 vu1Var, String str) {
        this.f9567e = vu1Var;
        this.f9568f = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f9567e.c(this.f9568f);
    }
}