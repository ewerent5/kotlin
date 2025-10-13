package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class om1 {
    public static mm1<t30, z30> a(Context context, yq1 yq1Var, rr1 rr1Var) {
        return c(context, yq1Var, rr1Var);
    }

    public static mm1<f40, k40> b(Context context, yq1 yq1Var, rr1 rr1Var) {
        return c(context, yq1Var, rr1Var);
    }

    private static <AppOpenAdRequestComponent extends y90<AppOpenAd>, AppOpenAd extends s60> mm1<AppOpenAdRequestComponent, AppOpenAd> c(Context context, yq1 yq1Var, rr1 rr1Var) {
        if (((Integer) c.c().b(w3.J4)).intValue() <= 0) {
            return new bm1();
        }
        qr1 qr1VarA = rr1Var.a(gr1.AppOpen, context, yq1Var, new ql1(new ml1()));
        cm1 cm1Var = new cm1(new bm1());
        cr1 cr1Var = qr1VarA.a;
        h52 h52Var = qr.a;
        return new sl1(cm1Var, new yl1(cr1Var, h52Var), qr1VarA.f8453b, h52Var);
    }
}