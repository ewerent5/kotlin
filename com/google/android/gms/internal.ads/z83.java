package com.google.android.gms.internal.ads;

import ch.qos.logback.core.CoreConstants;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class z83 extends ej2<z83, y83> implements mk2 {
    private static final z83 zzg;
    private int zzb;
    private int zze = CoreConstants.MILLIS_IN_ONE_SECOND;
    private m83 zzf;

    static {
        z83 z83Var = new z83();
        zzg = z83Var;
        ej2.A(z83.class, z83Var);
    }

    private z83() {
    }

    @Override // com.google.android.gms.internal.ads.ej2
    protected final Object C(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return ej2.B(zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"zzb", "zze", p63.b(), "zzf"});
        }
        if (i3 == 3) {
            return new z83();
        }
        d53 d53Var = null;
        if (i3 == 4) {
            return new y83(d53Var);
        }
        if (i3 != 5) {
            return null;
        }
        return zzg;
    }
}