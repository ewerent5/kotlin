package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class nd0 extends ej2<nd0, mc0> implements mk2 {
    private static final nd0 zzg;
    private int zzb;
    private String zze = "";
    private String zzf = "";

    static {
        nd0 nd0Var = new nd0();
        zzg = nd0Var;
        ej2.A(nd0.class, nd0Var);
    }

    private nd0() {
    }

    @Override // com.google.android.gms.internal.ads.ej2
    protected final Object C(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return ej2.B(zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i3 == 3) {
            return new nd0();
        }
        ka0 ka0Var = null;
        if (i3 == 4) {
            return new mc0(ka0Var);
        }
        if (i3 != 5) {
            return null;
        }
        return zzg;
    }
}