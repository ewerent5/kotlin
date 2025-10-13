package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class d81 implements rj0 {
    private final m31 a;

    d81(m31 m31Var) {
        this.a = m31Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.rj0
    public final void a(boolean z, Context context) throws qj0 {
        m31 m31Var = this.a;
        try {
            ((hq1) m31Var.f7412b).v(z);
            ((hq1) m31Var.f7412b).p();
        } catch (vp1 e2) {
            er.zzj("Cannot show rewarded video.", e2);
            throw new qj0(e2.getCause());
        }
    }
}