package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class o41 extends ej2<o41, n31> implements mk2 {
    private static final o41 zzg;
    private int zzb;
    private int zze;
    private long zzf = -1;

    static {
        o41 o41Var = new o41();
        zzg = o41Var;
        ej2.A(o41.class, o41Var);
    }

    private o41() {
    }

    @Override // com.google.android.gms.internal.ads.ej2
    protected final Object C(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return ej2.B(zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001", new Object[]{"zzb", "zze", k01.b(), "zzf"});
        }
        if (i3 == 3) {
            return new o41();
        }
        dt0 dt0Var = null;
        if (i3 == 4) {
            return new n31(dt0Var);
        }
        if (i3 != 5) {
            return null;
        }
        return zzg;
    }
}