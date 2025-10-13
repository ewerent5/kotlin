package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class m63 extends ej2<m63, i63> implements mk2 {
    private static final m63 zzi;
    private int zzb;
    private int zze;
    private d83 zzf;
    private String zzg = "";
    private String zzh = "";

    static {
        m63 m63Var = new m63();
        zzi = m63Var;
        ej2.A(m63.class, m63Var);
    }

    private m63() {
    }

    @Override // com.google.android.gms.internal.ads.ej2
    protected final Object C(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return ej2.B(zzi, "\u0001\u0004\u0000\u0001\u0005\b\u0004\u0000\u0000\u0000\u0005ဌ\u0000\u0006ဉ\u0001\u0007ဈ\u0002\bဈ\u0003", new Object[]{"zzb", "zze", l63.b(), "zzf", "zzg", "zzh"});
        }
        if (i3 == 3) {
            return new m63();
        }
        d53 d53Var = null;
        if (i3 == 4) {
            return new i63(d53Var);
        }
        if (i3 != 5) {
            return null;
        }
        return zzi;
    }
}