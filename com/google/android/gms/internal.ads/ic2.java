package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class ic2 extends ej2<ic2, hc2> implements mk2 {
    private static final ic2 zze;
    private wd2 zzb;

    static {
        ic2 ic2Var = new ic2();
        zze = ic2Var;
        ej2.A(ic2.class, ic2Var);
    }

    private ic2() {
    }

    public static ic2 E() {
        return zze;
    }

    @Override // com.google.android.gms.internal.ads.ej2
    protected final Object C(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return ej2.B(zze, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\t", new Object[]{"zzb"});
        }
        if (i3 == 3) {
            return new ic2();
        }
        gc2 gc2Var = null;
        if (i3 == 4) {
            return new hc2(gc2Var);
        }
        if (i3 != 5) {
            return null;
        }
        return zze;
    }

    public final wd2 D() {
        wd2 wd2Var = this.zzb;
        return wd2Var == null ? wd2.F() : wd2Var;
    }
}