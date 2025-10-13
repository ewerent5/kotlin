package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class ib1 implements ta0 {

    /* renamed from: e */
    private final wa1 f6515e;

    /* renamed from: f */
    private final tc f6516f;

    ib1(wa1 wa1Var, tc tcVar) {
        this.f6515e = wa1Var;
        this.f6516f = tcVar;
    }

    @Override // com.google.android.gms.internal.ads.ta0
    public final void B0(g93 g93Var) {
        wa1 wa1Var = this.f6515e;
        tc tcVar = this.f6516f;
        wa1Var.B0(g93Var);
        if (tcVar != null) {
            try {
                tcVar.e(g93Var);
            } catch (RemoteException e2) {
                er.zzl("#007 Could not call remote method.", e2);
            }
        }
        if (tcVar != null) {
            try {
                tcVar.j(g93Var.f6091e);
            } catch (RemoteException e3) {
                er.zzl("#007 Could not call remote method.", e3);
            }
        }
    }
}