package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class t2 implements Runnable {

    /* renamed from: e */
    private final hn f9059e;

    t2(hn hnVar) {
        this.f9059e = hnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        hn hnVar = this.f9059e;
        if (hnVar != null) {
            try {
                hnVar.j(1);
            } catch (RemoteException e2) {
                er.zzl("#007 Could not call remote method.", e2);
            }
        }
    }
}