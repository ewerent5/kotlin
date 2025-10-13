package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
final /* synthetic */ class h6 implements Runnable {

    /* renamed from: e */
    private final i6 f10915e;

    /* renamed from: f */
    private final Bundle f10916f;

    h6(i6 i6Var, Bundle bundle) {
        this.f10915e = i6Var;
        this.f10916f = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f10915e.j0(this.f10916f);
    }
}