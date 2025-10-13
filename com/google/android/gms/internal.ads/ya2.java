package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class ya2 extends ej2<ya2, xa2> implements mk2 {
    private static final ya2 zzg;
    private int zzb;
    private eb2 zze;
    private ci2 zzf = ci2.f5319e;

    static {
        ya2 ya2Var = new ya2();
        zzg = ya2Var;
        ej2.A(ya2.class, ya2Var);
    }

    private ya2() {
    }

    public static ya2 G(ci2 ci2Var, qi2 qi2Var) {
        return (ya2) ej2.t(zzg, ci2Var, qi2Var);
    }

    public static xa2 H() {
        return zzg.w();
    }

    static /* synthetic */ void L(ya2 ya2Var, eb2 eb2Var) {
        eb2Var.getClass();
        ya2Var.zze = eb2Var;
    }

    @Override // com.google.android.gms.internal.ads.ej2
    protected final Object C(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return ej2.B(zzg, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i3 == 3) {
            return new ya2();
        }
        wa2 wa2Var = null;
        if (i3 == 4) {
            return new xa2(wa2Var);
        }
        if (i3 != 5) {
            return null;
        }
        return zzg;
    }

    public final int D() {
        return this.zzb;
    }

    public final eb2 E() {
        eb2 eb2Var = this.zze;
        return eb2Var == null ? eb2.E() : eb2Var;
    }

    public final ci2 F() {
        return this.zzf;
    }
}