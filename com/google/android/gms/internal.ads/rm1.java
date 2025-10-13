package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class rm1 implements mo2<mm1<dr0, xq0>> {
    private final wo2<Context> a;

    /* renamed from: b */
    private final wo2<yq1> f8684b;

    /* renamed from: c */
    private final wo2<rr1> f8685c;

    public rm1(wo2<Context> wo2Var, wo2<yq1> wo2Var2, wo2<rr1> wo2Var3) {
        this.a = wo2Var;
        this.f8684b = wo2Var2;
        this.f8685c = wo2Var3;
    }

    @Override // com.google.android.gms.internal.ads.wo2
    /* renamed from: a */
    public final mm1<dr0, xq0> zzb() {
        Context contextZzb = this.a.zzb();
        yq1 yq1VarZzb = this.f8684b.zzb();
        rr1 rr1VarZzb = this.f8685c.zzb();
        if (((Integer) c.c().b(w3.v4)).intValue() <= 0) {
            return new bm1();
        }
        qr1 qr1VarA = rr1VarZzb.a(gr1.Rewarded, contextZzb, yq1VarZzb, new ql1(new ml1()));
        cm1 cm1Var = new cm1(new bm1());
        cr1 cr1Var = qr1VarA.a;
        h52 h52Var = qr.a;
        return new sl1(cm1Var, new yl1(cr1Var, h52Var), qr1VarA.f8453b, h52Var);
    }
}