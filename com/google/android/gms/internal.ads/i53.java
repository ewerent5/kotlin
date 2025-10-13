package com.google.android.gms.internal.ads;

import ch.qos.logback.core.CoreConstants;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class i53 extends ej2<i53, h53> implements mk2 {
    private static final i53 zzp;
    private int zzb;
    private int zze;
    private b63 zzg;
    private d63 zzh;
    private f63 zzj;
    private t73 zzk;
    private i73 zzl;
    private w63 zzm;
    private y63 zzn;
    private int zzf = CoreConstants.MILLIS_IN_ONE_SECOND;
    private nj2<z53> zzi = ej2.p();
    private nj2<f83> zzo = ej2.p();

    static {
        i53 i53Var = new i53();
        zzp = i53Var;
        ej2.A(i53.class, i53Var);
    }

    private i53() {
    }

    public static i53 E() {
        return zzp;
    }

    static /* synthetic */ void G(i53 i53Var, g53 g53Var) {
        i53Var.zze = g53Var.zza();
        i53Var.zzb |= 1;
    }

    static /* synthetic */ void H(i53 i53Var, d63 d63Var) {
        d63Var.getClass();
        i53Var.zzh = d63Var;
        i53Var.zzb |= 8;
    }

    @Override // com.google.android.gms.internal.ads.ej2
    protected final Object C(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return ej2.B(zzp, "\u0001\u000b\u0000\u0001\u0007\u0011\u000b\u0000\u0002\u0000\u0007ဌ\u0000\bဌ\u0001\tဉ\u0002\nဉ\u0003\u000b\u001b\fဉ\u0004\rဉ\u0005\u000eဉ\u0006\u000fဉ\u0007\u0010ဉ\b\u0011\u001b", new Object[]{"zzb", "zze", g53.b(), "zzf", p63.b(), "zzg", "zzh", "zzi", z53.class, "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", f83.class});
        }
        if (i3 == 3) {
            return new i53();
        }
        if (i3 == 4) {
            return new h53(null);
        }
        if (i3 != 5) {
            return null;
        }
        return zzp;
    }

    public final d63 D() {
        d63 d63Var = this.zzh;
        return d63Var == null ? d63.D() : d63Var;
    }
}