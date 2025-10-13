package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
final class k2 implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ l2 f6928e;

    k2(l2 l2Var) {
        this.f6928e = l2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f6928e.f7167e.f7399e != null) {
            try {
                this.f6928e.f7167e.f7399e.g(1);
            } catch (RemoteException e2) {
                er.zzj("Could not notify onAdFailedToLoad event.", e2);
            }
        }
    }
}