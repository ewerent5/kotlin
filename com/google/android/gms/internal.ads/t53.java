package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class t53 extends ej2<t53, s53> implements mk2 {
    private static final t53 zzh;
    private int zzb;
    private boolean zze;
    private boolean zzf;
    private int zzg;

    static {
        t53 t53Var = new t53();
        zzh = t53Var;
        ej2.A(t53.class, t53Var);
    }

    private t53() {
    }

    public static s53 D() {
        return zzh.w();
    }

    static /* synthetic */ void F(t53 t53Var, boolean z) {
        t53Var.zzb |= 1;
        t53Var.zze = z;
    }

    static /* synthetic */ void G(t53 t53Var, boolean z) {
        t53Var.zzb |= 2;
        t53Var.zzf = z;
    }

    static /* synthetic */ void H(t53 t53Var, int i2) {
        t53Var.zzb |= 4;
        t53Var.zzg = i2;
    }

    @Override // com.google.android.gms.internal.ads.ej2
    protected final Object C(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return ej2.B(zzh, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဋ\u0002", new Object[]{"zzb", "zze", "zzf", "zzg"});
        }
        if (i3 == 3) {
            return new t53();
        }
        d53 d53Var = null;
        if (i3 == 4) {
            return new s53(d53Var);
        }
        if (i3 != 5) {
            return null;
        }
        return zzh;
    }
}