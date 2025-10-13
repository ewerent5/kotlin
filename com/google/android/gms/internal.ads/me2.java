package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class me2 extends ej2<me2, le2> implements mk2 {
    private static final me2 zzf;
    private int zzb;
    private pe2 zze;

    static {
        me2 me2Var = new me2();
        zzf = me2Var;
        ej2.A(me2.class, me2Var);
    }

    private me2() {
    }

    public static me2 F(ci2 ci2Var, qi2 qi2Var) {
        return (me2) ej2.t(zzf, ci2Var, qi2Var);
    }

    public static le2 G() {
        return zzf.w();
    }

    static /* synthetic */ void J(me2 me2Var, pe2 pe2Var) {
        pe2Var.getClass();
        me2Var.zze = pe2Var;
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
            return new me2();
        }
        ke2 ke2Var = null;
        if (i3 == 4) {
            return new le2(ke2Var);
        }
        if (i3 != 5) {
            return null;
        }
        return zzf;
    }

    public final int D() {
        return this.zzb;
    }

    public final pe2 E() {
        pe2 pe2Var = this.zze;
        return pe2Var == null ? pe2.F() : pe2Var;
    }
}