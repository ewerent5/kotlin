package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class sc2 extends ej2<sc2, qc2> implements mk2 {
    private static final sc2 zzg;
    private int zzb;
    private vc2 zze;
    private ci2 zzf = ci2.f5319e;

    static {
        sc2 sc2Var = new sc2();
        zzg = sc2Var;
        ej2.A(sc2.class, sc2Var);
    }

    private sc2() {
    }

    public static sc2 G(ci2 ci2Var, qi2 qi2Var) {
        return (sc2) ej2.t(zzg, ci2Var, qi2Var);
    }

    public static qc2 H() {
        return zzg.w();
    }

    static /* synthetic */ void L(sc2 sc2Var, vc2 vc2Var) {
        vc2Var.getClass();
        sc2Var.zze = vc2Var;
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
            return new sc2();
        }
        pc2 pc2Var = null;
        if (i3 == 4) {
            return new qc2(pc2Var);
        }
        if (i3 != 5) {
            return null;
        }
        return zzg;
    }

    public final int D() {
        return this.zzb;
    }

    public final vc2 E() {
        vc2 vc2Var = this.zze;
        return vc2Var == null ? vc2.J() : vc2Var;
    }

    public final ci2 F() {
        return this.zzf;
    }
}