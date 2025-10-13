package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class g73 extends ej2<g73, z63> implements mk2 {
    private static final g73 zzg;
    private int zzb;
    private int zze;
    private int zzf;

    static {
        g73 g73Var = new g73();
        zzg = g73Var;
        ej2.A(g73.class, g73Var);
    }

    private g73() {
    }

    public static z63 H() {
        return zzg.w();
    }

    public static g73 I() {
        return zzg;
    }

    static /* synthetic */ void L(g73 g73Var, f73 f73Var) {
        g73Var.zze = f73Var.zza();
        g73Var.zzb |= 1;
    }

    static /* synthetic */ void M(g73 g73Var, c73 c73Var) {
        g73Var.zzf = c73Var.zza();
        g73Var.zzb |= 2;
    }

    @Override // com.google.android.gms.internal.ads.ej2
    protected final Object C(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return ej2.B(zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"zzb", "zze", f73.b(), "zzf", c73.b()});
        }
        if (i3 == 3) {
            return new g73();
        }
        d53 d53Var = null;
        if (i3 == 4) {
            return new z63(d53Var);
        }
        if (i3 != 5) {
            return null;
        }
        return zzg;
    }

    public final boolean D() {
        return (this.zzb & 1) != 0;
    }

    public final f73 E() {
        f73 f73VarA = f73.a(this.zze);
        return f73VarA == null ? f73.NETWORKTYPE_UNSPECIFIED : f73VarA;
    }

    public final boolean F() {
        return (this.zzb & 2) != 0;
    }

    public final c73 G() {
        c73 c73VarA = c73.a(this.zzf);
        return c73VarA == null ? c73.CELLULAR_NETWORK_TYPE_UNSPECIFIED : c73VarA;
    }
}