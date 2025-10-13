package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import e.c.b.b.c.e.ec;
import e.c.b.b.c.e.uf;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
final class c8 implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ ka f10786e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ uf f10787f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ y7 f10788g;

    c8(y7 y7Var, ka kaVar, uf ufVar) {
        this.f10788g = y7Var;
        this.f10786e = kaVar;
        this.f10787f = ufVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (ec.a() && this.f10788g.i().o(t.J0) && !this.f10788g.h().H().q()) {
                this.f10788g.zzq().F().a("Analytics storage consent denied; will not get app instance id");
                this.f10788g.k().N(null);
                this.f10788g.h().f10933m.b(null);
                return;
            }
            n3 n3Var = this.f10788g.f11352d;
            if (n3Var == null) {
                this.f10788g.zzq().A().a("Failed to get app instance id");
                return;
            }
            String strH1 = n3Var.h1(this.f10786e);
            if (strH1 != null) {
                this.f10788g.k().N(strH1);
                this.f10788g.h().f10933m.b(strH1);
            }
            this.f10788g.Z();
            this.f10788g.g().M(this.f10787f, strH1);
        } catch (RemoteException e2) {
            this.f10788g.zzq().A().b("Failed to get app instance id", e2);
        } finally {
            this.f10788g.g().M(this.f10787f, null);
        }
    }
}