package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class va2 extends ej2<va2, ua2> implements mk2 {
    private static final va2 zze;
    private int zzb;

    static {
        va2 va2Var = new va2();
        zze = va2Var;
        ej2.A(va2.class, va2Var);
    }

    private va2() {
    }

    public static va2 E() {
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
            return new va2();
        }
        ta2 ta2Var = null;
        if (i3 == 4) {
            return new ua2(ta2Var);
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