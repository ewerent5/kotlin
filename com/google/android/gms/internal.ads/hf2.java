package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class hf2 extends ej2<hf2, gf2> implements mk2 {
    private static final hf2 zzb;

    static {
        hf2 hf2Var = new hf2();
        zzb = hf2Var;
        ej2.A(hf2.class, hf2Var);
    }

    private hf2() {
    }

    public static hf2 D(ci2 ci2Var, qi2 qi2Var) {
        return (hf2) ej2.t(zzb, ci2Var, qi2Var);
    }

    @Override // com.google.android.gms.internal.ads.ej2
    protected final Object C(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        ff2 ff2Var = null;
        if (i3 == 2) {
            return ej2.B(zzb, "\u0000\u0000", null);
        }
        if (i3 == 3) {
            return new hf2();
        }
        if (i3 == 4) {
            return new gf2(ff2Var);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}