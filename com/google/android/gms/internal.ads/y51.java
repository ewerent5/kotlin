package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class y51 implements s31<li0, th, h51> {
    private final Context a;

    /* renamed from: b, reason: collision with root package name */
    private final jj0 f10380b;

    public y51(Context context, jj0 jj0Var) {
        this.a = context;
        this.f10380b = jj0Var;
    }

    @Override // com.google.android.gms.internal.ads.s31
    public final /* bridge */ /* synthetic */ li0 a(kp1 kp1Var, xo1 xo1Var, m31 m31Var) {
        s51 s51Var = new s51(xo1Var, (th) m31Var.f7412b, false);
        mi0 mi0VarC = this.f10380b.c(new i70(kp1Var, xo1Var, m31Var.a), new pi0(s51Var, null));
        s51Var.b(mi0VarC.d());
        ((h51) m31Var.f7413c).J4(mi0VarC.g());
        return mi0VarC.h();
    }

    @Override // com.google.android.gms.internal.ads.s31
    public final void b(kp1 kp1Var, xo1 xo1Var, m31<th, h51> m31Var) throws vp1 {
        try {
            m31Var.f7412b.S(xo1Var.T);
            m31Var.f7412b.C3(xo1Var.O, xo1Var.u.toString(), kp1Var.a.a.f8427d, e.c.b.b.b.d.m4(this.a), new x51(this, m31Var, null), (zf) m31Var.f7413c);
        } catch (RemoteException e2) {
            throw new vp1(e2);
        }
    }
}