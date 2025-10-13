package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class vm2 extends ej2<vm2, um2> implements mk2 {
    private static final vm2 zzh;
    private int zzb;
    private ci2 zze;
    private ci2 zzf;
    private ci2 zzg;

    static {
        vm2 vm2Var = new vm2();
        zzh = vm2Var;
        ej2.A(vm2.class, vm2Var);
    }

    private vm2() {
        ci2 ci2Var = ci2.f5319e;
        this.zze = ci2Var;
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
            return ej2.B(zzh, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zzb", "zze", "zzf", "zzg"});
        }
        if (i3 == 3) {
            return new vm2();
        }
        km2 km2Var = null;
        if (i3 == 4) {
            return new um2(km2Var);
        }
        if (i3 != 5) {
            return null;
        }
        return zzh;
    }
}