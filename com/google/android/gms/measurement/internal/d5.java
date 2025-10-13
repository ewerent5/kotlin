package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
/* loaded from: classes.dex */
final /* synthetic */ class d5 implements Runnable {

    /* renamed from: e */
    private final e5 f10807e;

    /* renamed from: f */
    private final ka f10808f;

    /* renamed from: g */
    private final Bundle f10809g;

    d5(e5 e5Var, ka kaVar, Bundle bundle) {
        this.f10807e = e5Var;
        this.f10808f = kaVar;
        this.f10809g = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f10807e.Y(this.f10808f, this.f10809g);
    }
}