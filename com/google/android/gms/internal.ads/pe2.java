package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class pe2 extends ej2<pe2, oe2> implements mk2 {
    private static final pe2 zze;
    private String zzb = "";

    static {
        pe2 pe2Var = new pe2();
        zze = pe2Var;
        ej2.A(pe2.class, pe2Var);
    }

    private pe2() {
    }

    public static pe2 E(ci2 ci2Var, qi2 qi2Var) {
        return (pe2) ej2.t(zze, ci2Var, qi2Var);
    }

    public static pe2 F() {
        return zze;
    }

    @Override // com.google.android.gms.internal.ads.ej2
    protected final Object C(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return ej2.B(zze, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zzb"});
        }
        if (i3 == 3) {
            return new pe2();
        }
        ne2 ne2Var = null;
        if (i3 == 4) {
            return new oe2(ne2Var);
        }
        if (i3 != 5) {
            return null;
        }
        return zze;
    }

    public final String D() {
        return this.zzb;
    }
}