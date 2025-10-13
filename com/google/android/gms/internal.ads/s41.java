package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class s41 implements q60 {
    private final m31 a;

    s41(m31 m31Var) {
        this.a = m31Var;
    }

    @Override // com.google.android.gms.internal.ads.q60
    public final n1 zza() throws vp1 {
        try {
            return ((th) this.a.f7412b).zzh();
        } catch (RemoteException e2) {
            throw new vp1(e2);
        }
    }
}