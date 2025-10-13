package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class ew0 implements Runnable {

    /* renamed from: e */
    private final qw0 f5728e;

    /* renamed from: f */
    private final ec f5729f;

    ew0(qw0 qw0Var, ec ecVar) {
        this.f5728e = qw0Var;
        this.f5729f = ecVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        qw0 qw0Var = this.f5728e;
        try {
            this.f5729f.t3(qw0Var.d());
        } catch (RemoteException e2) {
            er.zzg("", e2);
        }
    }
}