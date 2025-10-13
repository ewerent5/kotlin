package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class bb2 extends ej2<bb2, ab2> implements mk2 {
    private static final bb2 zzf;
    private eb2 zzb;
    private int zze;

    static {
        bb2 bb2Var = new bb2();
        zzf = bb2Var;
        ej2.A(bb2.class, bb2Var);
    }

    private bb2() {
    }

    public static bb2 F(ci2 ci2Var, qi2 qi2Var) {
        return (bb2) ej2.t(zzf, ci2Var, qi2Var);
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
            return new bb2();
        }
        if (i3 == 4) {
            return new ab2(null);
        }
        if (i3 != 5) {
            return null;
        }
        return zzf;
    }

    public final eb2 D() {
        eb2 eb2Var = this.zzb;
        return eb2Var == null ? eb2.E() : eb2Var;
    }

    public final int E() {
        return this.zze;
    }
}