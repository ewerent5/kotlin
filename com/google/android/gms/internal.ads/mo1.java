package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class mo1 extends gx1 {
    final /* synthetic */ e1 a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ oo1 f7519b;

    mo1(oo1 oo1Var, e1 e1Var) {
        this.f7519b = oo1Var;
        this.a = e1Var;
    }

    @Override // com.google.android.gms.internal.ads.gx1
    public final void m() {
        if (this.f7519b.f7983j != null) {
            try {
                this.a.zze();
            } catch (RemoteException e2) {
                er.zzl("#007 Could not call remote method.", e2);
            }
        }
    }
}