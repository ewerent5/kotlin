package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class jg extends m1 {

    /* renamed from: e, reason: collision with root package name */
    private final Object f6749e = new Object();

    /* renamed from: f, reason: collision with root package name */
    private volatile q1 f6750f;

    @Override // com.google.android.gms.internal.ads.n1
    public final void R2(q1 q1Var) {
        synchronized (this.f6749e) {
            this.f6750f = q1Var;
        }
    }

    @Override // com.google.android.gms.internal.ads.n1
    public final q1 a() {
        q1 q1Var;
        synchronized (this.f6749e) {
            q1Var = this.f6750f;
        }
        return q1Var;
    }

    @Override // com.google.android.gms.internal.ads.n1
    public final void zze() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.n1
    public final void zzf() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.n1
    public final void zzg(boolean z) throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.n1
    public final boolean zzh() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.n1
    public final int zzi() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.n1
    public final float zzj() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.n1
    public final float zzk() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.n1
    public final float zzm() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.n1
    public final boolean zzn() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.n1
    public final boolean zzp() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.n1
    public final void zzq() throws RemoteException {
        throw new RemoteException();
    }
}