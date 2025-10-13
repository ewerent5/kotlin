package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public abstract class dv1 {
    public static dv1 f(ev1 ev1Var, fv1 fv1Var) {
        if (bv1.b()) {
            return new hv1(ev1Var, fv1Var);
        }
        throw new IllegalStateException("Method called before OM SDK activation");
    }

    public abstract void a();

    public abstract void b(View view);

    public abstract void c();

    public abstract void d(View view, jv1 jv1Var, String str);

    @Deprecated
    public abstract void e(View view);
}