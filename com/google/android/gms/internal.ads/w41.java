package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import java.util.concurrent.ExecutionException;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class w41 implements s31<r40, th, h51> {
    private final Context a;

    /* renamed from: b, reason: collision with root package name */
    private final p50 f9887b;

    /* renamed from: c, reason: collision with root package name */
    private View f9888c;

    /* renamed from: d, reason: collision with root package name */
    private cg f9889d;

    public w41(Context context, p50 p50Var) {
        this.a = context;
        this.f9887b = p50Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.s31
    public final /* bridge */ /* synthetic */ r40 a(kp1 kp1Var, final xo1 xo1Var, final m31 m31Var) throws vp1 {
        final View view;
        if (((Boolean) c.c().b(w3.b5)).booleanValue() && xo1Var.b0) {
            try {
                view = (View) e.c.b.b.b.d.Y(this.f9889d.zze());
                boolean zZzf = this.f9889d.zzf();
                if (view == null) {
                    throw new vp1(new Exception("BannerRtbAdapterWrapper interscrollerView should not be null"));
                }
                if (zZzf) {
                    try {
                        view = (View) y42.h(y42.a(null), new e42(this, view, xo1Var) { // from class: com.google.android.gms.internal.ads.t41
                            private final w41 a;

                            /* renamed from: b, reason: collision with root package name */
                            private final View f9078b;

                            /* renamed from: c, reason: collision with root package name */
                            private final xo1 f9079c;

                            {
                                this.a = this;
                                this.f9078b = view;
                                this.f9079c = xo1Var;
                            }

                            @Override // com.google.android.gms.internal.ads.e42
                            public final g52 zza(Object obj) {
                                return this.a.c(this.f9078b, this.f9079c, obj);
                            }
                        }, qr.f8450e).get();
                    } catch (InterruptedException | ExecutionException e2) {
                        throw new vp1(e2);
                    }
                }
            } catch (RemoteException e3) {
                throw new vp1(e3);
            }
        } else {
            view = this.f9888c;
        }
        s40 s40VarD = this.f9887b.d(new i70(kp1Var, xo1Var, m31Var.a), new y40(view, null, new q60(m31Var) { // from class: com.google.android.gms.internal.ads.s41
            private final m31 a;

            {
                this.a = m31Var;
            }

            @Override // com.google.android.gms.internal.ads.q60
            public final n1 zza() throws vp1 {
                try {
                    return ((th) this.a.f7412b).zzh();
                } catch (RemoteException e4) {
                    throw new vp1(e4);
                }
            }
        }, xo1Var.t.get(0)));
        s40VarD.j().K0(view);
        ((h51) m31Var.f7413c).J4(s40VarD.g());
        return s40VarD.h();
    }

    @Override // com.google.android.gms.internal.ads.s31
    public final void b(kp1 kp1Var, xo1 xo1Var, m31<th, h51> m31Var) throws vp1 {
        try {
            m31Var.f7412b.S(xo1Var.T);
            u41 u41Var = null;
            if (((Boolean) c.c().b(w3.b5)).booleanValue() && xo1Var.b0) {
                m31Var.f7412b.p3(xo1Var.O, xo1Var.u.toString(), kp1Var.a.a.f8427d, e.c.b.b.b.d.m4(this.a), new v41(this, m31Var, u41Var), (zf) m31Var.f7413c, kp1Var.a.a.f8428e);
            } else {
                m31Var.f7412b.U2(xo1Var.O, xo1Var.u.toString(), kp1Var.a.a.f8427d, e.c.b.b.b.d.m4(this.a), new v41(this, m31Var, u41Var), (zf) m31Var.f7413c, kp1Var.a.a.f8428e);
            }
        } catch (RemoteException e2) {
            throw new vp1(e2);
        }
    }

    final /* synthetic */ g52 c(View view, xo1 xo1Var, Object obj) {
        return y42.a(h60.a(this.a, view, xo1Var));
    }
}