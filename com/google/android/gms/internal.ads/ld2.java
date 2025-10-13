package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class ld2 extends ej2<ld2, kd2> implements mk2 {
    private static final ld2 zzf;
    private int zzb;
    private int zze;

    static {
        ld2 ld2Var = new ld2();
        zzf = ld2Var;
        ej2.A(ld2.class, ld2Var);
    }

    private ld2() {
    }

    public static ld2 F() {
        return zzf;
    }

    @Override // com.google.android.gms.internal.ads.ej2
    protected final Object C(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return ej2.B(zzf, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"zzb", "zze"});
        }
        if (i3 == 3) {
            return new ld2();
        }
        jd2 jd2Var = null;
        if (i3 == 4) {
            return new kd2(jd2Var);
        }
        if (i3 != 5) {
            return null;
        }
        return zzf;
    }

    public final cd2 D() {
        cd2 cd2VarA = cd2.a(this.zzb);
        return cd2VarA == null ? cd2.UNRECOGNIZED : cd2VarA;
    }

    public final int E() {
        return this.zze;
    }
}