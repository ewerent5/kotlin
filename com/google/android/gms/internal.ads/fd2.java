package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class fd2 extends ej2<fd2, ed2> implements mk2 {
    private static final fd2 zzg;
    private int zzb;
    private ld2 zze;
    private ci2 zzf = ci2.f5319e;

    static {
        fd2 fd2Var = new fd2();
        zzg = fd2Var;
        ej2.A(fd2.class, fd2Var);
    }

    private fd2() {
    }

    public static fd2 G(ci2 ci2Var, qi2 qi2Var) {
        return (fd2) ej2.t(zzg, ci2Var, qi2Var);
    }

    public static ed2 H() {
        return zzg.w();
    }

    public static fd2 I() {
        return zzg;
    }

    static /* synthetic */ void M(fd2 fd2Var, ld2 ld2Var) {
        ld2Var.getClass();
        fd2Var.zze = ld2Var;
    }

    @Override // com.google.android.gms.internal.ads.ej2
    protected final Object C(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return ej2.B(zzg, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i3 == 3) {
            return new fd2();
        }
        dd2 dd2Var = null;
        if (i3 == 4) {
            return new ed2(dd2Var);
        }
        if (i3 != 5) {
            return null;
        }
        return zzg;
    }

    public final int D() {
        return this.zzb;
    }

    public final ld2 E() {
        ld2 ld2Var = this.zze;
        return ld2Var == null ? ld2.F() : ld2Var;
    }

    public final ci2 F() {
        return this.zzf;
    }
}