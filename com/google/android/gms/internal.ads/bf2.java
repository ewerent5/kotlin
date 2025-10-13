package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
@Deprecated
/* loaded from: classes.dex */
public final class bf2 extends ej2<bf2, af2> implements mk2 {
    private static final bf2 zzf;
    private String zzb = "";
    private nj2<zd2> zze = ej2.p();

    static {
        bf2 bf2Var = new bf2();
        zzf = bf2Var;
        ej2.A(bf2.class, bf2Var);
    }

    private bf2() {
    }

    public static bf2 E() {
        return zzf;
    }

    @Override // com.google.android.gms.internal.ads.ej2
    protected final Object C(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return ej2.B(zzf, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"zzb", "zze", zd2.class});
        }
        if (i3 == 3) {
            return new bf2();
        }
        ze2 ze2Var = null;
        if (i3 == 4) {
            return new af2(ze2Var);
        }
        if (i3 != 5) {
            return null;
        }
        return zzf;
    }

    public final List<zd2> D() {
        return this.zze;
    }
}