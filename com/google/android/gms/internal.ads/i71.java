package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class i71 implements s31<xq0, hq1, h51> {
    private final Context a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f6498b;

    /* renamed from: c, reason: collision with root package name */
    private final dr0 f6499c;

    public i71(Context context, Executor executor, dr0 dr0Var) {
        this.a = context;
        this.f6498b = executor;
        this.f6499c = dr0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.s31
    public final /* bridge */ /* synthetic */ xq0 a(kp1 kp1Var, xo1 xo1Var, final m31 m31Var) {
        yq0 yq0VarA = this.f6499c.a(new i70(kp1Var, xo1Var, m31Var.a), new zq0(new rj0(m31Var) { // from class: com.google.android.gms.internal.ads.h71
            private final m31 a;

            {
                this.a = m31Var;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.internal.ads.rj0
            public final void a(boolean z, Context context) throws qj0 {
                m31 m31Var2 = this.a;
                try {
                    ((hq1) m31Var2.f7412b).v(z);
                    ((hq1) m31Var2.f7412b).z(context);
                } catch (vp1 e2) {
                    throw new qj0(e2.getCause());
                }
            }
        }));
        yq0VarA.a().H0(new i20((hq1) m31Var.f7412b), this.f6498b);
        ((h51) m31Var.f7413c).J4(yq0VarA.m());
        return yq0VarA.h();
    }

    @Override // com.google.android.gms.internal.ads.s31
    public final void b(kp1 kp1Var, xo1 xo1Var, m31<hq1, h51> m31Var) {
        try {
            qp1 qp1Var = kp1Var.a.a;
            if (qp1Var.o.a == 3) {
                m31Var.f7412b.A(this.a, qp1Var.f8427d, xo1Var.u.toString(), (zf) m31Var.f7413c);
            } else {
                m31Var.f7412b.y(this.a, qp1Var.f8427d, xo1Var.u.toString(), (zf) m31Var.f7413c);
            }
        } catch (Exception e2) {
            String strValueOf = String.valueOf(m31Var.a);
            er.zzj(strValueOf.length() != 0 ? "Fail to load ad from adapter ".concat(strValueOf) : new String("Fail to load ad from adapter "), e2);
        }
    }
}