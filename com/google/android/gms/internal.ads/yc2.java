package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class yc2 extends ej2<yc2, xc2> implements mk2 {
    private static final yc2 zzg;
    private int zzb;
    private int zze;
    private ci2 zzf = ci2.f5319e;

    static {
        yc2 yc2Var = new yc2();
        zzg = yc2Var;
        ej2.A(yc2.class, yc2Var);
    }

    private yc2() {
    }

    public static yc2 G() {
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.ej2
    protected final Object C(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return ej2.B(zzg, "\u0000\u0003\u0000\u0000\u0001\u000b\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u000b\n", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i3 == 3) {
            return new yc2();
        }
        wc2 wc2Var = null;
        if (i3 == 4) {
            return new xc2(wc2Var);
        }
        if (i3 != 5) {
            return null;
        }
        return zzg;
    }

    public final ad2 D() {
        ad2 ad2VarA = ad2.a(this.zzb);
        return ad2VarA == null ? ad2.UNRECOGNIZED : ad2VarA;
    }

    public final cd2 E() {
        cd2 cd2VarA = cd2.a(this.zze);
        return cd2VarA == null ? cd2.UNRECOGNIZED : cd2VarA;
    }

    public final ci2 F() {
        return this.zzf;
    }
}