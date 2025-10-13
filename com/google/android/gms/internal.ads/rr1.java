package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class rr1 {
    private final HashMap<gr1, qr1<? extends s60>> a = new HashMap<>();

    public final <AdT extends s60> qr1<AdT> a(gr1 gr1Var, Context context, yq1 yq1Var, yr1<AdT> yr1Var) {
        qr1<AdT> qr1Var = (qr1) this.a.get(gr1Var);
        if (qr1Var != null) {
            return qr1Var;
        }
        dr1 dr1Var = new dr1(jr1.c(gr1Var, context));
        qr1<AdT> qr1Var2 = new qr1<>(dr1Var, new as1(dr1Var, yq1Var, yr1Var));
        this.a.put(gr1Var, qr1Var2);
        return qr1Var2;
    }
}