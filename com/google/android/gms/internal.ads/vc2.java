package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class vc2 extends ej2<vc2, uc2> implements mk2 {
    private static final vc2 zzh;
    private int zzb;
    private oc2 zze;
    private ci2 zzf;
    private ci2 zzg;

    static {
        vc2 vc2Var = new vc2();
        zzh = vc2Var;
        ej2.A(vc2.class, vc2Var);
    }

    private vc2() {
        ci2 ci2Var = ci2.f5319e;
        this.zzf = ci2Var;
        this.zzg = ci2Var;
    }

    public static vc2 H(ci2 ci2Var, qi2 qi2Var) {
        return (vc2) ej2.t(zzh, ci2Var, qi2Var);
    }

    public static uc2 I() {
        return zzh.w();
    }

    public static vc2 J() {
        return zzh;
    }

    static /* synthetic */ void N(vc2 vc2Var, oc2 oc2Var) {
        oc2Var.getClass();
        vc2Var.zze = oc2Var;
    }

    @Override // com.google.android.gms.internal.ads.ej2
    protected final Object C(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return ej2.B(zzh, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n\u0004\n", new Object[]{"zzb", "zze", "zzf", "zzg"});
        }
        if (i3 == 3) {
            return new vc2();
        }
        tc2 tc2Var = null;
        if (i3 == 4) {
            return new uc2(tc2Var);
        }
        if (i3 != 5) {
            return null;
        }
        return zzh;
    }

    public final int D() {
        return this.zzb;
    }

    public final oc2 E() {
        oc2 oc2Var = this.zze;
        return oc2Var == null ? oc2.G() : oc2Var;
    }

    public final ci2 F() {
        return this.zzf;
    }

    public final ci2 G() {
        return this.zzg;
    }
}