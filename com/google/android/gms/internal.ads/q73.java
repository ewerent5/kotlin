package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class q73 extends ej2<q73, m73> implements mk2 {
    private static final q73 zzl;
    private int zzb;
    private int zzf;
    private int zzg;
    private long zzh;
    private long zzk;
    private nj2<l73> zze = ej2.p();
    private String zzi = "";
    private String zzj = "";

    static {
        q73 q73Var = new q73();
        zzl = q73Var;
        ej2.A(q73.class, q73Var);
    }

    private q73() {
    }

    public static m73 D() {
        return zzl.w();
    }

    static /* synthetic */ void F(q73 q73Var, Iterable iterable) {
        nj2<l73> nj2Var = q73Var.zze;
        if (!nj2Var.zza()) {
            q73Var.zze = ej2.q(nj2Var);
        }
        lh2.j(iterable, q73Var.zze);
    }

    static /* synthetic */ void G(q73 q73Var, int i2) {
        q73Var.zzb |= 1;
        q73Var.zzf = i2;
    }

    static /* synthetic */ void H(q73 q73Var, int i2) {
        q73Var.zzb |= 2;
        q73Var.zzg = i2;
    }

    static /* synthetic */ void I(q73 q73Var, long j2) {
        q73Var.zzb |= 4;
        q73Var.zzh = j2;
    }

    static /* synthetic */ void J(q73 q73Var, String str) {
        str.getClass();
        q73Var.zzb |= 8;
        q73Var.zzi = str;
    }

    static /* synthetic */ void L(q73 q73Var, String str) {
        str.getClass();
        q73Var.zzb |= 16;
        q73Var.zzj = str;
    }

    static /* synthetic */ void M(q73 q73Var, long j2) {
        q73Var.zzb |= 32;
        q73Var.zzk = j2;
    }

    @Override // com.google.android.gms.internal.ads.ej2
    protected final Object C(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return ej2.B(zzl, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001\u001b\u0002င\u0000\u0003င\u0001\u0004ဂ\u0002\u0005ဈ\u0003\u0006ဈ\u0004\u0007ဂ\u0005", new Object[]{"zzb", "zze", l73.class, "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i3 == 3) {
            return new q73();
        }
        d53 d53Var = null;
        if (i3 == 4) {
            return new m73(d53Var);
        }
        if (i3 != 5) {
            return null;
        }
        return zzl;
    }
}