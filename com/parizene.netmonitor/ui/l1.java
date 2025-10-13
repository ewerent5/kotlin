package com.parizene.netmonitor.ui;

import android.os.Build;

/* compiled from: ThemeHelper.kt */
/* loaded from: classes3.dex */
public final class l1 {

    /* compiled from: ThemeHelper.kt */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[n1.valuesCustom().length];
            iArr[n1.DARK.ordinal()] = 1;
            iArr[n1.LIGHT.ordinal()] = 2;
            iArr[n1.FOLLOW_SYSTEM.ordinal()] = 3;
            a = iArr;
        }
    }

    public final void a() {
        b(c());
    }

    public final void b(n1 n1Var) {
        i.y.d.l.d(n1Var, "themeId");
        int i2 = a.a[n1Var.ordinal()];
        int i3 = 2;
        if (i2 != 1) {
            if (i2 == 2) {
                i3 = 1;
            } else {
                if (i2 != 3) {
                    throw new i.k();
                }
                i3 = -1;
            }
        }
        androidx.appcompat.app.e.F(i3);
    }

    public final n1 c() {
        Integer numF = com.parizene.netmonitor.t0.f.E.f();
        n1[] n1VarArrValuesCustom = n1.valuesCustom();
        i.y.d.l.c(numF, "value");
        return (numF.intValue() < 0 || numF.intValue() >= n1VarArrValuesCustom.length) ? Build.VERSION.SDK_INT >= 28 ? n1.FOLLOW_SYSTEM : n1.DARK : n1VarArrValuesCustom[numF.intValue()];
    }
}