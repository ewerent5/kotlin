package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class xb2 extends ej2<xb2, wb2> implements mk2 {
    private static final xb2 zze;
    private int zzb;

    static {
        xb2 xb2Var = new xb2();
        zze = xb2Var;
        ej2.A(xb2.class, xb2Var);
    }

    private xb2() {
    }

    public static xb2 E(ci2 ci2Var, qi2 qi2Var) {
        return (xb2) ej2.t(zze, ci2Var, qi2Var);
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
            return new xb2();
        }
        vb2 vb2Var = null;
        if (i3 == 4) {
            return new wb2(vb2Var);
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