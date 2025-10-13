package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.util.zzr;
import com.google.android.gms.ads.internal.zzs;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class oo1 extends zm {

    /* renamed from: e */
    private final ko1 f7978e;

    /* renamed from: f */
    private final ao1 f7979f;

    /* renamed from: g */
    private final String f7980g;

    /* renamed from: h */
    private final lp1 f7981h;

    /* renamed from: i */
    private final Context f7982i;

    /* renamed from: j */
    @GuardedBy("this")
    private xq0 f7983j;

    /* renamed from: k */
    @GuardedBy("this")
    private boolean f7984k = ((Boolean) c.c().b(w3.t0)).booleanValue();

    public oo1(String str, ko1 ko1Var, Context context, ao1 ao1Var, lp1 lp1Var) {
        this.f7980g = str;
        this.f7978e = ko1Var;
        this.f7979f = ao1Var;
        this.f7981h = lp1Var;
        this.f7982i = context;
    }

    private final synchronized void L4(m93 m93Var, hn hnVar, int i2) {
        com.google.android.gms.common.internal.p.e("#008 Must be called on the main UI thread.");
        this.f7979f.o(hnVar);
        zzs.zzc();
        if (zzr.zzJ(this.f7982i) && m93Var.w == null) {
            er.zzf("Failed to load the ad because app ID is missing.");
            this.f7979f.B0(mq1.d(4, null, null));
            return;
        }
        if (this.f7983j != null) {
            return;
        }
        co1 co1Var = new co1(null);
        this.f7978e.h(i2);
        this.f7978e.a(m93Var, this.f7980g, co1Var, new no1(this));
    }

    @Override // com.google.android.gms.internal.ads.an
    public final void J3(in inVar) {
        com.google.android.gms.common.internal.p.e("#008 Must be called on the main UI thread.");
        this.f7979f.G(inVar);
    }

    @Override // com.google.android.gms.internal.ads.an
    public final synchronized void V(boolean z) {
        com.google.android.gms.common.internal.p.e("setImmersiveMode must be called on the main UI thread.");
        this.f7984k = z;
    }

    @Override // com.google.android.gms.internal.ads.an
    public final synchronized void V2(m93 m93Var, hn hnVar) {
        L4(m93Var, hnVar, 3);
    }

    @Override // com.google.android.gms.internal.ads.an
    public final void c1(h1 h1Var) {
        com.google.android.gms.common.internal.p.e("setOnPaidEventListener must be called on the main UI thread.");
        this.f7979f.z(h1Var);
    }

    @Override // com.google.android.gms.internal.ads.an
    public final synchronized void d0(on onVar) {
        com.google.android.gms.common.internal.p.e("#008 Must be called on the main UI thread.");
        lp1 lp1Var = this.f7981h;
        lp1Var.a = onVar.f7975e;
        lp1Var.f7291b = onVar.f7976f;
    }

    @Override // com.google.android.gms.internal.ads.an
    public final void e3(dn dnVar) {
        com.google.android.gms.common.internal.p.e("#008 Must be called on the main UI thread.");
        this.f7979f.u(dnVar);
    }

    @Override // com.google.android.gms.internal.ads.an
    public final synchronized void k(e.c.b.b.b.b bVar) {
        o0(bVar, this.f7984k);
    }

    @Override // com.google.android.gms.internal.ads.an
    public final synchronized void o0(e.c.b.b.b.b bVar, boolean z) {
        com.google.android.gms.common.internal.p.e("#008 Must be called on the main UI thread.");
        if (this.f7983j == null) {
            er.zzi("Rewarded can not be shown before loaded");
            this.f7979f.I(mq1.d(9, null, null));
        } else {
            this.f7983j.g(z, (Activity) e.c.b.b.b.d.Y(bVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.an
    public final synchronized void w2(m93 m93Var, hn hnVar) {
        L4(m93Var, hnVar, 2);
    }

    @Override // com.google.android.gms.internal.ads.an
    public final void y3(e1 e1Var) {
        if (e1Var == null) {
            this.f7979f.x(null);
        } else {
            this.f7979f.x(new mo1(this, e1Var));
        }
    }

    @Override // com.google.android.gms.internal.ads.an
    public final Bundle zzg() {
        com.google.android.gms.common.internal.p.e("#008 Must be called on the main UI thread.");
        xq0 xq0Var = this.f7983j;
        return xq0Var != null ? xq0Var.l() : new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.an
    public final boolean zzi() {
        com.google.android.gms.common.internal.p.e("#008 Must be called on the main UI thread.");
        xq0 xq0Var = this.f7983j;
        return (xq0Var == null || xq0Var.h()) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.an
    public final synchronized String zzj() {
        xq0 xq0Var = this.f7983j;
        if (xq0Var == null || xq0Var.d() == null) {
            return null;
        }
        return this.f7983j.d().zze();
    }

    @Override // com.google.android.gms.internal.ads.an
    public final xm zzl() {
        com.google.android.gms.common.internal.p.e("#008 Must be called on the main UI thread.");
        xq0 xq0Var = this.f7983j;
        if (xq0Var != null) {
            return xq0Var.i();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.an
    public final k1 zzm() {
        xq0 xq0Var;
        if (((Boolean) c.c().b(w3.P4)).booleanValue() && (xq0Var = this.f7983j) != null) {
            return xq0Var.d();
        }
        return null;
    }
}