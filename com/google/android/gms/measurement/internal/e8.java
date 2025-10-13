package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
final class e8 implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ q7 f10842e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ y7 f10843f;

    e8(y7 y7Var, q7 q7Var) {
        this.f10843f = y7Var;
        this.f10842e = q7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        n3 n3Var = this.f10843f.f11352d;
        if (n3Var == null) {
            this.f10843f.zzq().A().a("Failed to send current screen to service");
            return;
        }
        try {
            q7 q7Var = this.f10842e;
            if (q7Var == null) {
                n3Var.H1(0L, null, null, this.f10843f.zzm().getPackageName());
            } else {
                n3Var.H1(q7Var.f11152c, q7Var.a, q7Var.f11151b, this.f10843f.zzm().getPackageName());
            }
            this.f10843f.Z();
        } catch (RemoteException e2) {
            this.f10843f.zzq().A().b("Failed to send current screen to the service", e2);
        }
    }
}