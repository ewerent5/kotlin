package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class ee2 extends ej2<ee2, be2> implements mk2 {
    private static final ee2 zzf;
    private int zzb;
    private nj2<de2> zze = ej2.p();

    static {
        ee2 ee2Var = new ee2();
        zzf = ee2Var;
        ej2.A(ee2.class, ee2Var);
    }

    private ee2() {
    }

    public static ee2 G(byte[] bArr, qi2 qi2Var) {
        return (ee2) ej2.v(zzf, bArr, qi2Var);
    }

    @Override // com.google.android.gms.internal.ads.ej2
    protected final Object C(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return ej2.B(zzf, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zzb", "zze", de2.class});
        }
        if (i3 == 3) {
            return new ee2();
        }
        ae2 ae2Var = null;
        if (i3 == 4) {
            return new be2(ae2Var);
        }
        if (i3 != 5) {
            return null;
        }
        return zzf;
    }

    public final int D() {
        return this.zzb;
    }

    public final List<de2> E() {
        return this.zze;
    }

    public final int F() {
        return this.zze.size();
    }
}