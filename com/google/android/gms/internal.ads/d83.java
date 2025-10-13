package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class d83 extends ej2<d83, c83> implements mk2 {
    private static final d83 zzh;
    private int zzb;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        d83 d83Var = new d83();
        zzh = d83Var;
        ej2.A(d83.class, d83Var);
    }

    private d83() {
    }

    public static c83 D() {
        return zzh.w();
    }

    static /* synthetic */ void F(d83 d83Var, int i2) {
        d83Var.zzb |= 1;
        d83Var.zze = i2;
    }

    static /* synthetic */ void G(d83 d83Var, int i2) {
        d83Var.zzb |= 2;
        d83Var.zzf = i2;
    }

    static /* synthetic */ void H(d83 d83Var, int i2) {
        d83Var.zzb |= 4;
        d83Var.zzg = i2;
    }

    @Override // com.google.android.gms.internal.ads.ej2
    protected final Object C(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return ej2.B(zzh, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"zzb", "zze", "zzf", "zzg"});
        }
        if (i3 == 3) {
            return new d83();
        }
        d53 d53Var = null;
        if (i3 == 4) {
            return new c83(d53Var);
        }
        if (i3 != 5) {
            return null;
        }
        return zzh;
    }
}