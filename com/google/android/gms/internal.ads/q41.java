package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.internal.util.zzbk;
import com.google.android.gms.ads.zza;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class q41 implements s31<r40, hq1, h51> {
    private final Context a;

    /* renamed from: b, reason: collision with root package name */
    private final p50 f8324b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f8325c;

    public q41(Context context, p50 p50Var, Executor executor) {
        this.a = context;
        this.f8324b = p50Var;
        this.f8325c = executor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.s31
    public final /* bridge */ /* synthetic */ r40 a(kp1 kp1Var, final xo1 xo1Var, m31 m31Var) throws vp1 {
        final View viewD;
        if (((Boolean) c.c().b(w3.b5)).booleanValue() && xo1Var.b0) {
            cg cgVarF = ((hq1) m31Var.f7412b).f();
            if (cgVarF == null) {
                er.zzf("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad.");
                throw new vp1(new Exception("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad."));
            }
            try {
                viewD = (View) e.c.b.b.b.d.Y(cgVarF.zze());
                boolean zZzf = cgVarF.zzf();
                if (viewD == null) {
                    throw new vp1(new Exception("BannerAdapterWrapper interscrollerView should not be null"));
                }
                if (zZzf) {
                    try {
                        viewD = (View) y42.h(y42.a(null), new e42(this, viewD, xo1Var) { // from class: com.google.android.gms.internal.ads.p41
                            private final q41 a;

                            /* renamed from: b, reason: collision with root package name */
                            private final View f8085b;

                            /* renamed from: c, reason: collision with root package name */
                            private final xo1 f8086c;

                            {
                                this.a = this;
                                this.f8085b = viewD;
                                this.f8086c = xo1Var;
                            }

                            @Override // com.google.android.gms.internal.ads.e42
                            public final g52 zza(Object obj) {
                                return this.a.c(this.f8085b, this.f8086c, obj);
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
            viewD = ((hq1) m31Var.f7412b).d();
        }
        s40 s40VarD = this.f8324b.d(new i70(kp1Var, xo1Var, m31Var.a), new y40(viewD, null, n41.a((hq1) m31Var.f7412b), xo1Var.t.get(0)));
        s40VarD.j().K0(viewD);
        s40VarD.a().H0(new i20((hq1) m31Var.f7412b), this.f8325c);
        ((h51) m31Var.f7413c).J4(s40VarD.f());
        return s40VarD.h();
    }

    @Override // com.google.android.gms.internal.ads.s31
    public final void b(kp1 kp1Var, xo1 xo1Var, m31<hq1, h51> m31Var) throws vp1 {
        r93 r93Var;
        r93 r93Var2 = kp1Var.a.a.f8428e;
        if (r93Var2.r) {
            r93Var = new r93(this.a, zza.zzb(r93Var2.f8619i, r93Var2.f8616f));
        } else {
            r93Var = (((Boolean) c.c().b(w3.b5)).booleanValue() && xo1Var.b0) ? new r93(this.a, zza.zzc(r93Var2.f8619i, r93Var2.f8616f)) : up1.b(this.a, xo1Var.t);
        }
        r93 r93Var3 = r93Var;
        if (((Boolean) c.c().b(w3.b5)).booleanValue() && xo1Var.b0) {
            m31Var.f7412b.e(this.a, r93Var3, kp1Var.a.a.f8427d, xo1Var.u.toString(), zzbk.zzk(xo1Var.r), (zf) m31Var.f7413c);
        } else {
            m31Var.f7412b.j(this.a, r93Var3, kp1Var.a.a.f8427d, xo1Var.u.toString(), zzbk.zzk(xo1Var.r), (zf) m31Var.f7413c);
        }
    }

    final /* synthetic */ g52 c(View view, xo1 xo1Var, Object obj) {
        return y42.a(h60.a(this.a, view, xo1Var));
    }
}