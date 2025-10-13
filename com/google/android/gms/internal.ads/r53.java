package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class r53 extends ej2<r53, p53> implements mk2 {
    private static final r53 zzg;
    private int zzb;
    private boolean zze;
    private int zzf;

    static {
        r53 r53Var = new r53();
        zzg = r53Var;
        ej2.A(r53.class, r53Var);
    }

    private r53() {
    }

    public static p53 D() {
        return zzg.w();
    }

    static /* synthetic */ void F(r53 r53Var, boolean z) {
        r53Var.zzb |= 1;
        r53Var.zze = z;
    }

    static /* synthetic */ void G(r53 r53Var, int i2) {
        r53Var.zzb |= 2;
        r53Var.zzf = i2;
    }

    @Override // com.google.android.gms.internal.ads.ej2
    protected final Object C(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return ej2.B(zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဋ\u0001", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i3 == 3) {
            return new r53();
        }
        d53 d53Var = null;
        if (i3 == 4) {
            return new p53(d53Var);
        }
        if (i3 != 5) {
            return null;
        }
        return zzg;
    }
}