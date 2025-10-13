package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class lr1 extends ej2<lr1, kq1> implements mk2 {
    private static final lr1 zzf;
    private int zzb;
    private String zze = "";

    static {
        lr1 lr1Var = new lr1();
        zzf = lr1Var;
        ej2.A(lr1.class, lr1Var);
    }

    private lr1() {
    }

    @Override // com.google.android.gms.internal.ads.ej2
    protected final Object C(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return ej2.B(zzf, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzb", "zze"});
        }
        if (i3 == 3) {
            return new lr1();
        }
        dt0 dt0Var = null;
        if (i3 == 4) {
            return new kq1(dt0Var);
        }
        if (i3 != 5) {
            return null;
        }
        return zzf;
    }
}