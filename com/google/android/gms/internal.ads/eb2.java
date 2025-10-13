package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class eb2 extends ej2<eb2, db2> implements mk2 {
    private static final eb2 zze;
    private int zzb;

    static {
        eb2 eb2Var = new eb2();
        zze = eb2Var;
        ej2.A(eb2.class, eb2Var);
    }

    private eb2() {
    }

    public static eb2 E() {
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
            return new eb2();
        }
        cb2 cb2Var = null;
        if (i3 == 4) {
            return new db2(cb2Var);
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