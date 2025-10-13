package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
final class f8 implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ ka f10874e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ y7 f10875f;

    f8(y7 y7Var, ka kaVar) {
        this.f10875f = y7Var;
        this.f10874e = kaVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        n3 n3Var = this.f10875f.f11352d;
        if (n3Var == null) {
            this.f10875f.zzq().A().a("Discarding data. Failed to send app launch");
            return;
        }
        try {
            n3Var.r2(this.f10874e);
            this.f10875f.o().E();
            this.f10875f.G(n3Var, null, this.f10874e);
            this.f10875f.Z();
        } catch (RemoteException e2) {
            this.f10875f.zzq().A().b("Failed to send app launch to the service", e2);
        }
    }
}