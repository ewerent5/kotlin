package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class ca2 extends ej2<ca2, ba2> implements mk2 {
    private static final ca2 zzf;
    private int zzb;
    private fa2 zze;

    static {
        ca2 ca2Var = new ca2();
        zzf = ca2Var;
        ej2.A(ca2.class, ca2Var);
    }

    private ca2() {
    }

    public static ca2 F(ci2 ci2Var, qi2 qi2Var) {
        return (ca2) ej2.t(zzf, ci2Var, qi2Var);
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
            return new ca2();
        }
        if (i3 == 4) {
            return new ba2(null);
        }
        if (i3 != 5) {
            return null;
        }
        return zzf;
    }

    public final int D() {
        return this.zzb;
    }

    public final fa2 E() {
        fa2 fa2Var = this.zze;
        return fa2Var == null ? fa2.E() : fa2Var;
    }
}