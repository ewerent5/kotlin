package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class z92 extends ej2<z92, y92> implements mk2 {
    private static final z92 zzg;
    private int zzb;
    private ci2 zze = ci2.f5319e;
    private fa2 zzf;

    static {
        z92 z92Var = new z92();
        zzg = z92Var;
        ej2.A(z92.class, z92Var);
    }

    private z92() {
    }

    public static z92 G(ci2 ci2Var, qi2 qi2Var) {
        return (z92) ej2.t(zzg, ci2Var, qi2Var);
    }

    public static y92 H() {
        return zzg.w();
    }

    static /* synthetic */ void M(z92 z92Var, fa2 fa2Var) {
        fa2Var.getClass();
        z92Var.zzf = fa2Var;
    }

    @Override // com.google.android.gms.internal.ads.ej2
    protected final Object C(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return ej2.B(zzg, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003\t", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i3 == 3) {
            return new z92();
        }
        x92 x92Var = null;
        if (i3 == 4) {
            return new y92(x92Var);
        }
        if (i3 != 5) {
            return null;
        }
        return zzg;
    }

    public final int D() {
        return this.zzb;
    }

    public final ci2 E() {
        return this.zze;
    }

    public final fa2 F() {
        fa2 fa2Var = this.zzf;
        return fa2Var == null ? fa2.E() : fa2Var;
    }
}