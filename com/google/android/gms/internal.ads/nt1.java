package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class nt1 extends ej2<nt1, ms1> implements mk2 {
    private static final nt1 zzi;
    private int zzb;
    private nj2<ci2> zze = ej2.p();
    private ci2 zzf = ci2.f5319e;
    private int zzg = 1;
    private int zzh = 1;

    static {
        nt1 nt1Var = new nt1();
        zzi = nt1Var;
        ej2.A(nt1.class, nt1Var);
    }

    private nt1() {
    }

    public static ms1 D() {
        return zzi.w();
    }

    static /* synthetic */ void F(nt1 nt1Var, ci2 ci2Var) {
        nj2<ci2> nj2Var = nt1Var.zze;
        if (!nj2Var.zza()) {
            nt1Var.zze = ej2.q(nj2Var);
        }
        nt1Var.zze.add(ci2Var);
    }

    static /* synthetic */ void G(nt1 nt1Var, ci2 ci2Var) {
        nt1Var.zzb |= 1;
        nt1Var.zzf = ci2Var;
    }

    static /* synthetic */ void H(nt1 nt1Var, bh1 bh1Var) {
        nt1Var.zzh = bh1Var.zza();
        nt1Var.zzb |= 4;
    }

    @Override // com.google.android.gms.internal.ads.ej2
    protected final Object C(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return ej2.B(zzi, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001c\u0002ည\u0000\u0003ဌ\u0001\u0004ဌ\u0002", new Object[]{"zzb", "zze", "zzf", "zzg", hn1.b(), "zzh", bh1.b()});
        }
        if (i3 == 3) {
            return new nt1();
        }
        if (i3 == 4) {
            return new ms1(null);
        }
        if (i3 != 5) {
            return null;
        }
        return zzi;
    }
}