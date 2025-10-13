package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class m83 extends ej2<m83, i83> implements mk2 {
    private static final m83 zzf;
    private int zzb;
    private int zze;

    static {
        m83 m83Var = new m83();
        zzf = m83Var;
        ej2.A(m83.class, m83Var);
    }

    private m83() {
    }

    @Override // com.google.android.gms.internal.ads.ej2
    protected final Object C(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return ej2.B(zzf, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"zzb", "zze", l83.b()});
        }
        if (i3 == 3) {
            return new m83();
        }
        d53 d53Var = null;
        if (i3 == 4) {
            return new i83(d53Var);
        }
        if (i3 != 5) {
            return null;
        }
        return zzf;
    }
}