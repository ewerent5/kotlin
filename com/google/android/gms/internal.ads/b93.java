package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class b93 extends ej2<b93, a93> implements mk2 {
    private static final b93 zzg;
    private int zzb;
    private boolean zze;
    private int zzf;

    static {
        b93 b93Var = new b93();
        zzg = b93Var;
        ej2.A(b93.class, b93Var);
    }

    private b93() {
    }

    public static a93 E() {
        return zzg.w();
    }

    static /* synthetic */ void G(b93 b93Var, boolean z) {
        b93Var.zzb |= 1;
        b93Var.zze = z;
    }

    static /* synthetic */ void H(b93 b93Var, int i2) {
        b93Var.zzb |= 2;
        b93Var.zzf = i2;
    }

    @Override // com.google.android.gms.internal.ads.ej2
    protected final Object C(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return ej2.B(zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i3 == 3) {
            return new b93();
        }
        d53 d53Var = null;
        if (i3 == 4) {
            return new a93(d53Var);
        }
        if (i3 != 5) {
            return null;
        }
        return zzg;
    }

    public final boolean D() {
        return this.zze;
    }
}