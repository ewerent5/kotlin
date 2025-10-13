package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class v73 extends ej2<v73, u73> implements mk2 {
    private static final v73 zzg;
    private int zzb;
    private int zze;
    private int zzf;

    static {
        v73 v73Var = new v73();
        zzg = v73Var;
        ej2.A(v73.class, v73Var);
    }

    private v73() {
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
            return new v73();
        }
        d53 d53Var = null;
        if (i3 == 4) {
            return new u73(d53Var);
        }
        if (i3 != 5) {
            return null;
        }
        return zzg;
    }
}