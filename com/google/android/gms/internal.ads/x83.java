package com.google.android.gms.internal.ads;

import ch.qos.logback.core.CoreConstants;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class x83 extends ej2<x83, w83> implements mk2 {
    private static final x83 zzh;
    private int zzb;
    private int zze = CoreConstants.MILLIS_IN_ONE_SECOND;
    private m83 zzf;
    private b83 zzg;

    static {
        x83 x83Var = new x83();
        zzh = x83Var;
        ej2.A(x83.class, x83Var);
    }

    private x83() {
    }

    @Override // com.google.android.gms.internal.ads.ej2
    protected final Object C(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return ej2.B(zzh, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzb", "zze", p63.b(), "zzf", "zzg"});
        }
        if (i3 == 3) {
            return new x83();
        }
        d53 d53Var = null;
        if (i3 == 4) {
            return new w83(d53Var);
        }
        if (i3 != 5) {
            return null;
        }
        return zzh;
    }
}