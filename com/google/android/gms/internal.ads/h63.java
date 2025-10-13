package com.google.android.gms.internal.ads;

import ch.qos.logback.core.CoreConstants;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class h63 extends ej2<h63, g63> implements mk2 {
    private static final h63 zzm;
    private int zzb;
    private b83 zzf;
    private int zzg;
    private d83 zzh;
    private int zzi;
    private String zze = "";
    private int zzj = CoreConstants.MILLIS_IN_ONE_SECOND;
    private int zzk = CoreConstants.MILLIS_IN_ONE_SECOND;
    private int zzl = CoreConstants.MILLIS_IN_ONE_SECOND;

    static {
        h63 h63Var = new h63();
        zzm = h63Var;
        ej2.A(h63.class, h63Var);
    }

    private h63() {
    }

    public static h63 D() {
        return zzm;
    }

    static /* synthetic */ void F(h63 h63Var, String str) {
        h63Var.zzb |= 1;
        h63Var.zze = str;
    }

    static /* synthetic */ void G(h63 h63Var, d83 d83Var) {
        d83Var.getClass();
        h63Var.zzh = d83Var;
        h63Var.zzb |= 8;
    }

    @Override // com.google.android.gms.internal.ads.ej2
    protected final Object C(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return ej2.B(zzm, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003င\u0002\u0004ဉ\u0003\u0005င\u0004\u0006ဌ\u0005\u0007ဌ\u0006\bဌ\u0007", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", p63.b(), "zzk", p63.b(), "zzl", p63.b()});
        }
        if (i3 == 3) {
            return new h63();
        }
        d53 d53Var = null;
        if (i3 == 4) {
            return new g63(d53Var);
        }
        if (i3 != 5) {
            return null;
        }
        return zzm;
    }
}