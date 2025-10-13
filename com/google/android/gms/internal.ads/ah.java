package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
final class ah implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ e.c.a.a f4905e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ bh f4906f;

    ah(bh bhVar, e.c.a.a aVar) {
        this.f4906f = bhVar;
        this.f4905e = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f4906f.a.W(ch.a(this.f4905e));
        } catch (RemoteException e2) {
            er.zzl("#007 Could not call remote method.", e2);
        }
    }
}