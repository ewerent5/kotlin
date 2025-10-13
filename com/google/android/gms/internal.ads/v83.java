package com.google.android.gms.internal.ads;

import ch.qos.logback.core.CoreConstants;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class v83 extends ej2<v83, u83> implements mk2 {
    private static final v83 zzk;
    private int zzb;
    private int zze = CoreConstants.MILLIS_IN_ONE_SECOND;
    private m83 zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private long zzj;

    static {
        v83 v83Var = new v83();
        zzk = v83Var;
        ej2.A(v83.class, v83Var);
    }

    private v83() {
    }

    @Override // com.google.android.gms.internal.ads.ej2
    protected final Object C(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return ej2.B(zzk, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006ဃ\u0005", new Object[]{"zzb", "zze", p63.b(), "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i3 == 3) {
            return new v83();
        }
        d53 d53Var = null;
        if (i3 == 4) {
            return new u83(d53Var);
        }
        if (i3 != 5) {
            return null;
        }
        return zzk;
    }
}