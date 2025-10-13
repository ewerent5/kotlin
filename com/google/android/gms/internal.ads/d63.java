package com.google.android.gms.internal.ads;

import ch.qos.logback.core.CoreConstants;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class d63 extends ej2<d63, c63> implements mk2 {
    private static final d63 zzj;
    private int zzb;
    private String zze = "";
    private nj2<z53> zzf = ej2.p();
    private int zzg = CoreConstants.MILLIS_IN_ONE_SECOND;
    private int zzh = CoreConstants.MILLIS_IN_ONE_SECOND;
    private int zzi = CoreConstants.MILLIS_IN_ONE_SECOND;

    static {
        d63 d63Var = new d63();
        zzj = d63Var;
        ej2.A(d63.class, d63Var);
    }

    private d63() {
    }

    public static d63 D() {
        return zzj;
    }

    static /* synthetic */ void F(d63 d63Var, String str) {
        str.getClass();
        d63Var.zzb |= 1;
        d63Var.zze = str;
    }

    @Override // com.google.android.gms.internal.ads.ej2
    protected final Object C(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return ej2.B(zzj, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဌ\u0001\u0004ဌ\u0002\u0005ဌ\u0003", new Object[]{"zzb", "zze", "zzf", z53.class, "zzg", p63.b(), "zzh", p63.b(), "zzi", p63.b()});
        }
        if (i3 == 3) {
            return new d63();
        }
        d53 d53Var = null;
        if (i3 == 4) {
            return new c63(d53Var);
        }
        if (i3 != 5) {
            return null;
        }
        return zzj;
    }
}