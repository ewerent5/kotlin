package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class u53 extends ej2<u53, l53> implements mk2 {
    private static final u53 zze;
    private nj2<k53> zzb = ej2.p();

    static {
        u53 u53Var = new u53();
        zze = u53Var;
        ej2.A(u53.class, u53Var);
    }

    private u53() {
    }

    public static l53 D() {
        return zze.w();
    }

    static /* synthetic */ void F(u53 u53Var, k53 k53Var) {
        k53Var.getClass();
        nj2<k53> nj2Var = u53Var.zzb;
        if (!nj2Var.zza()) {
            u53Var.zzb = ej2.q(nj2Var);
        }
        u53Var.zzb.add(k53Var);
    }

    @Override // com.google.android.gms.internal.ads.ej2
    protected final Object C(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return ej2.B(zze, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzb", k53.class});
        }
        if (i3 == 3) {
            return new u53();
        }
        d53 d53Var = null;
        if (i3 == 4) {
            return new l53(d53Var);
        }
        if (i3 != 5) {
            return null;
        }
        return zze;
    }
}