package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class lc2 extends ej2<lc2, kc2> implements mk2 {
    private static final lc2 zze;
    private oc2 zzb;

    static {
        lc2 lc2Var = new lc2();
        zze = lc2Var;
        ej2.A(lc2.class, lc2Var);
    }

    private lc2() {
    }

    public static lc2 E(ci2 ci2Var, qi2 qi2Var) {
        return (lc2) ej2.t(zze, ci2Var, qi2Var);
    }

    @Override // com.google.android.gms.internal.ads.ej2
    protected final Object C(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return ej2.B(zze, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"zzb"});
        }
        if (i3 == 3) {
            return new lc2();
        }
        if (i3 == 4) {
            return new kc2(null);
        }
        if (i3 != 5) {
            return null;
        }
        return zze;
    }

    public final oc2 D() {
        oc2 oc2Var = this.zzb;
        return oc2Var == null ? oc2.G() : oc2Var;
    }
}