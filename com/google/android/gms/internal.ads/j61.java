package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zzbk;
import java.io.IOException;
import java.util.concurrent.Executor;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class j61 implements s31<ol0, hq1, h51> {
    private final Context a;

    /* renamed from: b, reason: collision with root package name */
    private final gk0 f6697b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f6698c;

    public j61(Context context, gk0 gk0Var, Executor executor) {
        this.a = context;
        this.f6697b = gk0Var;
        this.f6698c = executor;
    }

    private static final boolean c(kp1 kp1Var, int i2) {
        return kp1Var.a.a.f8430g.contains(Integer.toString(i2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.s31
    public final /* bridge */ /* synthetic */ ol0 a(kp1 kp1Var, xo1 xo1Var, m31 m31Var) throws e71, vp1 {
        tl0 tl0VarX;
        eg egVarB = ((hq1) m31Var.f7412b).b();
        fg fgVarC = ((hq1) m31Var.f7412b).c();
        ig igVarX = ((hq1) m31Var.f7412b).x();
        if (igVarX != null && c(kp1Var, 6)) {
            tl0VarX = tl0.w(igVarX);
        } else if (egVarB != null && c(kp1Var, 6)) {
            tl0VarX = tl0.z(egVarB);
        } else if (egVarB != null && c(kp1Var, 2)) {
            tl0VarX = tl0.y(egVarB);
        } else if (fgVarC != null && c(kp1Var, 6)) {
            tl0VarX = tl0.B(fgVarC);
        } else {
            if (fgVarC == null || !c(kp1Var, 1)) {
                throw new e71(1, "No native ad mappers");
            }
            tl0VarX = tl0.x(fgVarC);
        }
        if (!kp1Var.a.a.f8430g.contains(Integer.toString(tl0VarX.X()))) {
            throw new e71(1, "No corresponding native ad listener");
        }
        vl0 vl0VarD = this.f6697b.d(new i70(kp1Var, xo1Var, m31Var.a), new gm0(tl0VarX), new un0(fgVarC, egVarB, igVarX, null));
        ((h51) m31Var.f7413c).J4(vl0VarD.f());
        vl0VarD.a().H0(new i20((hq1) m31Var.f7412b), this.f6698c);
        return vl0VarD.h();
    }

    @Override // com.google.android.gms.internal.ads.s31
    public final void b(kp1 kp1Var, xo1 xo1Var, m31<hq1, h51> m31Var) throws JSONException, vp1, IOException {
        hq1 hq1Var = m31Var.f7412b;
        Context context = this.a;
        m93 m93Var = kp1Var.a.a.f8427d;
        String string = xo1Var.u.toString();
        String strZzk = zzbk.zzk(xo1Var.r);
        zf zfVar = (zf) m31Var.f7413c;
        qp1 qp1Var = kp1Var.a.a;
        hq1Var.r(context, m93Var, string, strZzk, zfVar, qp1Var.f8432i, qp1Var.f8430g);
    }
}