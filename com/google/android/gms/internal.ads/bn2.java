package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class bn2 extends ej2<bn2, xm2> implements mk2 {
    private static final bn2 zzl;
    private int zzb;
    private an2 zze;
    private ci2 zzg;
    private ci2 zzh;
    private int zzi;
    private ci2 zzj;
    private byte zzk = 2;
    private nj2<sm2> zzf = ej2.p();

    static {
        bn2 bn2Var = new bn2();
        zzl = bn2Var;
        ej2.A(bn2.class, bn2Var);
    }

    private bn2() {
        ci2 ci2Var = ci2.f5319e;
        this.zzg = ci2Var;
        this.zzh = ci2Var;
        this.zzj = ci2Var;
    }

    @Override // com.google.android.gms.internal.ads.ej2
    protected final Object C(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return Byte.valueOf(this.zzk);
        }
        if (i3 == 2) {
            return ej2.B(zzl, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003\u0006ည\u0004", new Object[]{"zzb", "zze", "zzf", sm2.class, "zzg", "zzh", "zzi", "zzj"});
        }
        if (i3 == 3) {
            return new bn2();
        }
        if (i3 == 4) {
            return new xm2(null);
        }
        if (i3 == 5) {
            return zzl;
        }
        this.zzk = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}