package com.google.android.gms.internal.ads;

import j$.util.Spliterator;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class sh0 extends ej2<sh0, lb0> implements mk2 {
    private static final sh0 zzr;
    private int zzb;
    private long zzf;
    private long zzj;
    private long zzk;
    private long zzm;
    private int zzq;
    private String zze = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private String zzl = "";
    private String zzn = "";
    private String zzo = "";
    private nj2<nd0> zzp = ej2.p();

    static {
        sh0 sh0Var = new sh0();
        zzr = sh0Var;
        ej2.A(sh0.class, sh0Var);
    }

    private sh0() {
    }

    public static lb0 D() {
        return zzr.w();
    }

    static /* synthetic */ void F(sh0 sh0Var, String str) {
        str.getClass();
        sh0Var.zzb |= 1;
        sh0Var.zze = str;
    }

    static /* synthetic */ void G(sh0 sh0Var, long j2) {
        sh0Var.zzb |= 2;
        sh0Var.zzf = j2;
    }

    static /* synthetic */ void H(sh0 sh0Var, String str) {
        str.getClass();
        sh0Var.zzb |= 4;
        sh0Var.zzg = str;
    }

    static /* synthetic */ void I(sh0 sh0Var, String str) {
        str.getClass();
        sh0Var.zzb |= 8;
        sh0Var.zzh = str;
    }

    static /* synthetic */ void J(sh0 sh0Var, String str) {
        sh0Var.zzb |= 16;
        sh0Var.zzi = str;
    }

    static /* synthetic */ void L(sh0 sh0Var, String str) {
        sh0Var.zzb |= Spliterator.IMMUTABLE;
        sh0Var.zzo = str;
    }

    static /* synthetic */ void M(sh0 sh0Var, rg0 rg0Var) {
        sh0Var.zzq = rg0Var.zza();
        sh0Var.zzb |= 2048;
    }

    @Override // com.google.android.gms.internal.ads.ej2
    protected final Object C(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return ej2.B(zzr, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဈ\u0007\tဂ\b\nဈ\t\u000bဈ\n\f\u001b\rဌ\u000b", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", nd0.class, "zzq", rg0.b()});
        }
        if (i3 == 3) {
            return new sh0();
        }
        ka0 ka0Var = null;
        if (i3 == 4) {
            return new lb0(ka0Var);
        }
        if (i3 != 5) {
            return null;
        }
        return zzr;
    }
}