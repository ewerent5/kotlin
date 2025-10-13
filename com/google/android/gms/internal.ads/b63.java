package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class b63 extends ej2<b63, a63> implements mk2 {
    private static final b63 zzh;
    private int zzb;
    private String zze = "";
    private nj2<z53> zzf = ej2.p();
    private int zzg;

    static {
        b63 b63Var = new b63();
        zzh = b63Var;
        ej2.A(b63.class, b63Var);
    }

    private b63() {
    }

    @Override // com.google.android.gms.internal.ads.ej2
    protected final Object C(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return ej2.B(zzh, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဌ\u0001", new Object[]{"zzb", "zze", "zzf", z53.class, "zzg", p63.b()});
        }
        if (i3 == 3) {
            return new b63();
        }
        d53 d53Var = null;
        if (i3 == 4) {
            return new a63(d53Var);
        }
        if (i3 != 5) {
            return null;
        }
        return zzh;
    }
}