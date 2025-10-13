package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class wm2 extends ej2<wm2, tm2> implements mk2 {
    private static final wm2 zzk;
    private int zzb;
    private vm2 zze;
    private ci2 zzg;
    private ci2 zzh;
    private int zzi;
    private byte zzj = 2;
    private nj2<sm2> zzf = ej2.p();

    static {
        wm2 wm2Var = new wm2();
        zzk = wm2Var;
        ej2.A(wm2.class, wm2Var);
    }

    private wm2() {
        ci2 ci2Var = ci2.f5319e;
        this.zzg = ci2Var;
        this.zzh = ci2Var;
    }

    public static tm2 D() {
        return zzk.w();
    }

    static /* synthetic */ void F(wm2 wm2Var, sm2 sm2Var) {
        sm2Var.getClass();
        nj2<sm2> nj2Var = wm2Var.zzf;
        if (!nj2Var.zza()) {
            wm2Var.zzf = ej2.q(nj2Var);
        }
        wm2Var.zzf.add(sm2Var);
    }

    @Override // com.google.android.gms.internal.ads.ej2
    protected final Object C(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return Byte.valueOf(this.zzj);
        }
        if (i3 == 2) {
            return ej2.B(zzk, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003", new Object[]{"zzb", "zze", "zzf", sm2.class, "zzg", "zzh", "zzi"});
        }
        if (i3 == 3) {
            return new wm2();
        }
        km2 km2Var = null;
        if (i3 == 4) {
            return new tm2(km2Var);
        }
        if (i3 == 5) {
            return zzk;
        }
        this.zzj = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}