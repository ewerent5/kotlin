package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class y63 extends ej2<y63, x63> implements mk2 {
    private static final y63 zzi;
    private int zzb;
    private u63 zze;
    private nj2<z73> zzf = ej2.p();
    private int zzg;
    private b83 zzh;

    static {
        y63 y63Var = new y63();
        zzi = y63Var;
        ej2.A(y63.class, y63Var);
    }

    private y63() {
    }

    @Override // com.google.android.gms.internal.ads.ej2
    protected final Object C(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return ej2.B(zzi, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003ဌ\u0001\u0004ဉ\u0002", new Object[]{"zzb", "zze", "zzf", z73.class, "zzg", p63.b(), "zzh"});
        }
        if (i3 == 3) {
            return new y63();
        }
        if (i3 == 4) {
            return new x63(null);
        }
        if (i3 != 5) {
            return null;
        }
        return zzi;
    }
}