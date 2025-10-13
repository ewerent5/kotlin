package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class on2 extends ej2<on2, nn2> implements mk2 {
    private static final on2 zzo;
    private int zzb;
    private int zze;
    private wm2 zzg;
    private bn2 zzh;
    private int zzi;
    private int zzl;
    private byte zzn = 2;
    private String zzf = "";
    private jj2 zzj = ej2.m();
    private String zzk = "";
    private nj2<String> zzm = ej2.p();

    static {
        on2 on2Var = new on2();
        zzo = on2Var;
        ej2.A(on2.class, on2Var);
    }

    private on2() {
    }

    public static nn2 F() {
        return zzo.w();
    }

    static /* synthetic */ void H(on2 on2Var, int i2) {
        on2Var.zzb |= 1;
        on2Var.zze = i2;
    }

    static /* synthetic */ void I(on2 on2Var, String str) {
        str.getClass();
        on2Var.zzb |= 2;
        on2Var.zzf = str;
    }

    static /* synthetic */ void J(on2 on2Var, wm2 wm2Var) {
        wm2Var.getClass();
        on2Var.zzg = wm2Var;
        on2Var.zzb |= 4;
    }

    static /* synthetic */ void L(on2 on2Var, mn2 mn2Var) {
        on2Var.zzl = mn2Var.zza();
        on2Var.zzb |= 64;
    }

    static /* synthetic */ void M(on2 on2Var, String str) {
        str.getClass();
        nj2<String> nj2Var = on2Var.zzm;
        if (!nj2Var.zza()) {
            on2Var.zzm = ej2.q(nj2Var);
        }
        on2Var.zzm.add(str);
    }

    @Override // com.google.android.gms.internal.ads.ej2
    protected final Object C(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return Byte.valueOf(this.zzn);
        }
        if (i3 == 2) {
            return ej2.B(zzo, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0002\u0003\u0001ᔄ\u0000\u0002ဈ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005င\u0004\u0006\u0016\u0007ဈ\u0005\bဌ\u0006\t\u001a", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", mn2.b(), "zzm"});
        }
        if (i3 == 3) {
            return new on2();
        }
        if (i3 == 4) {
            return new nn2(null);
        }
        if (i3 == 5) {
            return zzo;
        }
        this.zzn = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }

    public final String D() {
        return this.zzf;
    }

    public final int E() {
        return this.zzm.size();
    }
}