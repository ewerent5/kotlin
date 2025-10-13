package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class z53 extends ej2<z53, y53> implements mk2 {
    private static final z53 zzg;
    private int zzb;
    private int zze;
    private x73 zzf;

    static {
        z53 z53Var = new z53();
        zzg = z53Var;
        ej2.A(z53.class, z53Var);
    }

    private z53() {
    }

    @Override // com.google.android.gms.internal.ads.ej2
    protected final Object C(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return ej2.B(zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"zzb", "zze", x53.b(), "zzf"});
        }
        if (i3 == 3) {
            return new z53();
        }
        d53 d53Var = null;
        if (i3 == 4) {
            return new y53(d53Var);
        }
        if (i3 != 5) {
            return null;
        }
        return zzg;
    }
}