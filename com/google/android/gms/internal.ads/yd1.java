package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class yd1 extends ej2<yd1, xc1> implements mk2 {
    private static final yd1 zzi;
    private int zzb;
    private ci2 zze;
    private ci2 zzf;
    private ci2 zzg;
    private ci2 zzh;

    static {
        yd1 yd1Var = new yd1();
        zzi = yd1Var;
        ej2.A(yd1.class, yd1Var);
    }

    private yd1() {
        ci2 ci2Var = ci2.f5319e;
        this.zze = ci2Var;
        this.zzf = ci2Var;
        this.zzg = ci2Var;
        this.zzh = ci2Var;
    }

    public static yd1 H(byte[] bArr, qi2 qi2Var) {
        return (yd1) ej2.v(zzi, bArr, qi2Var);
    }

    public static xc1 I() {
        return zzi.w();
    }

    static /* synthetic */ void L(yd1 yd1Var, ci2 ci2Var) {
        yd1Var.zzb |= 1;
        yd1Var.zze = ci2Var;
    }

    static /* synthetic */ void M(yd1 yd1Var, ci2 ci2Var) {
        yd1Var.zzb |= 2;
        yd1Var.zzf = ci2Var;
    }

    static /* synthetic */ void N(yd1 yd1Var, ci2 ci2Var) {
        yd1Var.zzb |= 4;
        yd1Var.zzg = ci2Var;
    }

    static /* synthetic */ void O(yd1 yd1Var, ci2 ci2Var) {
        yd1Var.zzb |= 8;
        yd1Var.zzh = ci2Var;
    }

    @Override // com.google.android.gms.internal.ads.ej2
    protected final Object C(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return ej2.B(zzi, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh"});
        }
        if (i3 == 3) {
            return new yd1();
        }
        if (i3 == 4) {
            return new xc1(null);
        }
        if (i3 != 5) {
            return null;
        }
        return zzi;
    }

    public final ci2 D() {
        return this.zze;
    }

    public final ci2 E() {
        return this.zzf;
    }

    public final ci2 F() {
        return this.zzg;
    }

    public final ci2 G() {
        return this.zzh;
    }
}