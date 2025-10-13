package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class rn2 extends ej2<rn2, om2> implements mk2 {
    private static final rn2 zzx;
    private int zzb;
    private int zze;
    private int zzf;
    private qm2 zzj;
    private gn2 zzm;
    private boolean zzn;
    private boolean zzq;
    private boolean zzr;
    private qn2 zzt;
    private byte zzw = 2;
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private nj2<on2> zzk = ej2.p();
    private String zzl = "";
    private nj2<String> zzo = ej2.p();
    private String zzp = "";
    private ci2 zzs = ci2.f5319e;
    private nj2<String> zzu = ej2.p();
    private nj2<String> zzv = ej2.p();

    static {
        rn2 rn2Var = new rn2();
        zzx = rn2Var;
        ej2.A(rn2.class, rn2Var);
    }

    private rn2() {
    }

    public static om2 G() {
        return zzx.w();
    }

    static /* synthetic */ void I(rn2 rn2Var, jn2 jn2Var) {
        rn2Var.zze = jn2Var.zza();
        rn2Var.zzb |= 1;
    }

    static /* synthetic */ void J(rn2 rn2Var, String str) {
        str.getClass();
        rn2Var.zzb |= 4;
        rn2Var.zzg = str;
    }

    static /* synthetic */ void L(rn2 rn2Var, String str) {
        str.getClass();
        rn2Var.zzb |= 8;
        rn2Var.zzh = str;
    }

    static /* synthetic */ void M(rn2 rn2Var, qm2 qm2Var) {
        qm2Var.getClass();
        rn2Var.zzj = qm2Var;
        rn2Var.zzb |= 32;
    }

    static /* synthetic */ void N(rn2 rn2Var, on2 on2Var) {
        on2Var.getClass();
        nj2<on2> nj2Var = rn2Var.zzk;
        if (!nj2Var.zza()) {
            rn2Var.zzk = ej2.q(nj2Var);
        }
        rn2Var.zzk.add(on2Var);
    }

    static /* synthetic */ void O(rn2 rn2Var, String str) {
        rn2Var.zzb |= 64;
        rn2Var.zzl = str;
    }

    static /* synthetic */ void P(rn2 rn2Var) {
        rn2Var.zzb &= -65;
        rn2Var.zzl = zzx.zzl;
    }

    static /* synthetic */ void Q(rn2 rn2Var, gn2 gn2Var) {
        gn2Var.getClass();
        rn2Var.zzm = gn2Var;
        rn2Var.zzb |= 128;
    }

    static /* synthetic */ void R(rn2 rn2Var, qn2 qn2Var) {
        qn2Var.getClass();
        rn2Var.zzt = qn2Var;
        rn2Var.zzb |= 8192;
    }

    static /* synthetic */ void S(rn2 rn2Var, Iterable iterable) {
        nj2<String> nj2Var = rn2Var.zzu;
        if (!nj2Var.zza()) {
            rn2Var.zzu = ej2.q(nj2Var);
        }
        lh2.j(iterable, rn2Var.zzu);
    }

    static /* synthetic */ void T(rn2 rn2Var, Iterable iterable) {
        nj2<String> nj2Var = rn2Var.zzv;
        if (!nj2Var.zza()) {
            rn2Var.zzv = ej2.q(nj2Var);
        }
        lh2.j(iterable, rn2Var.zzv);
    }

    @Override // com.google.android.gms.internal.ads.ej2
    protected final Object C(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return Byte.valueOf(this.zzw);
        }
        if (i3 == 2) {
            return ej2.B(zzx, "\u0001\u0012\u0000\u0001\u0001\u0015\u0012\u0000\u0004\u0001\u0001ဈ\u0002\u0002ဈ\u0003\u0003ဈ\u0004\u0004Л\u0005ဇ\b\u0006\u001a\u0007ဈ\t\bဇ\n\tဇ\u000b\nဌ\u0000\u000bဌ\u0001\fဉ\u0005\rဈ\u0006\u000eဉ\u0007\u000fည\f\u0011ဉ\r\u0014\u001a\u0015\u001a", new Object[]{"zzb", "zzg", "zzh", "zzi", "zzk", on2.class, "zzn", "zzo", "zzp", "zzq", "zzr", "zze", jn2.b(), "zzf", nm2.b(), "zzj", "zzl", "zzm", "zzs", "zzt", "zzu", "zzv"});
        }
        if (i3 == 3) {
            return new rn2();
        }
        if (i3 == 4) {
            return new om2(null);
        }
        if (i3 == 5) {
            return zzx;
        }
        this.zzw = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }

    public final String D() {
        return this.zzg;
    }

    public final List<on2> E() {
        return this.zzk;
    }

    public final String F() {
        return this.zzl;
    }
}