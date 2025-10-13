package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
final class b8 implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ ka f10772e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ y7 f10773f;

    b8(y7 y7Var, ka kaVar) {
        this.f10773f = y7Var;
        this.f10772e = kaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        n3 n3Var = this.f10773f.f11352d;
        if (n3Var == null) {
            this.f10773f.zzq().A().a("Failed to reset data on the service: not connected to service");
            return;
        }
        try {
            n3Var.M1(this.f10772e);
        } catch (RemoteException e2) {
            this.f10773f.zzq().A().b("Failed to reset data on the service: remote exception", e2);
        }
        this.f10773f.Z();
    }
}