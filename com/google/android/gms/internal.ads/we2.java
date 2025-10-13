package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class we2 extends ej2<we2, ve2> implements mk2 {
    private static final we2 zzf;
    private String zzb = "";
    private wd2 zze;

    static {
        we2 we2Var = new we2();
        zzf = we2Var;
        ej2.A(we2.class, we2Var);
    }

    private we2() {
    }

    public static we2 F(ci2 ci2Var, qi2 qi2Var) {
        return (we2) ej2.t(zzf, ci2Var, qi2Var);
    }

    public static we2 G() {
        return zzf;
    }

    @Override // com.google.android.gms.internal.ads.ej2
    protected final Object C(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return ej2.B(zzf, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"zzb", "zze"});
        }
        if (i3 == 3) {
            return new we2();
        }
        ue2 ue2Var = null;
        if (i3 == 4) {
            return new ve2(ue2Var);
        }
        if (i3 != 5) {
            return null;
        }
        return zzf;
    }

    public final String D() {
        return this.zzb;
    }

    public final wd2 E() {
        wd2 wd2Var = this.zze;
        return wd2Var == null ? wd2.F() : wd2Var;
    }
}