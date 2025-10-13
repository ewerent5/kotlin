package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class id2 extends ej2<id2, hd2> implements mk2 {
    private static final id2 zzg;
    private ld2 zzb;
    private int zze;
    private int zzf;

    static {
        id2 id2Var = new id2();
        zzg = id2Var;
        ej2.A(id2.class, id2Var);
    }

    private id2() {
    }

    public static id2 F(ci2 ci2Var, qi2 qi2Var) {
        return (id2) ej2.t(zzg, ci2Var, qi2Var);
    }

    public static id2 G() {
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.ej2
    protected final Object C(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return ej2.B(zzg, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\u000b\u0003\u000b", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i3 == 3) {
            return new id2();
        }
        if (i3 == 4) {
            return new hd2(null);
        }
        if (i3 != 5) {
            return null;
        }
        return zzg;
    }

    public final ld2 D() {
        ld2 ld2Var = this.zzb;
        return ld2Var == null ? ld2.F() : ld2Var;
    }

    public final int E() {
        return this.zze;
    }
}