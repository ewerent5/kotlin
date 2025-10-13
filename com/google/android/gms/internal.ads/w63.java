package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class w63 extends ej2<w63, v63> implements mk2 {
    private static final w63 zzg;
    private int zzb;
    private int zze;
    private jj2 zzf = ej2.m();

    static {
        w63 w63Var = new w63();
        zzg = w63Var;
        ej2.A(w63.class, w63Var);
    }

    private w63() {
    }

    @Override // com.google.android.gms.internal.ads.ej2
    protected final Object C(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return ej2.B(zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u0016", new Object[]{"zzb", "zze", p63.b(), "zzf"});
        }
        if (i3 == 3) {
            return new w63();
        }
        d53 d53Var = null;
        if (i3 == 4) {
            return new v63(d53Var);
        }
        if (i3 != 5) {
            return null;
        }
        return zzg;
    }
}