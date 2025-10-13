package com.google.android.gms.internal.ads;

import ch.qos.logback.core.CoreConstants;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class o83 extends ej2<o83, n83> implements mk2 {
    private static final o83 zzi;
    private int zzb;
    private d83 zze;
    private int zzf = CoreConstants.MILLIS_IN_ONE_SECOND;
    private m83 zzg;
    private b83 zzh;

    static {
        o83 o83Var = new o83();
        zzi = o83Var;
        ej2.A(o83.class, o83Var);
    }

    private o83() {
    }

    @Override // com.google.android.gms.internal.ads.ej2
    protected final Object C(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return ej2.B(zzi, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"zzb", "zze", "zzf", p63.b(), "zzg", "zzh"});
        }
        if (i3 == 3) {
            return new o83();
        }
        if (i3 == 4) {
            return new n83(null);
        }
        if (i3 != 5) {
            return null;
        }
        return zzi;
    }
}