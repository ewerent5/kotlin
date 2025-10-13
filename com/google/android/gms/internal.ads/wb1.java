package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class wb1 extends ej2<wb1, va1> implements mk2 {
    private static final wb1 zzj;
    private int zzb;
    private long zze;
    private int zzf;
    private boolean zzg;
    private jj2 zzh = ej2.m();
    private long zzi;

    static {
        wb1 wb1Var = new wb1();
        zzj = wb1Var;
        ej2.A(wb1.class, wb1Var);
    }

    private wb1() {
    }

    @Override // com.google.android.gms.internal.ads.ej2
    protected final Object C(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return ej2.B(zzj, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဂ\u0000\u0002င\u0001\u0003ဇ\u0002\u0004\u0016\u0005ဃ\u0003", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i3 == 3) {
            return new wb1();
        }
        dt0 dt0Var = null;
        if (i3 == 4) {
            return new va1(dt0Var);
        }
        if (i3 != 5) {
            return null;
        }
        return zzj;
    }
}