package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class dc2 extends ej2<dc2, cc2> implements mk2 {
    private static final dc2 zzb;

    static {
        dc2 dc2Var = new dc2();
        zzb = dc2Var;
        ej2.A(dc2.class, dc2Var);
    }

    private dc2() {
    }

    public static dc2 D(ci2 ci2Var, qi2 qi2Var) {
        return (dc2) ej2.t(zzb, ci2Var, qi2Var);
    }

    @Override // com.google.android.gms.internal.ads.ej2
    protected final Object C(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        bc2 bc2Var = null;
        if (i3 == 2) {
            return ej2.B(zzb, "\u0000\u0000", null);
        }
        if (i3 == 3) {
            return new dc2();
        }
        if (i3 == 4) {
            return new cc2(bc2Var);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}