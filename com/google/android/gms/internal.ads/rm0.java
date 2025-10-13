package com.google.android.gms.internal.ads;

import android.view.ViewGroup;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class rm0 implements Runnable {

    /* renamed from: e */
    private final tm0 f8682e;

    /* renamed from: f */
    private final ViewGroup f8683f;

    rm0(tm0 tm0Var, ViewGroup viewGroup) {
        this.f8682e = tm0Var;
        this.f8683f = viewGroup;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f8682e.e(this.f8683f);
    }
}