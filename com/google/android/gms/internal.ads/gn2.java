package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class gn2 extends ej2<gn2, cn2> implements mk2 {
    private static final gn2 zzh;
    private int zzb;
    private int zze;
    private String zzf = "";
    private ci2 zzg = ci2.f5319e;

    static {
        gn2 gn2Var = new gn2();
        zzh = gn2Var;
        ej2.A(gn2.class, gn2Var);
    }

    private gn2() {
    }

    public static cn2 D() {
        return zzh.w();
    }

    static /* synthetic */ void F(gn2 gn2Var, fn2 fn2Var) {
        gn2Var.zze = fn2Var.zza();
        gn2Var.zzb |= 1;
    }

    static /* synthetic */ void G(gn2 gn2Var, String str) {
        gn2Var.zzb |= 2;
        gn2Var.zzf = "image/png";
    }

    static /* synthetic */ void H(gn2 gn2Var, ci2 ci2Var) {
        ci2Var.getClass();
        gn2Var.zzb |= 4;
        gn2Var.zzg = ci2Var;
    }

    @Override // com.google.android.gms.internal.ads.ej2
    protected final Object C(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return ej2.B(zzh, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ည\u0002", new Object[]{"zzb", "zze", fn2.b(), "zzf", "zzg"});
        }
        if (i3 == 3) {
            return new gn2();
        }
        if (i3 == 4) {
            return new cn2(null);
        }
        if (i3 != 5) {
            return null;
        }
        return zzh;
    }
}