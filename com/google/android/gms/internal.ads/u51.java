package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zzbk;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class u51 implements s31<li0, hq1, h51> {
    private final Context a;

    /* renamed from: b, reason: collision with root package name */
    private final jj0 f9382b;

    /* renamed from: c, reason: collision with root package name */
    private final kr f9383c;

    /* renamed from: d, reason: collision with root package name */
    private final Executor f9384d;

    public u51(Context context, kr krVar, jj0 jj0Var, Executor executor) {
        this.a = context;
        this.f9383c = krVar;
        this.f9382b = jj0Var;
        this.f9384d = executor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.s31
    public final /* bridge */ /* synthetic */ li0 a(kp1 kp1Var, xo1 xo1Var, final m31 m31Var) {
        mi0 mi0VarC = this.f9382b.c(new i70(kp1Var, xo1Var, m31Var.a), new pi0(new rj0(this, m31Var) { // from class: com.google.android.gms.internal.ads.t51
            private final u51 a;

            /* renamed from: b, reason: collision with root package name */
            private final m31 f9080b;

            {
                this.a = this;
                this.f9080b = m31Var;
            }

            @Override // com.google.android.gms.internal.ads.rj0
            public final void a(boolean z, Context context) throws qj0 {
                this.a.c(this.f9080b, z, context);
            }
        }, null));
        mi0VarC.a().H0(new i20((hq1) m31Var.f7412b), this.f9384d);
        ((h51) m31Var.f7413c).J4(mi0VarC.f());
        return mi0VarC.h();
    }

    @Override // com.google.android.gms.internal.ads.s31
    public final void b(kp1 kp1Var, xo1 xo1Var, m31<hq1, h51> m31Var) throws vp1 {
        m31Var.f7412b.k(this.a, kp1Var.a.a.f8427d, xo1Var.u.toString(), zzbk.zzk(xo1Var.r), (zf) m31Var.f7413c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ void c(m31 m31Var, boolean z, Context context) throws qj0 {
        try {
            ((hq1) m31Var.f7412b).v(z);
            if (this.f9383c.f7056g < ((Integer) c.c().b(w3.u0)).intValue()) {
                ((hq1) m31Var.f7412b).g();
            } else {
                ((hq1) m31Var.f7412b).h(context);
            }
        } catch (vp1 e2) {
            er.zzh("Cannot show interstitial.");
            throw new qj0(e2.getCause());
        }
    }
}