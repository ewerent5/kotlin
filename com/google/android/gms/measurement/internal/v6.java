package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
final class v6 implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ Bundle f11298e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ i6 f11299f;

    v6(i6 i6Var, Bundle bundle) {
        this.f11299f = i6Var;
        this.f11298e = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f11299f.q0(this.f11298e);
    }
}