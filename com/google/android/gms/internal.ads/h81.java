package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class h81 implements s31<xq0, hq1, i51> {
    private final Context a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f6308b;

    /* renamed from: c, reason: collision with root package name */
    private final dr0 f6309c;

    public h81(Context context, Executor executor, dr0 dr0Var) {
        this.a = context;
        this.f6308b = executor;
        this.f6309c = dr0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(kp1 kp1Var, xo1 xo1Var, m31<hq1, i51> m31Var) {
        try {
            m31Var.f7412b.o(kp1Var.a.a.f8427d, xo1Var.u.toString());
        } catch (Exception e2) {
            String strValueOf = String.valueOf(m31Var.a);
            er.zzj(strValueOf.length() != 0 ? "Fail to load ad from adapter ".concat(strValueOf) : new String("Fail to load ad from adapter "), e2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.s31
    public final /* bridge */ /* synthetic */ xq0 a(kp1 kp1Var, xo1 xo1Var, final m31 m31Var) {
        yq0 yq0VarA = this.f6309c.a(new i70(kp1Var, xo1Var, m31Var.a), new zq0(new rj0(m31Var) { // from class: com.google.android.gms.internal.ads.d81
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
                    ((hq1) m31Var2.f7412b).p();
                } catch (vp1 e2) {
                    er.zzj("Cannot show rewarded video.", e2);
                    throw new qj0(e2.getCause());
                }
            }
        }));
        yq0VarA.a().H0(new i20((hq1) m31Var.f7412b), this.f6308b);
        wb0 wb0VarB = yq0VarA.b();
        oa0 oa0VarC = yq0VarA.c();
        ((i51) m31Var.f7413c).J4(new g81(this, yq0VarA.i(), oa0VarC, wb0VarB, yq0VarA.k()));
        return yq0VarA.h();
    }

    @Override // com.google.android.gms.internal.ads.s31
    public final void b(kp1 kp1Var, xo1 xo1Var, m31<hq1, i51> m31Var) throws vp1 {
        if (m31Var.f7412b.q()) {
            e(kp1Var, xo1Var, m31Var);
            return;
        }
        ((i51) m31Var.f7413c).K4(new f81(this, kp1Var, xo1Var, m31Var));
        m31Var.f7412b.n(this.a, kp1Var.a.a.f8427d, null, (sm) m31Var.f7413c, xo1Var.u.toString());
    }
}