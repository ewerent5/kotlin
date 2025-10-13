package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class to1 extends gx1 {
    final /* synthetic */ a0 a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ uo1 f9230b;

    to1(uo1 uo1Var, a0 a0Var) {
        this.f9230b = uo1Var;
        this.a = a0Var;
    }

    @Override // com.google.android.gms.internal.ads.gx1
    public final void m() {
        if (this.f9230b.f9523h != null) {
            try {
                this.a.zze();
            } catch (RemoteException e2) {
                er.zzl("#007 Could not call remote method.", e2);
            }
        }
    }
}