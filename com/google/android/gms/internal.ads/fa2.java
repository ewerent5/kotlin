package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class fa2 extends ej2<fa2, ea2> implements mk2 {
    private static final fa2 zze;
    private int zzb;

    static {
        fa2 fa2Var = new fa2();
        zze = fa2Var;
        ej2.A(fa2.class, fa2Var);
    }

    private fa2() {
    }

    public static fa2 E() {
        return zze;
    }

    @Override // com.google.android.gms.internal.ads.ej2
    protected final Object C(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return ej2.B(zze, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzb"});
        }
        if (i3 == 3) {
            return new fa2();
        }
        da2 da2Var = null;
        if (i3 == 4) {
            return new ea2(da2Var);
        }
        if (i3 != 5) {
            return null;
        }
        return zze;
    }

    public final int D() {
        return this.zzb;
    }
}