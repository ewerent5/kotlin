package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class ia2 extends ej2<ia2, ha2> implements mk2 {
    private static final ia2 zzg;
    private int zzb;
    private oa2 zze;
    private fd2 zzf;

    static {
        ia2 ia2Var = new ia2();
        zzg = ia2Var;
        ej2.A(ia2.class, ia2Var);
    }

    private ia2() {
    }

    public static ia2 G(ci2 ci2Var, qi2 qi2Var) {
        return (ia2) ej2.t(zzg, ci2Var, qi2Var);
    }

    public static ha2 H() {
        return zzg.w();
    }

    static /* synthetic */ void L(ia2 ia2Var, oa2 oa2Var) {
        oa2Var.getClass();
        ia2Var.zze = oa2Var;
    }

    static /* synthetic */ void M(ia2 ia2Var, fd2 fd2Var) {
        fd2Var.getClass();
        ia2Var.zzf = fd2Var;
    }

    @Override // com.google.android.gms.internal.ads.ej2
    protected final Object C(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return ej2.B(zzg, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\t", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i3 == 3) {
            return new ia2();
        }
        if (i3 == 4) {
            return new ha2(null);
        }
        if (i3 != 5) {
            return null;
        }
        return zzg;
    }

    public final int D() {
        return this.zzb;
    }

    public final oa2 E() {
        oa2 oa2Var = this.zze;
        return oa2Var == null ? oa2.I() : oa2Var;
    }

    public final fd2 F() {
        fd2 fd2Var = this.zzf;
        return fd2Var == null ? fd2.I() : fd2Var;
    }
}