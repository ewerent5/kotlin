package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class hb2 extends ej2<hb2, gb2> implements mk2 {
    private static final hb2 zzf;
    private int zzb;
    private ci2 zze = ci2.f5319e;

    static {
        hb2 hb2Var = new hb2();
        zzf = hb2Var;
        ej2.A(hb2.class, hb2Var);
    }

    private hb2() {
    }

    public static hb2 F(ci2 ci2Var, qi2 qi2Var) {
        return (hb2) ej2.t(zzf, ci2Var, qi2Var);
    }

    public static gb2 G() {
        return zzf.w();
    }

    @Override // com.google.android.gms.internal.ads.ej2
    protected final Object C(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return ej2.B(zzf, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zzb", "zze"});
        }
        if (i3 == 3) {
            return new hb2();
        }
        fb2 fb2Var = null;
        if (i3 == 4) {
            return new gb2(fb2Var);
        }
        if (i3 != 5) {
            return null;
        }
        return zzf;
    }

    public final int D() {
        return this.zzb;
    }

    public final ci2 E() {
        return this.zze;
    }
}