package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class t81 extends ej2<t81, s71> implements mk2 {
    private static final t81 zzk;
    private int zzb;
    private long zze = -1;
    private long zzf = -1;
    private long zzg = -1;
    private long zzh = -1;
    private long zzi = -1;
    private long zzj = -1;

    static {
        t81 t81Var = new t81();
        zzk = t81Var;
        ej2.A(t81.class, t81Var);
    }

    private t81() {
    }

    public static s71 D() {
        return zzk.w();
    }

    static /* synthetic */ void F(t81 t81Var, long j2) {
        t81Var.zzb |= 4;
        t81Var.zzg = j2;
    }

    static /* synthetic */ void G(t81 t81Var, long j2) {
        t81Var.zzb |= 8;
        t81Var.zzh = j2;
    }

    static /* synthetic */ void H(t81 t81Var, long j2) {
        t81Var.zzb |= 16;
        t81Var.zzi = j2;
    }

    static /* synthetic */ void I(t81 t81Var, long j2) {
        t81Var.zzb |= 32;
        t81Var.zzj = j2;
    }

    @Override // com.google.android.gms.internal.ads.ej2
    protected final Object C(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return ej2.B(zzk, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i3 == 3) {
            return new t81();
        }
        dt0 dt0Var = null;
        if (i3 == 4) {
            return new s71(dt0Var);
        }
        if (i3 != 5) {
            return null;
        }
        return zzk;
    }
}