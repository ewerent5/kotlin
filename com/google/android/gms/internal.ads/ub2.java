package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class ub2 extends ej2<ub2, tb2> implements mk2 {
    private static final ub2 zzf;
    private int zzb;
    private ci2 zze = ci2.f5319e;

    static {
        ub2 ub2Var = new ub2();
        zzf = ub2Var;
        ej2.A(ub2.class, ub2Var);
    }

    private ub2() {
    }

    public static ub2 F(ci2 ci2Var, qi2 qi2Var) {
        return (ub2) ej2.t(zzf, ci2Var, qi2Var);
    }

    public static tb2 G() {
        return zzf.w();
    }

    @Override // com.google.android.gms.internal.ads.ej2
    protected final Object C(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return ej2.B(zzf, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"zzb", "zze"});
        }
        if (i3 == 3) {
            return new ub2();
        }
        sb2 sb2Var = null;
        if (i3 == 4) {
            return new tb2(sb2Var);
        }
        if (i3 != 5) {
            return null;
        }
        return zzf;
    }

    public final int D() {
        return this.zzb;
    }

    public final ci2 E() {
        return this.zze;
    }
}