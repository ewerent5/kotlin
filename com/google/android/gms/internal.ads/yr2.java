package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class yr2 extends ej2<yr2, xr2> implements mk2 {
    private static final yr2 zzj;
    private int zzb;
    private String zze = "";
    private String zzf = "";
    private long zzg;
    private long zzh;
    private long zzi;

    static {
        yr2 yr2Var = new yr2();
        zzj = yr2Var;
        ej2.A(yr2.class, yr2Var);
    }

    private yr2() {
    }

    public static yr2 I(ci2 ci2Var) {
        return (yr2) ej2.s(zzj, ci2Var);
    }

    public static yr2 J(ci2 ci2Var, qi2 qi2Var) {
        return (yr2) ej2.t(zzj, ci2Var, qi2Var);
    }

    public static xr2 L() {
        return zzj.w();
    }

    public static yr2 M() {
        return zzj;
    }

    static /* synthetic */ void O(yr2 yr2Var, String str) {
        str.getClass();
        yr2Var.zzb |= 1;
        yr2Var.zze = str;
    }

    static /* synthetic */ void P(yr2 yr2Var, String str) {
        str.getClass();
        yr2Var.zzb |= 2;
        yr2Var.zzf = str;
    }

    static /* synthetic */ void Q(yr2 yr2Var, long j2) {
        yr2Var.zzb |= 4;
        yr2Var.zzg = j2;
    }

    static /* synthetic */ void R(yr2 yr2Var, long j2) {
        yr2Var.zzb |= 8;
        yr2Var.zzh = j2;
    }

    static /* synthetic */ void S(yr2 yr2Var, long j2) {
        yr2Var.zzb |= 16;
        yr2Var.zzi = j2;
    }

    @Override // com.google.android.gms.internal.ads.ej2
    protected final Object C(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return ej2.B(zzj, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဃ\u0002\u0004ဃ\u0003\u0005ဃ\u0004", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i3 == 3) {
            return new yr2();
        }
        wr2 wr2Var = null;
        if (i3 == 4) {
            return new xr2(wr2Var);
        }
        if (i3 != 5) {
            return null;
        }
        return zzj;
    }

    public final String D() {
        return this.zze;
    }

    public final String E() {
        return this.zzf;
    }

    public final long F() {
        return this.zzg;
    }

    public final long G() {
        return this.zzh;
    }

    public final long H() {
        return this.zzi;
    }
}