package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class u63 extends ej2<u63, t63> implements mk2 {
    private static final u63 zzi;
    private int zzb;
    private int zzf;
    private b83 zzh;
    private String zze = "";
    private jj2 zzg = ej2.m();

    static {
        u63 u63Var = new u63();
        zzi = u63Var;
        ej2.A(u63.class, u63Var);
    }

    private u63() {
    }

    @Override // com.google.android.gms.internal.ads.ej2
    protected final Object C(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return ej2.B(zzi, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003\u0016\u0004ဉ\u0002", new Object[]{"zzb", "zze", "zzf", p63.b(), "zzg", "zzh"});
        }
        if (i3 == 3) {
            return new u63();
        }
        d53 d53Var = null;
        if (i3 == 4) {
            return new t63(d53Var);
        }
        if (i3 != 5) {
            return null;
        }
        return zzi;
    }
}