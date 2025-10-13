package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class wd2 extends ej2<wd2, vd2> implements mk2 {
    private static final wd2 zzg;
    private String zzb = "";
    private ci2 zze = ci2.f5319e;
    private int zzf;

    static {
        wd2 wd2Var = new wd2();
        zzg = wd2Var;
        ej2.A(wd2.class, wd2Var);
    }

    private wd2() {
    }

    public static wd2 F() {
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.ej2
    protected final Object C(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return ej2.B(zzg, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i3 == 3) {
            return new wd2();
        }
        ud2 ud2Var = null;
        if (i3 == 4) {
            return new vd2(ud2Var);
        }
        if (i3 != 5) {
            return null;
        }
        return zzg;
    }

    public final String D() {
        return this.zzb;
    }

    public final ci2 E() {
        return this.zze;
    }
}