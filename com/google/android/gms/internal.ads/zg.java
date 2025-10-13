package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
final class zg implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ e.c.a.a f10592e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ bh f10593f;

    zg(bh bhVar, e.c.a.a aVar) {
        this.f10593f = bhVar;
        this.f10592e = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f10593f.a.W(ch.a(this.f10592e));
        } catch (RemoteException e2) {
            er.zzl("#007 Could not call remote method.", e2);
        }
    }
}