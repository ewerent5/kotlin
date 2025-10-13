package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class z73 extends ej2<z73, y73> implements mk2 {
    private static final z73 zzh;
    private int zzb;
    private String zze = "";
    private int zzf;
    private b83 zzg;

    static {
        z73 z73Var = new z73();
        zzh = z73Var;
        ej2.A(z73.class, z73Var);
    }

    private z73() {
    }

    @Override // com.google.android.gms.internal.ads.ej2
    protected final Object C(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return ej2.B(zzh, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဉ\u0002", new Object[]{"zzb", "zze", "zzf", p63.b(), "zzg"});
        }
        if (i3 == 3) {
            return new z73();
        }
        d53 d53Var = null;
        if (i3 == 4) {
            return new y73(d53Var);
        }
        if (i3 != 5) {
            return null;
        }
        return zzh;
    }
}