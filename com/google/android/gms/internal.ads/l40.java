package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class l40 extends p33 {

    /* renamed from: e, reason: collision with root package name */
    private final k40 f7186e;

    /* renamed from: f, reason: collision with root package name */
    private final w f7187f;

    /* renamed from: g, reason: collision with root package name */
    private final rk1 f7188g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f7189h = false;

    public l40(k40 k40Var, w wVar, rk1 rk1Var) {
        this.f7186e = k40Var;
        this.f7187f = wVar;
        this.f7188g = rk1Var;
    }

    @Override // com.google.android.gms.internal.ads.q33
    public final void H2(e.c.b.b.b.b bVar, x33 x33Var) {
        try {
            this.f7188g.d(x33Var);
            this.f7186e.h((Activity) e.c.b.b.b.d.Y(bVar), x33Var, this.f7189h);
        } catch (RemoteException e2) {
            er.zzl("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.q33
    public final void P(boolean z) {
        this.f7189h = z;
    }

    @Override // com.google.android.gms.internal.ads.q33
    public final void j4(h1 h1Var) {
        com.google.android.gms.common.internal.p.e("setOnPaidEventListener must be called on the main UI thread.");
        rk1 rk1Var = this.f7188g;
        if (rk1Var != null) {
            rk1Var.h(h1Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.q33
    public final void q3(u33 u33Var) {
    }

    @Override // com.google.android.gms.internal.ads.q33
    public final w zze() {
        return this.f7187f;
    }

    @Override // com.google.android.gms.internal.ads.q33
    public final k1 zzg() {
        if (((Boolean) c.c().b(w3.P4)).booleanValue()) {
            return this.f7186e.d();
        }
        return null;
    }
}