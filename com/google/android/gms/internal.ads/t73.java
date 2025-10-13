package com.google.android.gms.internal.ads;

import ch.qos.logback.core.CoreConstants;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class t73 extends ej2<t73, r73> implements mk2 {
    private static final t73 zzp;
    private int zzb;
    private int zze = CoreConstants.MILLIS_IN_ONE_SECOND;
    private int zzf = CoreConstants.MILLIS_IN_ONE_SECOND;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private int zzn;
    private v73 zzo;

    static {
        t73 t73Var = new t73();
        zzp = t73Var;
        ej2.A(t73.class, t73Var);
    }

    private t73() {
    }

    @Override // com.google.android.gms.internal.ads.ej2
    protected final Object C(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return ej2.B(zzp, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006\bင\u0007\tင\b\nင\t\u000bဉ\n", new Object[]{"zzb", "zze", p63.b(), "zzf", p63.b(), "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo"});
        }
        if (i3 == 3) {
            return new t73();
        }
        d53 d53Var = null;
        if (i3 == 4) {
            return new r73(d53Var);
        }
        if (i3 != 5) {
            return null;
        }
        return zzp;
    }
}