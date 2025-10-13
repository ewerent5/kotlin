package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class ba1 extends o {

    /* renamed from: e, reason: collision with root package name */
    private final hb1 f5097e;

    public ba1(Context context, cy cyVar, pp1 pp1Var, fm0 fm0Var, j jVar) {
        jb1 jb1Var = new jb1(fm0Var, cyVar.g());
        jb1Var.a(jVar);
        this.f5097e = new hb1(new tb1(cyVar, context, jb1Var, pp1Var), pp1Var.v());
    }

    @Override // com.google.android.gms.internal.ads.p
    public final synchronized void Q2(m93 m93Var, int i2) {
        this.f5097e.b(m93Var, i2);
    }

    @Override // com.google.android.gms.internal.ads.p
    public final void zze(m93 m93Var) {
        this.f5097e.b(m93Var, 1);
    }

    @Override // com.google.android.gms.internal.ads.p
    public final synchronized String zzf() {
        return this.f5097e.c();
    }

    @Override // com.google.android.gms.internal.ads.p
    public final synchronized boolean zzg() {
        return this.f5097e.a();
    }

    @Override // com.google.android.gms.internal.ads.p
    public final synchronized String zzh() {
        return this.f5097e.d();
    }
}