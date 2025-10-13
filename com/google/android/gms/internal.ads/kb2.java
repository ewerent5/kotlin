package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class kb2 extends ej2<kb2, jb2> implements mk2 {
    private static final kb2 zzf;
    private int zzb;
    private int zze;

    static {
        kb2 kb2Var = new kb2();
        zzf = kb2Var;
        ej2.A(kb2.class, kb2Var);
    }

    private kb2() {
    }

    public static kb2 E(ci2 ci2Var, qi2 qi2Var) {
        return (kb2) ej2.t(zzf, ci2Var, qi2Var);
    }

    @Override // com.google.android.gms.internal.ads.ej2
    protected final Object C(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return ej2.B(zzf, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[]{"zzb", "zze"});
        }
        if (i3 == 3) {
            return new kb2();
        }
        ib2 ib2Var = null;
        if (i3 == 4) {
            return new jb2(ib2Var);
        }
        if (i3 != 5) {
            return null;
        }
        return zzf;
    }

    public final int D() {
        return this.zzb;
    }
}