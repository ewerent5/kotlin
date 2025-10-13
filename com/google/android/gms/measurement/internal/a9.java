package com.google.android.gms.measurement.internal;

import android.content.Intent;

/* compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
/* loaded from: classes.dex */
final /* synthetic */ class a9 implements Runnable {

    /* renamed from: e */
    private final x8 f10758e;

    /* renamed from: f */
    private final int f10759f;

    /* renamed from: g */
    private final v3 f10760g;

    /* renamed from: h */
    private final Intent f10761h;

    a9(x8 x8Var, int i2, v3 v3Var, Intent intent) {
        this.f10758e = x8Var;
        this.f10759f = i2;
        this.f10760g = v3Var;
        this.f10761h = intent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f10758e.d(this.f10759f, this.f10760g, this.f10761h);
    }
}