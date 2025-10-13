package com.google.android.gms.internal.ads;

import ch.qos.logback.core.CoreConstants;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class q83 extends ej2<q83, p83> implements mk2 {
    private static final q83 zzj;
    private int zzb;
    private int zze = CoreConstants.MILLIS_IN_ONE_SECOND;
    private m83 zzf;
    private int zzg;
    private int zzh;
    private int zzi;

    static {
        q83 q83Var = new q83();
        zzj = q83Var;
        ej2.A(q83.class, q83Var);
    }

    private q83() {
    }

    @Override // com.google.android.gms.internal.ads.ej2
    protected final Object C(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return ej2.B(zzj, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"zzb", "zze", p63.b(), "zzf", "zzg", "zzh", "zzi"});
        }
        if (i3 == 3) {
            return new q83();
        }
        d53 d53Var = null;
        if (i3 == 4) {
            return new p83(d53Var);
        }
        if (i3 != 5) {
            return null;
        }
        return zzj;
    }
}