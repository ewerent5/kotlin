package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class sa2 extends ej2<sa2, ra2> implements mk2 {
    private static final sa2 zzf;
    private va2 zzb;
    private int zze;

    static {
        sa2 sa2Var = new sa2();
        zzf = sa2Var;
        ej2.A(sa2.class, sa2Var);
    }

    private sa2() {
    }

    public static sa2 F(ci2 ci2Var, qi2 qi2Var) {
        return (sa2) ej2.t(zzf, ci2Var, qi2Var);
    }

    public static sa2 G() {
        return zzf;
    }

    @Override // com.google.android.gms.internal.ads.ej2
    protected final Object C(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return ej2.B(zzf, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"zzb", "zze"});
        }
        if (i3 == 3) {
            return new sa2();
        }
        if (i3 == 4) {
            return new ra2(null);
        }
        if (i3 != 5) {
            return null;
        }
        return zzf;
    }

    public final va2 D() {
        va2 va2Var = this.zzb;
        return va2Var == null ? va2.E() : va2Var;
    }

    public final int E() {
        return this.zze;
    }
}