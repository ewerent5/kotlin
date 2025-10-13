package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class vr2 extends ej2<vr2, ur2> implements mk2 {
    private static final vr2 zzh;
    private int zzb;
    private yr2 zze;
    private ci2 zzf;
    private ci2 zzg;

    static {
        vr2 vr2Var = new vr2();
        zzh = vr2Var;
        ej2.A(vr2.class, vr2Var);
    }

    private vr2() {
        ci2 ci2Var = ci2.f5319e;
        this.zzf = ci2Var;
        this.zzg = ci2Var;
    }

    public static vr2 G(ci2 ci2Var, qi2 qi2Var) {
        return (vr2) ej2.t(zzh, ci2Var, qi2Var);
    }

    @Override // com.google.android.gms.internal.ads.ej2
    protected final Object C(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return ej2.B(zzh, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zzb", "zze", "zzf", "zzg"});
        }
        if (i3 == 3) {
            return new vr2();
        }
        if (i3 == 4) {
            return new ur2(null);
        }
        if (i3 != 5) {
            return null;
        }
        return zzh;
    }

    public final yr2 D() {
        yr2 yr2Var = this.zze;
        return yr2Var == null ? yr2.M() : yr2Var;
    }

    public final ci2 E() {
        return this.zzf;
    }

    public final ci2 F() {
        return this.zzg;
    }
}