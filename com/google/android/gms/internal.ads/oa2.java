package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class oa2 extends ej2<oa2, na2> implements mk2 {
    private static final oa2 zzg;
    private int zzb;
    private va2 zze;
    private ci2 zzf = ci2.f5319e;

    static {
        oa2 oa2Var = new oa2();
        zzg = oa2Var;
        ej2.A(oa2.class, oa2Var);
    }

    private oa2() {
    }

    public static oa2 G(ci2 ci2Var, qi2 qi2Var) {
        return (oa2) ej2.t(zzg, ci2Var, qi2Var);
    }

    public static na2 H() {
        return zzg.w();
    }

    public static oa2 I() {
        return zzg;
    }

    static /* synthetic */ void M(oa2 oa2Var, va2 va2Var) {
        va2Var.getClass();
        oa2Var.zze = va2Var;
    }

    @Override // com.google.android.gms.internal.ads.ej2
    protected final Object C(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return ej2.B(zzg, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i3 == 3) {
            return new oa2();
        }
        ma2 ma2Var = null;
        if (i3 == 4) {
            return new na2(ma2Var);
        }
        if (i3 != 5) {
            return null;
        }
        return zzg;
    }

    public final int D() {
        return this.zzb;
    }

    public final va2 E() {
        va2 va2Var = this.zze;
        return va2Var == null ? va2.E() : va2Var;
    }

    public final ci2 F() {
        return this.zzf;
    }
}