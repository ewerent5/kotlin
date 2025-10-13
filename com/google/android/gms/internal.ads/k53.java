package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class k53 extends ej2<k53, j53> implements mk2 {
    private static final k53 zzh;
    private int zzb;
    private int zze;
    private r53 zzf;
    private t53 zzg;

    static {
        k53 k53Var = new k53();
        zzh = k53Var;
        ej2.A(k53.class, k53Var);
    }

    private k53() {
    }

    public static j53 D() {
        return zzh.w();
    }

    static /* synthetic */ void F(k53 k53Var, o53 o53Var) {
        k53Var.zze = o53Var.zza();
        k53Var.zzb |= 1;
    }

    static /* synthetic */ void G(k53 k53Var, r53 r53Var) {
        r53Var.getClass();
        k53Var.zzf = r53Var;
        k53Var.zzb |= 2;
    }

    static /* synthetic */ void H(k53 k53Var, t53 t53Var) {
        t53Var.getClass();
        k53Var.zzg = t53Var;
        k53Var.zzb |= 4;
    }

    @Override // com.google.android.gms.internal.ads.ej2
    protected final Object C(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return ej2.B(zzh, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzb", "zze", o53.b(), "zzf", "zzg"});
        }
        if (i3 == 3) {
            return new k53();
        }
        d53 d53Var = null;
        if (i3 == 4) {
            return new j53(d53Var);
        }
        if (i3 != 5) {
            return null;
        }
        return zzh;
    }
}