package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class n61 implements s31<ol0, th, h51> {
    private final Context a;

    /* renamed from: b, reason: collision with root package name */
    private final gk0 f7657b;

    /* renamed from: c, reason: collision with root package name */
    private ig f7658c;

    /* renamed from: d, reason: collision with root package name */
    private final kr f7659d;

    public n61(Context context, gk0 gk0Var, kr krVar) {
        this.a = context;
        this.f7657b = gk0Var;
        this.f7659d = krVar;
    }

    @Override // com.google.android.gms.internal.ads.s31
    public final /* bridge */ /* synthetic */ ol0 a(kp1 kp1Var, xo1 xo1Var, m31 m31Var) throws e71 {
        if (!kp1Var.a.a.f8430g.contains(Integer.toString(6))) {
            throw new e71(2, "Unified must be used for RTB.");
        }
        tl0 tl0VarW = tl0.w(this.f7658c);
        if (!kp1Var.a.a.f8430g.contains(Integer.toString(tl0VarW.X()))) {
            throw new e71(1, "No corresponding native ad listener");
        }
        vl0 vl0VarD = this.f7657b.d(new i70(kp1Var, xo1Var, m31Var.a), new gm0(tl0VarW), new un0(null, null, this.f7658c, null));
        ((h51) m31Var.f7413c).J4(vl0VarD.g());
        return vl0VarD.h();
    }

    @Override // com.google.android.gms.internal.ads.s31
    public final void b(kp1 kp1Var, xo1 xo1Var, m31<th, h51> m31Var) throws vp1 {
        try {
            m31Var.f7412b.S(xo1Var.T);
            l61 l61Var = null;
            if (this.f7659d.f7056g < ((Integer) c.c().b(w3.d1)).intValue()) {
                m31Var.f7412b.s1(xo1Var.O, xo1Var.u.toString(), kp1Var.a.a.f8427d, e.c.b.b.b.d.m4(this.a), new m61(this, m31Var, l61Var), (zf) m31Var.f7413c);
            } else {
                m31Var.f7412b.B4(xo1Var.O, xo1Var.u.toString(), kp1Var.a.a.f8427d, e.c.b.b.b.d.m4(this.a), new m61(this, m31Var, l61Var), (zf) m31Var.f7413c, kp1Var.a.a.f8432i);
            }
        } catch (RemoteException e2) {
            throw new vp1(e2);
        }
    }
}