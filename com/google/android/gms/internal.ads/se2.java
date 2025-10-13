package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class se2 extends ej2<se2, re2> implements mk2 {
    private static final se2 zzf;
    private int zzb;
    private we2 zze;

    static {
        se2 se2Var = new se2();
        zzf = se2Var;
        ej2.A(se2.class, se2Var);
    }

    private se2() {
    }

    public static se2 F(ci2 ci2Var, qi2 qi2Var) {
        return (se2) ej2.t(zzf, ci2Var, qi2Var);
    }

    public static re2 G() {
        return zzf.w();
    }

    static /* synthetic */ void J(se2 se2Var, we2 we2Var) {
        we2Var.getClass();
        se2Var.zze = we2Var;
    }

    @Override // com.google.android.gms.internal.ads.ej2
    protected final Object C(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return ej2.B(zzf, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zzb", "zze"});
        }
        if (i3 == 3) {
            return new se2();
        }
        qe2 qe2Var = null;
        if (i3 == 4) {
            return new re2(qe2Var);
        }
        if (i3 != 5) {
            return null;
        }
        return zzf;
    }

    public final int D() {
        return this.zzb;
    }

    public final we2 E() {
        we2 we2Var = this.zze;
        return we2Var == null ? we2.G() : we2Var;
    }
}