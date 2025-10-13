package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class op0 implements Runnable {

    /* renamed from: e */
    private final qp0 f7987e;

    op0(qp0 qp0Var) {
        this.f7987e = qp0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f7987e.zzc();
        } catch (RemoteException e2) {
            er.zzl("#007 Could not call remote method.", e2);
        }
    }
}