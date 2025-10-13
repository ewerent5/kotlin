package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class x1 implements Runnable {

    /* renamed from: e */
    private final c2 f10099e;

    /* renamed from: f */
    private final OnInitializationCompleteListener f10100f;

    x1(c2 c2Var, OnInitializationCompleteListener onInitializationCompleteListener) {
        this.f10099e = c2Var;
        this.f10100f = onInitializationCompleteListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f10099e.p(this.f10100f);
    }
}