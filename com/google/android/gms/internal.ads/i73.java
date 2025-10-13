package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class i73 extends ej2<i73, h73> implements mk2 {
    private static final i73 zzg;
    private int zzb;
    private int zze;
    private b83 zzf;

    static {
        i73 i73Var = new i73();
        zzg = i73Var;
        ej2.A(i73.class, i73Var);
    }

    private i73() {
    }

    @Override // com.google.android.gms.internal.ads.ej2
    protected final Object C(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return ej2.B(zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"zzb", "zze", p63.b(), "zzf"});
        }
        if (i3 == 3) {
            return new i73();
        }
        d53 d53Var = null;
        if (i3 == 4) {
            return new h73(d53Var);
        }
        if (i3 != 5) {
            return null;
        }
        return zzg;
    }
}