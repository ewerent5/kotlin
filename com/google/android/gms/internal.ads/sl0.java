package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class sl0 extends m1 {

    /* renamed from: e, reason: collision with root package name */
    private final Object f8904e = new Object();

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    private final n1 f8905f;

    /* renamed from: g, reason: collision with root package name */
    @Nullable
    private final ig f8906g;

    public sl0(@Nullable n1 n1Var, @Nullable ig igVar) {
        this.f8905f = n1Var;
        this.f8906g = igVar;
    }

    @Override // com.google.android.gms.internal.ads.n1
    public final void R2(q1 q1Var) {
        synchronized (this.f8904e) {
            n1 n1Var = this.f8905f;
            if (n1Var != null) {
                n1Var.R2(q1Var);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.n1
    public final q1 a() {
        synchronized (this.f8904e) {
            n1 n1Var = this.f8905f;
            if (n1Var == null) {
                return null;
            }
            return n1Var.a();
        }
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
    public final float zzj() {
        ig igVar = this.f8906g;
        if (igVar != null) {
            return igVar.zzA();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.n1
    public final float zzk() {
        ig igVar = this.f8906g;
        if (igVar != null) {
            return igVar.zzB();
        }
        return 0.0f;
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