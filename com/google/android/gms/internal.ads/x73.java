package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class x73 extends ej2<x73, w73> implements mk2 {
    private static final x73 zzg;
    private int zzb;
    private int zze;
    private int zzf;

    static {
        x73 x73Var = new x73();
        zzg = x73Var;
        ej2.A(x73.class, x73Var);
    }

    private x73() {
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
            return new x73();
        }
        d53 d53Var = null;
        if (i3 == 4) {
            return new w73(d53Var);
        }
        if (i3 != 5) {
            return null;
        }
        return zzg;
    }
}