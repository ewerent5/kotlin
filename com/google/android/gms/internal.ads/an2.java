package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class an2 extends ej2<an2, ym2> implements mk2 {
    private static final an2 zzh;
    private int zzb;
    private int zze;
    private ci2 zzf;
    private ci2 zzg;

    static {
        an2 an2Var = new an2();
        zzh = an2Var;
        ej2.A(an2.class, an2Var);
    }

    private an2() {
        ci2 ci2Var = ci2.f5319e;
        this.zzf = ci2Var;
        this.zzg = ci2Var;
    }

    @Override // com.google.android.gms.internal.ads.ej2
    protected final Object C(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return ej2.B(zzh, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zzb", "zze", "zzf", "zzg"});
        }
        if (i3 == 3) {
            return new an2();
        }
        km2 km2Var = null;
        if (i3 == 4) {
            return new ym2(km2Var);
        }
        if (i3 != 5) {
            return null;
        }
        return zzh;
    }
}