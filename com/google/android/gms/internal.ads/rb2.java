package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class rb2 extends ej2<rb2, pb2> implements mk2 {
    private static final rb2 zzf;
    private int zzb;
    private int zze;

    static {
        rb2 rb2Var = new rb2();
        zzf = rb2Var;
        ej2.A(rb2.class, rb2Var);
    }

    private rb2() {
    }

    public static rb2 E(ci2 ci2Var, qi2 qi2Var) {
        return (rb2) ej2.t(zzf, ci2Var, qi2Var);
    }

    @Override // com.google.android.gms.internal.ads.ej2
    protected final Object C(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return ej2.B(zzf, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zze", "zzb"});
        }
        if (i3 == 3) {
            return new rb2();
        }
        ob2 ob2Var = null;
        if (i3 == 4) {
            return new pb2(ob2Var);
        }
        if (i3 != 5) {
            return null;
        }
        return zzf;
    }

    public final int D() {
        return this.zzb;
    }
}