package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class u2 extends zm {
    private static void J4(final hn hnVar) {
        er.zzf("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        xq.a.post(new Runnable(hnVar) { // from class: com.google.android.gms.internal.ads.t2

            /* renamed from: e, reason: collision with root package name */
            private final hn f9059e;

            {
                this.f9059e = hnVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                hn hnVar2 = this.f9059e;
                if (hnVar2 != null) {
                    try {
                        hnVar2.j(1);
                    } catch (RemoteException e2) {
                        er.zzl("#007 Could not call remote method.", e2);
                    }
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.an
    public final void J3(in inVar) {
    }

    @Override // com.google.android.gms.internal.ads.an
    public final void V(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.an
    public final void V2(m93 m93Var, hn hnVar) {
        J4(hnVar);
    }

    @Override // com.google.android.gms.internal.ads.an
    public final void c1(h1 h1Var) {
    }

    @Override // com.google.android.gms.internal.ads.an
    public final void d0(on onVar) {
    }

    @Override // com.google.android.gms.internal.ads.an
    public final void e3(dn dnVar) {
    }

    @Override // com.google.android.gms.internal.ads.an
    public final void k(e.c.b.b.b.b bVar) {
    }

    @Override // com.google.android.gms.internal.ads.an
    public final void o0(e.c.b.b.b.b bVar, boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.an
    public final void w2(m93 m93Var, hn hnVar) {
        J4(hnVar);
    }

    @Override // com.google.android.gms.internal.ads.an
    public final void y3(e1 e1Var) {
    }

    @Override // com.google.android.gms.internal.ads.an
    public final Bundle zzg() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.an
    public final boolean zzi() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.an
    public final String zzj() {
        return "";
    }

    @Override // com.google.android.gms.internal.ads.an
    public final xm zzl() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.an
    public final k1 zzm() {
        return null;
    }
}