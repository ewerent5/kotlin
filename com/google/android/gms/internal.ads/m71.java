package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.zze;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class m71 implements s31<xq0, th, h51> {
    private final Context a;

    /* renamed from: b, reason: collision with root package name */
    private final dr0 f7437b;

    public m71(Context context, dr0 dr0Var) {
        this.a = context;
        this.f7437b = dr0Var;
    }

    @Override // com.google.android.gms.internal.ads.s31
    public final /* bridge */ /* synthetic */ xq0 a(kp1 kp1Var, xo1 xo1Var, m31 m31Var) {
        s51 s51Var = new s51(xo1Var, (th) m31Var.f7412b, true);
        yq0 yq0VarA = this.f7437b.a(new i70(kp1Var, xo1Var, m31Var.a), new zq0(s51Var));
        s51Var.b(yq0VarA.d());
        ((h51) m31Var.f7413c).J4(yq0VarA.n());
        return yq0VarA.h();
    }

    @Override // com.google.android.gms.internal.ads.s31
    public final void b(kp1 kp1Var, xo1 xo1Var, m31<th, h51> m31Var) {
        try {
            m31Var.f7412b.S(xo1Var.T);
            if (kp1Var.a.a.o.a == 3) {
                m31Var.f7412b.n0(xo1Var.O, xo1Var.u.toString(), kp1Var.a.a.f8427d, e.c.b.b.b.d.m4(this.a), new l71(this, m31Var, null), (zf) m31Var.f7413c);
            } else {
                m31Var.f7412b.o2(xo1Var.O, xo1Var.u.toString(), kp1Var.a.a.f8427d, e.c.b.b.b.d.m4(this.a), new l71(this, m31Var, null), (zf) m31Var.f7413c);
            }
        } catch (RemoteException e2) {
            zze.zzb("Remote exception loading a rewarded RTB ad", e2);
        }
    }
}