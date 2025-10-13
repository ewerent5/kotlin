package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class xm0 extends ej2<xm0, wl0> implements mk2 {
    private static final xm0 zzf;
    private int zzb;
    private int zze = 2;

    static {
        xm0 xm0Var = new xm0();
        zzf = xm0Var;
        ej2.A(xm0.class, xm0Var);
    }

    private xm0() {
    }

    @Override // com.google.android.gms.internal.ads.ej2
    protected final Object C(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return ej2.B(zzf, "\u0001\u0001\u0000\u0001\u001b\u001b\u0001\u0000\u0000\u0000\u001bဌ\u0000", new Object[]{"zzb", "zze", aq0.b()});
        }
        if (i3 == 3) {
            return new xm0();
        }
        ti0 ti0Var = null;
        if (i3 == 4) {
            return new wl0(ti0Var);
        }
        if (i3 != 5) {
            return null;
        }
        return zzf;
    }
}