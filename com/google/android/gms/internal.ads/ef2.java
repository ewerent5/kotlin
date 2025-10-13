package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class ef2 extends ej2<ef2, df2> implements mk2 {
    private static final ef2 zzf;
    private int zzb;
    private ci2 zze = ci2.f5319e;

    static {
        ef2 ef2Var = new ef2();
        zzf = ef2Var;
        ej2.A(ef2.class, ef2Var);
    }

    private ef2() {
    }

    public static ef2 F(ci2 ci2Var, qi2 qi2Var) {
        return (ef2) ej2.t(zzf, ci2Var, qi2Var);
    }

    public static df2 G() {
        return zzf.w();
    }

    @Override // com.google.android.gms.internal.ads.ej2
    protected final Object C(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return ej2.B(zzf, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zzb", "zze"});
        }
        if (i3 == 3) {
            return new ef2();
        }
        cf2 cf2Var = null;
        if (i3 == 4) {
            return new df2(cf2Var);
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