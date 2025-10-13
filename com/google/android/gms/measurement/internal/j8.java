package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
final class j8 implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ ka f10968e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ y7 f10969f;

    j8(y7 y7Var, ka kaVar) {
        this.f10969f = y7Var;
        this.f10968e = kaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        n3 n3Var = this.f10969f.f11352d;
        if (n3Var == null) {
            this.f10969f.zzq().A().a("Failed to send measurementEnabled to service");
            return;
        }
        try {
            n3Var.Z2(this.f10968e);
            this.f10969f.Z();
        } catch (RemoteException e2) {
            this.f10969f.zzq().A().b("Failed to send measurementEnabled to the service", e2);
        }
    }
}