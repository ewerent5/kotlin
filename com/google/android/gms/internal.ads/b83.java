package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class b83 extends ej2<b83, a83> implements mk2 {
    private static final b83 zzg;
    private int zzb;
    private int zze;
    private int zzf;

    static {
        b83 b83Var = new b83();
        zzg = b83Var;
        ej2.A(b83.class, b83Var);
    }

    private b83() {
    }

    @Override // com.google.android.gms.internal.ads.ej2
    protected final Object C(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return ej2.B(zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i3 == 3) {
            return new b83();
        }
        d53 d53Var = null;
        if (i3 == 4) {
            return new a83(d53Var);
        }
        if (i3 != 5) {
            return null;
        }
        return zzg;
    }
}