package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class la2 extends ej2<la2, ka2> implements mk2 {
    private static final la2 zzf;
    private sa2 zzb;
    private id2 zze;

    static {
        la2 la2Var = new la2();
        zzf = la2Var;
        ej2.A(la2.class, la2Var);
    }

    private la2() {
    }

    public static la2 F(ci2 ci2Var, qi2 qi2Var) {
        return (la2) ej2.t(zzf, ci2Var, qi2Var);
    }

    @Override // com.google.android.gms.internal.ads.ej2
    protected final Object C(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return ej2.B(zzf, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"zzb", "zze"});
        }
        if (i3 == 3) {
            return new la2();
        }
        if (i3 == 4) {
            return new ka2(null);
        }
        if (i3 != 5) {
            return null;
        }
        return zzf;
    }

    public final sa2 D() {
        sa2 sa2Var = this.zzb;
        return sa2Var == null ? sa2.G() : sa2Var;
    }

    public final id2 E() {
        id2 id2Var = this.zze;
        return id2Var == null ? id2.G() : id2Var;
    }
}