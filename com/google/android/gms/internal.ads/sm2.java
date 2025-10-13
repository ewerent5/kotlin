package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class sm2 extends ej2<sm2, rm2> implements mk2 {
    private static final sm2 zzh;
    private int zzb;
    private ci2 zze;
    private ci2 zzf;
    private byte zzg = 2;

    static {
        sm2 sm2Var = new sm2();
        zzh = sm2Var;
        ej2.A(sm2.class, sm2Var);
    }

    private sm2() {
        ci2 ci2Var = ci2.f5319e;
        this.zze = ci2Var;
        this.zzf = ci2Var;
    }

    public static rm2 D() {
        return zzh.w();
    }

    static /* synthetic */ void F(sm2 sm2Var, ci2 ci2Var) {
        sm2Var.zzb |= 1;
        sm2Var.zze = ci2Var;
    }

    static /* synthetic */ void G(sm2 sm2Var, ci2 ci2Var) {
        sm2Var.zzb |= 2;
        sm2Var.zzf = ci2Var;
    }

    @Override // com.google.android.gms.internal.ads.ej2
    protected final Object C(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return Byte.valueOf(this.zzg);
        }
        if (i3 == 2) {
            return ej2.B(zzh, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔊ\u0000\u0002ည\u0001", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i3 == 3) {
            return new sm2();
        }
        km2 km2Var = null;
        if (i3 == 4) {
            return new rm2(km2Var);
        }
        if (i3 == 5) {
            return zzh;
        }
        this.zzg = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}