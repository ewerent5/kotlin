package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
final class n2 implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ o2 f7627e;

    n2(o2 o2Var) {
        this.f7627e = o2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f7627e.f7874e != null) {
            try {
                this.f7627e.f7874e.g(1);
            } catch (RemoteException e2) {
                er.zzj("Could not notify onAdFailedToLoad event.", e2);
            }
        }
    }
}