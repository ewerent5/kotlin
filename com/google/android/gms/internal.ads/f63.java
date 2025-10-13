package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class f63 extends ej2<f63, e63> implements mk2 {
    private static final f63 zzk;
    private int zzb;
    private int zze;
    private b83 zzf;
    private b83 zzg;
    private b83 zzh;
    private nj2<b83> zzi = ej2.p();
    private int zzj;

    static {
        f63 f63Var = new f63();
        zzk = f63Var;
        ej2.A(f63.class, f63Var);
    }

    private f63() {
    }

    @Override // com.google.android.gms.internal.ads.ej2
    protected final Object C(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return ej2.B(zzk, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005\u001b\u0006င\u0004", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", b83.class, "zzj"});
        }
        if (i3 == 3) {
            return new f63();
        }
        d53 d53Var = null;
        if (i3 == 4) {
            return new e63(d53Var);
        }
        if (i3 != 5) {
            return null;
        }
        return zzk;
    }
}