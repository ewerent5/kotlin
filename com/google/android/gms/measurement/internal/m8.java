package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
final class m8 implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ ka f11038e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ y7 f11039f;

    m8(y7 y7Var, ka kaVar) {
        this.f11039f = y7Var;
        this.f11038e = kaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        n3 n3Var = this.f11039f.f11352d;
        if (n3Var == null) {
            this.f11039f.zzq().A().a("Failed to send consent settings to service");
            return;
        }
        try {
            n3Var.s0(this.f11038e);
            this.f11039f.Z();
        } catch (RemoteException e2) {
            this.f11039f.zzq().A().b("Failed to send consent settings to the service", e2);
        }
    }
}